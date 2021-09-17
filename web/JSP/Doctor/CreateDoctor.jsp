<%-- 
    Document   : scpdRegistration
    Created on : Aug 8, 2021, 12:57:06 AM
    Author     : Ankit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>


<html:html lang="true">
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> SSO </title>
        <jsp:include page = "../Admin/AdminSidebar.jsp" /> 
        <jsp:include page = "../Admin/AdminHeader.jsp" />   
        
    </head>
    
    <script>
        var contextPath = '<%=request.getContextPath()%>';
    </script>    

  
        <div class="container">
            
                <h3 class="main_div_h "> Add Doctor</h3>
                
                <a href="#" data-toggle="modal" data-target=".bd-example-modal-xl" class="doc_view d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm " >View Doctor List</a>
                   <!-- Extra large modal -->
                    <div class="modal fade bd-example-modal-xl" tabindex="-1" role="dialog" aria-labelledby="myExtraLargeModalLabel" aria-hidden="true">
                      <div class="modal-dialog modal-xl">
                        <div class="modal-content view-list-popup">
                            <div class="col-md-12">
                                <h5 class="edit_">Doctor list</h5>
                                
                          <div class="responsive-table">
                                   	<table class="table">
                                          <thead>
                                            <tr>
                                              <th scope="col">Name</th>
                                              <th scope="col">DOB</th>
                                              <th scope="col">Gender</th>
                                              <th scope="col">State</th>
                                              <th scope="col">City</th>
                                              <th scope="col">Action</th>
                                            </tr>
                                          </thead>
                                          <tbody>
                                            <tr>
                                              <td>Aarav</td>
                                              <td>20 SEPT 1984</td>
                                              <td>Male</td>
                                              <td>Gujrat</td>
                                              <td>Gandhi Nagar</td>
                                              <td><i class="fa fa-edit" aria-hidden="true" class="close" data-dismiss="modal" aria-label="Close" aria-hidden="true"></i></td>
                                            </tr>
                                            <tr>
                                              <td>Aavya</td>
                                              <td>20 SEPT 1984</td>
                                              <td>Female</td>
                                              <td>Himachal Pradesh</td>
                                              <td>Solan</td>
                                              <td><i class="fa fa-edit" aria-hidden="true" class="close" data-dismiss="modal" aria-label="Close" aria-hidden="true"></i></td>
                                            </tr>
                                            <tr>
				
                                              <td>Samarth</td>
                                              <td>20 SEPT 1984</td>
                                              <td>Male</td>
                                              <td>Punjab</td>
                                              <td>Ludhiana</td>
                                              <td><i class="fa fa-edit" aria-hidden="true" class="close" data-dismiss="modal" aria-label="Close" aria-hidden="true"></i></td>
                                            </tr>
                                          </tbody>
                                        </table>
                                    </div>
                                    </div>
                        </div>
                      </div>
                    </div>
                    
                
                
                        <div class="panel-group" id="accordion">
                          <div class="panel panel-default">
                            <div class="panel-heading">
                              <h4 class="panel-title">
                                  <a class="basic_dtl" data-toggle="collapse" data-parent="#accordion" href="#collapse1">
                                       <i class="fas fa-info-circle"></i> Basic Information
                               </a>
                                  <a class="basic_dtl" data-toggle="collapse" data-parent="#accordion" href="#collapse1">
                                       <i class="fa fa-angle-down arr" aria-hidden="true"></i>
                                  </a>
                              </h4>
                            </div>
                            <div id="collapse1" class="panel-collapse collapse in">
                                <div class="panel-body">
                                    <form>
                                <div class="form-row">
                                    <div class="form-group col-md-4">
                                        <label for="inputState">Designation</label>
                                        <select id="inputState" class="form-control enqry_input">
                                            <option selected>MBBS</option>
                                            <option selected>PHD</option>
                                            <option selected>BDMS</option>
                                        </select>
                                    </div>
                                    <div class="form-group col-md-4">
                                        <label for="">First Name</label>
                                        <input type="text" class="form-control enqry_input" id="">
                                    </div>
                                    <div class="form-group col-md-4">
                                        <label for="">Last Name</label>
                                        <input type="text" class="form-control enqry_input" id="" >
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="form-group col-md-4">
                                        <label for="">Date of Birth</label>
                                        <input type="text" class="form-control enqry_input" id="" placeholder="DD-MM-YYYY">
                                    </div>
                                    <div class="form-group col-md-4">
                                        <label class="left" for="">Gender</label>
                                        <div class="form-check gender">
                                            <input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
                                            <label class="form-check-label" for="defaultCheck1">
                                                Male
                                            </label>
                                        </div>
                                        <div class="form-check gender">
                                            <input class="form-check-input" type="checkbox" value="" id="defaultCheck2" >
                                            <label class="form-check-label" for="defaultCheck2">
                                                Female
                                            </label>
                                        </div>

                                    </div>
                                    <div class="form-group col-md-4">
                                        <label for="">Mobile No.</label>
                                        <input type="text" class="form-control enqry_input" id="">
                                    </div>


                                </div>
                                <div class="form-row">
                                    <div class="form-group col-md-4">
                                        <label for="inputAddress">Address 1</label>
                                        <textarea type="text" class="form-control enqry_input" id="inputAddress" placeholder="Add1"></textarea>
                                    </div>
                                    <div class="form-group col-md-4">
                                        <label for="inputState">State</label>
                                        <select id="inputState" class="form-control enqry_input">
                                            <option selected>Andhra Pradesh</option>
                                            <option selected>Arunachal Pradesh</option>
                                           <option selected>Assam</option>
                                        <option selected>Bihar</option>
                                        <option selected>Chandigarh</option>
                                        <option selected>Chhattisgarh</option>
                                        <option selected>Delhi</option>
                                        <option selected>Goa</option>
                                        <option selected>Gujarat</option>
                                        <option selected>Haryana</option>
                                        <option selected>Himachal Pradesh</option>
                                        </select>
                                    </div>
                                    <div class="form-group col-md-4">
                                        <label for="inputState">City</label>
                                        <select id="inputState" class="form-control enqry_input">
                                            <option selected>Mumbai</option>
                                            <option selected>Delhi</option>
                                            <option selected>Bangalore</option>
                                            <option selected>Hyderabad</option>
                                            <option selected>Ahmedabad</option>
                                            <option selected>Chennai</option>
                                            <option selected>Kolkata</option>
                                            <option selected>Surat</option>
                                            <option selected>Pune</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="form-group col-md-4">
                                        <label for="">Pin code</label>
                                        <input type="text" class="form-control enqry_input" id="">
                                    </div> 
                                    <div class="form-group col-md-4">
                                           <label for="exampleFormControlFile1">Select Image</label>
                                            <div class="custom-file mb-3">
                                                <input type="file" class="custom-file-input" id="customFile" name="filename">
                                                <label class="custom-file-label" for="customFile">Choose file</label>
                                              </div>
                                    </div>
                                </div>
                            </form>
                                  <script>
                                    // Add the following code if you want the name of the file appear on select
                                    $(".custom-file-input").on("change", function() {
                                      var fileName = $(this).val().split("\\").pop();
                                      $(this).siblings(".custom-file-label").addClass("selected").html(fileName);
                                    });
                                    </script>  
                                </div>
                            </div>
                          </div>
                        </div>

               <div class="">
                    <ul class="nav nav-tabs">
                      <li class="active"><a data-toggle="tab" href="#home"> <i class="fa fa-graduation-cap" aria-hidden="true"></i> Qualification Detail</a></li>
                      <li><a data-toggle="tab" href="#menu1"><i class="fa fa-hospital-o" aria-hidden="true"></i> Hospital</a></li>
                      <li><a data-toggle="tab" href="#menu2"><i class="fa fa-user-md" aria-hidden="true"></i> Specialization</a></li>
                    </ul>

                    <div class="tab-content">
                      <div id="home" class="tab-pane fade in active">
                        <div class="col-md-12 " >

                            <div class="col-md-12 right">
                                <a href="myModal" data-toggle="modal" data-target="#_hospital" class="add_">
                                    <i class="fa fa-plus-circle" aria-hidden="true"></i></a>
                                <div class="modal" id="_hospital" tabindex="-1">
                                    <div class="modal-dialog" style="width:100% !important">
                                        <div class="modal-content"  style="width:100% !important">
                                             <div class="modal-header">
                                                <h5 class="modal-title"><i class="fas fa-graduation-cap "></i> Enter Qualification Detail</h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                  <span aria-hidden="true">&times;</span>
                                                </button>
                                              </div>
                                            <div class="modal-body">
                                                <div class="form-group ">
                                                    <label for="">Degree</label>
                                                    <input type="text" value="Enter Degree" class="form-control enqry_input" id="">
                                                </div>
                                                <div class="form-group">
                                                    <label for="">Start Date</label>
                                                    <input type="text" value="dd-mm-yyyy" class="form-control enqry_input" id="">
                                                </div>
                                                <div class="form-group ">
                                                    <label for="">End Date</label>
                                                    <input type="text" value="dd-mm-yyyy" class="form-control enqry_input" id="">
                                                </div>
                                                <div class="form-group ">
                                                    <label for="">Percentage</label>
                                                    <input type="text" value="Enter percentage" class="form-control enqry_input" id="">
                                                </div>
                                            </div>
                                            <div class="modal-footer mdl_btn">
                                                <button type="button" class="btn btn-primary"> Add </button>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>

                            <table class="table table-sm">
                                <thead>
                                    <tr>
                                        <th scope="col">Degree Type</th>
                                        <th scope="col">Start Date</th>
                                        <th scope="col">End Date</th>
                                        <th scope="col">Percentage</th>
                                        <th scope="col">Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>MBBS</td>
                                        <td>16-07-2007</td>
                                        <td>16-07-2013</td>
                                        <td>83.7%</td>
                                        <td><i class="fas fa-trash-alt delete_detail"></i></td>
                                    </tr>

                                </tbody>
                            </table>
                </div>
                      </div>
                      <div id="menu1" class="tab-pane fade">
                       <div class="col-md-12"> 
                        <div class="col-md-12 right">
                                <a class="add_" href="myModal" data-toggle="modal" data-target="#_qual">
                                  <i class="fa fa-plus-circle" aria-hidden="true"></i> 
                                </a>
                                <div class="modal" id="_qual" tabindex="-1">
                                    <div class="modal-dialog" style="width:100% !important">
                                        <div class="modal-content"  style="width:100% !important">
                                             <div class="modal-header">
                                                <h5 class="modal-title"><i class="fas fa-hospital-alt"></i> Enter Hospital Detail</h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                  <span aria-hidden="true">&times;</span>
                                                </button>
                                              </div>
                                            <div class="modal-body">
                                                <div class="form-group ">
                                                    <label for="">Hospital</label>
                                                    <input type="text" value="Enter Hospital" class="form-control enqry_input" id="">
                                                </div>
                                                <div class="form-group">
                                                    <label for="">Years of Experience</label>
                                                    <input type="text" value="Enter Exp." class="form-control enqry_input" id="">
                                                </div>
                                                <div class="form-group ">
                                                    <label for="">No. of Surgeries</label>
                                                    <input type="text" value="Enter Surguries done" class="form-control enqry_input" id="">
                                                </div>
                                                <div class="form-group ">
                                                    <label for="">Achievements</label>
                                                    <input type="text" value="Enter Achievements" class="form-control enqry_input" id="">
                                                </div>
                                            </div>
                                            <div class="modal-footer mdl_btn">
                                                <button type="button" class="btn btn-primary">Add</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                        
                            </div>

                            <table class="table table-sm">
                                <thead>
                                    <tr>
                                        <th scope="col">Hospital</th>
                                        <th scope="col">Years of Experience</th>
                                        <th scope="col">No. of Surgeries</th>
                                        <th scope="col">Achievements</th>
                                        <th scope="col">Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>Apollo</td>
                                        <td>5 Years</td>
                                        <td>50+</td>
                                        <td>Gold Medalist</td>
                                        <td><i class="fas fa-trash-alt delete_detail"></i></td>
                                    </tr>

                                </tbody>
                            </table>  
                          </div>
                      </div>
                      <div id="menu2" class="tab-pane fade">
                         <div class="col-md-12 "> 
                          <div class="col-md-12 right">
                                <a href="myModal" data-toggle="modal" data-target="#_special" class="add_">
                                    <i class="fa fa-plus-circle" aria-hidden="true"></i>
                                </a>
                                <div class="modal" id="_special" tabindex="-1">
                                    <div class="modal-dialog" style="width:100% !important">
                                        <div class="modal-content"  style="width:100% !important">
                                             <div class="modal-header">
                                                <h5 class="modal-title"><i class="fas fa-user-md"></i> Enter Specialties Detail</h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                  <span aria-hidden="true">&times;</span>
                                                </button>
                                              </div>
                                            <div class="modal-body">
                                                <div class="form-group ">
                                                    <label for="">Speciality</label>
                                                    <input type="text" value="Enter Degree" class="form-control enqry_input" id="">
                                                </div>
                                                <div class="form-group">
                                                    <label for="">Experience</label>
                                                    <input type="text" value="dd-mm-yyyy" class="form-control enqry_input" id="">
                                                </div>
                                                <div class="form-group ">
                                                    <label for="">Certificate</label>
                                                    <input type="text" value="dd-mm-yyyy" class="form-control enqry_input" id="">
                                                </div>
                                                <div class="form-group ">
                                                    <label for="">Awards</label>
                                                    <input type="text" value="Enter percentage" class="form-control enqry_input" id="">
                                                </div>
                                            </div>
                                            <div class="modal-footer mdl_btn">
                                                <button type="button" class="btn btn-primary">Add</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>
                         
                            <table class="table table-sm">
                                <thead>
                                    <tr>
                                        <th scope="col">Speciality</th>
                                        <th scope="col">Experience</th>
                                        <th scope="col">Certificate</th>
                                        <th scope="col">Awards</th>
                                        <th scope="col">Action</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>Dermatologist</td>
                                        <td>4 Years</td>
                                        <td>12345</td>
                                        <td>10+</td>
                                        <td><i class="fas fa-trash-alt delete_detail"></i></td>
                                    </tr>

                                </tbody>
                            </table>
                      </div>
                     </div> 
                    </div>
                    </div>

                 
                <!--/col-->
                
               
                <div class="col-md-12 " >
                   
                
                    <div class="panel_btn">
                        <button type="button" class="btn_login">Save</button>
                    </div>
                     </div>
                <!-- Chip DIv-->
                <div class="chip-container">
                <div class="col-md-12">
                    <div class="col-md-2 left Chip">
                        <span>Blood Cancer</span>
                    </div>
                    <div class="col-md-2 left Chip">
                        <span>Blood Cancer</span>
                    </div>
                    <div class="col-md-2 left Chip">
                        <span>Blood Cancer</span>
                    </div>
                    <div class="col-md-2 left Chip">
                        <span>Blood Cancer</span>
                    </div>
                    <div class="col-md-2 left Chip">
                        <span>Blood Cancer</span>
                    </div>
                    <div class="col-md-2 left Chip">
                        <span>Blood Cancer</span>
                    </div>
                </div>
                 </div>
                  <!-- Chip DIv-->

           </div>
</div>
</div>
</div>
    
    </body>
    <script>
        $(document).ready(function () {
            $(".btn").click(function () {
                $("#myModal").modal("show");
            });
        });
    </script>
    
    <jsp:include page = "../../footer.jsp" />  
</html:html>