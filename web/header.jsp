<%-- 
    Document   : header.jsp
    Created on : 19-Jul-2021, 10:17:45 PM
    Author     : dev2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        


        <script src="js/_so__registration.js" type="text/javascript"></script>
        <script>
            var contextPath = '<%=request.getContextPath()%>';
        </script>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>SSO</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel ="stylesheet" href="css/bootstrap.css" type="text/css" >
        <link rel ="stylesheet" href="css/bootstrap.min.css" type="text/css">

        <link rel ="stylesheet" href="css/bootstrap-grid.css" type="text/css">
        <link rel ="stylesheet" href="css/bootstrap-grid.min.css.map" type="text/css">

        <link href="css/style.css" rel="stylesheet" />

        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
    </head>
    <!--header-->
    <div class="container-fluid">
        <div class="header_SSO " data-top="0" data-scroll="200">
            <!--logo-->
            <div class="col-sm-4 logo_ background_head">
                <!--<img class="logo_img" src="img/Logo_c.png" />
<h3>SSO</h3>-->
            </div>      
            <style>
                .nav_bar{width:17%;float: left;width: auto;float: left;margin-left: 2%;margin-right: 2%;}
                .nav_bar_call{width:20%;float: left;}
                .phn{font-size: 18px;float: left;width: 100%;text-align: center;color: #000;}
                .home_login{    float: right;    margin: 1.1%  2%;    position: relative;    z-index: 100;}
                .Register_head_text{font-size:30px;}
                .REG_heading{margin:1% 0 6% 0;text-align: center;}
                .mbl_info{margin: 0 0 6% 0}
             </style>
            <!--navbar-->
            <div class="col-sm-8 right div_left_nav background_head"  id="header">           
                <div class="navbar_" >
                    <div class="nav_bar_call" >
                        <a href="#"> <i class="fa fa-phone"></i> Call<span class="phn">+91-9988776655</span></a> 
                    </div>
                    
                    <div class="nav_bar" >
                        <a href="<%=request.getContextPath()%>/Welcome.do">Home</a> <!--<i class="fas fa-home"></i>-->
                    </div>
                    
                    <div class="nav_bar" >
                        <a href="<%=request.getContextPath()%>/service.do?Method=search">Search Doctor</a><!-- <i class="fas fa-boxes"></i>-->
                    </div>
                    
                    <div class="dropdown_">
                        <button class="dropbtn_">Login 
                            <!-- <i class="fas fa-users"></i>-->
                        </button>
                        <div class="dropdown-content_">
                            <a href="#">Patient Login <!--<i class="fas fa-book-medical"></i>--></a>
                            <a href="#">Doctor Login <!--<i class="fas fa-user"></i>--></a>
                        </div>
                    </div> 
                </div>

                <!--modal ends-->
            </div>
        </div>
        <div class="toast"  style="position: fixed;z-index: 100;right: 5%;top: 14%;">
            <div class="toast-header" style="background: #04AA6D ">
                <strong class="mr-auto text-primary" style="font-size: 18px; color: #fff !important">Message</strong>
                <small class="text-muted toast-time" style="color: #fff !important;font-size: 14px !important; 
                       margin-left: 30px;"></small>
                <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" style="font-size: 28px;color: #fff !important">&times;</button>
            </div>
            <div class="toast-body" style="color: darkgreen !important;background-color:#d4edda ;">

            </div>
        </div>
        <!--Search login bar-->
        <div class="search srch_log">
            <span class="srch_log_span">
                <!--login btn-->
                <div class="home_login">

                    <button id="myBtn" class="btn_login">Signup</button>
                </div>
                <!-- The Modal -->
                <div id="myModal" class="modal">
                    <!-- Modal content -->
                    <div class="modal-content ">
                        <div class="">
                            <span class="close srch_log_form">&times;</span>
                        </div>

                        <div class="col-sm-12 text-center regi_">
                            <label for="" class="REG_heading">
                                <h4 class="Register_head_text" >Register Here</h4>
                                <p>Don't have an account? Sign up</p>

                            </label>
                            <div class="mbl_info"> 
                                <label for="Mobile" class=" form_lbl popup">Via Mobile No.</label>
                                <div class="col-sm-12">
                                    <input type="text" class="form-control enqry_input" id="inputPassword" placeholder="Enter your mobile number...">
                                </div>
                            </div>

                            <button class="regi_btn">Register</button>
                            <br/>
                            <span class="modal-text">OR</span>

                            <div class="form-group row">
                                <div class="col-sm-12">
                                    <div class="g-signin2 model_g_btn" id="my-signin2" data-theme="dark"></div>
                                </div>
                            </div>


                        </div>
                    </div>
                    <!-- Modal content -->
                </div>
                <!-- The Modal -->
        </div>
        <!--login btn-->
    </div>

    <div class="col-sm-12 head_brdr"></div>
    <!--header ends-->

