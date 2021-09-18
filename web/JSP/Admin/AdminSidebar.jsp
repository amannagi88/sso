<%-- 
    Document   : AdminSidebar
    Created on : 12 Sep. 2021, 1:00:36 pm
    Author     : jotprabh
--%>
<!DOCTYPE html>
<%@page import="java.util.List"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <title>Admin Sidebar</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">       
              
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" 
              integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>        
    </head>

    <body id="page-top">

        <!-- Page Wrapper -->
        <div id="wrapper" class="">
            <!-- Sidebar -->
            <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

                <!-- Sidebar - Brand -->
                <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
                    <div class="sidebar-brand-icon rotate-n-15">
                        <i class="fas fa-laugh"></i>
                    </div>
                    <div class="sidebar-brand-text mx-3">SSO Admin</div>
                </a>

                <!-- Divider -->
                <hr class="sidebar-divider my-0">

                <!-- Nav Item - Dashboard -->
                <li class="nav-item active">
                    <a class="nav-link" href="index.html">
                        <i class="fas fa-fw fa-tachometer-alt"></i>
                        <span>Dashboard</span></a>
                </li>

                <!-- Divider -->
                <hr class="sidebar-divider">
                <!-- Nav Item - Pages Collapse Menu -->
                <li class="nav-item">
                    <a class="nav-link collapsed" href="<%=request.getContextPath()%>/doctor.do?Method=addDoctor" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
                        <span>Add Doctor</span>
                    </a>
                    <!--  <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                          <div class="bg-white py-2 collapse-inner rounded">
                              <h6 class="collapse-header">Custom Components:</h6>
                              <a class="collapse-item" href="buttons.html">Buttons</a>
                              <a class="collapse-item" href="cards.html">Cards</a>
                          </div>
                      </div>-->
                </li>

                <!-- Nav Item - Utilities Collapse Menu -->
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
                       aria-expanded="true" aria-controls="collapseUtilities">
                        <span>Upload CSV</span>
                    </a>

                </li>
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
                       aria-expanded="true" aria-controls="collapseUtilities">
                        <span>Doctor Payment</span>
                    </a>

                </li>
                <li class="nav-item">
                    <a class="nav-link collapsed" href="<%=request.getContextPath()%>/settings.do?Method=labelSettings"  data-target="#collapseUtilities"
                       aria-expanded="true" aria-controls="collapseUtilities">
                        <span>Configuration</span>
                    </a>

                </li>
                <li class="nav-item">
                    <a class="nav-link collapsed" href="ViewInquiry.html" data-toggle="collapse" data-target="#collapseUtilities"
                       aria-expanded="true" aria-controls="collapseUtilities">
                        <span>View Patient Inquiries</span>
                    </a>

                </li>


            </ul>
            <!-- End of Sidebar -->

     