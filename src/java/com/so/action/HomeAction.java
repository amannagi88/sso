/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.action;

import com.so.dao.ServicesDao;
import com.so.form.ServicesForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author dev2
 */
public class HomeAction extends DispatchAction {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws JSONException {
        ServicesForm serviceForm = (ServicesForm) req.getSession(false).getAttribute("serviceform");
        ServicesDao serviceDao = new ServicesDao();
        JSONArray arr = new JSONArray();
        JSONObject root = new JSONObject();
        try {

            /*res.setContentType("application/json");
            res.setHeader("Cache-control", "no-cache");
            res.setHeader("Access-Control-Allow-Headers", "Content-Type");
            res.getWriter().write("" + root.toString());//SUCCESS*/

        } catch (Exception e) {
            e.printStackTrace();
        }

        return mapping.findForward("home");
    }

}
