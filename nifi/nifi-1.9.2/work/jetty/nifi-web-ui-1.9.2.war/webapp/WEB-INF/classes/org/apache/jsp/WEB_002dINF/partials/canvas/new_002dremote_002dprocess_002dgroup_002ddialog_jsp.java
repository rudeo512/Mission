/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat8
 * Generated at: 2019-04-03 19:25:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.partials.canvas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_002dremote_002dprocess_002dgroup_002ddialog_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n\n<div id=\"new-remote-process-group-dialog\" class=\"hidden large-dialog\">\n    <div class=\"dialog-content\">\n        <div class=\"setting\">\n            <div class=\"setting-name\">URLs\n                <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"Specify the remote target NiFi URLs. Multiple URLs can be specified in comma-separated format. Different protocols cannot be mixed. If remote NiFi is a cluster, two or more node URLs are recommended for better connection establishment availability.\"></div>\n             </div>\n            <div class=\"setting-field\">\n                <input id=\"new-remote-process-group-uris\" type=\"text\" placeholder=\"https://remotehost:8443/nifi\"/>\n            </div>\n        </div>\n        <div class=\"setting\">\n            <div class=\"remote-process-group-setting-left\">\n                <div class=\"setting-name\">\n                    Transport Protocol\n                    <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"Specify the transport protocol to use for this Remote Process Group communication.\"></div>\n");
      out.write("                </div>\n                <div class=\"setting-field\">\n                    <div id=\"new-remote-process-group-transport-protocol-combo\"></div>\n                </div>\n            </div>\n            <div class=\"remote-process-group-setting-right\">\n                <div class=\"setting-name\">\n                    Local Network Interface\n                    <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"The local network interface to send/receive data. If not specified, any local address is used. If clustered, all nodes must have an interface with this identifier.\"></div>\n                </div>\n                <div class=\"setting-field\">\n                    <input type=\"text\" class=\"small-setting-input\" id=\"new-remote-process-group-local-network-interface\"/>\n                </div>\n            </div>\n            <div class=\"clear\"></div>\n        </div>\n        <div class=\"setting\">\n            <div class=\"remote-process-group-setting-left\">\n                <div class=\"setting-name\">\n                    HTTP Proxy server hostname\n");
      out.write("                    <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"Specify the proxy server's hostname to use. If not specified, HTTP traffics are sent directly to the target NiFi instance.\"></div>\n                </div>\n                <div class=\"setting-field\">\n                    <input type=\"text\" class=\"small-setting-input\" id=\"new-remote-process-group-proxy-host\"/>\n                </div>\n            </div>\n            <div class=\"remote-process-group-setting-right\">\n                <div class=\"setting-name\">\n                    HTTP Proxy server port\n                    <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"Specify the proxy server's port number, optional. If not specified, default port 80 will be used.\"></div>\n                </div>\n                <div class=\"setting-field\">\n                    <input type=\"text\" class=\"small-setting-input\" id=\"new-remote-process-group-proxy-port\"/>\n                </div>\n            </div>\n            <div class=\"clear\"></div>\n        </div>\n        <div class=\"setting\">\n");
      out.write("            <div class=\"remote-process-group-setting-left\">\n                <div class=\"setting-name\">\n                    HTTP Proxy user\n                    <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"Specify an user name to connect to the proxy server, optional.\"></div>\n                </div>\n                <div class=\"setting-field\">\n                    <input type=\"text\" class=\"small-setting-input\" id=\"new-remote-process-group-proxy-user\"/>\n                </div>\n            </div>\n            <div class=\"remote-process-group-setting-right\">\n                <div class=\"setting-name\">\n                    HTTP Proxy password\n                    <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"Specify an user password to connect to the proxy server, optional.\"></div>\n                </div>\n                <div class=\"setting-field\">\n                    <input type=\"password\" class=\"small-setting-input\" id=\"new-remote-process-group-proxy-password\"/>\n                </div>\n            </div>\n            <div class=\"clear\"></div>\n");
      out.write("        </div>\n        <div class=\"setting\">\n            <div class=\"remote-process-group-setting-left\">\n                <div class=\"setting-name\">\n                    Communications timeout\n                    <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"When communication with this remote process group takes longer than this amount of time, it will timeout.\"></div>\n                </div>\n                <div class=\"setting-field\">\n                    <input type=\"text\" class=\"small-setting-input\" id=\"new-remote-process-group-timeout\"/>\n                </div>\n            </div>\n            <div class=\"remote-process-group-setting-right\">\n                <div class=\"setting-name\">\n                    Yield duration\n                    <div class=\"fa fa-question-circle\" alt=\"Info\" title=\"When communication with this remote process group fails, it will not be scheduled again until this amount of time elapses.\"></div>\n                </div>\n                <div class=\"setting-field\">\n                    <input type=\"text\" class=\"small-setting-input\" id=\"new-remote-process-group-yield-duration\"/>\n");
      out.write("                </div>\n            </div>\n            <div class=\"clear\"></div>\n        </div>\n    </div>\n</div>");
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
