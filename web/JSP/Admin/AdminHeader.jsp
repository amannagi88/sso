<%-- 
    Document   : Header
    Created on : 11 Sep. 2021, 11:05:23 pm
    Author     : jotprabh
--%>

<!DOCTYPE html>
<%@page import="java.util.List"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<title> <bean:message key="welcome.title"/></title>
<head>
    <link rel="shortcut icon" href="<%=request.getContextPath()%>/img/favicon.ico?v=1.1.1" type="image/x-icon">
</head> 
<!DOCTYPE html>
<html>
    <link rel ="stylesheet" href="css/bootstrap.css" type="text/css" >
    <link rel ="stylesheet" href="css/bootstrap.min.css" type="text/css">
    <link rel ="stylesheet" href="css/bootstrap-grid.css" type="text/css">
    <link rel ="stylesheet" href="css/bootstrap-grid.min.css.map" type="text/css"> 
    <link href="css/style.css" rel="stylesheet" /> 
    <script type="text/javascript" src="js/Chart.js"></script>
    <link href="css/sb-admin-2.min.css" rel="stylesheet">


    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">

            <!-- Topbar -->
            <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                <!-- Sidebar Toggle (Topbar) -->
                <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                    <i class="fa fa-bars"></i>
                </button>

                <!-- Topbar Search -->
                <form
                    class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
                    <div class="input-group">
                        <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..."
                               aria-label="Search" aria-describedby="basic-addon2">
                        <div class="input-group-append">
                            <button class="btn btn-primary" type="button">
                                <i class="fas fa-search fa-sm"></i>
                            </button>
                        </div>
                    </div>
                </form>

                <!-- Topbar Navbar -->
                <ul class="navbar-nav ml-auto">

                    <div class="topbar-divider d-none d-sm-block"></div>

                    <!-- Nav Item - User Information -->
                    <li class="nav-item dropdown no-arrow">
                        <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <span class="mr-2 d-none d-lg-inline text-gray-600 small">Cheshta Joshi</span>
                            <img class="img-profile rounded-circle"
                                 src="img/female.png">
                        </a>
                        <!-- Dropdown - User Information -->
                        <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                             aria-labelledby="userDropdown">
                            <a class="dropdown-item" href="#">
                                <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                                Profile
                            </a>
                            <a class="dropdown-item" href="#">
                                <i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
                                Settings
                            </a>
                            <a class="dropdown-item" href="#">
                                <i class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>
                                Activity Log
                            </a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                Logout
                            </a>
                        </div>
                    </li>

                </ul>

            </nav>
            <!-- End of Topbar -->







            <script type="text/jscript" src="css/bootstrap.css"></script>
            <script type="text/jscript" src="js/bootstrap.min.js"></script>
            <script type="text/jscript" src="../../js/sb-admin-2.js"></script>
            <script type="text/jscript" src="../../js/sb-admin-2.min.js"></script>
            </html>
