/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.action;

import com.so.dao.ServicesDao;
import com.so.form.InquiryForm;
import com.so.form.ServicesForm;
import com.so.pojo.SoSpecializationMasterPojo;
import com.so.util.BeanObject;
import com.so.util.FilterBean;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author dev2
 */
public class ServiceAction extends DispatchAction {

    public ActionForward search(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        ServicesForm serviceForm = (ServicesForm) req.getSession(false).getAttribute("serviceform");
        ServicesDao serviceDao = new ServicesDao();
        try {
            List<SoSpecializationMasterPojo> specializationList = serviceDao.services();
            serviceForm.setSpecializationList(specializationList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("search");
    }

    public ActionForward enquiry(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        InquiryForm enquiryForm = null;
        if (req.getSession(false).getAttribute("inquiryForm") != null) {
            enquiryForm = (InquiryForm) req.getSession(false).getAttribute("inquiryForm");
        } else {
            enquiryForm = new InquiryForm();
        }
        try {
            enquiryForm.setFirstName("");
            enquiryForm.setAddress("");
            enquiryForm.setDescription("");
            enquiryForm.setEmailId("");
            enquiryForm.setMobile("");
            enquiryForm.setPurpose("");
            enquiryForm.setPincode("");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("enquiry");
    }

    public ActionForward addDoctor(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        ServicesForm serviceForm = (ServicesForm) req.getSession(false).getAttribute("serviceform");
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("doctor");
    }

    public ActionForward filter(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        ServicesForm serviceForm = (ServicesForm) req.getSession(false).getAttribute("serviceform");
        ServicesDao serviceDao = new ServicesDao();
        try {
            List<Double> rating = null;
            List<Double> experience = null;
            List<Double> surgery = null;
            List<Long> specialization = null;
            double longitude = 0.0;
            double latitude = 0.0;
            if (req.getParameter("experience") != null && req.getParameter("experience").length() > 0) {
                experience = Stream.of(req.getParameter("experience").split(","))
                        .map(Double::parseDouble)
                        .collect(Collectors.toList());
            }
            if (req.getParameter("rating") != null && req.getParameter("rating").length() > 0) {
                experience = Stream.of(req.getParameter("rating").split(","))
                        .map(Double::parseDouble)
                        .collect(Collectors.toList());
            }
            if (req.getParameter("surgery") != null && req.getParameter("surgery").length() > 0) {
                experience = Stream.of(req.getParameter("surgery").split(","))
                        .map(Double::parseDouble)
                        .collect(Collectors.toList());
            }
            if (req.getParameter("specialization") != null && req.getParameter("specialization").length() > 0) {
                specialization = Stream.of(req.getParameter("specialization").split(","))
                        .map(Long::parseLong)
                        .collect(Collectors.toList());
            }
            if (req.getParameter("longitude") != null) {
                longitude = Double.parseDouble(req.getParameter("longitude"));
            }
            if (req.getParameter("latitude") != null) {
                latitude = Double.parseDouble(req.getParameter("longitude"));
            }
            List<String> nearLoc = new ArrayList<>();
            List<BeanObject> nearLocTemp = serviceDao.getNearByCities(longitude, latitude);
            if (nearLocTemp != null) {
                nearLoc = nearLocTemp.stream().sorted(Comparator.comparing(BeanObject::getDoubleValue3)).map(BeanObject::getStringValue1).collect(Collectors.toList());
            }
            List<FilterBean> searchList = serviceDao.getFilteredDoctors(nearLoc.subList(0, 9), rating, experience, surgery, specialization, null, null);
            req.setAttribute("search", searchList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("searchResult");
    }

    public ActionForward doctorDetails(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        ServicesForm serviceForm = (ServicesForm) req.getSession(false).getAttribute("serviceform");
        ServicesDao serviceDao = new ServicesDao();
        try {
            Long doctorId = 0l;
            if (req.getParameter("doctorId") != null) {
                doctorId = Long.parseLong(req.getParameter("doctorId"));
            }
            List<FilterBean> searchList = serviceDao.getDoctorDetails(doctorId);
            req.setAttribute("details", searchList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("doctorDetails");
    }

}
