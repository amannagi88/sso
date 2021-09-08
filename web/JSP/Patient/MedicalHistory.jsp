<%-- 
    Document   : MedicalHistory
    Created on : 25-Jul-2021, 12:19:51 PM
    Author     : dev1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SSO</title>
        <jsp:include page = "../../header.jsp" />   
    </head>
    <body>
        
        
        <style>
   
</style>







<div class="container-fluid">
    <div class="row">
        <div class="col-md-1"></div>
    <div class="col-md-10 form_des">
<div class="bs-example">
    <h3 class="border-bottom" >Medical History of Patient</h3>
    <form class="needs-validation" action="/examples/actions/confirmation.php" method="post" novalidate>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label" for="firstName">First Name:</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="firstName" placeholder="First Name" required>
            </div>
            <label class="col-sm-2 col-form-label" for="lastName">Last Name:</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="lastName" placeholder="Last Name" required>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label" for="inputEmail">Email Address:</label>
            <div class="col-sm-4">
                <input type="email" class="form-control" id="inputEmail" placeholder="Email Address" required>
            </div>
            <label class="col-sm-2 col-form-label" for="phoneNumber">Mobile Number:</label>
            <div class="col-sm-4">
                <input type="number" class="form-control" id="phoneNumber" placeholder="Phone Number" required>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label">Date of Birth:</label>
            <div class="col-sm-3">
                <select class="custom-select" required>
                    <option value="">Date</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                    <option value="10">10</option>
                    <option value="11">11</option>
                    <option value="12">12</option>
                    <option value="13">13</option>
                    <option value="14">14</option>
                    <option value="15">15</option>
                    <option value="16">16</option>
                    <option value="17">17</option>
                    <option value="18">18</option>
                    <option value="19">19</option>
                    <option value="20">20</option>
                    <option value="21">21</option>
                    <option value="22">22</option>
                    <option value="23">23</option>
                    <option value="24">24</option>
                    <option value="25">25</option>
                    <option value="26">26</option>
                    <option value="27">27</option>
                    <option value="28">28</option>
                    <option value="29">29</option>
                    <option value="30">30</option>
                    <option val3ue="31">31</option>
                </select>
            </div>
            <div class="col-sm-4">
                <select class="custom-select" required>
                    <option value="">Month</option>
                    <option value="1">January</option>
                    <option value="2">February</option>
                    <option value="3">March</option>
                    <option value="4">April</option>
                    <option value="5">May</option>
                    <option value="6">June</option>
                    <option value="7">July</option>
                    <option value="8">August</option>
                    <option value="9">September</option>
                    <option value="10">October</option>
                    <option value="11">November</option>
                    <option value="12">December</option>
                </select>
            </div>
            <div class="col-sm-3">
                <select class="custom-select">
                    <option>Year</option>
                </select>
            </div>
        </div>
        <div class="form-group row">
            <label class="col-sm-2 col-form-label" for="postalAddress">Postal Address:</label>
            <div class="col-sm-10">
                <textarea rows="3" class="form-control" id="postalAddress" placeholder="Postal Address" required></textarea>
            </div>
        </div>
        
               
        <div class="form-group row">
            <label class="col-sm-2 col-form-label" for="ZipCode">Zip Code:</label>
            <div class="col-sm-4">
                <input type="text" class="form-control" id="ZipCode" placeholder="Zip Code" required>
            </div>
            <label class="col-sm-2 col-form-label">Gender:</label>
            <div class="col-sm-4 mt-2">
                <label class="mb-0 mr-3">
                    <input type="radio" class="mr-1" name="gender"> Male
                </label>
                <label class="mb-0 mr-3">
                    <input type="radio" class="mr-1" name="gender"> Female
                </label>
            </div>
        </div>
        <div class="form-group row">
        <label for="formFileMultiple" class="col-sm-2 col-form-label">Upload File</label>
        <div class="col-sm-4">
        <input class="form-control" type="file" id="formFileMultiple" multiple />
        </div>
        <label for="formFileMultiple" class="col-sm-2 col-form-label">Upload File</label>
        <div class="col-sm-4">
        <input class="form-control" type="file" id="formFileMultiple" multiple />
        </div>
        </div>
        
        <div class="form-group row">
        <label for="formFileMultiple" class="col-sm-2 col-form-label"></label>
        <div class="col-sm-4">
            
        </div>
        <label for="formFileMultiple" class="col-sm-2 col-form-label"></label>
        <div class="col-sm-4">
            
        </div>
        </div>
        
        <div class="form-group row">
            <div class="col-sm-9 offset-sm-3">
                <label class="checkbox-inline">
                    <input type="checkbox" class="mr-1" value="agree"> I agree to the <a href="#">Terms and Conditions</a>.
                </label>
            </div>
        </div>
        <div class="form-group row">
            <div class="col-sm-9 offset-sm-3">
                <input type="submit" class="btn btn-primary" value="Submit">
                <input type="reset" class="btn btn-secondary" value="Reset">
            </div>
        </div>
    </form>
</div>
    </div>
                <div class="col-md-1"></div>
    </div> 
</div> 
        <jsp:include page = "../../footer.jsp" />  
    </body>
    
</html>
