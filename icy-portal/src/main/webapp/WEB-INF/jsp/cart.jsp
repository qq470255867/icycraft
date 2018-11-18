<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Sanatana HTML Version - Home</title>
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

<script type="text/javascript" src="/js/jquery-1.6.1.min.js"></script>
<script type="text/javascript" src="/js/jquery.price_format.2.0.min.js"></script>
<script type="text/javascript" src="/js/prototype.js"></script>

<script type="text/javascript" src="/js/common.js"></script>
<script type="text/javascript" src="/js/menu.js"></script>
<script type="text/javascript" src="/js/banner_pack.js"></script>
<script type="text/javascript" src="/js/light_box.js"></script>
<script type="text/javascript" src="/js/cloud-zoom.1.0.2.js"></script>
<script type="text/javascript" src="/js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="/js/jquery.jcarousel.min.js"></script>
<script type="text/javascript" src="/js/jquery.mix.js"></script>
<script type="text/javascript" src="/js/cart.js"></script>
<script type="text/javascript" src="/js/jquery.price_format.2.0.min.js"></script>
<script type="text/javascript" src="/js/base-v1.js" charset="utf-8"></script>
<link href="/css/purchase.2012.css?v=201410141639" rel="stylesheet" type="text/css">
<!-- Scripts =====================================================================================-->



</head>
<body id="bg_color" class=" cms-index-index cms-home">
<!--START OF WRAPPER-->
<jsp:include page="commons/newheader.jsp" />
    <!--END OF HEADER--> 
    
    <!--START OF MAIN CONTENT-->
    <div class="main-container col1-layout"> 
      <!--Start of Home Content-->
      <div class="main">
        <div class="col-main">
          <div class="std"> 
            
           
            <!--End Banner--> 
            
            <!--Start New Products-->

<div class="w cart">
	<div class="cart-hd group">
		<h2>我的购物车</h2>
	</div>
	<div id="show">
	
<div class="cart-frame">
    <div class="tl"></div>
    <div class="tr"></div>
</div>
<div class="cart-inner">
    <div class="cart-thead clearfix">
        <div class="column t-checkbox form"><input data-cart="toggle-cb" name="toggle-checkboxes" id="toggle-checkboxes_up" type="checkbox" checked="" value=""><label for="toggle-checkboxes_up">全选</label></div>
        <div class="column t-goods">商品</div>
        <div class="column t-price">淘淘价</div>
        <div class="column t-promotion">优惠</div>
        <div class="column t-inventory">库存</div>
        <div class="column t-quantity">数量</div>
        <div class="column t-action">操作</div>
    </div>
    <div id="product-list" class="cart-tbody">
        <!-- ************************商品开始********************* -->
        <c:set var="totalPrice" value="0"></c:set>
        <c:forEach items="${cartList}" var="cart">
        	<c:set var="totalPrice"  value="${ totalPrice + (cart.price * cart.num)}"/>
	        <div id="product_11345721" data-bind="rowid:1" class="item item_selected ">
		        <div class="item_form clearfix">
		            <div class="cell p-checkbox"><input data-bind="cbid:1" class="checkbox" type="checkbox" name="checkItem" checked="" value="11345721-1"></div>
		            <div class="cell p-goods">
		                <div class="p-img">
		                	<a href="/item/${cart.id }.html" target="_blank">
		                		<img clstag="clickcart|keycount|xincart|p-imglistcart" src="${cart.image}" alt="${cart.title}" width="52" height="52">
		                	</a>
		                </div>    
		                <div class="p-name">
		                	<a href="/item/${cart.id }.html" clstag="clickcart|keycount|xincart|productnamelink" target="_blank">${cart.title}</a>
		                	<span class="promise411 promise411_11345721" id="promise411_11345721"></span>
		                </div>    
		            </div>
		            <div class="cell p-price"><span class="price">¥<fmt:formatNumber groupingUsed="false" value="${cart.price / 100}" maxFractionDigits="2" minFractionDigits="2"/> </span></div>
		            <div class="cell p-promotion">
		            </div>
		            <div class="cell p-inventory stock-11345721">有货</div>
		            <div class="cell p-quantity" for-stock="for-stock-11345721">
		                <div class="quantity-form" data-bind="">
		                    <a href="javascript:void(0);" class="decrement" clstag="clickcart|keycount|xincart|diminish1" id="decrement">-</a>
		                    <input type="text" class="quantity-text" itemPrice="${cart.price}" itemId="${cart.id}" value="${cart.num }" id="changeQuantity-11345721-1-1-0">
		                    <a href="javascript:void(0);" class="increment" clstag="clickcart|keycount|xincart|add1" id="increment">+</a>
		                </div>
		            </div>
		            <div class="cell p-remove"><a id="remove-11345721-1" data-more="removed-87.20-1" clstag="clickcart|keycount|xincart|btndel318558" class="cart-remove" href="/cart/delete/${cart.id}.html">删除</a>
		            </div>
		        </div>
	        </div> 
        </c:forEach>
        
    </div><!-- product-list结束 -->
          <div class="cart-toolbar clearfix">
            <div class="total fr">
                <h3><p><span class="totalSkuPrice">¥<fmt:formatNumber value="${totalPrice / 100}" maxFractionDigits="2" minFractionDigits="2" groupingUsed="true"/></span>总计：</p></h3>
                <h3><font color="green"><p><span id="totalRePrice">- ¥0.00</span>优惠：</p></font></h3>
            </div>
             <div class="total fr" >
            <h3><div class="amout fr"><span id="selectedCount"></span> 合计</div></h3>
                  
                  <h3><font color="red"><span class="totalSkuPrice">¥<fmt:formatNumber value="${totalPrice / 100}" maxFractionDigits="2" minFractionDigits="2" groupingUsed="true"/></span></font></h3>
                  
              </div>
        </div>
        <div class="ui-ceilinglamp-1" style="width: 988px; height: 49px;"><div class="cart-dibu ui-ceilinglamp-current" style="width: 957px; height: 49px;">
          <div class="control fdibu fdibucurrent">
              <span class="column t-checkbox form">
                  <input data-cart="toggle-cb" name="toggle-checkboxes" id="toggle-checkboxes_down" type="checkbox" checked="" value="" class="jdcheckbox">
                  <label for="toggle-checkboxes_down">
                          全选
                  </label>
              </span>
              <span class="delete">
                  <b>
                  </b>
                  <a href="javascript:void(0);" clstag="clickcart|keycount|xincart|clearcartlink" id="remove-batch">
                          删除选中的商品
                  </a>
              </span>
              <span class="shopping">
                  <b>
                  </b>
                  <a href="/" target="_blank" clstag="clickcart|keycount|xincart|coudanlink" id="continue">继续购物</a>
              </span>
          </div>
          <div class="cart-total-2014">
              <div class="cart-button" style=" height: 20px;">
                  <span class="check-comm-btns" id="checkout-jd">
                      <a  href="/order/order-cart.html" clstag="clickcart|keycount|xincart|gotoOrderInfo" id="toSettlement"> <button type="submit" title="Vote" class="button"><span><span>去订单页面结算</span></span></button><b></b></a>
                  </span>
                  <span class="combine-btns" style="display:none">
                        <span class="fore1" style="display: none;">
                          <a href="" class="combine-btn">不支持合并付款</a>
                      </span>
                 
                  </span>
              </div>
              &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp

          </div>
      </div></div>
</div><!-- cart-inner结束 -->
</div>
</div>

            <!--End New Products--> 
            
          </div>
        </div>
      </div>
      <!--End of Home Content--> 
      <div style="display: none;" id="back-top"> <a href="#"><img alt="" src="images/backtop.gif" /></a> </div>
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