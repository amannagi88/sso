/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.form;

import java.util.HashMap;
import java.util.List;
import org.apache.struts.action.ActionForm;

/**
 *
 * @author amanpreet.singh
 */
public class SessionForm extends ActionForm {

    private int userId;
    private int userTypeId;
    private String userName;
    private int transactionId;
    private String password;
    private HashMap<Integer, List<Object>> userInfo;
    private int dateProperty;

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
    
    

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public HashMap<Integer, List<Object>> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(HashMap<Integer, List<Object>> userInfo) {
        this.userInfo = userInfo;
    }

    public int getDateProperty() {
        return dateProperty;
    }

    public void setDateProperty(int dateProperty) {
        this.dateProperty = dateProperty;
    }    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    

}