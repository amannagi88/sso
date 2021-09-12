/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.action;

import com.so.form.ServicesForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author jotprabh
 */
public class AdminAction extends DispatchAction {

    public ActionForward dashboard(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("dashboard");
    }
    
     public ActionForward labelSettings(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("label");
    }

}
