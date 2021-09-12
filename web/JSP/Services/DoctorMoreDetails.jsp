<%@page import="com.so.util.FilterBean"%>
<%@page import="java.util.List"%>
<%@page import="com.so.form.ServicesForm"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ServicesForm serviceForm = (ServicesForm) request.getSession(false).getAttribute("serviceform");
    List<FilterBean> details = (List) request.getAttribute("details");
    FilterBean bean = (FilterBean) details.get(0);
%>
<div class="col-md-2 left">
    <img class="rounded-circle doc_modal_img" alt="100%x280" src="img/doctor2.jpg" >
</div>

<div class="col-md-4 left">
    <p class=""> <%=bean.getTitle()%> <%=bean.getFirstName()%> <%=bean.getLastName()%></p>
    <span class=""><%=bean.getEducationalDegrees()%></span><br />    
    <span class=""><%=bean.getSpecializationName()%></span><br />    
    <p class="">
        <%
        for (int j = 0; j < (((Double) bean.getRating()).intValue()); j++) {%>
        <span class="fa fa-star checked "></span>
        <%}
        %>
        <%
        for (int j = (((Double) bean.getRating()).intValue()); j < 5; j++) {%>
        <span class="fa fa-star "></span>
        <%}
        %>                
    </p>
    <p class="left"><i class="fas fa-award " style="color:#ffa500"></i> <%=bean.getExperience()%> Years of Exp./Practice</p>
</div>

<div class="col-md-6 left">
    <p class="" style="text-align:justify;"><strong><%=bean.getDoctorDescription()%></p>

    <div id="accordion">
        <div class="card">
            <div class="card-header doc_modal_head">
                <a class="card-link" data-toggle="collapse" href="#collapseOne">
                    <i class="fas fa-chevron-circle-down"></i> Show 
                </a>
                <a class="card-link" data-toggle="collapse" href="#collapseOne">
                    <i class="fas fa-chevron-circle-up"></i> Hide 
                </a>
            </div>
            <div id="collapseOne" class="collapse" data-parent="#accordion">
                <div class="card-body doc_modal_body" >
                    Kumar reached sporting headlines at the 2002 Commonwealth Games in Manchester, England, where he claimed a silver medal in the 84-kg division, losing out to Canada's Nicholas Ugoalah by a tough 4–1 verdict. On that same year, he competed for the Indian wrestling team at the Asian Games in Busan, South Korea, but left the tournament empty-handed and injured.
                </div>
            </div>
        </div>
    </div>
</div> 