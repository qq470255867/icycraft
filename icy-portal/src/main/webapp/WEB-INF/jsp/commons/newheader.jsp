<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<!--START OF WRAPPER-->
<div class="wrapper">
  <div class="page"> 
    
    <!--START OF HEADER-->
    <div class="header-container">
      <div class="quick-access"> 
        <!--Start Block Cart-->
        <div class="block block-cart header_cart">
          <div class="block-content_pan">
            <div class="summary trigger-minicart">
              <h2 class="classy"> <span class="cart_icon"><img alt="" src="images/shoppingbag.png" /></span><a href="http://localhost:8082/cart/cart.html">0 item</a> </h2>
            </div>
            <div class="remain_cart" id="minicart">
              <p class="empty">${cartstatus }</p>
              <div class="actions">
                <p class="subtotal"> <span class="label">价值￥:</span> <span class="price">${totalprice }</span> </p>
                <button type="button" title="Checkout" class="button"><span><span>去结账</span></span></button>
              </div>
            </div>
          </div>
        </div>
        <!--End Block Cart--> 
        
        <!--Start Toplinks-->
        <ul class="links">
          			${status }

        </ul>
        <!--End Toplinks--> 
        
        <!--Start Language-->
        <div class="form-language">
         <a href="#"> inssues</a>
        </div>
        <!--End Language--> 
        
        <!--Start Currency-->
        <div class="header_currency">
          <div class="block block-currency">
            <div class="block-content"> <a title="British Pound Sterling" class="currency_icon" style="background: url(images/currency_GBP.gif) no-repeat" href="#">British Pound</a> <a title="Euro" class="currency_icon" style="background:url(images/currency_EUR.gif) no-repeat" href="#">Euro</a> <a title="US Dollar" class="currency_icon selected" style="background: url(images/currency_USD.gif) no-repeat" href="#">US Dollar</a> </div>
          </div>
        </div>
        <!--End Currency--> 
        <div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >Website Template</a></div>
      </div>
      <!--Start Header Content-->
      <div class="header">
        <ul id="logo">
          <!--Left-->
          <li class="head-container"> <span>{</span>
            <h2 class="classy">简约，不简单</h2>
            <span>}</span>
            <p class="top-welcome-msg">欢迎光临冰笑风云！</p>
          </li>
          <!--Left--> 
          <!--Center Logo-->
          <li class="logo-box">
            <h1 class="logo"><strong>冰笑风云</strong><a href="/" title="Santana Commerce" class="logo"><img src="images/logo.png" alt="Santana Commerce" /></a></h1>
          </li>
          <!--Center Logo--> 
          
          <!--Right-->
              <li class="head-container"> <span>{</span>
            <h2 class="classy">试试在这里搜索</h2>
            <span>}</span>
            <div id="search-bar">
              <div class="top-bar">
                <form id="search_mini_form" action="#">
                  <div id="search-2013">
			<div class="">
				<ul id="shelper" class="hide">
				</ul>
				
					<div class="form">
					<input onfocus="if(this.value=='Search') {this.value=''};" onblur="if(this.value=='') {this.value='Search'};" value="Search" type="text" class="text" accesskey="s" id="key" autocomplete="off" onkeydown="javascript:if(event.keyCode==13) search('key');">
					&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
					
					 <button type="" title="Submit" onclick="search('key');return false;" clstag="homepage|keycount|home2013|03a" class="button"><span>点击搜索</span></button>				
				</div>
			</div>
			
		</div>
                </form>
              </div>
            </div>
          </li>
          <!--Right-->
        </ul>
        <!--Start of Navigation-->
        <div class="nav-container">
          <ul id="nav">
            <li><a href="/">主页</a></li>
            <li class="level0 nav-1 level-top first parent"> <a href="#" class="level-top"> <span>图书与音像</span> </a>
              <ul class="level0">
              ${cat1 }
              
            
                </li>
              </ul>
            </li>
            <li class="level0 nav-2 level-top parent"> <a href="#" class="level-top"> <span>电脑与办公</span> </a>
              <ul class="level0">
               ${cat2 }
                </li>
              </ul>
            </li>
            <li class="level0 nav-2 level-top parent"> <a href="#" class="level-top"> <span>手机与配件</span> </a>
              <ul class="level0">
               ${cat3 }
                </li>
              </ul>
            </li>
            <li class="level0 nav-2 level-top parent"> <a href="#" class="level-top"> <span>服饰与化妆</span> </a>
              <ul class="level0">
               ${cat4 }
                </li>
              </ul>
            </li>
            <li class="level0 nav-2 level-top parent"> <a href="#" class="level-top"> <span>电器与设备</span> </a>
              <ul class="level0">
               ${cat5 }
                </li>
              </ul>
            </li>
            <li class="level0 nav-2 level-top parent"> <a href="#" class="level-top"> <span>美食与饮品</span> </a>
              <ul class="level0">
               ${cat6 }
                </li>
              </ul>
            </li>
           
          </ul>
        </div>
        <!--End of Navigation--> 
      </div>
      <!--End Header Content--> 
    </div>
    <!--END OF HEADER--> 
</body>
</html>