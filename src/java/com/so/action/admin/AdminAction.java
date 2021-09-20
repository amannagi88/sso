/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.action.admin;

import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.so.beans.LicenseBean;
import com.so.dao.RegistrationDao;
import com.so.dao.config.ConfigurationDao;
import com.so.form.DoctorForm;
import com.so.form.SessionForm;
import com.so.pojo.doctor.SoDoctorFieldsConfig;
import java.sql.Timestamp;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
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
        DoctorForm docForm = (DoctorForm) form;
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

    public ActionForward saveDocConfigurationPage(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        SessionForm frm = (SessionForm) request.getSession(false).getAttribute("sessForm");
        /*apUtilityFile uf = new UtilityFile();
        funcMapId = 17;        
        int accessLevel = uf.CheckUserAccessToFunc(request, funcMapId);
        if (accessLevel == 0) {
            return mapping.findForward("errorPage");
        } else if (accessLevel == 2) {
            return mapping.findForward("CommonErrorPage");
        }
        frm.setStepNo(2);
        uf.SetCommonValues(request, funcMapId, "");*/
        DoctorForm pfrm = (DoctorForm) form;
        ConfigurationDao cdao = new ConfigurationDao();
        List l1 = pfrm.getFieldList();
        int pkId = 0;
        LicenseBean bean = null;
        SoDoctorFieldsConfig pojo = null;
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        ActionMessages mess = null;
        //APUserLogFile log1 = new UserLogFile();
        int added = 0;
        int updated = 0;
        try {
            if (l1 != null && l1.size() > 0) {
                for (int i = 0; i < l1.size(); i++) {
                    bean = (LicenseBean) l1.get(i);
                    pojo = cdao.getPojo(0, bean.getSerialNo(), "");
                    if (pojo != null) {
                        pojo.setStatus(1);
                        //pojo.setUpdatedBy(frm.getUserId());
                        pojo.setUpdatedDate(ts);
                        if (bean.getIsNameEditable() == 1) {
                            pojo.setFieldName(request.getParameter("fieldNameVal" + i));
                        } else {
                            pojo.setFieldName(bean.getFieldName());
                        }

                        pojo.setFieldType(bean.getFieldType());
                        pojo.setFieldDesc(bean.getFieldDesc());
                        if (bean.getIsDisabled() == 0) {
                            if (request.getParameter("isApplicableVal" + i) != null) {
                                pojo.setIsApplicable(1);
                            } else {
                                pojo.setIsApplicable(0);
                            }
                        } else {
                            pojo.setIsApplicable(bean.getIsApplicable());
                        }
                        if (bean.getIsDisabled() == 0) {
                            if (request.getParameter("isMandatoryVal" + i) != null) {
                                pojo.setIsMandatory(1);
                            } else {
                                pojo.setIsMandatory(0);
                            }
                        } else {
                            pojo.setIsMandatory(bean.getIsMandatory());
                        }
                        if (bean.getIsDisabled() == 0) {
                            if (request.getParameter("orderVal" + i) != null) {
                                pojo.setOrderNo(Double.parseDouble(request.getParameter("orderVal" + i)));
                            } else {
                                pojo.setOrderNo(bean.getOrderNo());
                            }
                        } else {
                            pojo.setOrderNo(bean.getOrderNo());
                        }
                        pojo.setIsDisabled(bean.getIsDisabled());
                        pojo.setIsNameEditable(bean.getIsNameEditable());
                        pojo.setSerialNo(bean.getSerialNo());
                        pkId = cdao.updatePojo(pojo);
                        if (pkId > 0) {
                            updated++;
                        }
                    } else {
                        pojo = new SoDoctorFieldsConfig();
                        pojo.setStatus(1);
                        //pojo.setCreatedBy(frm.getUserId());
                        pojo.setUpdatedBy(0);
                        pojo.setCreatedDate(ts);
                        pojo.setUpdatedDate(ts);
                        if (bean.getIsNameEditable() == 1) {
                            pojo.setFieldName(request.getParameter("fieldNameVal" + i));
                        } else {
                            pojo.setFieldName(bean.getFieldName());
                        }

                        pojo.setFieldType(bean.getFieldType());
                        pojo.setFieldDesc(bean.getFieldDesc());
                        if (bean.getIsDisabled() == 0) {
                            if (request.getParameter("isApplicableVal" + i) != null) {
                                pojo.setIsApplicable(1);
                            } else {
                                pojo.setIsApplicable(0);
                            }
                        } else {
                            pojo.setIsApplicable(bean.getIsApplicable());
                        }
                        if (bean.getIsDisabled() == 0) {
                            if (request.getParameter("isMandatoryVal" + i) != null) {
                                pojo.setIsMandatory(1);
                            } else {
                                pojo.setIsMandatory(0);
                            }
                        } else {
                            pojo.setIsMandatory(bean.getIsMandatory());
                        }
                        pojo.setIsDisabled(bean.getIsDisabled());
                        pojo.setIsNameEditable(bean.getIsNameEditable());
                        pojo.setOrderNo(bean.getOrderNo());
                        pojo.setSerialNo(bean.getSerialNo());
                        pojo.setField1(bean.getField1());
                        pojo.setField2(bean.getField2());
                        pkId = cdao.savePojo(pojo);
                        if (pkId > 0) {
                            added++;
                        }
                    }
                }
            }
            /*apif (added > 0) {
                log1.saveLogFile(frm.getModuleId(), frm.getFuncId(), frm.getSubFuncId(), frm.getStepNo(), pkId, 1, 0,
                        "Customer Config", "Customer Configuration Added", "New Customer Configuration Added", "", "", "",
                        frm.getUid(), frm.getClientId(), "", "", "");
            } else if (updated > 0) {
                log1.saveLogFile(frm.getModuleId(), frm.getFuncId(), frm.getSubFuncId(), frm.getStepNo(), pkId, 2, 0,
                        "Customer Config", "Customer Configuration Updated", "Customer Configuration Updated", "", "", "",
                        frm.getUid(), frm.getClientId(), "", "", "");
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cdao = null;
        }
        if (pkId > 0) {
            mess = new ActionMessages();
            mess.add("message", new ActionMessage("info.configurationSaved"));
            saveMessages(request, mess);
        } else {
            mess = new ActionMessages();
            mess.add("message", new ActionMessage("error.configurationSaved"));
            saveMessages(request, mess);
        }

        return mapping.findForward("doctorSettingSave");
    }

    public ActionForward addDoctor(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) {
        DoctorForm docForm = (DoctorForm) req.getSession(false).getAttribute("doctorForm");
        List fieldList = null;
        ConfigurationDao dao = new ConfigurationDao();
        try {
            fieldList = dao.getConfiguration("CUST", "config", "");
            if (fieldList == null || fieldList.isEmpty()) {
                fieldList = dao.getConfiguration("CUST", "config", "");
            }
            docForm.setFieldList(fieldList);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dao = null;
            fieldList = null;
        }
        return mapping.findForward("doctor");
    }

    public ActionForward getCounts(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws GoogleJsonResponseException {
        SessionForm sessionForm = new SessionForm();
        ConfigurationDao usDao = new ConfigurationDao();
        try {

            int docCount = usDao.getDoctorsCount();
            res.setContentType("text/html");
            res.setHeader("Cache-control", "no-cache");
            res.setHeader("Access-Control-Allow-Headers", "Content-Type");
            res.getWriter().write(docCount);//Exists

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
