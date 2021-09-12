<%-- 
    Document   : LabelSettings
    Created on : 11 Sep. 2021, 11:08:41 pm
    Author     : jotprabh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page = "../Admin/AdminSidebar.jsp" /> 
        <jsp:include page = "../Admin/AdminHeader.jsp" />   
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Configuration</title>
    </head>
  
    <div class="container-fluid">
<div class="row">
<div class="col-md-12">
<span class="config_heading">Configuration</span>
</div>
<div class="col-md-10 table-main-div">
        <table class="table">
          <thead>
            <tr style="">
              <th scope="col" class="centre_">Sr. No</th>
              <th scope="col" class="centre_">Label Name</th>
              <th scope="col" class="centre_">Mandatory</th>
              <th scope="col" class="centre_">Enable/Disable</th>
              <th scope="col" class="centre_">Action</th>
            </tr>
          </thead>
          <tbody>
            <tr style="">
              <td class="centre_">1</td>
              <td class="centre_"><input class="enquiry_input" type="text" placeholder='First Name'/></td>
              <td class="centre_"><input class="form-check-input centre_" type="checkbox"></td>
              <td class="centre_"><input class="form-check-input centre_" type="checkbox"></td>
              <td class="centre_"><button type="button" class="btn" data-toggle="modal" data-target="#setting">
                                  <i class="fa fa-cog cursor"></i>
                                </button>
                
                <!-- Modal -->
                <div class="modal fade" id="setting" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                  <div class="modal-dialog modal-dialog-centered" role="document">
                    <div class="modal-content">
                      <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLongTitle"></h5>
                      </div>
                      <div class="modal-body">
                       <div class="col-md-12 left">
                          <!--<label for="" class="">Modify Label Name</label>
                          <div class="col-md-10 left">
                          <input type="text" class="form-control" placeholder="Enter New Label" id="">
                  		  </div>
                          <div class="col-md-2 left">
                          <button type="button" class="btn btn-primary">Save</button>
                          </div>
                          
                      </div>
                      
                      <div class="col-md-12 left" style="padding:10px; ">
                          <label for="" class="" >Select Field Type</label>
                          
                          <div class="col-md-10 left">
                           <input type="text" class="form-control" style="margin:0.5%" id=""  placeholder="Text field">
                           </div>
                           <div class="col-md-2 right">
                          <input class="form-check-input"  type="checkbox">
                          </div>
                          
                          <div class="col-md-10 left">
                           <input type="email" class="form-control" style="margin:0.5%" placeholder="Email Field" id="Email">
                           </div>
                           <div class="col-md-2 right">
                          	<input class="form-check-input"  type="checkbox">	
                          </div>
                          
                          <div class="col-md-10 left">
							<input type="password" class="form-control" style="margin:0.5%" placeholder="Password Field" id="pwd">
                           </div>
                           <div class="col-md-2 right">
                          	<input class="form-check-input"  type="checkbox">
                          </div>
                          
                          <div class="col-md-10 left">
                          <select class="form-control" style="margin:0.5%" id="exampleFormControlSelect1" >
                          			 <option>Selection Field</option>
                              <option>1</option>
                              <option>2</option>
                              <option>3</option>
                              <option>4</option>
                              <option>5</option>
                            </select>
                           </div>
                           <div class="col-md-2 right">
                          	<input class="form-check-input" type="checkbox">
                          </div>
                          
                          <div class="col-md-10 left">
                          <input type="file" class="form-control-file" style="margin:0.5%" id="exampleFormControlFile1"  />
                           </div>
                           <div class="col-md-2 right">
                          	<input class="form-check-input" type="checkbox">
                          </div>-->
                          
                      </div>
                     </div>
                      <div class="modal-footer">
                        <button type="button" class="btn btn-primary">Save changes</button>
                      </div>
                    </div>
                  </div>
                </div>
              </td>
              
            </tr>
            <tr style="">
              <td class="centre_">2</td>
              <td class="centre_"><input class="enquiry_input" type="text" placeholder='Last Name'/></td>
              <td class="centre_"><input class="form-check-input centre_" type="checkbox"></td>
              <td class="centre_"><input class="form-check-input centre_" type="checkbox"></td>
              <td class="centre_"><button type="button" class="btn" data-toggle="modal" data-target="#setting">
                                  <i class="fa fa-cog cursor"></i>
                                </button>
            </tr>
           <tr style="">
              <td class="centre_">3</td>
              <td class="centre_"><input class="enquiry_input" type="text" placeholder='DOB'/></td>
              <td class="centre_"><input class="form-check-input centre_" type="checkbox"></td>
              <td class="centre_"><input class="form-check-input centre_" type="checkbox"></td>
              <td class="centre_"><button type="button" class="btn" data-toggle="modal" data-target="#setting">
                                  <i class="fa fa-cog cursor"></i>
                  </button></td>
           </tr>
            <tr style="">
              <td class="centre_">4</td>
              <td class="centre_"><input class="enquiry_input" type="text" placeholder='Contact'/></td>
              <td class="centre_"><input class="form-check-input centre_" type="checkbox"></td>
              <td class="centre_"><input class="form-check-input centre_" type="checkbox"></td>
              <td class="centre_"><button type="button" class="btn" data-toggle="modal" data-target="#setting">
                                  <i class="fa fa-cog cursor"></i>
                                </button></td>
            </tr>
             <tr style="">
              <td class="centre_">5</td>
              <td class="centre_"><input class="enquiry_input" type="text" placeholder='Eamil'/></td>
              <td class="centre_"><input class="form-check-input centre_" type="checkbox"></td>
              <td class="centre_"><input class="form-check-input centre_" type="checkbox"></td>
              <td class="centre_"><button type="button" class="btn" data-toggle="modal" data-target="#setting">
                                  <i class="fa fa-cog cursor"></i>
                                </button></td>
            </tr>
          </tbody>
        </table>
</div>
</div>
</div>

             
                
                
                



</div></div></div>
</div></div>
    </body>
</html>
