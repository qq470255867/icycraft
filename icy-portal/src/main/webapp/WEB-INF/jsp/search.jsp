<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Sanatana HTML Version - Category</title>
<meta name="description" content="Default Description" />
<meta name="keywords" content="Magento, Varien, E-commerce" />
<meta name="robots" content="INDEX,FOLLOW" />
<link rel="icon" href="#" type="image/x-icon" />
<link rel="shortcut icon" href="#" type="image/x-icon" />

<!-- CSS =====================================================================================-->
<link href='http://fonts.googleapis.com/css?family=Telex' rel='stylesheet' type='text/css' />
<link rel="stylesheet" type="text/css" href="/css/styles.css" media="all" />
<link rel="stylesheet" type="text/css" href="/css/skin.css" media="all" />
<link rel="stylesheet" type="text/css" href="/css/cloud-zoom.css" media="all" />
<link rel="stylesheet" type="text/css" href="/css/light_box.css" media="all" />
<link rel="stylesheet" type="text/css" href="/css/mix.css" media="all" />
<link rel="stylesheet" type="text/css" href="/css/banner.css" media="all" />
<link rel="stylesheet" type="text/css" href="/css/magicat.css" media="all" />

<link rel="stylesheet" type="text/css" href="/css/psearch20131008.css" media="all" />


<link href='http://fonts.googleapis.com/css?family=Telex' rel='stylesheet' type='text/css' />


<link rel="stylesheet" type="text/css" href="css/styles.css" media="all" />
<link rel="stylesheet" type="text/css" href="css/skin.css" media="all" />
<link rel="stylesheet" type="text/css" href="css/cloud-zoom.css" media="all" />
<link rel="stylesheet" type="text/css" href="css/light_box.css" media="all" />
<link rel="stylesheet" type="text/css" href="css/mix.css" media="all" />
<link rel="stylesheet" type="text/css" href="css/banner.css" media="all" />
<link rel="stylesheet" type="text/css" href="css/magicat.css" media="all" />

<!-- Scripts =====================================================================================-->
<script type="text/javascript" src="js/prototype.js"></script>
<script type="text/javascript" src="js/jquery-1.6.1.min.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<script type="text/javascript" src="js/menu.js"></script>
<script type="text/javascript" src="js/banner_pack.js"></script>
<script type="text/javascript" src="js/light_box.js"></script>
<script type="text/javascript" src="js/cloud-zoom.1.0.2.js"></script>
<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/jquery.jcarousel.min.js"></script>
<script type="text/javascript" src="js/jquery.mix.js"></script>
<script type="text/javascript" src="js/base-v1.js" charset="utf-8"></script>

</head>
<body id="bg_color" class=" cms-index-index cms-home">
<!--START OF WRAPPER-->


    
    <!--START OF HEADER-->
   <jsp:include page="commons/newheader.jsp" />
    <!--END OF HEADER--> 
    
    <!--START OF MAIN CONTENT-->
    <div class="main-container col2-left-layout">
      <div class="main">
        <div class="col-main"> 
          <!--Category Title-->
          <div class="page-title category-title">
            <h1>Womens</h1>
          </div>
          <!--Category Image-->
                                 <div class="toolbar">
              <div class="pager">
                <div class="limiter">
                  <label>Show</label>
                  <select>
                    <option selected="selected"> 9 </option>
                    <option> 15 </option>
                    <option> 30 </option>
                  </select>
                </div>
              </div>
              <div class="sorter">
                <p class="view-mode">
                  <label>View as:</label>
                  <strong title="Grid" class="grid">Grid</strong>&nbsp; <a href="#" title="List" class="list">List</a>&nbsp; </p>
              </div>
              <div class="pagination">
                <div class="pages"> <strong>Page:</strong>
                  <ol>
                   <a href="search.html?q=${query }&page=1">1</a>
                      <a href="search.html?q=${query }&page=2">2</a>
  <a href="search.html?q=${query }&page=3">3</a>
  <a href="search.html?q=${query }&page=4">4</a>
  <a href="search.html?q=${query }&page=5">5</a>
  <a href="search.html?q=${query }&page=6">6</a>
                  </ol>
                </div>
              </div>
            </div>
          <p class="category-image"><img src="/images/women.jpg" alt="Womens" title="Womens"/></p>
          
          <div class="category-products"> 
            <!--Start toolbar-->
            
            <!--End toolbar--> 
            
            <!--Start Category Product List-->
           
           <div class="m psearch " id="plist">
<ul class="list-h clearfix" tpl="2">
<c:forEach items="${itemList}" var="item">
${msg}
<li class="item-book" bookid="11078102">
	<div class="p-img">
		<a target="_blank" href="/item/${item.id }.html">
			<img width="160" height="160" data-img="1" src="${item.images[0]}" />
		</a>
	</div>
	<div class="p-name">
		<a target="_blank" href="/item/${item.id }.html">
			${item.title}
		</a>
	</div>
	<div class="p-price">
		<i>淘淘价：</i>
		<strong>￥<fmt:formatNumber groupingUsed="false" maxFractionDigits="2" minFractionDigits="2" value="${item.price / 100 }"/></strong>
	</div>
	
	<div class="extra">
		
	</div>
</li>
</c:forEach>
</ul></div>

           
           
           
            <!--End Category Product List--> 
            
            <!--Start toolbar bottom-->
            
            <!--End toolbar bottom--> 
          </div>
        </div>
        <div class="col-left sidebar"> 
          <!--Start Magic Category Block-->
          <div class="magicat-container">
            <div class="block">
              <div class="block-title cat_heading"> <strong><span>solrCloud</span></strong> </div>
              <ul id="magicat">
                <li class="first level0-inactive level0 inactive"><span class="magicat-cat"><a href="#"><span>系统中索引量大，并发量高</span></a></span> </li>
                <li class="level0-inactive level0 inactive"><span class="magicat-cat"><a href="#"><span>所以采用了solr的分布式搜索方案</span></a></span> </li>
                <li class="level0-inactive level0 inactive"><span class="magicat-cat"><a href="#"><span>使用Zookeeper作为集群的配置信息中心</span></a></span> </li>
                <li class="level0-inactive level0 inactive"><span class="magicat-cat"><a href="#"><span>它在分布式SOA架构中常常作为服务发现</span></a></span> </li>
                <li class="last level0-inactive level0 inactive"><span class="magicat-cat"><a href="#"><span>而solrcould利用分片索引库引入更多个服务器</span></a></span></li>
                 <li class="last level0-inactive level0 inactive"><span class="magicat-cat"><a href="#"><span>所有分片组成一个完整的索引库</span></a></span></li>
              </ul>
            </div>
          </div>
          <!--End Magic Category Block--> 
          
          <!--Start Layered nav-->
          <div class="block block-layered-nav">
            <div class="block-title"> <strong><span>搭建过程</span></strong> </div>
            <div class="block-content">
              <div id="narrow-by-list">
                <div>
                  <div class="last collapse" id="filter_heading">zookeeper和solr单机是多对多关系</div>
                  <div class="last odd" id="filter_content">
                    <ul>
                      <li> <a href="#"><span class="price">每台服务器部署solr服务</span> - </a>，一台或多台指定索引片 </li>
                      <li> <a href="#"><span class="price">安装zookeeper</span> 的每个服务器 </a>，指定solr服务器的地址和端口</li>
                    </ul>
                  </div>
                  <script type="text/javascript">
						jQuery('#filter_heading').click(function() {
					      jQuery('#filter_content').slideToggle('slow');
						   jQuery(this).toggleClass("highlight");
					    });
					</script> 
                </div>
              </div>
            </div>
          </div>
          <!--End Layered nav--> 
          
          <!--Start Compare Products-->
          <div class="block block-list block-compare">
            <div class="block-title"><strong><span>还需要修改每个solr实例的监听端口</span></strong> </div>
            <div class="block-content">
              <p class="empty">每个solr实例都要配置每个zookeeper的地址</p>
            </div>
          </div>
          <!--End Compare Products--> 
          
          <!--Start Poll-->
          <div class="block block-poll">
            <div class="block-title"> <strong><span>比如这里有4个solr节点</span></strong> </div>
            <form action="#">
              <div class="block-content">
                <p class="block-subtitle">集群分为两片</p>
                <ul id="poll-answers">
                  <li class="odd">
                    <input name="vote" class="radio poll_vote" id="vote_5" value="5" type="radio"/>
                    <span class="label">
                    <label for="vote_5">每片2个副本label>
                    </span> </li>
                  <li class="even">
                    <input name="vote" class="radio poll_vote" id="vote_6" value="6" type="radio"/>
                    <span class="label">
                    <label for="vote_6">分为一主一备，实现高可用</label>
                    </span> </li>
                  <li class="odd">
                    <input name="vote" class="radio poll_vote" id="vote_7" value="7" type="radio"/>
                    <span class="label">
                    <label for="vote_7">solrj操作集群环境的索引库</label>
                    </span> </li>
                  <li class="last even">
                    <input name="vote" class="radio poll_vote" id="vote_8" value="8" type="radio"/>
                    <span class="label">
                    <label for="vote_8"></label>
                    </span> </li>
                </ul>
                <div class="actions">
                  <button type="submit" title="Vote" class="button"><span><span>Vote</span></span></button>
                </div>
              </div>
            </form>
          </div>
          <!--End Poll--> 
        </div>
      </div>
      <div style="display: none;" id="back-top"> <a href="#"><img alt="" src="images/backtop.gif"/></a> </div>
    </div>
    <!--END OF MAIN CONTENT--> 
    
    <!--START OF FOOTER-->
<jsp:include page="commons/newfooter.jsp" />
<!--end pages box-->
<!--END OF WRAPPER-->
<script type="text/javascript">
  function downloadJSAtOnload() {
    var element = document.createElement("script");
    element.src = "js/menu.js";
    document.body.appendChild(element);
  }
  if (window.addEventListener)
    window.addEventListener("load", downloadJSAtOnload, false);
  else if (window.attachEvent)
    window.attachEvent("onload", downloadJSAtOnload);
  else window.onload = downloadJSAtOnload;
</script>
</body>
</html>