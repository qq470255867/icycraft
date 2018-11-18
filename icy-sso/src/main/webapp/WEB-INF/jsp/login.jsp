<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Sanatana HTML Version - Contacts</title>
<meta name="description" content="Default Description" />
<meta name="keywords" content="Santana, Varien, E-commerce" />
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
<link type="text/css" rel="stylesheet" href="/css/login.css"/>
<!-- Scripts =====================================================================================-->
<script type="text/javascript" src="/js/prototype.js"></script>
<script type="text/javascript" src="/js/jquery-1.6.1.min.js"></script>
<script type="text/javascript" src="/js/common.js"></script>
<script type="text/javascript" src="/js/menu.js"></script>
<script type="text/javascript" src="/js/banner_pack.js"></script>
<script type="text/javascript" src="/js/light_box.js"></script>
<script type="text/javascript" src="/js/cloud-zoom.1.0.2.js"></script>
<script type="text/javascript" src="/js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="/js/jquery.jcarousel.min.js"></script>
<script type="text/javascript" src="/js/jquery.mix.js"></script>
<script type="text/javascript" src="/js/jquery-1.6.4.js"></script>
<script type="text/javascript" src="/js/icy.js" charset="utf-8"></script>
</head>
<body id="bg_color" class=" cms-index-index cms-home">
<!--START OF WRAPPER-->
<jsp:include page="Newheader.jsp" />
    
    <!--START OF MAIN CONTENT-->
    <div class="main-container col2-left-layout">
      <div class="main">
        <div class="col-main">
          <div id="messages_product_view"></div>
          <!--Page Title-->
          <div class="page-title">
            <h1>登录</h1>
          </div>
          <!--Start of Contact Form-->
          <form  id="formlogin" method="post" onsubmit="return false;">
            <div class="fieldset">
              <h2 class="legend">请输入账号和密码</h2>
              <ul class="form-list">
                <li class="fields">
                  <div class="field">
                    <label for="name" class="required">账号</label>
                    <div class="input-box">
                      <input name="username" id="loginname" title="Name" class="input-text required-entry" type="text" />
                       <label id="loginname_succeed" class="blank invisible"></label>
                       <label id="loginname_error" class="hide"><b></b></label>
                    </div>
                  </div>
                   <script type="text/javascript">
                    setTimeout(function () {
                        if (!$("#loginname").val()) {
                            $("#loginname").get(0).focus();
                        }
                    }, 0);
                </script>
                </li>
                <br/> 
                <li>
                  <label for="telephone">密码</label>
                  <div class="input-box">
                    <input type="password" name="password" id="nloginpwd" title="Telephone" class="input-text" type="text" />
                    <label id="loginpwd_succeed" class="blank invisible"></label>
                    <label id="loginpwd_error" class="hide"></label>
                  </div>
                </li>
                
              </ul>
            </div>
            <div class="buttons-set">
              <p class="required"></p>
                <div class="item login-btn2013" >
                    <button type="submit" title="Submit" class="button"><span><a href="/page/showRegister" clstag="passport|keycount|login|08" style='color:white'>免费注册</a></span></button>
                </div>
                
                    <button type="submit" title="Vote" class="button"><span><a id="loginsubmit"  tabindex="8" clstag="passport|keycount|login|06" style="color:white;width: 98px; height: 49px">立即登陆</a></span></span></button>
                
            </div>
          </form>
          <!--End of Contact Form-->  
        </div>
        <div class="col-left sidebar"> 
          <!--Start of Compare Products-->
          <div class="block block-list block-compare">
            <div class="block-title"> <strong><span>nginx的反向代理</span></strong> </div>
            <div class="block-content">
              <p class="empty">用户访问时由nginx决定哪个服务器提供服务</p>
            </div>
          </div>
          <!--Start of Compare Products--> 
          
          <!--Start of Poll-->
          <div class="block block-poll">
            <div class="block-title"> <strong><span>Nginx只做请求的转发</span></strong> </div>
            <form id="pollForm" method="post" onsubmit="return validatePollAnswerIsSelected();" action="#">
              <div class="block-content">
                <p class="block-subtitle">后台有多个http服务器提供服务</p>
                <ul id="poll-answers">
                  <li class="odd">
                    <input name="vote" class="radio poll_vote" id="vote_5" value="5" type="radio" />
                    <span class="label">
                    <label for="vote_5">nginx的功能就是把请求转发给后面的服务器</label>
                    </span> </li>
                  <li class="even">
                    <input name="vote" class="radio poll_vote" id="vote_6" value="6" type="radio" />
                    <span class="label">
                    <label for="vote_6">通过访问不同的域名访问运行在不同端口的tomcat</label>
                    </span> </li>
                  <li class="odd">
                    <input name="vote" class="radio poll_vote" id="vote_7" value="7" type="radio" />
                    <span class="label">
                    <label for="vote_7">在配置文件中配置不同服务的地址</label>
                    </span> </li>
                  <li class="last even">
                    <input name="vote" class="radio poll_vote" id="vote_8" value="8" type="radio" />
                    <span class="label">
                    <label for="vote_8">如果在同一个域名下有多台服务器提供服务，此时需要nginx负载均衡</label>
                    </span> </li>
                </ul>
                <div class="actions">
                  <button type="submit" title="Vote" class="button"><span><span>Vote</span></span></button>
                </div>
              </div>
            </form>
          </div>
          <!--End of Poll--> 
        </div>
      </div>
      <div style="display: none;" id="back-top"> <a href="#"><img alt="" src="images/backtop.gif" /></a> </div>
    </div>
    <!--END OF MAIN CONTENT--> 
    
    <!--START OF FOOTER-->
<jsp:include page="newfooter.jsp" />
    <!--END OF FOOTER--> 
  </div>
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
<script type="text/javascript">
	var redirectUrl = "${redirect}";
	var LOGIN = {
			checkInput:function() {
				if ($("#loginname").val() == "") {
					alert("用户名不能为空");
					$("#loginname").focus();
					return false;
				}
				if ($("#nloginpwd").val() == "") {
					alert("密码不能为空");
					$("#nloginpwd").focus();
					return false;
				}
				return true;
			},
			doLogin:function() {
				$.post("/user/login", $("#formlogin").serialize(),function(data){
					if (data.status == 200) {
						alert("登录成功！");
						if (redirectUrl == "") {
							location.href = "http://localhost:8082";
						} else {
							location.href = redirectUrl;
						}
					} else {
						alert("登录失败，原因是：" + data.msg);
						$("#loginname").select();
					}
				});
			},
			login:function() {
				if (this.checkInput()) {
					this.doLogin();
				}
			}
		
	};
	$(function(){
		$("#loginsubmit").click(function(){
			LOGIN.login();
		});
	});
</script>
</div>

<!--end pages box-->
<!--END OF WRAPPER-->

</body>
</html>