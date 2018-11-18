<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Sanatana HTML Version - Product</title>
<meta name="description" content="Default Description" />
<meta name="keywords" content="Santana, Varien, E-commerce" />
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

<script type="text/javascript" src="/js/menu.js"></script>
<script type="text/javascript" src="/js/banner_pack.js"></script>
<script type="text/javascript" src="/js/light_box.js"></script>
<script type="text/javascript" src="/js/cloud-zoom.1.0.2.js"></script>
<script type="text/javascript" src="/js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="/js/jquery.jcarousel.min.js"></script>
<script type="text/javascript" src="/js/jquery.mix.js"></script>
<script type="text/javascript" src="/js/icy.js" charset="utf-8"></script>
<script type="text/javascript" src="/js/base-v1.js" charset="utf-8"></script>

</head>
<body id="bg_color" class=" cms-index-index cms-home">
<!--START OF WRAPPER-->
<jsp:include page="commons/newheader.jsp" />

    
    <!--START OF MAIN CONTENT-->
    <div class="main-container col1-layout">
      <div class="main">
        <div class="col-main">
          <div id="messages_product_view"></div>
          <div class="product-view">
            <div class="product-essential"> 
              <!--Start Product Information Right-->
              <div class="product-shop"> 
                <!--Prev/Next Code Start-->
                <div class="f-fix mb-10"><a href="#" class="prod-prev">PREV</a> <a class="prod-next" href="#">NEXT</a> </div>
                <!--Prev/Next Code End--> 
                <!--Product Title-->
                <div class="product-name">
                  <h1>${item.title }</h1>
                  
                </div>
                <p class="availability in-stock"><span>有库存</span></p>
                <div class="price-box"> <span class="regular-price" id="product-price-167"> <span class="price">￥：${item.price / 100 }</span> </span> </div>
                <div class="pro-left">
                  <div class="short-description">
                    <h2>卖点：</h2>
                    <div class="std"> <strong>${item.sellPoint}</strong></div>
                  </div>
                  <div class="review">
                    <p class="no-rating"><a href="#">本产品全国联保，享受三包服务，质保期为：一年质保<br />
						在“客户服务-返修退换货”页面提交退换申请，将有专业售后人员提供服务。<br />您可以查询本品牌在各地售后服务中心的联系方式，</a></p>
                    <div class="size_guide"><a class="ajax" href=""><span>您可以查询本品牌在各地售后服务中心的联系方式，</span> </a></div>
                  </div>
                </div>
                <div class="pro-right">
                  <ul class="add-to-links">
                    <li><a href="#" class="link-wishlist">好评</a></li>
                    <li><span class="separator">|</span> <a href="#" class="link-compare">比较商品</a></li>
                  </ul>
                  <p class="email-friend"><a href="#">分享给伙伴</a></p>
                  <div class="add-to-box">
                    <div class="add-to-cart">
                      <label for="qty">Qty:</label>
                      <input name="qty" id="qty" maxlength="12" value="1" title="Qty" class="input-text qty" type="text" />
                      <a href="javascript:void(0)" id="reset_btn">Reset</a>
                      <button type="button" title="Add to Cart" class="button btn-cart" onclick="productAddToCartForm.submit(this)"><span><span><a href="/cart/add/${item.id}.html">加入购物车</></span></span></button>
                      <div class="add"></div>
                      <div class="dec add"></div>
                    </div>
                  </div>
                </div>
              </div>
              <!--End Product Information Right--> 
              
              <!--Start Product Image Zoom Left-->
              <div class="product-img-box">
                <p class="product-image product-image-zoom"> <a href='${item.images[0]}' class = 'cloud-zoom' id='zoom1'
            rel="adjustX: 10, adjustY:-4"> <img style="max-height:400px; width:400px;" src="${item.images[0]}" alt='' title="Optional title display" /> </a> </p>
                <div class="more-views">
                  <div class=" jcarousel-skin-tango">
                    <ul id="more_view">
                      <li><a href='${item.images[1]}' class='cloud-zoom-gallery' title='Thumbnail 1'
        	rel="useZoom: 'zoom1', smallImage: '${item.images[1]}' "> <img style="max-height:92px; width:92px;" src="${item.images[1]}" alt = "Thumbnail 1"/></a></li>
                      <li> <a href='${item.images[2]}' class='cloud-zoom-gallery' title='Thumbnail 2'
        	rel="useZoom: 'zoom1', smallImage: ' ${item.images[2]}'"> <img style="max-height:90px; width:90px;" src="${item.images[2]}" alt = "Thumbnail 2"/></a> </li>
                      <li><a href='${item.images[3]}' class='cloud-zoom-gallery' title='Thumbnail 3'
        	rel="useZoom: 'zoom1', smallImage: '${item.images[3]}' "> <img style="max-height:90px; width:90px;" src="${item.images[3]}" alt = "Thumbnail 3"/></a></li>
                     
                   
                    </ul>
                  </div>
                </div>
                <script type="text/javascript">
     	jQuery(document).ready(function(){
			jQuery('#product_tabs_description').click(function(){
				jQuery('#product_tabs_description_contents').css('display','block');
				jQuery('#product_tabs_product').css('display','none');
				jQuery('#product_tabs_form_contents').css('display','none');
				});
			jQuery('#product_tabs_product_tag').click(function(){
				jQuery('#product_tabs_description_contents').css('display','none');
				jQuery('#product_tabs_product').css('display','block');
				jQuery('#product_tabs_form_contents').css('display','none');
				});
			jQuery('#product_tabs_form').click(function(){
				jQuery('#product_tabs_description_contents').css('display','none');
				jQuery('#product_tabs_product').css('display','none');
				jQuery('#product_tabs_form_contents').css('display','block');
				});
			
			});
     </script> 
              </div>
              <!--End Product Image Zoom Left-->
              <div class="clearer"></div>
            </div>
            
            <!--Start Product Tabs-->
            <div class="product-collateral">
              <ul class="product-tabs">
                <li id="product_tabs_description" class=" active first"><a href="javascript:void(0)">商品描述</a></li>
                <li id="product_tabs_product_tag" class=""><a href="javascript:void(0)">规格参数</a></li>
                <li id="product_tabs_form" class="last"><a href="javascript:void(0)">评价</a></li>
              </ul>
              <div class="product-tabs-content" id="product_tabs_description_contents">
                <h2>商品详情</h2>
                <div class="std">						${itemDesc.itemDesc } </div>
              </div>
              <div style="display: none;" class="product-tabs-content" id="product_tabs_product">
                <div class="box-collateral box-tags">
                  <h2>规格参数</h2>
                  <form id="addTagForm" method="get" action="#">
                    <div class="form-add">
                      
                      				${itemParam.paramData} 
                      
                      
                   
                    </div>
                  </form>
               
                </div>
              </div>
              <div style="display: none;" class="product-tabs-content" id="product_tabs_form_contents">
                <div class="form-add">
                  <h2>写下你的评价</h2>
                  <form  method="post" id="review-form" action="#">
                    <fieldset>
                      <h3>写下你的评价 <span>你有多喜欢这件商品</span></h3>
                      <h4>对它的评价有多高? <em class="required">*</em></h4>
                      <span id="input-message-box"></span>
                      <table class="data-table" id="product-review-table">
                        <thead>
                          <tr class="first last">
                            <th>&nbsp;</th>
                            <th><span class="nobr">1 star</span></th>
                            <th><span class="nobr">2 stars</span></th>
                            <th><span class="nobr">3 stars</span></th>
                            <th><span class="nobr">4 stars</span></th>
                            <th><span class="nobr">5 stars</span></th>
                          </tr>
                        </thead>
                        <tbody>
                          <tr class="first odd">
                            <th>质量</th>
                            <td class="value"><input name="ratings[1]" id="Quality_1" value="1" class="radio" type="radio" /></td>
                            <td class="value"><input name="ratings[1]" id="Quality_2" value="2" class="radio" type="radio" /></td>
                            <td class="value"><input name="ratings[1]" id="Quality_3" value="3" class="radio" type="radio" /></td>
                            <td class="value"><input name="ratings[1]" id="Quality_4" value="4" class="radio" type="radio" /></td>
                            <td class="value last"><input name="ratings[1]" id="Quality_5" value="5" class="radio" type="radio" /></td>
                          </tr>
                          <tr class="even">
                            <th>价格</th>
                            <td class="value"><input name="ratings[3]" id="Price_1" value="11" class="radio" type="radio" /></td>
                            <td class="value"><input name="ratings[3]" id="Price_2" value="12" class="radio" type="radio" /></td>
                            <td class="value"><input name="ratings[3]" id="Price_3" value="13" class="radio" type="radio" /></td>
                            <td class="value"><input name="ratings[3]" id="Price_4" value="14" class="radio" type="radio" /></td>
                            <td class="value last"><input name="ratings[3]" id="Price_5" value="15" class="radio" type="radio" /></td>
                          </tr>
                          <tr class="last odd">
                            <th>价值</th>
                            <td class="value"><input name="ratings[2]" id="Value_1" value="6" class="radio" type="radio" /></td>
                            <td class="value"><input name="ratings[2]" id="Value_2" value="7" class="radio" type="radio" /></td>
                            <td class="value"><input name="ratings[2]" id="Value_3" value="8" class="radio" type="radio" /></td>
                            <td class="value"><input name="ratings[2]" id="Value_4" value="9" class="radio" type="radio" /></td>
                            <td class="value last"><input name="ratings[2]" id="Value_5" value="10" class="radio" type="radio" /></td>
                          </tr>
                        </tbody>
                      </table>
                      <input name="validate_rating" class="validate-rating" value="" type="hidden" />
                      <ul class="form-list">
                        <li>
                          <label for="nickname_field" class="required"><em>*</em>昵称</label>
                          <div class="input-box">
                            <input name="nickname" id="nickname_field" class="input-text required-entry" type="text" />
                          </div>
                        </li>
                        <li>
                          <label for="summary_field" class="required"><em>*</em>总结一下你的观点</label>
                          <div class="input-box">
                            <input name="title" id="summary_field" class="input-text required-entry" type="text" />
                          </div>
                        </li>
                        <li>
                          <label for="review_field" class="required"><em>*</em>评论</label>
                          <div class="input-box">
                            <textarea name="detail" id="review_field" cols="5" rows="3" class="required-entry"></textarea>
                          </div>
                        </li>
                      </ul>
                    </fieldset>
                    <div class="buttons-set">
                      <button type="submit" title="Submit Review" class="button"><span><span>提交评论</span></span></button>
                    </div>
                  </form>
                </div>
              </div>
            </div>
            <!--End Product Tabs--> 
          </div>
        </div>
      </div>
      <div style="display: none;" id="back-top"> <a href="#"><img alt="" src="images/backtop.gif" /></a> </div>
    </div>
    <!--END OF MAIN CONTENT--> 
    
    <!--START OF FOOTER-->
<jsp:include page="commons/newfooter.jsp" />
<!--end pages box-->
<!--END OF WRAPPER-->
<script type="text/javascript">
	var itemControl = {
			param:{
				descUrl:"/item/desc/",
				paramUrl:"/item/param/"
			},
			//请求商品描述
			getItemDesc:function(itemId) {
				$.get(itemControl.param.descUrl+itemId+".html", function(data){
					//返回商品描述的html，直接显示到页面
					$("#item-desc").append(data);
				});
			},
			//参数请求flag
			haveParam:false,
			//请求规格参数
			getItemParam:function(itemId) {
				//如果没有查询过规格参数，就做请求
				if (!itemControl.haveParam) {
					$.get(itemControl.param.paramUrl+itemId+".html", function(data){
						//返回商品规格的html，直接显示到页面
						$("#product-detail-2").append(data);
						//更改flag状态
						itemControl.haveParam = true;
					});
				}
			}
	};
	$(function(){
		//取商品id
		var itemId = "${item.id}";
		//给商品规格参数tab页绑定事件
		$("#p-con-attr").bind("click", function(){
			
			itemControl.getItemParam(itemId);
		});
		//延迟一秒加载商品描述信息
		setTimeout(function(){
			itemControl.getItemDesc(itemId);
		},1000);
	});
</script>
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