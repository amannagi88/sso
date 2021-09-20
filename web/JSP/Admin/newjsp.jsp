<%-- 
    Document   : CustomerFormSetUp
    Created on : May 7, 2018, 1:10:55 PM
    Author     : SLS-004-COR-GGN'
--%>

<%@page import="com.sl.beans.LicenseBean"%>
<%@page import="java.util.List"%>
<%@page import="com.sl.forms.PartyForm"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.sl.forms.MainForm"%>
<% MainForm form = (MainForm) request.getSession(false).getAttribute("MainForm"); %>
<% PartyForm lform = (PartyForm) request.getSession(false).getAttribute("PartyForm"); %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %> 
<!DOCTYPE html>
<html lang="en">
    <head>
        <script lang="javascript">
            function submitForm() {
                var v1 = null;
                var v2 = null;
                var div = null;
                var err = 0;
                var len = document.getElementById("datalen").value;
                for (var i = 0; i < len; i++) {
                    v1 = document.getElementById("orderVal" + i);
                    div = document.getElementById("orderDiv" + i);
                    for (var j = 0; j < len; j++) {
                        v2 = document.getElementById("orderVal" + j);
                        if (i != j && v1 != null && v2 != null && v1.value == v2.value && div != null) {
                            err++;
                            div.style.background = "red";
                            break;
                        } else if (div != null) {
                            div.style.background = "";
                        }
                    }
                }
                if (err > 0) {
                    alert("Display order can not match with other fields");
                } else {
                    SubmitFormNormal(document.getElementById("form123"));
                }
            }
            var OV = null;
            function SaveOnChange(ob) {
                OV = ob.value;
            }
            function CheckOnChanges(i) {
                var NV = document.getElementById("orderVal" + i).value;
                var v2 = null;
                var len = document.getElementById("datalen").value;
                for (var j = 0; j < len; j++) {
                    v2 = document.getElementById("orderVal" + j);
                    if (i != j && parseInt(OV) > parseInt(NV) && v2 != null && parseInt(v2.value) >= parseInt(NV) && parseInt(v2.value) <= parseInt(OV)) {
                        v2.value = parseInt(v2.value) + 1;
                    }
                    if (i != j && parseInt(OV) < parseInt(NV) && v2 != null && parseInt(v2.value) <= parseInt(NV) && parseInt(v2.value) >= parseInt(OV)) {
                        v2.value = parseInt(v2.value) - 1;
                    }
                }
            }
            function selectAllCheckMand(ob) {
                var chk = null;
                var len = document.getElementById("datalen").value;
                for (var i = -5; i < len; i++) {
                    chk = document.getElementById("isMandatoryVal" + i);
                    if (ob.checked && chk != null && chk.disabled != true) {
                        chk.checked = true;
                    } else if (chk != null && chk.disabled != true) {
                        chk.checked = false;
                    }
                }
            }
            function selectAllCheckAppl(ob) {
                var chk = null;
                var len = document.getElementById("datalen").value;
                for (var i = -5; i < len; i++) {
                    chk = document.getElementById("isApplicableVal" + i);
                    if (ob.checked && chk != null && chk.disabled != true) {
                        chk.checked = true;
                    } else if (chk != null && chk.disabled != true) {
                        chk.checked = false;
                    }
                }
            }
        </script>
    </head>
    <style>
        table {
            width: 100%;
        }

        thead, tbody, tr, td, th { display: block; }

        tr:after {
            content: ' ';
            display: block;
            visibility: hidden;
            clear: both;
        }

        tbody {
            height: 340px;
            overflow-y: auto;
        }

        thead {
            /* fallback */
        }
        tbody td, thead th {
            width: 14.2%;
            float: left;
        }
    </style>
    <body>
        <jsp:include page="/JSP/CommonFiles/HeaderPage.jsp"/>
        <div class="page-container row-fluid container-fluid">
            <jsp:include page="/JSP/CommonFiles/SideMenu.jsp"/>
            <div class="clearfix"></div>            
            <section id="main-content">
                <section class="wrapper main-wrapper row">

                    <div class='col-xs-12'>
                        <div class="page-title">
                            <div class="pull-left">                                
                                <h1 class="title">Customer Configuration Form </h1>                                
                            </div>
                            <div class="pull-right hidden-xs">
                                <ol class="breadcrumb">
                                    <li>
                                        <a href="javascript:;"><i class="fa fa-home"></i>Home </a>
                                    </li>
                                    <li>
                                        <a href="javascript:;">Customer Management </a>
                                    </li>
                                    <li class="active">
                                        <strong>Customer Configuration Form </strong>
                                    </li>
                                </ol>
                            </div>

                        </div>
                    </div>
                    <div class="clearfix"></div>
                    <!-- MAIN CONTENT AREA STARTS -->
                    <div class="col-xs-12">
                        <section class="box ">
                            <header class="panel_header">
                                <h2 class="title pull-left"> Select the desired fields </h2>
                                <div class="actions panel_actions pull-right">
                                    <!--<a class="box_toggle fa fa-chevron-down"></a>-->
                                    <!--<a class="box_setting fa fa-cog" data-toggle="modal" href="#section-settings"></a>-->
                                    <!--<a class="box_close fa fa-times"></a>-->
                                </div>
                            </header>
                            <div class="content-body">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <div class="row">
                                            <form id="form123" class="form-horizontal style-form" method="post" action="PartyManagement.do?Method=SaveCustConfigurationPage">
                                                <logic:messagesPresent message="true">
                                                    <html:messages id="message" property="message" message="true">
                                                        <div class="alert alert-warning alert-dismissable">
                                                            <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                                                            <strong><bean:write name="message"/></strong>
                                                        </div>
                                                    </html:messages>
                                                </logic:messagesPresent>
                                                <!--                          <div class="form-group">
                                                                              <label class="col-sm-2 col-sm-2 control-label">Default</label>
                                                                              <div class="col-sm-10">
                                                                                  <input type="text" class="form-control">
                                                                              </div>
                                                                          </div>-->
                                                <%List list = lform.getFieldList();
                                                    int datalen = 0;
                                                    int maxOrder = 0;
                                                    LicenseBean bean = null;
                                                    if (list != null && list.size() > 0) {
                                                        datalen = list.size();%>                                                
                                                    <table class="table table-striped">
                                                        <thead>
                                                            <tr>
                                                                <th class="text-center" style="margin-top: 24px">Sr.No</th>
                                                                    <%--<th >Display Order</th>--%>
                                                                <th class="text-center" style="margin-top: 24px">Field Nature</th>
                                                                    <%--<th  title="Eligible for encryption after encryption applied">Enc. Eligible</th>--%>
                                                                <th class="text-center" style="margin-top: 24px">Field Name</th>
                                                                <th class="text-center" style="margin-top: 24px">Field Desc</th>
                                                                <!--<th >Field Type</th>-->
                                                                <th class="text-center" style="margin-left: -1px;"><input type="checkbox" name="mainAppli" id="mainAppli" onchange="selectAllCheckAppl(this)"> Applicable?</th>
                                                                <th class="text-center">
                                                                    <div>
                                                                        <input type="checkbox" name="mainMandat" style="width: 15%" id="mainMandat" onchange="selectAllCheckMand(this)">
                                                                    </div>
                                                                    Mandatory?
                                                                </th>
                                                                <th class="text-center" style="margin-top: 24px"> Name Editable?</th>
                                                                
                                                            </tr>
                                                        </thead>    
                                                        <tbody> 
                                                            <%for (int i = 0; i < list.size(); i++) {
                                                                    bean = (LicenseBean) list.get(i);
                                                                    maxOrder = bean.getField2();
                                                            %>
                                                            <tr>
                                                                <td class="text-center"><%=bean.getCount()%></td>
                                                               
                                                                <td class="text-center" title="Field Type">
                                                                    <%if (bean.getFieldType() == 4) {%><label>Heading</label><%} else {%>Field<%}%>    
                                                                </td>
                                                                <td class="text-center">
                                                                    <%if (bean.getFieldType() == 4) {%><label><%}%>
                                                                        <%if (bean.getIsNameEditable() == 0) {%>
                                                                        <%=bean.getFieldName()%>
                                                                        <%} else {%>
                                                                        <input type="text" class="form-control fontcolor text-center backgrounddisplay" style="font-size: 1.0em" name="fieldNameVal<%=i%>" id="fieldNameVal<%=i%>" value="<%=bean.getFieldName()%>">
                                                                        <%}%>
                                                                        <%if (bean.getFieldType() == 4) {%></label><%}%>
                                                                </td>
                                                                <td class="text-center">
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
                                                <input type="button" class="btn btn-theme" style="margin-left: 45%;" value="Submit" onclick="submitForm()">
                                                <%} else {%>Configuration set up is not available<%}%>
                                            </form>
                                        </div>
                                    </div> 
                                </div>
                        </section>
                    </div>                   
                    <div class="clearfix"></div>                    
                </section>
            </section>
        </div>
        <jsp:include page="/JSP/CommonFiles/FooterPage.jsp"/>
    </body>
</html>


