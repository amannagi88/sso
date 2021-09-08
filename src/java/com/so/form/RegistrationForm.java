/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.form;

import org.apache.struts.action.ActionForm;

/**
 *
 * @author PromoVision
 */
public class RegistrationForm extends ActionForm {

    private String userName;
    private String panNumber;
    private String docSubmissionType;
    private int tempUserId;
    private String password;
    private String firstName;
    private String lastName;
    private String middleName;
    private String dateOfBirth;
    private String mobile;
    private String otp;
    private String sentOtp;

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getDocSubmissionType() {
        return docSubmissionType;
    }

    public void setDocSubmissionType(String docSubmissionType) {
        this.docSubmissionType = docSubmissionType;
    }

    public int getTempUserId() {
        return tempUserId;
    }

    public void setTempUserId(int tempUserId) {
        this.tempUserId = tempUserId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getSentOtp() {
        return sentOtp;
    }

    public void setSentOtp(String sentOtp) {
        this.sentOtp = sentOtp;
    }

}