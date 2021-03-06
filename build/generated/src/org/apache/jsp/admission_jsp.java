package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admission_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <META HTTP-EQUIV=\"PRAGMA\" CONTENT=\"NO-CACHE\">\n");
      out.write("        <title>Student-ERP</title>\n");
      out.write("         <!--Bootstrap core CSS--> \n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <!--external css-->\n");
      out.write("        <link href=\"assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/zabuto_calendar.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/js/gritter/css/jquery.gritter.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/lineicons/style.css\">    \n");
      out.write("         <!--Custom styles for this template--> \n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/css/style-responsive.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css.css\">\n");
      out.write("        <!-- Include one of jTable styles. -->\n");
      out.write("        <link href=\"css/metro/green/jtable.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"css/jquery-ui-1.10.3.custom.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- Include jTable script file. -->\n");
      out.write("       \n");
      out.write("        <script src=\"js/jquery-1.8.2.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery-ui-1.10.3.custom.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery.jtable.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"download.js\"></script>    \n");
      out.write("        <script src=\"data.js\"></script>\n");
      out.write("        <script src=\"assets/js/chart-master/Chart.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section id=\"container\" >\n");
      out.write("            <!-- **********************************************************************************************************************************************************\n");
      out.write("            TOP BAR CONTENT & NOTIFICATIONS\n");
      out.write("            *********************************************************************************************************************************************************** -->\n");
      out.write("            <!--header start-->\n");
      out.write("            <header class=\"header black-bg\">\n");
      out.write("                <div class=\"sidebar-toggle-box\">\n");
      out.write("                <div class=\"fa fa-bars tooltips\" data-placement=\"right\" data-original-title=\"Toggle Navigation\"></div>\n");
      out.write("                </div>\n");
      out.write("                <!--logo start-->\n");
      out.write("                <a href=\"admintheme.php\" class=\"logo\"><b>Northwest Missouri State University</b></a>\n");
      out.write("                <!--logo end-->\n");
      out.write("                <div class=\"top-menu\">\n");
      out.write("                    <ul class=\"nav pull-right top-menu\">\n");
      out.write("                        <li><a class=\"logout\" href=\"index.php\">Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <!--header end-->\n");
      out.write("            <!-- **********************************************************************************************************************************************************\n");
      out.write("            MAIN SIDEBAR MENU\n");
      out.write("            *********************************************************************************************************************************************************** -->\n");
      out.write("            <!--sidebar start-->\n");
      out.write("            <aside>\n");
      out.write("                <div id=\"sidebar\"  class=\"nav-collapse \">\n");
      out.write("                    <!-- sidebar menu start-->\n");
      out.write("                    <ul class=\"sidebar-menu\" id=\"nav-accordion\">\n");
      out.write("                        <li class=\"sub-menu\">\n");
      out.write("                            <a href=\"adduser.php\" >\n");
      out.write("                                <i class=\"fa fa-user\"></i>\n");
      out.write("                                <span>Application Processing</span>\n");
      out.write("                            </a>\n");
      out.write("                               <ul class=\"sub\">\n");
      out.write("                                <li><a  href=\"reportgeneration.php\"><i class=\"fa fa-files-o\"></i><span>Report</span></a></li>\n");
      out.write("                               </ul>               \n");
      out.write("                        </li>                        \n");
      out.write("                        <li class=\"sub-menu\">\n");
      out.write("                            <a href=\"addcourse.php\" >\n");
      out.write("                                <i class=\"fa fa-cogs\"></i>\n");
      out.write("                                <span>Degree Audit</span>\n");
      out.write("                            </a>\n");
      out.write("                             <ul class=\"sub\">\n");
      out.write("                                <li><a  href=\"reportgeneration.php\"><i class=\"fa fa-files-o\"></i><span>Report</span></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"sub-menu\">\n");
      out.write("                            <a href=\"addwork.php\" >\n");
      out.write("                                <i class=\"fa fa-book\"></i>\n");
      out.write("                                <span>GA/TA Tracking</span>\n");
      out.write("                            </a>\n");
      out.write("                             <ul class=\"sub\">\n");
      out.write("                                <li><a  href=\"reportgeneration.php\"><i class=\"fa fa-files-o\"></i><span>Report</span></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("\t\t\t <li class=\"sub-menu\">\n");
      out.write("                            <a href=\"#\" >\n");
      out.write("                                <i class=\"fa fa-list-alt\"></i>\n");
      out.write("                                <span>Security</span>\n");
      out.write("                            </a>\n");
      out.write("                             <ul class=\"sub\">\n");
      out.write("                                <li><a  href=\"reportgeneration.php\"><i class=\"fa fa-files-o\"></i><span>Report</span></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\t\t\t\n");
      out.write("                        <li class=\"sub-menu\">\n");
      out.write("                            <a href=\"#\" >\n");
      out.write("                                <i class=\"fa fa-list-alt\"></i>\n");
      out.write("                                <span>Report Generation</span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"sub\">\n");
      out.write("                                <li><a  href=\"admission.html\"><i class=\"fa fa-files-o\"></i><span>Students Applied</span></a></li>\n");
      out.write("                                <li><a  href=\"accepted.html\"><i class=\"fa fa-clipboard\"></i><span>Accepted/Rejected</span></a></li>\n");
      out.write("\t\t\t\t<li><a  href=\"studentHistory.html\"><i class=\"fa fa-clock-o\"></i><span>Student History</span></a></li>\n");
      out.write("                                <li><a  href=\"Comms.html\"><i class=\"fa fa-files-o\"></i><span>Comms Eligibilty</span></a></li>\n");
      out.write("                                <li><a  href=\"WeeklyGATA.html\"><i class=\"fa fa-files-o\"></i><span>GA/TA Weekly Report</span></a></li>\n");
      out.write("                                <li><a  href=\"CummulativeGATA.html\"><i class=\"fa fa-files-o\"></i><span>Total GA/TA  Report </span></a></li>\n");
      out.write("                            \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- sidebar menu end-->\n");
      out.write("                </div>\n");
      out.write("            </aside>\n");
      out.write("            <!--sidebar end-->\n");
      out.write("\n");
      out.write("            <!-- **********************************************************************************************************************************************************\n");
      out.write("            MAIN CONTENT\n");
      out.write("            *********************************************************************************************************************************************************** -->\n");
      out.write("            <!--main content start-->\n");
      out.write("            <section id=\"main-content\">\n");
      out.write("                <section class=\"wrapper\">\n");
      out.write("                    <h3 align=\"center\">Report on admission process</h3>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <div align=\"right\">\n");
      out.write("                    <select>\n");
      out.write("            <option value=\"volvo\">Branch</option>\n");
      out.write("            <option value=\"saab\">ACS</option>\n");
      out.write("            <option value=\"mercedes\">MBA</option>\n");
      out.write("            <option value=\"audi\">Agriculture</option>\n");
      out.write("                    </select>\n");
      out.write("                      <select>\n");
      out.write("            <option value=\"volvo\">Date Range</option>\n");
      out.write("            <option value=\"saab\"> 1 - 2</option>\n");
      out.write("            <option value=\"mercedes\">3 - 4</option>\n");
      out.write("            <option value=\"audi\">4 - 5</option>\n");
      out.write("                    </select>\n");
      out.write("                      <select>\n");
      out.write("            <option value=\"volvo\">Filter By</option>\n");
      out.write("            <option value=\"audi\">All</option>\n");
      out.write("            <option value=\"saab\">Accepted</option>\n");
      out.write("            <option value=\"mercedes\">Rejected</option>\n");
      out.write("           \n");
      out.write("                    </select>\n");
      out.write("                        <form id=\"hello\">\n");
      out.write("                        <button type=\"button\" onclick=\"myFunction()\">Generate</button>\n");
      out.write("                        <button type=\"button\" onclick=\"tableToExcel('tables', 'name','admission.xls')\" value=\"Export to Excel\"><img src=\"excel.png\" height=\"16\" width=\"26\"  />Export to Excel</button>\n");
      out.write("                    </form>\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div align=\"center\">\n");
      out.write("                    <div style=\"width:60%;margin-right:20%;margin-left:20%;text-align:center;\">\n");
      out.write("                    <div id=\"PersonTableContainer\"></div>  \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-12 main-chart\">\n");
      out.write("\n");
      out.write("                                <div class=\"row mtbox\">\n");
      out.write("                                    <div  class=\"greetings\">\n");
      out.write("                                                                           \n");
      out.write("                                    </div>\n");
      out.write("                                </div><!-- /row mtbox -->\t\n");
      out.write("                            </div><!-- /col-lg-12 END SECTION MIDDLE -->  \n");
      out.write("                            \n");
      out.write("                    </div><! --/row -->\n");
      out.write("                     \n");
      out.write("                </section>\n");
      out.write("            </section>\n");
      out.write("            <!--main content end-->\n");
      out.write("            <!--footer start-->\n");
      out.write("            <footer class=\"site-footer\">\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                    Northwest Missouri State University\n");
      out.write("                    <a href=\"admintheme.php\" class=\"go-top\">\n");
      out.write("                        <i class=\"fa fa-angle-up\"></i>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("            <!--footer end-->\n");
      out.write("        </section>\n");
      out.write("         <!--js placed at the end of the document so the pages load faster--> \n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <script class=\"include\" type=\"text/javascript\" src=\"assets/js/jquery.dcjqaccordion.2.7.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.scrollTo.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.sparkline.js\"></script>\n");
      out.write("        <!--common script for all pages-->\n");
      out.write("        <script src=\"assets/js/common-scripts.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/gritter/js/jquery.gritter.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/gritter-conf.js\"></script>\n");
      out.write("        <!--script for this page-->\n");
      out.write("        <script src=\"assets/js/sparkline-chart.js\"></script>    \n");
      out.write("        <script src=\"assets/js/zabuto_calendar.js\"></script>\t\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
