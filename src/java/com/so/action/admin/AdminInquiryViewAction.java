/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.action.admin;

import com.google.api.client.googleapis.json.GoogleJsonResponseException;

import com.so.form.SessionForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.json.JSONException;

/**
 *
 * @author dev2
 */
public class AdminInquiryViewAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws JSONException {

        return null;
    }

    public ActionForward adminInquiryView(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws GoogleJsonResponseException {
        SessionForm sessionForm = new SessionForm();
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("admininquiryview");
    }
}
