

#服务器端环境搭建，运行不出来的看这里
### jdk
```
yum search jdk
yum -y install  java-1.7.0-openjdk*
```
### nginx

1. 安装编译器 gcc
```
gcc：yum install gcc-c++ 
```
安装其他环境
```
yum install -y pcre pcre-devel
yum install -y zlib zlib-devel
yum install -y openssl openssl-devel
```
2. 配置安装目录
```
./configure \
--prefix=/usr/local/nginx \
--pid-path=/var/run/nginx/nginx.pid \
--lock-path=/var/lock/nginx.lock \
--error-log-path=/var/log/nginx/error.log \
--http-log-path=/var/log/nginx/access.log \
--with-http_gzip_static_module \
--http-client-body-temp-path=/var/temp/nginx/client \
--http-proxy-temp-path=/var/temp/nginx/proxy \
--http-fastcgi-temp-path=/var/temp/nginx/fastcgi \
--http-uwsgi-temp-path=/var/temp/nginx/uwsgi \
--http-scgi-temp-path=/var/temp/nginx/scgi
```
3. 编译安装
make
make  install

4. 修改配置文件

头部用户修改为 root
```
server {#添加

location /images/ {
    root  /home/ftpuser/www/;
    autoindex on;
}

}
```
5. 启动

### mysql
1. 安装
```
yum install mysql
yum install mysql-server
```
2. 修改my.conf
```
[mysqld]
datadir=/var/lib/mysql
socket=/var/lib/mysql/mysql.sock
user=mysql
# Disabling symbolic-links is recommended to prevent assorted security risks
symbolic-links=0

[mysqld_safe]
log-error=/var/log/mysqld.log
pid-file=/var/run/mysqld/mysqld.pid
[client]
default-character-set=utf8
[mysqld_safe]
default-character-set=utf8
[mysqld]
default-character-set=utf8
[mysql]
default-character-set=utf8
~
~
```
3. 启动
service mysqld start

4. 配置
mysql -u root -p
直接回车，不用输密码
use mysql;
update user set password=password("你的数据库密码") where user='root';
flush privileges;
5. 添加外部链接
 GRANT ALL PRIVILEGES ON *.* TO 'myuser'@'%' IDENTIFIED BY 'mypassword' WITH GRANT OPTION;
### redis
1. 解压
tar -zxvf redis-3.0.0.tar.gz 
2. 安装
 make install PREFIX=/usr/local/redis
3. 修改配置文件
daemonize yes
4. 启动
 ./redis-server redis.conf

### solr
1. 安装tomcat
 tar -zxf apache-tomcat-7.0.47.tar.gz 
 mkdir /usr/local/solr
 cp apache-tomcat-7.0.47 /usr/local/solr/tomcat -r
2. 部署solr
 cp /root/solr-4.10.3/dist/solr-4.10.3.war /usr/local/solr/tomcat/webapps/solr.war
 把/root/solr-4.10.3/example/lib/ext 目录下所有的jar包复制到solr工程中
 cp * /usr/local/solr/tomcat/webapps/solr/WEB-INF/lib/
3. 创建solrhome
Solrhome是存放solr服务器所有配置文件的目录
cp -r /root/solr-4.10.3/example solr/usr/local/solr/solrhome
4. 修改web.xml
![](/images/123712381723.jpg)
5. 配置中文分析器
 cp IKAnalyzer2012FF_u1.jar /usr/local/solr/tomcat/webapps/solr/WEB-INF/lib/
 cp IKAnalyzer.cfg.xml ext_stopword.dic mydict.dic /usr/local/solr/tomcat/webapps/solr/WEB-INF/classes 
6. 配置fieldType
vim solrhome/collection1/conf/schema.xml

G跳转末尾
添加
```
<fieldType name="text_ik" class="solr.TextField">
  <analyzer class="org.wltea.analyzer.lucene.IKAnalyzer"/>
</fieldType>
```
7. 配置业务字段
```
 <field name="item_title" type="text_ik" indexed="true" stored="true"/>
<field name="item_sell_point" type="text_ik" indexed="true" stored="true"/>
<field name="item_price"  type="long" indexed="true" stored="true"/>
<field name="item_image" type="string" indexed="false" stored="true" />
<field name="item_category_name" type="string" indexed="true" stored="true" />
<field name="item_desc" type="text_ik" indexed="true" stored="false" />

<field name="item_keywords" type="text_ik" indexed="true" stored="false" multiValued="true"/>
<copyField source="item_title" dest="item_keywords"/>
<copyField source="item_sell_point" dest="item_keywords"/>
<copyField source="item_category_name" dest="item_keywords"/>
<copyField source="item_desc" dest="item_keywords"/>
```
8. 启动tomcat 导入索引
 代码
```
@Controller
@RequestMapping("/manager")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	//导入所有商品数据
	@RequestMapping("/importall")
	@ResponseBody
	public TaotaoResult importAllItem(){		
		TaotaoResult result=itemService.importAllItem();
		
		result.setMsg("导入solr库成功");
		return result;
		
	}
	

}
```
```
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	ItemMapper itemMapper;
	
	@Autowired
	SolrServer solrserver;

	@Override
	public TaotaoResult importAllItem()  {
		// TODO Auto-generated method stub
		
		try {
			List<Item> list=itemMapper.getItemList();
			
			for (Item item : list) {
				
				SolrInputDocument document = new SolrInputDocument();
				document.setField("id", item.getId());
				document.setField("item_title", item.getTitle());
				document.setField("item_sell_point", item.getSell_point());
				document.setField("item_price", item.getPrice());
				document.setField("item_image", item.getImage());
				document.setField("item_category_name", item.getCategory_name());
				document.setField("item_desc", item.getItem_desc());
				
				solrserver.add(document);
			}
			solrserver.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return TaotaoResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		return TaotaoResult.ok();
	}

}
```

```
List<com.taotao.search.pojo.Item> getItemList();
```
```
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="com.taotao.search.mapper.ItemMapper">
<select id="getItemList" resultType="com.taotao.search.pojo.Item">
		SELECT
			a.id,
			a.title,
			a.sell_point,
			a.price,
			a.image,
			b. NAME category_name
		FROM
			tb_item a
		LEFT JOIN tb_item_cat b ON a.cid = b.id
		<!--order by a.id desc limit 10-->
		
		<!-- 导入最新加入的十条数据到solr库，删掉则导入全部 -->
	</select>
</mapper>
```
```
public class Item {
	private String id;
	private String title;
	private String sell_point;
	private long price;
	private String image;
	private String category_name;
	private String item_desc;
省略getset
```
9. 启动tomcat

### 项目热部署
1. cp 4个tomcat文件
部署5个模块

修改tomcat的server.conf
0  8005 8080 8009 manager
1  8006 8081 8010 rest
5  8015 8082 8016 portal
2  8007 8083 8011 search
3  8008 8084 8012 sso
4  8014 8085 8013 order

2. 增加tomcat用户
在tomcat的安装目录下,修改conf / tomcat-user.xml文件,在<tomcat-users> 节点下面增加如下配置:
```
<role rolename="manager-gui" />
<role rolename="manager-script" />
<user username="tomcat" password="tomcat" roles="manager-gui, manager-script"/>
```
3. 修改项目pom.xml
```
			<plugin>
				<groupId>org.apache.tomcat.maven</groupId>
				<artifactId>tomcat7-maven-plugin</artifactId>
				<configuration>
					<port>8083</port>
					<path>/</path>
					<url>http://1ip17.188:8083/manager/text</url>
					<username>tomcat</username>
					<password>tomcat</password>
				</configuration>
			</plugin>
```
