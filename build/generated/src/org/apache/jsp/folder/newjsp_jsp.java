package org.apache.jsp.folder;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Setup and Load Data to jTable using Servlets and JSP</title>\n");
      out.write("<!-- Include one of jTable styles. -->\n");
      out.write("<link href=\"css/metro/lightgrey/jtable.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"css/jquery-ui-1.10.3.custom.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<!-- Include jTable script file. -->\n");
      out.write("<script src=\"js/jquery-1.8.2.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery-ui.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.jtable.js\" type=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $('#PersonTableContainer').jtable({\n");
      out.write("            title: 'Table of people',\n");
      out.write("            actions: {\n");
      out.write("                listAction: 'CRUDController?action=list',\n");
      out.write("                createAction:'CRUDController?action=create',\n");
      out.write("                updateAction: 'CRUDController?action=update',\n");
      out.write("                deleteAction: 'CRUDController?action=delete'\n");
      out.write("            },\n");
      out.write("            fields: {\n");
      out.write("                customerid: {\n");
      out.write("                    key: true,\n");
      out.write("                    list: false\n");
      out.write("                },\n");
      out.write("                customername: {\n");
      out.write("                    title: 'Customer Name',\n");
      out.write("                    width: '30%'\n");
      out.write("                },\n");
      out.write("                email: {\n");
      out.write("                    title: 'Email',\n");
      out.write("                    width: '30%'\n");
      out.write("                },\n");
      out.write("                phone: {\n");
      out.write("                    title: 'Phone',\n");
      out.write("                    width: '20%',\n");
      out.write("                    create: false,\n");
      out.write("                    edit: false\n");
      out.write("                },\n");
      out.write("                city: {\n");
      out.write("                    title: 'City',\n");
      out.write("                    width: '20%',\n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("        $('#PersonTableContainer').jtable('load');\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div style=\"width:60%;margin-right:20%;margin-left:20%;text-align:center;\">\n");
      out.write("<h1>Setup and Load Data in jTable using Servlet and JSP</h1>\n");
      out.write("<h4>Demo by Priya Darshini, Tutorial at <a href=\"http://www.programming-free.com/2013/07/setup-load-data-jtable-jsp-servlet.html\">www.programming-free.com</a></h4>\n");
      out.write("<div id=\"PersonTableContainer\"></div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
