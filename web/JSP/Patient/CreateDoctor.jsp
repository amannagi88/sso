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
        <jsp:include page = "../../header.jsp" />   
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <script src="<%=request.getContextPath()%>/js/search.js" type="text/javascript"></script>

    </head>
    <script>
        var contextPath = '<%=request.getContextPath()%>';
    </script>    

    <body >
        <div class="container main_div">
            <div class="row">
                <h3 class="main_div_h "> Create Doctor</h3>

                   <div class="col-md-12 " >
                    <div class="panel">
                        <div class="panel-heading"> <i class="fas fa-info-circle"></i> Basic Information </div>
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
                                        <label for="inputAddress">Address 4</label>
                                        <textarea type="text" class="form-control enqry_input" id="inputAddress" placeholder="Add1"></textarea>
                                    </div>
                                    <div class="form-group col-md-4">
                                        <label for="inputAddress2">Address 4</label>
                                        <textarea type="text" class="form-control enqry_input" id="inputAddress2" placeholder="AAdd2"></textarea>
                                    </div>
                                    <div class="form-group col-md-4">
                                        <label for="">Pin code</label>
                                        <input type="text" class="form-control enqry_input" id="">
                                    </div> 
                                </div>


                            </form>

                        </div>
                    </div>
                </div>

                 <div class="col-md-12 " >
                    <div class="panel">
                        <div class="panel-heading"><i class="fas fa-graduation-cap "></i> Qualification Detail </div>
                        <div class="panel-body">

                            <div class="col-md-12 right">
                                <a href="myModal" data-toggle="modal" data-target="#_hospital"><i class="fas fa-folder-plus add_detail"></i></a>
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



                </div>
                <!--/col-->
                
                <div class="col-md-12 " >
                    <div class="panel">
                        <div class="panel-heading">  <i class="fas fa-hospital-alt"></i> Hospital </div>
                        <div class="panel-body">

                            <div class="col-md-12 right">
                                <a href="myModal" data-toggle="modal" data-target="#_qual"><i class="fas fa-folder-plus add_detail"></i></a>
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
                </div>

                <div class="col-md-12 " >
                    <div class="panel">
                        <div class="panel-heading"> <i class="fas fa-user-md"></i> Specialization </div>
                        <div class="panel-body">

                            <div class="col-md-12 right">
                                <a href="myModal" data-toggle="modal" data-target="#_special"><i class="fas fa-folder-plus add_detail"></i></a>
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