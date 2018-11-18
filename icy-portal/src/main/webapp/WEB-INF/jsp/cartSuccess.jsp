<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Sanatana HTML Version - Home</title>
<meta name="description" content="Default Description" />
<meta name="keywords" content="Magento, Varien, E-commerce" />
<meta name="robots" content="INDEX,FOLLOW" />
<link rel="icon" href="#" type="/images/x-icon" />
<link rel="shortcut icon" href="#" type="/images/x-icon" />

<!-- CSS =====================================================================================-->
<link href='http://fonts.googleapis.com/css?family=Telex' rel='stylesheet' type='text/css' />

<link rel="stylesheet" type="text/css" href="/css/styles.css" media="all" />
<link rel="stylesheet" type="text/css" href="/css/skin.css" media="all" />
<link rel="stylesheet" type="text/css" href="/css/cloud-zoom.css" media="all" />
<link rel="stylesheet" type="text/css" href="/css/light_box.css" media="all" />
<link rel="stylesheet" type="text/css" href="/css/mix.css" media="all" />
<link rel="stylesheet" type="text/css" href="/css/banner.css" media="all" />
<link rel="stylesheet" type="text/css" href="/css/magicat.css" media="all" />
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
<script type="text/javascript" src="/js/base-v1.js" charset="utf-8"></script>
<style id="style-1-cropbar-clipper">
/* Copyright 2014 Evernote Corporation. All rights reserved. */
.en-markup-crop-options {
	top: 18px !important;
	left: 50% !important;
	margin-left: -100px !important;
	width: 200px !important;
	border: 2px rgba(255, 255, 255, .38) solid !important;
	border-radius: 4px !important;
}

.en-markup-crop-options div div:first-of-type {
	margin-left: 0px !important;
}
</style>
</head>
<body id="bg_color" class=" cms-index-index cms-home">
<!--START OF WRAPPER-->

    
    <!--START OF HEADER-->
    
<jsp:include page="commons/newheader.jsp" />





    
    <!--START OF MAIN CONTENT-->
    <div class="main-container col1-layout"> 
      <!--Start of Home Content-->
      <div class="main">
       
    <div class="w main">
		<div class="">
			<div class="m" id="succeed">

				<div class="corner tl"></div>
				<div class="corner tr"></div>
				<div class="corner bl"></div>
				<div class="corner br"></div>
				<div class="success">
					<div class="success-b">
						<h1>商品已成功加入购物车！</h1><br /><br />
						<span id="flashBuy" ">商品数量有限，请您尽快下单并付款！</span>
						<br /><br /><br /><br /><br />
					</div>
					<h1><span id="initCart_next_go"> <a class="button"
						href="/cart/cart.html"
						id="GotoShoppingCart">去购物车结算</a> 
						<br />
						<br />
						<br />
						<br />
						<span class="ml10">您还可以 <a
							class="button" href="javascript:history.back();">继续购物</a></span></h1>
					</span>
				</div>
			</div>
			<!--succeed end-->

		</div>
	</div>
            <!--End New Products--> 
            
          </div>
        </div>
      </div>
      <!--End of Home Content--> 
      <div style="display: none;" id="back-top"> <a href="#"><img alt="" src="/images/backtop.gif" /></a> </div>
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