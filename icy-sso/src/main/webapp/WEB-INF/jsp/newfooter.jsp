<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
      <div class="footer-container">
        <div class="footer">
          <div class="f-fix">
            <div class="frame">.</div>
            <!--Shipping Block-->
            <div class="free-shipping">享受包邮服务<span>所有订单是送你的节日礼物！</span></div>
            <!--Shipping Block-->
            
            <!--Newsletter-->
            <form method="post" id="newsletter-validate-detail" action="#">
              <div class="form-subscribe">
                <div class="form-subscribe-header">有什么好的建议告诉作者                                          (*^▽^*)</div>
                <div class="input-box">
                  <input 
                  onfocus="if(this.value=='感谢你的建议') {this.value=''};" onblur="if(this.value=='') {this.value='感谢你的建议'};"
                  value="感谢你的建议" name="email" id="newsletter" title="Sign up for newsletter" class="input-text required-entry validate-email" type="text" />
                  <button type="submit" title="Submit" class="button"><span>发送</span></button>
                </div>
              </div>
            </form> 
            <!--Newsletter-->
           
          </div>
          <div class="f-left bottom_links">
            <div class="footer-content">
              <div class="block_1">
                <h3>加入我们!</h3>
                <!--Footer links-->
                <ul class="footer_links">
                  <li> <a  title="网站是https的">世界顶级非对称安全加密标准</a></li>
                  <li> <a  title="商品数据源来自京东">京东旗下产品</a></li>
                  <li> <a  title="目前开发人员就我一人">加入我们，给你足够大的发展空间</a></li>
                </ul>
              </div>
              <div class="block_1">
                <h3>-</h3>
                <!--Footer links-->
                <ul class="footer_links">
                  <li> <a  title="使用了阿里的开源缓冲池">由阿里提供技术支持</a></li>
                  <li> <a  title="技术难题我都是用qq咨询的大哥">与腾讯达成长期合作</a></li>
                  <li> <a  title="当然也用百度">与百度达成长期合作</a></li>
                </ul>
              </div>
              <div class="block_1">
              <!--Footer links-->
                <h3>-</h3>
                <ul class="footer_links">
                  <li> <a title="前台开发用的谷歌浏览器">信息安全合作伙伴是谷歌</a></li>
                  <li> <a title="办公室处于毛坯房状态">典型欧美创业工作环境</a></li>
                  <li> <a title="目前还没人怼我们">项目收到业界一致好评</a></li>
                </ul>
              </div>
              <div class="block_2">
                <h3>免责声明</h3>
                <!--Social links-->
               本项目仅供java爱好者学习传播及交流<br/>
                 并无任何商业目的及意图<br/>
                  任何网友发布链接，产品，咨询均系网友个人行为<br/>
                  作者不为其承担任何法律责任<br/>
                  网页部分静态样式及js源来自京东<br/>
                  若涉及任何侵权行为请及时联系作者<br/>
                <!--Payment Icons-->
                <div class="payment"> <img src="images/amexp.jpg" alt="" /> <img src="images/visa.jpg" alt="" /> <img src="images/mastercard.jpg" alt="" /> <img src="images/discover.jpg" alt="" /> </div>
              </div>
            </div>
          </div>
        </div>
        <address>
        &copy; Copyright &copy; 2018.Company name All rights reserved.<a target="_blank" href="http://www.icygrin.club/" title="冰笑风云">冰笑风云</a> 
        </address>
      </div>
    <!--END OF FOOTER-->
  </div>
  <!--Minicart JS--> 
  <script type="text/javascript">
	 var minicart_timer;
    jQuery(".trigger-minicart").hover(function(){
        jQuery("#minicart").slideDown();
    });
    jQuery("#minicart").mouseleave(function(){
        jQuery("#minicart").slideUp();
    });
    jQuery("#minicart").hover(function(){
        clearTimeout(minicart_timer);
    });
	jQuery(document).ready(function(){
	jQuery('.pagebox_btn').click(function(){
		if(parseInt(jQuery('.page_pan').css('left')) < 0)
		{
			jQuery('.page_pan').animate({ left: '0' }, 600, 'easeOutQuint');
		}
		else{
			jQuery('.page_pan').animate({ left: '-100px' }, 600, 'easeOutQuint');
			}
		});
		});
</script>
</div>
<!--pages box-->
<div class="page_pan" style="left:-100px;">
	<div class="page_box">
    	<a >QQ</a>
        <a >470255867</a>
        <a >微信</a>
        <a >zl3515014</a>
        
    </div>
    <div class="pagebox_btn">
    	<span>联</span>
        <span>系</span>
        <span>方</span>
        <span>式</span>
        
    </div>
</div>

</body>
</html>