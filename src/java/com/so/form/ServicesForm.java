/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.form;

import com.so.pojo.SoSpecializationMasterPojo;
import java.util.List;
import org.apache.struts.action.ActionForm;

/**
 *
 * @author dev2
 */
public class ServicesForm extends ActionForm {

    private int serviceId;
    private List<Long> selectedSpecialzation;
    private List<SoSpecializationMasterPojo> specializationList;

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public List<SoSpecializationMasterPojo> getSpecializationList() {
        return specializationList;
    }

    public void setSpecializationList(List<SoSpecializationMasterPojo> specializationList) {
        this.specializationList = specializationList;
    }

    public List<Long> getSelectedSpecialzation() {
        return selectedSpecialzation;
    }

    public void setSelectedSpecialzation(List<Long> selectedSpecialzation) {
        this.selectedSpecialzation = selectedSpecialzation;
    }

    
    

}