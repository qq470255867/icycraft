/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-11-15 06:23:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fgroupingUsed_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fgroupingUsed_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fgroupingUsed_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<title>Sanatana HTML Version - Category</title>\r\n");
      out.write("<meta name=\"description\" content=\"Default Description\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Magento, Varien, E-commerce\" />\r\n");
      out.write("<meta name=\"robots\" content=\"INDEX,FOLLOW\" />\r\n");
      out.write("<link rel=\"icon\" href=\"#\" type=\"image/x-icon\" />\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"#\" type=\"image/x-icon\" />\r\n");
      out.write("\r\n");
      out.write("<!-- CSS =====================================================================================-->\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Telex' rel='stylesheet' type='text/css' />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/styles.css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/skin.css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/cloud-zoom.css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/light_box.css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/mix.css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/banner.css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/magicat.css\" media=\"all\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/psearch20131008.css\" media=\"all\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Telex' rel='stylesheet' type='text/css' />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/skin.css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/cloud-zoom.css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/light_box.css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/mix.css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/banner.css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/magicat.css\" media=\"all\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Scripts =====================================================================================-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/prototype.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-1.6.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/common.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/menu.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/banner_pack.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/light_box.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/cloud-zoom.1.0.2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery.jcarousel.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery.mix.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/base-v1.js\" charset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"bg_color\" class=\" cms-index-index cms-home\">\r\n");
      out.write("<!--START OF WRAPPER-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!--START OF HEADER-->\r\n");
      out.write("   ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "commons/newheader.jsp", out, false);
      out.write("<!--END OF HEADER--> \r\n");
      out.write("    \r\n");
      out.write("    <!--START OF MAIN CONTENT-->\r\n");
      out.write("    <div class=\"main-container col2-left-layout\">\r\n");
      out.write("      <div class=\"main\">\r\n");
      out.write("        <div class=\"col-main\"> \r\n");
      out.write("          <!--Category Title-->\r\n");
      out.write("          <div class=\"page-title category-title\">\r\n");
      out.write("            <h1>Womens</h1>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!--Category Image-->\r\n");
      out.write("                                 <div class=\"toolbar\">\r\n");
      out.write("              <div class=\"pager\">\r\n");
      out.write("                <div class=\"limiter\">\r\n");
      out.write("                  <label>Show</label>\r\n");
      out.write("                  <select>\r\n");
      out.write("                    <option selected=\"selected\"> 9 </option>\r\n");
      out.write("                    <option> 15 </option>\r\n");
      out.write("                    <option> 30 </option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"sorter\">\r\n");
      out.write("                <p class=\"view-mode\">\r\n");
      out.write("                  <label>View as:</label>\r\n");
      out.write("                  <strong title=\"Grid\" class=\"grid\">Grid</strong>&nbsp; <a href=\"#\" title=\"List\" class=\"list\">List</a>&nbsp; </p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"pagination\">\r\n");
      out.write("                <div class=\"pages\"> <strong>Page:</strong>\r\n");
      out.write("                  <ol>\r\n");
      out.write("\t<a href=\"?&page=1\">1</a>\r\n");
      out.write("\t<a href=\"?&page=2\">2</a>\r\n");
      out.write("\t<a href=\"?&page=3\">3</a>\r\n");
      out.write("\t<a href=\"?&page=4\">4</a>\r\n");
      out.write("\t<a href=\"?&page=5\">5</a>\r\n");
      out.write("\t<a href=\"?&page=6\">6</a>\r\n");
      out.write("                  </ol>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          <p class=\"category-image\"><img src=\"/images/women.jpg\" alt=\"Womens\" title=\"Womens\"/></p>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"category-products\"> \r\n");
      out.write("            <!--Start toolbar-->\r\n");
      out.write("            \r\n");
      out.write("            <!--End toolbar--> \r\n");
      out.write("            \r\n");
      out.write("            <!--Start Category Product List-->\r\n");
      out.write("           \r\n");
      out.write("           <div class=\"m psearch \" id=\"plist\">\r\n");
      out.write("<ul class=\"list-h clearfix\" tpl=\"2\">\r\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${msg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("</ul></div>\r\n");
      out.write("\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("            <!--End Category Product List--> \r\n");
      out.write("            \r\n");
      out.write("            <!--Start toolbar bottom-->\r\n");
      out.write("            \r\n");
      out.write("            <!--End toolbar bottom--> \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-left sidebar\"> \r\n");
      out.write("          <!--Start Magic Category Block-->\r\n");
      out.write("          <div class=\"magicat-container\">\r\n");
      out.write("            <div class=\"block\">\r\n");
      out.write("              <div class=\"block-title cat_heading\"> <strong><span>跨域问题</span></strong> </div>\r\n");
      out.write("              <ul id=\"magicat\">\r\n");
      out.write("                <li class=\"first level0-inactive level0 inactive\"><span class=\"magicat-cat\"><a href=\"#\"><span>同源策略是浏览器一种安全策略</span></a></span> </li>\r\n");
      out.write("                <li class=\"level0-inactive level0 inactive\"><span class=\"magicat-cat\"><a href=\"#\"><span>目的是为了保护用户信息安全</span></a></span> </li>\r\n");
      out.write("                <li class=\"level0-inactive level0 inactive\"><span class=\"magicat-cat\"><a href=\"#\"><span>同源指域名，协议，端口相同</span></a></span> </li>\r\n");
      out.write("                <li class=\"level0-inactive level0 inactive\"><span class=\"magicat-cat\"><a href=\"#\"><span>不可避免带来了跨域问题</span></a></span> </li>\r\n");
      out.write("                <li class=\"last level0-inactive level0 inactive\"><span class=\"magicat-cat\"><a href=\"#\"><span>cookie无法读取</span></a></span></li>\r\n");
      out.write("                 <li class=\"last level0-inactive level0 inactive\"><span class=\"magicat-cat\"><a href=\"#\"><span>ajax请求不能发送</span></a></span></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!--End Magic Category Block--> \r\n");
      out.write("          \r\n");
      out.write("          <!--Start Layered nav-->\r\n");
      out.write("          <div class=\"block block-layered-nav\">\r\n");
      out.write("            <div class=\"block-title\"> <strong><span>无法从另一域名中调用服务</span></strong> </div>\r\n");
      out.write("            <div class=\"block-content\">\r\n");
      out.write("              <div id=\"narrow-by-list\">\r\n");
      out.write("                <div>\r\n");
      out.write("                  <div class=\"last collapse\" id=\"filter_heading\">同名为安全</div>\r\n");
      out.write("                  <div class=\"last odd\" id=\"filter_content\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                      <li> <a href=\"#\"><span class=\"price\">不同名则为跨域</span> - </a> </li>\r\n");
      out.write("                      <li> <a href=\"#\"><span class=\"price\"></span></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t\tjQuery('#filter_heading').click(function() {\r\n");
      out.write("\t\t\t\t\t      jQuery('#filter_content').slideToggle('slow');\r\n");
      out.write("\t\t\t\t\t\t   jQuery(this).toggleClass(\"highlight\");\r\n");
      out.write("\t\t\t\t\t    });\r\n");
      out.write("\t\t\t\t\t</script> \r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!--End Layered nav--> \r\n");
      out.write("          \r\n");
      out.write("          <!--Start Compare Products-->\r\n");
      out.write("          <div class=\"block block-list block-compare\">\r\n");
      out.write("            <div class=\"block-title\"><strong><span>这里用到了jsonp</span></strong> </div>\r\n");
      out.write("            <div class=\"block-content\">\r\n");
      out.write("              <p class=\"empty\">其本质利用script标签具有可跨域特性</p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!--End Compare Products--> \r\n");
      out.write("          \r\n");
      out.write("          <!--Start Poll-->\r\n");
      out.write("          <div class=\"block block-poll\">\r\n");
      out.write("            <div class=\"block-title\"> <strong><span>由服务端返回预定义好的js函数的调用</span></strong> </div>\r\n");
      out.write("            <form action=\"#\">\r\n");
      out.write("              <div class=\"block-content\">\r\n");
      out.write("                <p class=\"block-subtitle\">将服务端数据以该函数形式传递过来</p>\r\n");
      out.write("                <ul id=\"poll-answers\">\r\n");
      out.write("                  <li class=\"odd\">\r\n");
      out.write("                    <input name=\"vote\" class=\"radio poll_vote\" id=\"vote_5\" value=\"5\" type=\"radio\"/>\r\n");
      out.write("                    <span class=\"label\">\r\n");
      out.write("                    <label for=\"vote_5\">就像script引用不同的数据源</label>\r\n");
      out.write("                    </span> </li>\r\n");
      out.write("                  <li class=\"even\">\r\n");
      out.write("                    <input name=\"vote\" class=\"radio poll_vote\" id=\"vote_6\" value=\"6\" type=\"radio\"/>\r\n");
      out.write("                    <span class=\"label\">\r\n");
      out.write("                    <label for=\"vote_6\">浏览器读到其src指定js脚本将会执行</label>\r\n");
      out.write("                    </span> </li>\r\n");
      out.write("                  <li class=\"odd\">\r\n");
      out.write("                    <input name=\"vote\" class=\"radio poll_vote\" id=\"vote_7\" value=\"7\" type=\"radio\"/>\r\n");
      out.write("                    <span class=\"label\">\r\n");
      out.write("                    <label for=\"vote_7\">只需要在进行访问的页面定义一个同名函数</label>\r\n");
      out.write("                    </span> </li>\r\n");
      out.write("                  <li class=\"last even\">\r\n");
      out.write("                    <input name=\"vote\" class=\"radio poll_vote\" id=\"vote_8\" value=\"8\" type=\"radio\"/>\r\n");
      out.write("                    <span class=\"label\">\r\n");
      out.write("                    <label for=\"vote_8\">json数据就会通过参数传递过来</label>\r\n");
      out.write("                    </span> </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <div class=\"actions\">\r\n");
      out.write("                  <button type=\"submit\" title=\"Vote\" class=\"button\"><span><span>Vote</span></span></button>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!--End Poll--> \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div style=\"display: none;\" id=\"back-top\"> <a href=\"#\"><img alt=\"\" src=\"images/backtop.gif\"/></a> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--END OF MAIN CONTENT--> \r\n");
      out.write("    \r\n");
      out.write("    <!--START OF FOOTER-->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "commons/newfooter.jsp", out, false);
      out.write("<!--end pages box-->\r\n");
      out.write("<!--END OF WRAPPER-->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  function downloadJSAtOnload() {\r\n");
      out.write("    var element = document.createElement(\"script\");\r\n");
      out.write("    element.src = \"js/menu.js\";\r\n");
      out.write("    document.body.appendChild(element);\r\n");
      out.write("  }\r\n");
      out.write("  if (window.addEventListener)\r\n");
      out.write("    window.addEventListener(\"load\", downloadJSAtOnload, false);\r\n");
      out.write("  else if (window.attachEvent)\r\n");
      out.write("    window.attachEvent(\"onload\", downloadJSAtOnload);\r\n");
      out.write("  else window.onload = downloadJSAtOnload;\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/products.jsp(112,0) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/products.jsp(112,0) '${itemList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${itemList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/products.jsp(112,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("item");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<li class=\"item-book\" bookid=\"11078102\">\r\n");
          out.write("\t<div class=\"p-img\">\r\n");
          out.write("\t\t<a target=\"_blank\" href=\"/item/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(".html\">\r\n");
          out.write("\t\t\t<img width=\"160\" height=\"160\" data-img=\"1\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.images[0]}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" />\r\n");
          out.write("\t\t</a>\r\n");
          out.write("\t</div>\r\n");
          out.write("\t<div class=\"p-name\">\r\n");
          out.write("\t\t<a target=\"_blank\" href=\"/item/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(".html\">\r\n");
          out.write("\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a>\r\n");
          out.write("\t</div>\r\n");
          out.write("\t<div class=\"p-price\">\r\n");
          out.write("\t\t<i>淘淘价：</i>\r\n");
          out.write("\t\t<strong>￥");
          if (_jspx_meth_fmt_005fformatNumber_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</strong>\r\n");
          out.write("\t</div>\r\n");
          out.write("\t\r\n");
          out.write("\t<div class=\"extra\">\r\n");
          out.write("\t\t\r\n");
          out.write("\t</div>\r\n");
          out.write("</li>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatNumber_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_005fformatNumber_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fgroupingUsed_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_005fformatNumber_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatNumber_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/products.jsp(127,11) name = groupingUsed type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatNumber_005f0.setGroupingUsed(false);
    // /WEB-INF/jsp/products.jsp(127,11) name = maxFractionDigits type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatNumber_005f0.setMaxFractionDigits(2);
    // /WEB-INF/jsp/products.jsp(127,11) name = minFractionDigits type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatNumber_005f0.setMinFractionDigits(2);
    // /WEB-INF/jsp/products.jsp(127,11) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatNumber_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.price / 100 }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fformatNumber_005f0 = _jspx_th_fmt_005fformatNumber_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatNumber_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fgroupingUsed_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fminFractionDigits_005fmaxFractionDigits_005fgroupingUsed_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f0);
    return false;
  }
}
