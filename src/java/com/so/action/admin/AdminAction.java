/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.action.admin;

import com.so.dao.config.ConfigurationDao;
import com.so.form.DoctorForm;
import java.util.List;
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
public class AdminAction extends DispatchAction {

    public ActionForward dashboard(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {

        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("dashboard");
    }

    public ActionForward labelSettings(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        DoctorForm docForm = (DoctorForm) req.getSession(false).getAttribute("doctorForm");
        List fieldList = null;
        ConfigurationDao dao = new ConfigurationDao();
        try {
            fieldList = dao.getConfiguration("DOC", "config", "");
            if (fieldList == null || fieldList.isEmpty()) {
                fieldList = dao.getConfiguration("DOC", "config", "");
            }
            docForm.setFieldList(fieldList);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dao = null;
            fieldList = null;
        }
        return mapping.findForward("label");
    }

}
