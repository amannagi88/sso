
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.action;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.so.dao.RegistrationDao;
import org.apache.struts.actions.DispatchAction;

import com.so.form.SessionForm;
import com.so.pojo.RegPass;
import com.so.pojo.patient.SoPatientMasterPojo;
import com.so.pojo.UserRegistration;
import com.so.util.SecretAction;
import java.sql.Timestamp;
import java.util.Collections;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author PromoVision
 */
public class LoginAction extends DispatchAction {

    public ActionForward verifyAndCheck(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws GoogleJsonResponseException {
        SessionForm sessionForm = new SessionForm();
        RegistrationDao usDao = null;
        try {

            GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(new NetHttpTransport(), JacksonFactory.getDefaultInstance())
                    //GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(null,null)
                    // Specify the CLIENT_ID of the app that accesses the backend:
                    .setAudience(Collections.singletonList("92588129338-curjkvtk8v283nmseug1kjjpddq4bqsi.apps.googleusercontent.com"))
                    // Or, if multiple clients access the backend:
                    //.setAudience(Arrays.asList(CLIENT_ID_1, CLIENT_ID_2, CLIENT_ID_3))
                    .build();

            // (Receive idTokenString by HTTPS POST)
            String idTokenString = req.getParameter("idtoken");
            //verifier.
            GoogleIdToken idToken = verifier.verify(idTokenString);
            if (idToken != null) {
                Payload payload = idToken.getPayload();

                // Print user identifier
                String userId = payload.getSubject();
                System.out.println("User ID: " + userId);
                // Get profile information from payload
                String email = payload.getEmail();
                String name = (String) payload.get("name");

                usDao = new RegistrationDao();

                UserRegistration user = usDao.checkUserExists(email);
                if (user.getUserId() != null && user.getUserId() > 0) {

                    sessionForm.setUserId(user.getUserId());
                    sessionForm.setUserTypeId(2);
                    sessionForm.setUserName(user.getUserName());
                    req.getSession(false).setAttribute("sessionForm", sessionForm);

                    res.setContentType("text/html");
                    res.setHeader("Cache-control", "no-cache");
                    res.setHeader("Access-Control-Allow-Headers", "Content-Type");
                    res.getWriter().write("1__1_10");//Exists
                } else {
                    res.setContentType("text/html");
                    res.setHeader("Cache-control", "no-cache");
                    res.setHeader("Access-Control-Allow-Headers", "Content-Type");
                    res.getWriter().write("0__0_01");//Not Exists
                }
            } else {
                System.out.println("Invalid ID token.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ActionForward login(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws GoogleJsonResponseException {
        SessionForm sessionForm = new SessionForm();
        try {

            GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(new NetHttpTransport(), JacksonFactory.getDefaultInstance())
                    //GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(null,null)
                    // Specify the CLIENT_ID of the app that accesses the backend:
                    .setAudience(Collections.singletonList("92588129338-curjkvtk8v283nmseug1kjjpddq4bqsi.apps.googleusercontent.com"))
                    // Or, if multiple clients access the backend:
                    //.setAudience(Arrays.asList(CLIENT_ID_1, CLIENT_ID_2, CLIENT_ID_3))
                    .build();

            // (Receive idTokenString by HTTPS POST)
            String idTokenString = req.getParameter("idtoken");
            GoogleIdToken idToken = verifier.verify(idTokenString);
            if (idToken != null) {
                Payload payload = idToken.getPayload();

                // Print user identifier
                String userId = payload.getSubject();
                System.out.println("User ID: " + userId);
                // Get profile information from payload
                String email = payload.getEmail();
                boolean emailVerified = Boolean.valueOf(payload.getEmailVerified());
                String name = (String) payload.get("name");
                String pictureUrl = (String) payload.get("picture");
                String locale = (String) payload.get("locale");
                String familyName = (String) payload.get("family_name");
                String givenName = (String) payload.get("given_name");

                // Use or store profile information
                req.setAttribute("email", email);
                req.setAttribute("name", name);

                doSave(mapping, form, req, res);
            } else {
                System.out.println("Invalid ID token.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("quickitr");
    }

    public ActionForward doSave(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        SessionForm myForm1 = new SessionForm();
        UserRegistration aur = new UserRegistration();
        SoPatientMasterPojo apo = new SoPatientMasterPojo();
        RegPass pss = new RegPass();
        RegistrationDao usDao = null;
        String salt = "salt";
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        try {
            usDao = new RegistrationDao();

            aur.setCreateDate(ts);
            aur.setUpdateDate(ts);
            aur.setUserTypeId(2);

            aur.setUserName(req.getAttribute("email").toString().trim());

            apo.setFirstName(req.getAttribute("name").toString().trim());            
            apo.setLastName(req.getAttribute("name").toString().trim());

            byte[] arr = SecretAction.getSalt();
            pss.setCurrentEncrpPassword(SecretAction.generateStorngPasswordHash("password.1".trim(), arr));
            pss.setCurrentEncrpSalt(arr);
            int userId = usDao.saveUser(aur, apo, pss, req);
            if (userId > 0) {
                myForm1.setUserId(userId);
                myForm1.setUserTypeId(2);
                myForm1.setUserName(aur.getUserName());
                req.getSession(false).setAttribute("sessionForm", myForm1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    
    public ActionForward history(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws GoogleJsonResponseException {
        SessionForm sessionForm= new SessionForm();
        try {

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("medicalhistory");
    }
    
    public ActionForward timeline(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws GoogleJsonResponseException {
        SessionForm sessionForm= new SessionForm();
        try {

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapping.findForward("timeline");
    }

}


