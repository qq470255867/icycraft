/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-11-02 12:22:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<title>Sanatana HTML Version - Contacts</title>\r\n");
      out.write("<meta name=\"description\" content=\"Default Description\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Santana, Varien, E-commerce\" />\r\n");
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
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"/css/login.css\"/>\r\n");
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
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-1.6.4.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/taotao.js\" charset=\"utf-8\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"bg_color\" class=\" cms-index-index cms-home\">\r\n");
      out.write("<!--START OF WRAPPER-->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Newheader.jsp", out, false);
      out.write("<!--START OF MAIN CONTENT-->\r\n");
      out.write("    <div class=\"main-container col2-left-layout\">\r\n");
      out.write("      <div class=\"main\">\r\n");
      out.write("        <div class=\"col-main\">\r\n");
      out.write("          <div id=\"messages_product_view\"></div>\r\n");
      out.write("          <!--Page Title-->\r\n");
      out.write("          <div class=\"page-title\">\r\n");
      out.write("            <h1>登录</h1>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!--Start of Contact Form-->\r\n");
      out.write("          <form  id=\"formlogin\" method=\"post\" onsubmit=\"return false;\">\r\n");
      out.write("            <div class=\"fieldset\">\r\n");
      out.write("              <h2 class=\"legend\">请输入账号和密码</h2>\r\n");
      out.write("              <ul class=\"form-list\">\r\n");
      out.write("                <li class=\"fields\">\r\n");
      out.write("                  <div class=\"field\">\r\n");
      out.write("                    <label for=\"name\" class=\"required\">账号</label>\r\n");
      out.write("                    <div class=\"input-box\">\r\n");
      out.write("                      <input name=\"username\" id=\"loginname\" title=\"Name\" class=\"input-text required-entry\" type=\"text\" />\r\n");
      out.write("                       <label id=\"loginname_succeed\" class=\"blank invisible\"></label>\r\n");
      out.write("                       <label id=\"loginname_error\" class=\"hide\"><b></b></label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                   <script type=\"text/javascript\">\r\n");
      out.write("                    setTimeout(function () {\r\n");
      out.write("                        if (!$(\"#loginname\").val()) {\r\n");
      out.write("                            $(\"#loginname\").get(0).focus();\r\n");
      out.write("                        }\r\n");
      out.write("                    }, 0);\r\n");
      out.write("                </script>\r\n");
      out.write("                </li>\r\n");
      out.write("                <br/> \r\n");
      out.write("                <li>\r\n");
      out.write("                  <label for=\"telephone\">密码</label>\r\n");
      out.write("                  <div class=\"input-box\">\r\n");
      out.write("                    <input type=\"password\" name=\"password\" id=\"nloginpwd\" title=\"Telephone\" class=\"input-text\" type=\"text\" />\r\n");
      out.write("                    <label id=\"loginpwd_succeed\" class=\"blank invisible\"></label>\r\n");
      out.write("                    <label id=\"loginpwd_error\" class=\"hide\"></label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                \r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"buttons-set\">\r\n");
      out.write("              <p class=\"required\"></p>\r\n");
      out.write("                <div class=\"item login-btn2013\" >\r\n");
      out.write("                    <button type=\"submit\" title=\"Submit\" class=\"button\"><span><a href=\"/page/showRegister\" clstag=\"passport|keycount|login|08\" style='color:white'>免费注册</a></span></button>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                    <button type=\"submit\" title=\"Vote\" class=\"button\"><span><a id=\"loginsubmit\"  tabindex=\"8\" clstag=\"passport|keycount|login|06\" style=\"color:white;width: 98px; height: 49px\">立即登陆</a></span></span></button>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("          </form>\r\n");
      out.write("          <!--End of Contact Form-->  \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-left sidebar\"> \r\n");
      out.write("          <!--Start of Compare Products-->\r\n");
      out.write("          <div class=\"block block-list block-compare\">\r\n");
      out.write("            <div class=\"block-title\"> <strong><span>nginx的反向代理</span></strong> </div>\r\n");
      out.write("            <div class=\"block-content\">\r\n");
      out.write("              <p class=\"empty\">用户访问时由nginx决定哪个服务器提供服务</p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!--Start of Compare Products--> \r\n");
      out.write("          \r\n");
      out.write("          <!--Start of Poll-->\r\n");
      out.write("          <div class=\"block block-poll\">\r\n");
      out.write("            <div class=\"block-title\"> <strong><span>Nginx只做请求的转发</span></strong> </div>\r\n");
      out.write("            <form id=\"pollForm\" method=\"post\" onsubmit=\"return validatePollAnswerIsSelected();\" action=\"#\">\r\n");
      out.write("              <div class=\"block-content\">\r\n");
      out.write("                <p class=\"block-subtitle\">后台有多个http服务器提供服务</p>\r\n");
      out.write("                <ul id=\"poll-answers\">\r\n");
      out.write("                  <li class=\"odd\">\r\n");
      out.write("                    <input name=\"vote\" class=\"radio poll_vote\" id=\"vote_5\" value=\"5\" type=\"radio\" />\r\n");
      out.write("                    <span class=\"label\">\r\n");
      out.write("                    <label for=\"vote_5\">nginx的功能就是把请求转发给后面的服务器</label>\r\n");
      out.write("                    </span> </li>\r\n");
      out.write("                  <li class=\"even\">\r\n");
      out.write("                    <input name=\"vote\" class=\"radio poll_vote\" id=\"vote_6\" value=\"6\" type=\"radio\" />\r\n");
      out.write("                    <span class=\"label\">\r\n");
      out.write("                    <label for=\"vote_6\">通过访问不同的域名访问运行在不同端口的tomcat</label>\r\n");
      out.write("                    </span> </li>\r\n");
      out.write("                  <li class=\"odd\">\r\n");
      out.write("                    <input name=\"vote\" class=\"radio poll_vote\" id=\"vote_7\" value=\"7\" type=\"radio\" />\r\n");
      out.write("                    <span class=\"label\">\r\n");
      out.write("                    <label for=\"vote_7\">在配置文件中配置不同服务的地址</label>\r\n");
      out.write("                    </span> </li>\r\n");
      out.write("                  <li class=\"last even\">\r\n");
      out.write("                    <input name=\"vote\" class=\"radio poll_vote\" id=\"vote_8\" value=\"8\" type=\"radio\" />\r\n");
      out.write("                    <span class=\"label\">\r\n");
      out.write("                    <label for=\"vote_8\">如果在同一个域名下有多台服务器提供服务，此时需要nginx负载均衡</label>\r\n");
      out.write("                    </span> </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <div class=\"actions\">\r\n");
      out.write("                  <button type=\"submit\" title=\"Vote\" class=\"button\"><span><span>Vote</span></span></button>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!--End of Poll--> \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div style=\"display: none;\" id=\"back-top\"> <a href=\"#\"><img alt=\"\" src=\"images/backtop.gif\" /></a> </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--END OF MAIN CONTENT--> \r\n");
      out.write("    \r\n");
      out.write("    <!--START OF FOOTER-->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "newfooter.jsp", out, false);
      out.write("<!--END OF FOOTER--> \r\n");
      out.write("  </div>\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write("\t var minicart_timer;\r\n");
      out.write("    jQuery(\".trigger-minicart\").hover(function(){\r\n");
      out.write("        jQuery(\"#minicart\").slideDown();\r\n");
      out.write("    });\r\n");
      out.write("    jQuery(\"#minicart\").mouseleave(function(){\r\n");
      out.write("        jQuery(\"#minicart\").slideUp();\r\n");
      out.write("    });\r\n");
      out.write("    jQuery(\"#minicart\").hover(function(){\r\n");
      out.write("        clearTimeout(minicart_timer);\r\n");
      out.write("    });\r\n");
      out.write("\tjQuery(document).ready(function(){\r\n");
      out.write("\tjQuery('.pagebox_btn').click(function(){\r\n");
      out.write("\t\tif(parseInt(jQuery('.page_pan').css('left')) < 0)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tjQuery('.page_pan').animate({ left: '0' }, 600, 'easeOutQuint');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse{\r\n");
      out.write("\t\t\tjQuery('.page_pan').animate({ left: '-100px' }, 600, 'easeOutQuint');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar redirectUrl = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${redirect}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\tvar LOGIN = {\r\n");
      out.write("\t\t\tcheckInput:function() {\r\n");
      out.write("\t\t\t\tif ($(\"#loginname\").val() == \"\") {\r\n");
      out.write("\t\t\t\t\talert(\"用户名不能为空\");\r\n");
      out.write("\t\t\t\t\t$(\"#loginname\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif ($(\"#nloginpwd\").val() == \"\") {\r\n");
      out.write("\t\t\t\t\talert(\"密码不能为空\");\r\n");
      out.write("\t\t\t\t\t$(\"#nloginpwd\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdoLogin:function() {\r\n");
      out.write("\t\t\t\t$.post(\"/user/login\", $(\"#formlogin\").serialize(),function(data){\r\n");
      out.write("\t\t\t\t\tif (data.status == 200) {\r\n");
      out.write("\t\t\t\t\t\talert(\"登录成功！\");\r\n");
      out.write("\t\t\t\t\t\tif (redirectUrl == \"\") {\r\n");
      out.write("\t\t\t\t\t\t\tlocation.href = \"http://localhost:8082\";\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\tlocation.href = redirectUrl;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\talert(\"登录失败，原因是：\" + data.msg);\r\n");
      out.write("\t\t\t\t\t\t$(\"#loginname\").select();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tlogin:function() {\r\n");
      out.write("\t\t\t\tif (this.checkInput()) {\r\n");
      out.write("\t\t\t\t\tthis.doLogin();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t};\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(\"#loginsubmit\").click(function(){\r\n");
      out.write("\t\t\tLOGIN.login();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--end pages box-->\r\n");
      out.write("<!--END OF WRAPPER-->\r\n");
      out.write("\r\n");
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