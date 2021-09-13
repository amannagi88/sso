/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.action.doctor;

import com.so.form.services.ServicesForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author jotprabh
 */
public class DoctorAction extends DispatchAction {

    public ActionForward addDoctor(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        ServicesForm serviceForm = (ServicesForm) req.getSession(false).getAttribute("serviceform");
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("doctor");
    }

}
