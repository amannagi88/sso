<%-- 
    Document   : AdminDashboard
    Created on : 11 Sep. 2021, 11:03:08 pm
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
    </head>

    <!-- Begin Page Content -->
<div class="container-fluid left">
<div class="col-md-12 left">
                    <!-- Page Heading -->
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
                        <h4 class="h4 mb-0 text-gray-800">Good Morning, Ms. Cheshta Joshi</h4>
                        <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">
                        <i class="fas fa-download fa-sm text-white-50"></i> Generate Report</a>
                    </div>
                    <div class="col-md-12">
                    
                    	 <div class="col-xl-3 col-md-3 mb-3 left">
                            <div class="card border-left-primary shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class="text-xs text-primary text-uppercase mb-1">
                                              <div class="h6 font-weight-bold text-center"> Doctor's Count </div>
                                           	  <div class="h5 mb-0 font-weight-bold text-center text-gray-800">100</div>
                                        	</div>
                                    	</div>
                                	</div>
                           		 </div>
                       		 </div>
                         </div>
						
                         <div class="col-xl-3 col-md-3 mb-3 left">
                            <div class="card border-left-primary shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class="text-xs text-primary text-uppercase mb-1">
                                              <div class="h6 font-weight-bold text-center"> Patient's Count </div>
                                           		 <div class="h5 mb-0 font-weight-bold text-center text-gray-800">80</div>
                                        	</div>
                                    	</div>
                                	</div>
                           		 </div>
                       		 </div>
                         </div>
						
                        <div class="col-xl-3 col-md-3 mb-3 left">
                            <div class="card border-left-primary shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class="text-xs text-primary text-uppercase mb-1">
                                              <div class="h6 font-weight-bold text-center">Today's Earnings</div>
                                           		 <div class="h5 mb-0 font-weight-bold text-center text-gray-800">RS-9,050</div>
                                        	</div>
                                    	</div>
                                	</div>
                           		 </div>
                       		 </div>
                         </div>
						
                        <div class="col-xl-3 col-md-3 mb-3 left">
                            <div class="card border-left-primary shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class="text-xs text-primary text-uppercase mb-1">
                                              <div class="h6 font-weight-bold text-center"> Total Revenue </div>
                                           		 <div class="h5 mb-0 font-weight-bold text-center text-gray-800"> RS-50,320</div>
                                        	</div>
                                    	</div>
                                	</div>
                           		 </div>
                       		 </div>
                         </div>
				
                        
                         <!-- Content Column -->
                        <div class="col-lg-12 mb-4 left">

                            <!-- Project Card Example -->
                            <div class="card shadow mb-4">
                                <div class="card-header py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Upcoming Appointments</h6>
                                </div>
                                <div class="card-body">
                                   	<table class="table">
                                          <thead>
                                            <tr>
                                              <th scope="col">Time</th>
                                              <th scope="col">Date</th>
                                              <th scope="col">Patient</th>
                                              <th scope="col">Address</th>
                                              <th scope="col">Phone</th>
                                              <th scope="col">Action</th>
                                            </tr>
                                          </thead>
                                          <tbody>
                                            <tr>
                                              <td>7:30 AM</td>
                                              <td>20 SEPT 2021</td>
                                              <td>Ammy</td>
                                              <td>Delhi</td>
                                              <td>1234566989</td>
                                              <td><i class="fa fa-eye" aria-hidden="true" ></i> &nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-trash" aria-hidden="true" ></i></td>
                                            </tr>
                                            <tr>
                                              <td>7:30 AM</td>
                                             <td>20 SEPT 2021</td>
                                              <td>Shiwan</td>
                                              <td>California</td>
                                              <td>1234566989</td>
                                              <td><i class="fa fa-eye" aria-hidden="true" ></i> &nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-trash" aria-hidden="true" ></i></td>
                                            </tr>
                                            <tr>
											  <td>7:30 AM</td>
                                              <td>20 SEPT 2021</td>
                                              <td>Farhan</td>
                                              <td>Toranto</td>
                                              <td>1234566989</td>
                                              <td><i class="fa fa-eye" aria-hidden="true" ></i> &nbsp;&nbsp;&nbsp;&nbsp;<i class="fa fa-trash" aria-hidden="true" ></i></td>
                                            </tr>
                                          </tbody>
                                        </table>
                                  
                                 </div>
                                </div>
                            </div>

					</div>
           <!--CHarts-->
            <div class="col-md-6 chart_ left">
            <h6 class="font-weight-bold">TOP DISEASES</h6>
             <canvas id="myChart" style="width:100%;max-width:600px"></canvas>
            </div>
            <div class="col-md-6 chart_ left">   
             <h6 class="font-weight-bold">REACH FROM COUNTRIES</h6>        
            <canvas id="myChart_doughnut" style="width:100%;max-width:600px"></canvas>
            </div>
</div>
</div>
</div>
</div>
</div>
    
    </body>
     <script>
            var xValues = ["Cancer - Lung", "Depression", "Asthma", "AIDS (HIV/AIDS)", "Coronavirus"];
            var yValues = [55, 49, 44, 24, 10];
            var barColors = [
              "#b91d47",
              "#00aba9",
              "#2b5797",
              "#e8c3b9",
              "#1e7145"
            ];
            
            new Chart("myChart", {
              type: "doughnut",
              data: {
                labels: xValues,
                datasets: [{
                  backgroundColor: barColors,
                  data: yValues
                }]
              },
              options: {
                title: {
                  display: true,
                }
              }
            });
            </script>
           
            
             
            <script>
            var xValues = ["INDIA", "CANADA", "SPAIN", "USA", "FRANCE"];
            var yValues = [55, 49, 44, 24, 15];
            var barColors = ["#2E4053", "#AF7AC5","#2E86C1","#5B2C6F","#FAD7A0"];
            
            new Chart("myChart_doughnut", {
              type: "bar",
              data: {
                labels: xValues,
                datasets: [{
                  backgroundColor: barColors,
                  data: yValues
                }]
              },
              options: {
                legend: {display: false},
                title: {
                  display: true,
                }
              }
            });
            </script>
     <jsp:include page = "../../footer.jsp" />  
</html>
