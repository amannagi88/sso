<%-- 
    Document   : AddInquiry
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
    <script src="js/so_hospital_inquiry.js" type="text/javascript"></script>
    <body style="">
        <div class="container main_div">
            <div class="row">
                <h3 class="main_div_h ">Enquiry Form</h3>
                <div class="col-md-12 form_div">
                    <div class="row">
                        <div class="col-md-10 offset-md-1" >
                            <span class="anchor" id="formComplex"></span>
                            <html:form action="/inquiry.do?Method=execute" method="post" styleId="inquiry_form_id" >
                                <div class="col-md-12 left">
                                    <div class="col-md-6 left">
                                        <div class="form-group">
                                            <label class="form_lbl"  for="firstName">First Name <span style="color:red">*</span></label>
                                            <html:text  property="firstName" styleClass="enqry_input" styleId="firstName"></html:text>
                                                <div id="first_name_error" class="validation-class"></div>
                                            </div>
                                        </div>
                                        <div class="col-md-6 left">
                                            <div class="form-group">
                                                <label class="form_lbl"  for="lastName">Last Name</label>
                                            <html:text  property="lastName" styleClass="enqry_input" styleId="lastName"></html:text>

                                            </div>
                                        </div>
                                    </div><div class="col-md-12 left">
                                        <div class="col-md-6 left">
                                            <div class="form-group">
                                                <label class="form_lbl"  for="emailId"> Email Id</label>
                                            <html:text  property="emailId" styleClass="enqry_input" styleId="emailId"  ></html:text>

                                            </div>
                                        </div>
                                        <div class="col-md-6 left">
                                            <div class="form-group">
                                                <label class="form_lbl"  for="mobile">Contact No. <span style="color:red">*</span></label>
                                            <html:text  property="mobile" styleClass="enqry_input" styleId="mobile"  style="" ></html:text>
                                                <div id="contact_error" class="validation-class"></div>
                                            </div>
                                        </div>
                                    </div><div class="col-md-12 left">
                                        <div class="col-md-6 left">
                                            <div class="form-group">
                                                <label class="form_lbl"  for="address">Address</label>
                                            <html:text  property="address" styleClass="enqry_input" styleId="address" ></html:text>

                                            </div>
                                        </div>
                                        <div class="col-md-6 left">
                                            <div class="form-group">
                                                <label class="form_lbl"  for="pincode">Pin Code</label>
                                            <html:text  property="pincode" styleClass="enqry_input" styleId="pincode" ></html:text>
                                                <div id="pin_error" class="validation-class"></div>
                                            </div>
                                        </div>
                                    </div><div class="col-md-12 left">
                                        <div class="col-md-6 left">
                                            <div class="form-group">
                                                <label class="form_lbl"  for="description">Description </label>
                                            <html:textarea  property="description" styleClass="enqry_input" styleId="description" ></html:textarea>

                                            </div>
                                        </div>
                                        <div class="col-md-6 left">
                                            <div class="form-group">
                                                <label class="form_lbl"  for="purpose">Purpose <span style="color:red">*</span></label>
                                            <html:textarea  property="purpose" styleClass="enqry_input" styleId="purpose" ></html:textarea>
                                                <div id="purpose_error" class="validation-class"></div>
                                            </div>
                                        </div>
                                    </div>


                                </div>
                                <div class="col-md-12 btn_div">
                                <html:button property="" styleId="btnReset" styleClass="btn btn-primary btn-lg  user_save"  onclick="return validate_form()" >Save</html:button>
                                   
                                </div>
                        </html:form>

                    </div>
                </div>
            </div>
            <!--/row-->
        </div>
        <!--/col-->

    </body>
    <jsp:include page = "../../footer.jsp" />  
</html:html>