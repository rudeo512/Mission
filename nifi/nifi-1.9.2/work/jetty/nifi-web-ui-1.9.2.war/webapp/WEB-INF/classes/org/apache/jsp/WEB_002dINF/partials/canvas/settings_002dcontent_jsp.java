/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat8
 * Generated at: 2019-04-03 19:25:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.partials.canvas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class settings_002dcontent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n\n<div id=\"settings\" class=\"hidden\">\n    <div id=\"settings-header-text\" class=\"settings-header-text\">NiFi Settings</div>\n    <div class=\"settings-container\">\n        <div>\n            <div id=\"settings-tabs\" class=\"settings-tabs tab-container\"></div>\n            <div class=\"clear\"></div>\n        </div>\n        <div id=\"settings-tabs-content\">\n            <button id=\"new-service-or-task\" class=\"add-button fa fa-plus\" title=\"Create a new reporting task controller service\" style=\"display: block;\"></button>\n            <div id=\"general-settings-tab-content\" class=\"configuration-tab\">\n                <div id=\"general-settings\">\n                    <div class=\"setting\">\n                        <div class=\"setting-name\">\n                            Maximum timer driven thread count\n                            <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"The maximum number of threads for timer driven processors available to the system.\"></div>\n                        </div>\n                        <div class=\"editable setting-field\">\n");
      out.write("                            <input type=\"text\" id=\"maximum-timer-driven-thread-count-field\" class=\"setting-input\"/>\n                        </div>\n                        <div class=\"read-only setting-field\">\n                            <span id=\"read-only-maximum-timer-driven-thread-count-field\"></span>\n                        </div>\n                    </div>\n                    <div class=\"setting\">\n                        <div class=\"setting-name\">\n                            Maximum event driven thread count\n                            <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"The maximum number of threads for event driven processors available to the system.\"></div>\n                        </div>\n                        <div class=\"editable setting-field\">\n                            <input type=\"text\" id=\"maximum-event-driven-thread-count-field\" class=\"setting-input\"/>\n                        </div>\n                        <div class=\"read-only setting-field\">\n                            <span id=\"read-only-maximum-event-driven-thread-count-field\"></span>\n");
      out.write("                        </div>\n                    </div>\n                    <div class=\"editable settings-buttons\">\n                        <div id=\"settings-save\" class=\"button\">Apply</div>\n                        <div class=\"clear\"></div>\n                    </div>\n                </div>\n            </div>\n            <div id=\"controller-services-tab-content\" class=\"configuration-tab controller-settings-table\">\n                <div id=\"controller-services-table\" class=\"settings-table\"></div>\n            </div>\n            <div id=\"reporting-tasks-tab-content\" class=\"configuration-tab controller-settings-table\">\n                <div id=\"reporting-tasks-table\" class=\"settings-table\"></div>\n            </div>\n            <div id=\"registries-tab-content\" class=\"configuration-tab controller-settings-table\">\n                <div id=\"registries-table\" class=\"settings-table\"></div>\n            </div>\n        </div>\n    </div>\n    <div id=\"settings-refresh-container\">\n        <button id=\"settings-refresh-button\" class=\"refresh-button pointer fa fa-refresh\" title=\"Refresh\"></button>\n");
      out.write("        <div id=\"settings-last-refreshed-container\" class=\"last-refreshed-container\">\n            Last updated:&nbsp;<span id=\"settings-last-refreshed\" class=\"value-color\"></span>\n        </div>\n        <div id=\"settings-loading-container\" class=\"loading-container\"></div>\n        <div id=\"controller-cs-availability\" class=\"hidden\">Listed services are available to all Reporting Tasks and services defined in the Controller Settings.</div>\n        <div class=\"clear\"></div>\n    </div>\n</div>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
