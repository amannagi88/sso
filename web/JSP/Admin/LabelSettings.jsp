<%-- 
    Document   : LabelSettings
    Created on : 11 Sep. 2021, 11:08:41 pm
    Author     : jotprabh
--%>

<%@page import="com.so.beans.LicenseBean"%>
<%@page import="java.util.List"%>
<%@page import="com.so.form.DoctorForm"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %> 
<!DOCTYPE html>
<% DoctorForm form = (DoctorForm) request.getSession(false).getAttribute("doctorForm");%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page = "../Admin/AdminSidebar.jsp" /> 
        <jsp:include page = "../Admin/AdminHeader.jsp" />   
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Doctor Label Configuration</title>

        <script src="<%=request.getContextPath()%>/js/admin/label_setting.js" type="text/javascript"></script>
        <script src="<%=request.getContextPath()%>/js/common/common_functions.js" type="text/javascript"></script>

    </head>

    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <span class="config_heading">Configuration</span>
            </div>
            <div class="col-md-10 table-main-div">
                <form id="form123" class="form-horizontal style-form" method="post" action="settings.do?Method=saveDocConfigurationPage">
                    <logic:messagesPresent message="true">
                        <html:messages id="message" property="message" message="true">
                            <div class="alert alert-warning alert-dismissable">
                                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                <strong><bean:write name="message"/></strong>
                            </div>
                        </html:messages>
                    </logic:messagesPresent>
                    <table class="table">
                        <thead>
                            <tr style="">
                                <th scope="col" class="centre_">Sr. No</th>
                                <th scope="col" class="centre_">Field Nature</th>
                                <th scope="col" class="centre_">Field Name</th>
                                <th scope="col" class="centre_">Field Desc</th>   
                                <th scope="col" class="centre_">
                                    <input type="checkbox" name="mainAppli" id="mainAppli" onchange="selectAllCheckAppl(this)"> Applicable?
                                </th>   
                                <th scope="col" class="centre_">
                                    <div>
                                        <input type="checkbox" name="mainMandat" style="width: 15%" id="mainMandat" onchange="selectAllCheckMand(this)">
                                    </div>
                                    Mandatory?
                                </th>   
                                <th scope="col" class="centre_"> Name Editable?</th>   
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                List list = form.getFieldList();
                                int datalen = 0;
                                int maxOrder = 0;
                                LicenseBean bean = null;
                                if (list != null && list.size() > 0) {
                                    datalen = list.size();%>

                            <%for (int i = 0; i < list.size(); i++) {
                                    bean = (LicenseBean) list.get(i);
                                    maxOrder = bean.getField2();
                            %>    
                            <tr style="">
                                <td class="centre_"><%=bean.getCount()%></td>
                                <td class="centre_"><%if (bean.getFieldType() == 4) {%><label>Heading</label><%} else {%>Field<%}%></td>
                                <td class="centre_">
                                    <%if (bean.getFieldType() == 4) {%><label><%}%>
                                        <%if (bean.getIsNameEditable() == 0) {%>
                                        <%=bean.getFieldName()%>
                                        <%} else {%>
                                        <input type="text" class="form-control fontcolor text-center backgrounddisplay" style="font-size: 1.0em" name="fieldNameVal<%=i%>" id="fieldNameVal<%=i%>" value="<%=bean.getFieldName()%>">
                                        <%}%>
                                        <%if (bean.getFieldType() == 4) {%></label><%}%>
                                </td>
                                <td class="centre_">
                                    <%if (bean.getFieldType() == 4) {%><label><%}%>
                                        <%=bean.getFieldDesc()%>
                                        <%if (bean.getFieldType() == 4) {%></label><%}%>
                                </td>     
                                <td class="text-center">
                                    <input type="checkbox"  name="isApplicableVal<%=i%>" id="isApplicableVal<%=i%>"<%if (bean.getIsDisabled() == 1) {%> disabled="true"<%}%>  <%if (bean.getIsApplicable() == 1) {%> checked="true"<%}%> value="1">    
                                </td>
                                <td class="text-center">
                                    <%if (bean.getFieldType() == 4) {%>
                                    NA
                                    <%} else {%>
                                    <input type="checkbox"  name="isMandatoryVal<%=i%>" id="isMandatoryVal<%=i%>"<%if (bean.getIsDisabled() == 1) {%> disabled="true"<%}%> <%if (bean.getIsMandatory() == 1) {%> checked="true"<%}%> value="1">    
                                    <%}%>
                                </td>
                                <td class="text-center">
                                    <%if (bean.getIsNameEditable() == 1) {%>Yes<%} else {%>No<%}%>
                                </td>
                            </tr>
                            <%}%>                        
                        </tbody>
                    </table>
                    <input type="hidden" id="datalen" value="<%=datalen%>">
                    <input type="hidden" id="maxOrder" value="<%=maxOrder%>">
                    <input type="button" class="btn btn-primary" style="margin-left: 45%;" value="Submit" onclick="submitForm()">
                    <%} else {%>Configuration set up is not available<%}%>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
