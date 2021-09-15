<%-- 
    Document   : SearchResult
    Created on : 25-Jul-2021, 12:19:51 PM
    Author     : dev1
--%>
<%@page import="com.so.util.FilterBean"%>
<%@page import="java.util.List"%>
<%@page import="com.so.pojo.admin.SoSpecializationMasterPojo"%>
<%@page import="com.so.form.services.ServicesForm"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ServicesForm serviceForm = (ServicesForm) request.getSession(false).getAttribute("serviceform");
    List<FilterBean> filter = (List) request.getAttribute("search");
%>
<!DOCTYPE html>
<%
    if (filter != null) {
        for (int i = 0; i < filter.size(); i++) {
            FilterBean bean = (FilterBean) filter.get(i);
%>

<div class="col-md-11 doc_div">
    <div class="col-md-3 left doc_img_div">
        <div class="card">
            <img class=" doc_img" alt="100%x280" src="img/doctor2.jpg">
        </div>
    </div>

    <div class="col-md-9 left doc_div1">
        <div class="col-md-6 left">
            <p class="doc_h"> <%=bean.getTitle()%> <%=bean.getFirstName()%> <%=bean.getLastName()%></p>
            <p class="doc_p"><%=bean.getEducationalDegrees()%></p>
            <p class="doc_p"><%=bean.getSpecializationName()%></p>
            <p class="doc_p">NA</p>
        </div>
        <div class="col-md-6 left">
            <p class="doc_icon">
                <%
                    for (int j = 0; j < (((Double) bean.getRating()).intValue()); j++) {%>
                <span class="fa fa-star checked "></span>
                <%}
                %>
                <%
                    for (int j = (((Double) bean.getRating()).intValue()); j < 5; j++) {%>
                <span class="fa fa-star "></span>
                <%}
                %>                
            </p>
            <!--<p class="doc_icon"><i class="fas fa-award " style="color:#ffa500"></i>  0 Surgeries</p>-->
            <p class="doc_icon"><i class="fa fa fa-user-md" style="color:#ffa500"></i> <%=bean.getExperience()%> Years of Exp./Practice</p>
            <!-- Button HTML (to Trigger Modal) -->
            <button type="button" class=" btn_login right" onclick="_open__detail('<%=bean.getDoctorId()%>')" data-toggle="modal" data-target="#myModal_"> Book Appointment</button>
        </div>
    </div>
</div>


<%}%>
<%}%>


<!-- Modal HTML -->
<div id="myModal_" class="modal" tabindex="-1">
    <div class="modal-dialog large_" style="">
        <div class="modal-srch_doc">
            <div class="modal-header">
                <div class="col-md-11 docDtl">

                </div>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>
            <div class="modal-body">

                <ul class="nav nav-tabs ">
                    <li class="active-tabs doc_nav1"><a class="doc_nav_text" data-toggle="tab" href="#home">Appointment</a></li>
                    <li class="doc_nav1"><a class="doc_nav_text" data-toggle="tab" href="#menu1">Pay</a></li>
                    <!--  <li class="doc_nav1"><a class="doc_nav_text" data-toggle="tab" href="#menu2">Menu 2</a></li>
                    <li class="doc_nav1"><a class="doc_nav_text" data-toggle="tab" href="#menu3">Menu 3</a></li>-->
                </ul>

                <div class="tab-content">
                    <div id="home" class="tab-pane fade in active div_app1" >
                        <div class="col-md-12 ">
                            <h5 class=" text-center booking-Aptmnt" >Appointment Request</h5>
                            <div class="col-md-12 left" style="padding-top: 0rem;padding-bottom: 0rem">
                                <!-- Cards slider start-->
                                <section class="pt-5 pb-5">
                                    <div class="">
                                        <div class="row">

                                            <div class="col-12 text-right" style="z-index: 10">
                                                <a class="btn btn-primary left" style="z-index: 10" href="#carouselExampleIndicators2" role="button" data-slide="prev">
                                                    <i class="fa fa-arrow-left"></i>
                                                </a>
                                                <a class="btn btn-primary right" style="z-index: 10" href="#carouselExampleIndicators2" role="button" data-slide="next">
                                                    <i class="fa fa-arrow-right"></i>
                                                </a>
                                            </div>
                                            <div class="col-12">
                                                <div id="carouselExampleIndicators2" class="carousel slide" data-ride="carousel">

                                                    <div class="carousel-inner day-date-inner">
                                                        <div class="carousel-item active">
                                                            <div class="row">

                                                                <div class="col-md-2 mb-3">
                                                                    <div class="card">

                                                                        <div class="card-body day-date">
                                                                            <h4 class="card-title day-date-text">Monday</h4>
                                                                            <p class="card-text day-date-p">1</p>

                                                                        </div>

                                                                    </div>
                                                                </div>
                                                                <div class="col-md-2 mb-3">
                                                                    <div class="card">

                                                                        <div class="card-body day-date">
                                                                            <h4 class="card-title day-date-text">Tuesday</h4>
                                                                            <p class="card-text day-date-p">2</p>

                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-2 mb-3">
                                                                    <div class="card">

                                                                        <div class="card-body day-date">
                                                                            <h4 class="card-title day-date-text">Wednesday</h4>
                                                                            <p class="card-text day-date-p">3</p>

                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-2 mb-3">
                                                                    <div class="card">

                                                                        <div class="card-body day-date">
                                                                            <h4 class="card-title day-date-text">Friday</h4>
                                                                            <p class="card-text day-date-p">5</p>

                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-2 mb-3">
                                                                    <div class="card">

                                                                        <div class="card-body day-date">
                                                                            <h4 class="card-title day-date-text">Saturday</h4>
                                                                            <p class="card-text day-date-p">6</p>

                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-2 mb-3">
                                                                    <div class="card">

                                                                        <div class="card-body day-date">
                                                                            <h4 class="card-title day-date-text">Sunday</h4>
                                                                            <p class="card-text day-date-p">7</p>

                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="carousel-item">
                                                            <div class="row">
                                                                <div class="col-md-2 mb-3">
                                                                    <div class="card">

                                                                        <div class="card-body day-date">
                                                                            <h4 class="card-title day-date-text">Monday</h4>
                                                                            <p class="card-text day-date-p">8</p>

                                                                        </div>

                                                                    </div>
                                                                </div>
                                                                <div class="col-md-2 mb-3">
                                                                    <div class="card">

                                                                        <div class="card-body day-date">
                                                                            <h4 class="card-title day-date-text">Tuesday</h4>
                                                                            <p class="card-text day-date-p">9</p>

                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-2 mb-3">
                                                                    <div class="card">

                                                                        <div class="card-body day-date">
                                                                            <h4 class="card-title day-date-text">Wednesday</h4>
                                                                            <p class="card-text day-date-p">10</p>

                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-2 mb-3">
                                                                    <div class="card">

                                                                        <div class="card-body day-date">
                                                                            <h4 class="card-title day-date-text">Friday</h4>
                                                                            <p class="card-text day-date-p">11</p>

                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-2 mb-3">
                                                                    <div class="card">

                                                                        <div class="card-body day-date">
                                                                            <h4 class="card-title day-date-text">Saturday</h4>
                                                                            <p class="card-text day-date-p">12</p>

                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <div class="col-md-2 mb-3">
                                                                    <div class="card">

                                                                        <div class="card-body day-date">
                                                                            <h4 class="card-title day-date-text">Sunday</h4>
                                                                            <p class="card-text day-date-p">13</p>

                                                                        </div>
                                                                    </div>
                                                                </div>


                                                            </div>
                                                        </div>

                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </section>

                                <!-- Cards slider ends-->
                            </div>
                            <div class="col-md-4 left">
                                <p class="booking-heading">MORNING <i class="fas fa-sun" style="color: #ffff53"></i></p>
                                <div class="booking_time" > 
                                    <div class="col-sm-4 left" >
                                        <div class="card">
                                            <div class="card-body Mrng" >
                                                <p class="card-text Mrng-time"> 8:00 AM</p>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-4 left" >
                                        <div class="card">
                                            <div class="card-body Mrng" >
                                                <p class="card-text Mrng-time"> 8:30 AM</p>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-4 left" >
                                        <div class="card">
                                            <div class="card-body Mrng" >
                                                <p class="card-text Mrng-time"> 9:00 AM</p>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-4 left" >
                                        <div class="card">
                                            <div class="card-body Mrng" >
                                                <p class="card-text Mrng-time"> 9:30 AM</p>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-4 left" >
                                        <div class="card">
                                            <div class="card-body Mrng" >
                                                <p class="card-text Mrng-time"> 10:00 AM</p>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-4 left" >
                                        <div class="card">
                                            <div class="card-body Mrng" >
                                                <p class="card-text Mrng-time"> 10:30 AM</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4 left">
                                <p class="booking-heading">AFTERNOON <i class="fas fa-sun" style="color: orange"></i></p>
                                <div class="booking_time" > 
                                    <div class="col-sm-4 left" >
                                        <div class="card">
                                            <div class="card-body Mrng" >
                                                <p class="card-text Noon-time"> 1:00 PM</p>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-4 left" >
                                        <div class="card">
                                            <div class="card-body Mrng" >
                                                <p class="card-text Noon-time"> 1:30 PM</p>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-4 left" >
                                        <div class="card">
                                            <div class="card-body Mrng" >
                                                <p class="card-text Noon-time"> 2:00 PM</p>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-4 left" >
                                        <div class="card">
                                            <div class="card-body Mrng" >
                                                <p class="card-text Noon-time"> 2:30 PM</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-4 left">
                                <p class="booking-heading"> EVENING <i class="fas fa-moon" style="color: lightblue"></i></p>
                                <div class="booking_time" > 
                                    <div class="col-sm-4 left" >
                                        <div class="card">
                                            <div class="card-body Mrng" >
                                                <p class="card-text Evng-time"> 5:00 PM</p>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-4 left" >
                                        <div class="card">
                                            <div class="card-body Mrng" >
                                                <p class="card-text Evng-time"> 5:30 PM</p>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-4 left" >
                                        <div class="card">
                                            <div class="card-body Mrng" >
                                                <p class="card-text Evng-time"> 6:00 PM</p>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="col-sm-4 left" >
                                        <div class="card">
                                            <div class="card-body Mrng" >
                                                <p class="card-text Evng-time"> 6:30 PM</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div id="menu1" class="tab-pane fade div_app1">
                        <h3 class="text-center booking-Aptmnt" >Pay for Booking</h3>
                        <div  style="display:block; margin-left: auto;  margin-right: auto;  width: 80%;">

                            <div class="col-md-12 left" style="margin:5% 0 0 0">
                                <div class="col-md-6 left">
                                    <div class="form-group">
                                        <lable class=""> <i class="fa fa-user" aria-hidden="true"></i> First Name</lable>
                                        <input class=" enqry_input" type="email" />
                                    </div>
                                </div>
                                <div class="col-md-6 left">
                                    <div class="form-group">
                                        <lable class=""> <i class="fa fa-user" aria-hidden="true"></i> Last Name</lable>
                                        <input class=" enqry_input" type="email" />
                                    </div>
                                </div>

                            </div>
                            <div class="col-md-12 left">
                                <div class="col-md-6 left">
                                    <div class="form-group">
                                        <lable class=""> <i class="fa fa-envelope" aria-hidden="true"></i> Email</lable>
                                        <input class=" enqry_input" type="email" />
                                    </div>
                                </div>
                                <div class="col-md-6 left">
                                    <div class="form-group">
                                        <lable class=""> <i class="fa fa-phone" aria-hidden="true"></i> Contact</lable>
                                        <input class=" enqry_input" type="email" />
                                    </div>
                                </div>
                                <div class="col-md-6 left">
                                    <div class="form-group">
                                        <lable class=""> <i class="fa fa-credit-card-alt" aria-hidden="true"></i> Payment Mode</lable>
                                        <input class=" enqry_input" type="email" />
                                    </div>
                                </div>
                                <div class="col-md-6 left">
                                    <div class="form-group">
                                        <lable class=""> <i class="fa fa-question-circle" aria-hidden="true"></i> Reason</lable>
                                        <input class=" enqry_input" type="email" />
                                    </div>
                                </div>
                            </div>

                        </div>

                    </div>

                    <div id="menu2" class="tab-pane fade div_app1">
                        <h3>Menu 2</h3>
                        <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam.</p>
                    </div>

                    <!--<div id="menu3" class="tab-pane fade div_app1">
                        <h3>Menu 3</h3>
                        <p>Eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p>
                    </div>-->
                </div>

            </div>
            <div class="modal-footer modal_foot">
                <button type="button" class="btn btn-secondary modal_foot_btn" data-dismiss="modal">Cancel</button>
                <button type="button" class="btn btn-primary modal_foot_btn">Next</button>
            </div>
        </div>
    </div>
</div>




