<%-- 
    Document   : DoctorAppointmentView
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
                <h3 class="main_div_h ">Doctor Appointment View</h3>
            </div>
            <!--/row-->
        </div>
        <!--/col-->
    </body>
    <jsp:include page = "../../footer.jsp" />  
</html:html>