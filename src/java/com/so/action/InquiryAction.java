/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.action;

import com.so.dao.InquiryDao;
import com.so.form.InquiryForm;
import com.so.pojo.SoInquiryPojo;
import java.sql.Timestamp;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.json.JSONException;

/**
 *
 * @author dev2
 */
public class InquiryAction extends DispatchAction {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws JSONException {
        /* Variable declaration area*/
        InquiryForm myForm = (InquiryForm) form;
        InquiryDao dao = new InquiryDao();
        SoInquiryPojo pojo = new SoInquiryPojo();
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        try {
            /* Proccess */
            int count = 0;
            if (myForm != null) {
                if (myForm.getFirstName() != null && !myForm.getFirstName().equalsIgnoreCase("")) {
                    pojo.setFirstName(myForm.getFirstName());
                } else {
                    count++;
                }
                if (myForm.getLastName() != null && !myForm.getLastName().equalsIgnoreCase("")) {
                    pojo.setLastName(myForm.getLastName());
                } else {
                    //count++;                    
                }
                if (myForm.getEmailId() != null && !myForm.getEmailId().equalsIgnoreCase("")) {
                    pojo.setEmailId(myForm.getEmailId());
                } else {
                    //count++;                    
                }
                if (myForm.getMobile() != null && !myForm.getMobile().equalsIgnoreCase("")) {
                    pojo.setMobile(myForm.getMobile());
                } else {
                    count++;
                }
                if (myForm.getAddress() != null && !myForm.getAddress().equalsIgnoreCase("")) {
                    pojo.setAddress(myForm.getAddress());
                } else {
                    //count++;                    
                }
                if (myForm.getDescription() != null && !myForm.getDescription().equalsIgnoreCase("")) {
                    pojo.setDescription(myForm.getDescription());
                } else {
                    // count++;                    
                }
                if (myForm.getPincode() != null && !myForm.getPincode().equalsIgnoreCase("")) {
                    pojo.setPincode(myForm.getPincode());
                } else {
                    // count++;                    

                }
                if (myForm.getPurpose() != null && !myForm.getPurpose().equalsIgnoreCase("")) {
                    pojo.setPurpose(myForm.getPurpose());
                } else {
                    count++;
                }
                if (count == 0) {
                    pojo.setCreateAt(ts);
                    pojo.setUpdateAt(ts);
                    dao.savePojo(pojo);
                    res.setContentType("text/html");
                    res.setHeader("Cache-control", "no-cache");
                    res.setHeader("Access-Control-Allow-Headers", "Content-Type");
                    res.getWriter().write("success");
                } else {
                    res.setContentType("text/html");
                    res.setHeader("Cache-control", "no-cache");
                    res.setHeader("Access-Control-Allow-Headers", "Content-Type");
                    res.getWriter().write("failed");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
