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
<link rel="icon" href="#" type="image/x-icon" />
<link rel="shortcut icon" href="#" type="image/x-icon" />

<!-- CSS =====================================================================================-->
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


<jsp:include page="commons/newheader.jsp" />
    
    <!--START OF MAIN CONTENT-->
    <div class="main-container col1-layout"> 
      <!--Start of Home Content-->
      <div class="main">
        <div class="col-main">
          <div class="std"> 
            
            <!--Start Banner-->
            <div class="banner_box">
              <div class="slider-wrapper banner"> 
                <!--Place your banner images-->
                <div id="slider" class="banner_slider"> <a href="#">${ad1} </a> <a href="#">${ad2 } </a> <a href="#">${ad3 }</a> <a href="#">${ad4 }</a> </div>
              </div>
              <div class="promotional_block"> <!--Place your promotional images-->
                <div class="block_one"> <a href="#"><img src="images/promo1.jpg" alt="" /></a> </div>
                <div class="block_one"> <a href="#"><img src="images/promo2.jpg" alt="" /></a> </div>
                <div class="block_two"> <a href="#"><img src="images/promo3.jpg" alt="" /></a> </div>
              </div>
            </div>
            <!--End Banner--> 
            
            <!--Start New Products-->
            <div class="box-center">
              <div class="special">
                <div style="visibility: visible;" id="mix_container" class="mix_container">
                  <h1 class="category_page_title">新品上市(暂未实现敬请期待)</h1>
                  <div class="mix_nav"> <span id="mix_prev" class="mix_prev">Previous</span> <span id="mix_next" class="mix_next">Next</span> </div>
                  <div id="container" class="mix_wrapper">
                    <ul style="position: relative;" class="mix_gallery">
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro1.jpg" alt="Imperdiet id tincidunt " /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a rel="example_group" href="images/zoom1.jpg" class="fancybox quickllook" id="fancybox170">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro2.jpg" alt="Imperdiet id tincidunt " /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro3.jpg" alt="Imperdiet id tincidunt " /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro4.jpg" alt="Imperdiet id tincidunt " /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row last">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro5.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro6.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro7.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro8.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro9.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row last">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro10.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro11.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro12.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro13.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro14.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row last">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro15.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro16.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro17.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro18.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro19.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row last">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro20.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro21.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro22.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro23.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro24.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row last">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro25.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro26.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro27.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro28.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro29.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row last">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro30.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro31.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro32.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                      <li class="item mix_row">
                        <div class="outer box"> <a href="#" class="product-image"><img src="images/pro33.jpg" alt="Imperdiet id tincidunt" /></a>
                          <div class="ic_caption">
                            <h2 class="product-name"><a href="#" title="Imperdiet id tincidunt ">Imperdiet id tincidunt </a></h2>
                            <div class="actions">
                              <button style="display:none;" type="button" title="Add to Cart" class="button btn-cart"> <span> <span>Add to Cart</span> </span> </button>
                              <a href="#" class="fancybox quickllook">Quick look</a>
                              <div class="price-box"> <span class="regular-price"> <span class="price">$190.00</span> </span> </div>
                            </div>
                          </div>
                        </div>
                      </li>
                    </ul>
                  </div>
                </div>
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
 
<!--end pages box-->
<!--END OF WRAPPER-->
<jsp:include page="commons/newfooter.jsp" />
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