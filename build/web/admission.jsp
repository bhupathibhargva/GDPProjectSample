<%-- 
    Document   : admission
    Created on : Jun 22, 2015, 11:33:34 AM
    Author     : S519458
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <META HTTP-EQUIV="PRAGMA" CONTENT="NO-CACHE">
        <title>Student-ERP</title>
         <!--Bootstrap core CSS--> 
        <link href="assets/css/bootstrap.css" rel="stylesheet">
        <!--external css-->
        <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        <link rel="stylesheet" type="text/css" href="assets/css/zabuto_calendar.css">
        <link rel="stylesheet" type="text/css" href="assets/js/gritter/css/jquery.gritter.css" />
        <link rel="stylesheet" type="text/css" href="assets/lineicons/style.css">    
         <!--Custom styles for this template--> 
        <link href="assets/css/style.css" rel="stylesheet">
        <link href="assets/css/style-responsive.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css.css">
        <!-- Include one of jTable styles. -->
        <link href="css/metro/green/jtable.css" rel="stylesheet" type="text/css" />
        <link href="css/jquery-ui-1.10.3.custom.css" rel="stylesheet" type="text/css" />
        <!-- Include jTable script file. -->
       
        <script src="js/jquery-1.8.2.js" type="text/javascript"></script>
        <script src="js/jquery-ui-1.10.3.custom.js" type="text/javascript"></script>
        <script src="js/jquery.jtable.js" type="text/javascript"></script>
        <script src="download.js"></script>    
        <script src="data.js"></script>
        <script src="assets/js/chart-master/Chart.js"></script>
    </head>
    <body>
        <section id="container" >
            <!-- **********************************************************************************************************************************************************
            TOP BAR CONTENT & NOTIFICATIONS
            *********************************************************************************************************************************************************** -->
            <!--header start-->
            <header class="header black-bg">
                <div class="sidebar-toggle-box">
                <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
                </div>
                <!--logo start-->
                <a href="admintheme.php" class="logo"><b>Northwest Missouri State University</b></a>
                <!--logo end-->
                <div class="top-menu">
                    <ul class="nav pull-right top-menu">
                        <li><a class="logout" href="index.php">Logout</a></li>
                    </ul>
                </div>
            </header>
            <!--header end-->
            <!-- **********************************************************************************************************************************************************
            MAIN SIDEBAR MENU
            *********************************************************************************************************************************************************** -->
            <!--sidebar start-->
            <aside>
                <div id="sidebar"  class="nav-collapse ">
                    <!-- sidebar menu start-->
                    <ul class="sidebar-menu" id="nav-accordion">
                        <li class="sub-menu">
                            <a href="adduser.php" >
                                <i class="fa fa-user"></i>
                                <span>Application Processing</span>
                            </a>
                               <ul class="sub">
                                <li><a  href="reportgeneration.php"><i class="fa fa-files-o"></i><span>Report</span></a></li>
                               </ul>               
                        </li>                        
                        <li class="sub-menu">
                            <a href="addcourse.php" >
                                <i class="fa fa-cogs"></i>
                                <span>Degree Audit</span>
                            </a>
                             <ul class="sub">
                                <li><a  href="reportgeneration.php"><i class="fa fa-files-o"></i><span>Report</span></a></li>
                            </ul>
                        </li>
                        <li class="sub-menu">
                            <a href="addwork.php" >
                                <i class="fa fa-book"></i>
                                <span>GA/TA Tracking</span>
                            </a>
                             <ul class="sub">
                                <li><a  href="reportgeneration.php"><i class="fa fa-files-o"></i><span>Report</span></a></li>
                            </ul>
                        </li>
                        
			 <li class="sub-menu">
                            <a href="#" >
                                <i class="fa fa-list-alt"></i>
                                <span>Security</span>
                            </a>
                             <ul class="sub">
                                <li><a  href="reportgeneration.php"><i class="fa fa-files-o"></i><span>Report</span></a></li>
                            </ul>
                        </li>			
                        <li class="sub-menu">
                            <a href="#" >
                                <i class="fa fa-list-alt"></i>
                                <span>Report Generation</span>
                            </a>
                            <ul class="sub">
                                <li><a  href="admission.html"><i class="fa fa-files-o"></i><span>Students Applied</span></a></li>
                                <li><a  href="accepted.html"><i class="fa fa-clipboard"></i><span>Accepted/Rejected</span></a></li>
				<li><a  href="studentHistory.html"><i class="fa fa-clock-o"></i><span>Student History</span></a></li>
                                <li><a  href="Comms.html"><i class="fa fa-files-o"></i><span>Comms Eligibilty</span></a></li>
                                <li><a  href="WeeklyGATA.html"><i class="fa fa-files-o"></i><span>GA/TA Weekly Report</span></a></li>
                                <li><a  href="CummulativeGATA.html"><i class="fa fa-files-o"></i><span>Total GA/TA  Report </span></a></li>
                            
                            </ul>
                        </li>
                    </ul>
                    <!-- sidebar menu end-->
                </div>
            </aside>
            <!--sidebar end-->

            <!-- **********************************************************************************************************************************************************
            MAIN CONTENT
            *********************************************************************************************************************************************************** -->
            <!--main content start-->
            <section id="main-content">
                <section class="wrapper">
                    <h3 align="center">Report on admission process</h3>
                    <br>
                    <br>
                    <div align="right">
                    <select>
            <option value="volvo">Branch</option>
            <option value="saab">ACS</option>
            <option value="mercedes">MBA</option>
            <option value="audi">Agriculture</option>
                    </select>
                      <select>
            <option value="volvo">Date Range</option>
            <option value="saab"> 1 - 2</option>
            <option value="mercedes">3 - 4</option>
            <option value="audi">4 - 5</option>
                    </select>
                      <select>
            <option value="volvo">Filter By</option>
            <option value="audi">All</option>
            <option value="saab">Accepted</option>
            <option value="mercedes">Rejected</option>
           
                    </select>
                        <form id="hello">
                        <button type="button" onclick="myFunction()">Generate</button>
                        <button type="button" onclick="tableToExcel('tables', 'name','admission.xls')" value="Export to Excel"><img src="excel.png" height="16" width="26"  />Export to Excel</button>
                    </form>
                    </div>
                    <br>
                    <div align="center">
<!--                    <div style="width:80%;margin-right:20%;margin-left:20%;text-align:center;">-->
                    <div id="PersonTableContainer"></div>  
                    </div>
                    
                    <div class="row">
                        <div class="row">
                            <div class="col-lg-12 main-chart">

                                <div class="row mtbox">
                                    <div  class="greetings">
                                                                           
                                    </div>
                                </div><!-- /row mtbox -->	
                            </div><!-- /col-lg-12 END SECTION MIDDLE -->  
                            
                    </div><! --/row -->
                     
                </section>
            </section>
            <!--main content end-->
            <!--footer start-->
            <footer class="site-footer">
                <div class="text-center">
                    Northwest Missouri State University
                    <a href="admintheme.php" class="go-top">
                        <i class="fa fa-angle-up"></i>
                    </a>
                </div>
            </footer>
            <!--footer end-->
        </section>
         <!--js placed at the end of the document so the pages load faster--> 
        <script src="assets/js/bootstrap.min.js"></script>
        <script class="include" type="text/javascript" src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
        <script src="assets/js/jquery.scrollTo.min.js"></script>
        <script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>
        <script src="assets/js/jquery.sparkline.js"></script>
        <!--common script for all pages-->
        <script src="assets/js/common-scripts.js"></script>
        <script type="text/javascript" src="assets/js/gritter/js/jquery.gritter.js"></script>
        <script type="text/javascript" src="assets/js/gritter-conf.js"></script>
        <!--script for this page-->
        <script src="assets/js/sparkline-chart.js"></script>    
        <script src="assets/js/zabuto_calendar.js"></script>	
    </body>
</html>
