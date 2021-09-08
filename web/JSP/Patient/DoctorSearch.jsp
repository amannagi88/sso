<%-- 
    Document   : MedicalHistory
    Created on : 25-Jul-2021, 12:19:51 PM
    Author     : dev1
--%>
<%@page import="java.util.List"%>
<%@page import="com.so.pojo.SoSpecializationMasterPojo"%>
<%@page import="com.so.form.ServicesForm"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ServicesForm serviceForm = (ServicesForm) request.getSession(false).getAttribute("serviceform");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <jsp:include page = "../../header.jsp" />   
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <script src="<%=request.getContextPath()%>/js/search.js" type="text/javascript"></script>
    </head>
    <body>

        <!--Search -->
        <div class="" style="width:auto;height: auto;">
            <div class="col-md-12 srch_bar">
                <section class="ftco-section">
                    <div class="form-group">

                        <div class="row justify-content-center">
                            <div class="col-md-12 col-lg-12 d-flex justify-content-center align-items-center">
                                <div class="d-flex text-left align-items-center w-100">
                                    <div class="col-md-3">
                                        <strong class="srch_doc">Filter Specialist by  Location</strong>
                                    </div>
                                    <div class="col-md-2">
                                        <select id="multiple-checkboxes" multiple="multiple" class="spec-sel" onChange=" _open__search(0, null);">
                                            <%
                                                List<SoSpecializationMasterPojo> spec = serviceForm.getSpecializationList();
                                                for (SoSpecializationMasterPojo special : spec) {%>
                                            <option value="<%=special.getSpecializationId()%>"><%=special.getName()%></option>
                                            <%}%>                                            
                                        </select>
                                    </div>
                                    <div class="col-md-5">
                                        <div class="form-group">
                                            <input type="text" class="form-control enqry_input" id="" placeholder="Search doctor by location">
                                            <i class="fas fa-search index_srch_" aria-hidden="true"></i>
                                          </div>    
                                    </div>
                                    <!--Sorting starts-->
                                    <div class="col-md-2 right">
                                        <div class="btn-group right">
                                            <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                                                Sort
                                                <span class="caret"></span>
                                            </a>
                                            <ul class="dropdown-menu sort_drop">
                                                <li class="sort_menu"><a href="#" class="sort_a">Ratings</a> </li>
                                                <li class="sort_menu"><a href="#" class="sort_a">Experience</a> </li>
                                                <li class="sort_menu"><a href="#" class="sort_a">Surgeries Done</a> </li>
                                            </ul>
                                        </div>
                                    </div>                      

                                    <!--Sorting end-->
                                </div>
                            </div>
                        </div>
                    </div>
                </section>

            </div>

            <!--Search ends -->


            <!--left menu-->
            <div class="col-md-3 left filter_cls">

                <p class="filter_heading"><b>By Experience</b></p>
                <div class="form-check filter_subheading">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input exp-sel" value="10" onclick="_open__search(1, event)">10+ Years of Experience
                    </label>
                </div> 
                <div class="form-check filter_subheading">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input exp-sel" value="8" onclick="_open__search(1, event)">8+ Years of Experience
                    </label>
                </div> 
                <div class="form-check filter_subheading">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input exp-sel" value="5" onclick="_open__search(1, event)">5+ Years of Experience
                    </label>
                </div> 
                <div class="form-check filter_subheading">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input exp-sel" value="2" onclick="_open__search(1, event)">2+ Years of Experience
                    </label>
                </div> 
                <br>

                <p class="filter_heading"><b>By Rating</b></p>


                <div class=" filter_subheading_i">

                    <input type="checkbox" class="form-check-input rat-sel" value="4" onclick="_open__search(2, event)">

                    <p>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star "></span>
                    </p>
                </div>

                <div class=" filter_subheading_i">

                    <input type="checkbox" class="form-check-input rat-sel" value="3" onclick="_open__search(2, event)">

                    <p>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star "></span>
                        <span class="fa fa-star "></span>
                    </p>
                </div> 

                <div class="filter_subheading_i">

                    <input type="checkbox" class="form-check-input rat-sel" value="2" onclick="_open__search(2, event)">

                    <p>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star "></span>
                        <span class="fa fa-star "></span>
                        <span class="fa fa-star "></span>
                    </p>
                </div> 

                <div class=" filter_subheading_i">
                    <input type="checkbox" class="form-check-input rat-sel" value="1" onclick="_open__search(2, event)">
                    <p>
                        <span class="fa fa-star checked"></span>
                        <span class="fa fa-star "></span>
                        <span class="fa fa-star "></span>
                        <span class="fa fa-star "></span>
                        <span class="fa fa-star "></span>
                    </p>
                </div> 
                
                <p class="filter_heading"> <b>By Price</b></p>

                <div class="form-check filter_subheading">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input sur-sel" value="30" onclick="_open__search(3, event)"><span>&#8377;</span> 500 - <span>&#8377;</span>  1500
                </div> 
                <div class="form-check filter_subheading">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input sur-sel" value="15" onclick="_open__search(3, event)"><span>&#8377;</span> 1500 - <span>&#8377;</span> 3000
                    </label>
                </div> 

                <div class="form-check filter_subheading">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input sur-sel" value="10" onclick="_open__search(3, event)"><span>&#8377;</span> 3000 - <span>&#8377;</span> 5000
                    </label>
                </div> 

                <div class="form-check filter_subheading">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input sur-sel" value="5" onclick="_open__search(3, event)"> Over <span>&#8377;</span> 5000
                    </label>
                </div> 
                <br/>

                <div class="col-md-7 form-check rate_setup">
                    <div class="form-group">
                      <input type="range" class="form-control-range" id="formControlRange">
                      <span class="left"><span>&#8377;</span> 500 </span>
                      <span class="right"><span>&#8377;</span> 20,000 </span>
                    </div>
                </div>
                  <br/> 
                
                
                
                <p class="filter_heading"> <b>By No. of surgeries done</b></p>

                <div class="form-check filter_subheading">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input sur-sel" value="30" onclick="_open__search(3, event)">30+ Surgeries
                    </label>
                </div> 
                <div class="form-check filter_subheading">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input sur-sel" value="15" onclick="_open__search(3, event)">15+ Surgeries
                    </label>
                </div> 

                <div class="form-check filter_subheading">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input sur-sel" value="10" onclick="_open__search(3, event)">10+ Surgeries
                    </label>
                </div> 

                <div class="form-check filter_subheading">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input sur-sel" value="5" onclick="_open__search(3, event)">5+ Surgeries
                    </label>
                </div> 
                <br/>

                
                 </DIV>
<!--
                <p> <b class="filter_heading">By Hospital</b></p>
                <div class="form-check filter_subheading">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input" value="">Capitol Hospital
                    </label>
                </div> 

                <div class="form-check filter_subheading">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input" value="">Oswal Hospital
                    </label>
                </div> 

                <div class="form-check filter_subheading">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input" value="">Forties Hospital
                    </label>
                </div>

                <div class="form-check filter_subheading">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input" value="">Sanjivani Hospital
                    </label>
                </div> 

                <div class="form-check filter_subheading">
                    <label class="form-check-label">
                        <input type="checkbox" class="form-check-input" value="">Apollo Hospital
                    </label>
                </div>-->


         
            <!--left menu ends-->

            <!--Doctors-->
            <div class="col-md-9 right doc_new"
                 <div class="row">

                <div id="__search_result" ></div>


            </div>
        </div>



    </div>



    <script>
        $(document).ready(function () {
            $(".btn").click(function () {
                $("#myModal_").modal('show');
            });
        });
    </script>
    <jsp:include page = "../../footer.jsp" />  

