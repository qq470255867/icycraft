/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-11-15 06:23:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.commons;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newheader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--START OF WRAPPER-->\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("  <div class=\"page\"> \r\n");
      out.write("    \r\n");
      out.write("    <!--START OF HEADER-->\r\n");
      out.write("    <div class=\"header-container\">\r\n");
      out.write("      <div class=\"quick-access\"> \r\n");
      out.write("        <!--Start Block Cart-->\r\n");
      out.write("        <div class=\"block block-cart header_cart\">\r\n");
      out.write("          <div class=\"block-content_pan\">\r\n");
      out.write("            <div class=\"summary trigger-minicart\">\r\n");
      out.write("              <h2 class=\"classy\"> <span class=\"cart_icon\"><img alt=\"\" src=\"images/shoppingbag.png\" /></span><a href=\"http://localhost:8082/cart/cart.html\">0 item</a> </h2>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"remain_cart\" id=\"minicart\">\r\n");
      out.write("              <p class=\"empty\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cartstatus }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("              <div class=\"actions\">\r\n");
      out.write("                <p class=\"subtotal\"> <span class=\"label\">价值￥:</span> <span class=\"price\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalprice }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span> </p>\r\n");
      out.write("                <button type=\"button\" title=\"Checkout\" class=\"button\"><span><span>去结账</span></span></button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--End Block Cart--> \r\n");
      out.write("        \r\n");
      out.write("        <!--Start Toplinks-->\r\n");
      out.write("        <ul class=\"links\">\r\n");
      out.write("          \t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("        <!--End Toplinks--> \r\n");
      out.write("        \r\n");
      out.write("        <!--Start Language-->\r\n");
      out.write("        <div class=\"form-language\">\r\n");
      out.write("         <a href=\"#\"> inssues</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--End Language--> \r\n");
      out.write("        \r\n");
      out.write("        <!--Start Currency-->\r\n");
      out.write("        <div class=\"header_currency\">\r\n");
      out.write("          <div class=\"block block-currency\">\r\n");
      out.write("            <div class=\"block-content\"> <a title=\"British Pound Sterling\" class=\"currency_icon\" style=\"background: url(images/currency_GBP.gif) no-repeat\" href=\"#\">British Pound</a> <a title=\"Euro\" class=\"currency_icon\" style=\"background:url(images/currency_EUR.gif) no-repeat\" href=\"#\">Euro</a> <a title=\"US Dollar\" class=\"currency_icon selected\" style=\"background: url(images/currency_USD.gif) no-repeat\" href=\"#\">US Dollar</a> </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--End Currency--> \r\n");
      out.write("        <div class=\"copyrights\">Collect from <a href=\"http://www.cssmoban.com/\" >Website Template</a></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--Start Header Content-->\r\n");
      out.write("      <div class=\"header\">\r\n");
      out.write("        <ul id=\"logo\">\r\n");
      out.write("          <!--Left-->\r\n");
      out.write("          <li class=\"head-container\"> <span>{</span>\r\n");
      out.write("            <h2 class=\"classy\">简约，不简单</h2>\r\n");
      out.write("            <span>}</span>\r\n");
      out.write("            <p class=\"top-welcome-msg\">欢迎光临冰笑风云！</p>\r\n");
      out.write("          </li>\r\n");
      out.write("          <!--Left--> \r\n");
      out.write("          <!--Center Logo-->\r\n");
      out.write("          <li class=\"logo-box\">\r\n");
      out.write("            <h1 class=\"logo\"><strong>冰笑风云</strong><a href=\"/\" title=\"Santana Commerce\" class=\"logo\"><img src=\"images/logo.png\" alt=\"Santana Commerce\" /></a></h1>\r\n");
      out.write("          </li>\r\n");
      out.write("          <!--Center Logo--> \r\n");
      out.write("          \r\n");
      out.write("          <!--Right-->\r\n");
      out.write("              <li class=\"head-container\"> <span>{</span>\r\n");
      out.write("            <h2 class=\"classy\">试试在这里搜索</h2>\r\n");
      out.write("            <span>}</span>\r\n");
      out.write("            <div id=\"search-bar\">\r\n");
      out.write("              <div class=\"top-bar\">\r\n");
      out.write("                <form id=\"search_mini_form\" action=\"#\">\r\n");
      out.write("                  <div id=\"search-2013\">\r\n");
      out.write("\t\t\t<div class=\"\">\r\n");
      out.write("\t\t\t\t<ul id=\"shelper\" class=\"hide\">\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"form\">\r\n");
      out.write("\t\t\t\t\t<input onfocus=\"if(this.value=='Search') {this.value=''};\" onblur=\"if(this.value=='') {this.value='Search'};\" value=\"Search\" type=\"text\" class=\"text\" accesskey=\"s\" id=\"key\" autocomplete=\"off\" onkeydown=\"javascript:if(event.keyCode==13) search('key');\">\r\n");
      out.write("\t\t\t\t\t&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t <button type=\"\" title=\"Submit\" onclick=\"search('key');return false;\" clstag=\"homepage|keycount|home2013|03a\" class=\"button\"><span>点击搜索</span></button>\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </li>\r\n");
      out.write("          <!--Right-->\r\n");
      out.write("        </ul>\r\n");
      out.write("        <!--Start of Navigation-->\r\n");
      out.write("        <div class=\"nav-container\">\r\n");
      out.write("          <ul id=\"nav\">\r\n");
      out.write("            <li><a href=\"/\">主页</a></li>\r\n");
      out.write("            <li class=\"level0 nav-1 level-top first parent\"> <a href=\"#\" class=\"level-top\"> <span>图书与音像</span> </a>\r\n");
      out.write("              <ul class=\"level0\">\r\n");
      out.write("              ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cat1 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("              \r\n");
      out.write("            \r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"level0 nav-2 level-top parent\"> <a href=\"#\" class=\"level-top\"> <span>电脑与办公</span> </a>\r\n");
      out.write("              <ul class=\"level0\">\r\n");
      out.write("               ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cat2 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"level0 nav-2 level-top parent\"> <a href=\"#\" class=\"level-top\"> <span>手机与配件</span> </a>\r\n");
      out.write("              <ul class=\"level0\">\r\n");
      out.write("               ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cat3 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"level0 nav-2 level-top parent\"> <a href=\"#\" class=\"level-top\"> <span>服饰与化妆</span> </a>\r\n");
      out.write("              <ul class=\"level0\">\r\n");
      out.write("               ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cat4 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"level0 nav-2 level-top parent\"> <a href=\"#\" class=\"level-top\"> <span>电器与设备</span> </a>\r\n");
      out.write("              <ul class=\"level0\">\r\n");
      out.write("               ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cat5 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"level0 nav-2 level-top parent\"> <a href=\"#\" class=\"level-top\"> <span>美食与饮品</span> </a>\r\n");
      out.write("              <ul class=\"level0\">\r\n");
      out.write("               ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cat6 }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("           \r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--End of Navigation--> \r\n");
      out.write("      </div>\r\n");
      out.write("      <!--End Header Content--> \r\n");
      out.write("    </div>\r\n");
      out.write("    <!--END OF HEADER--> \r\n");
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
}
