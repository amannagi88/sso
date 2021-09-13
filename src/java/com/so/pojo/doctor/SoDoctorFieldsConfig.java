/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.pojo.doctor;

import java.sql.Timestamp;

/**
 *
 * @author Dell India
 */
public class SoDoctorFieldsConfig implements java.io.Serializable {

    private int pkId;
    private int fieldType;
    private String fieldName;
    private String fieldDesc;
    private int isMandatory;
    private int isNameEditable;
    private int isApplicable;
    private int isDisabled;
    private double serialNo;
    private double orderNo;
    private int status;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private int createdBy;
    private int updatedBy;
    private int field1;//used as section in this case in user is used as encription
    private int field2;
    private String field3;
    private String field4;
    private String field5;

    public int getPkId() {
        return pkId;
    }

    public void setPkId(int pkId) {
        this.pkId = pkId;
    }

    public int getFieldType() {
        return fieldType;
    }

    public void setFieldType(int fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldDesc() {
        return fieldDesc;
    }

    public void setFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc;
    }

    public int getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(int isMandatory) {
        this.isMandatory = isMandatory;
    }

    public int getIsNameEditable() {
        return isNameEditable;
    }

    public void setIsNameEditable(int isNameEditable) {
        this.isNameEditable = isNameEditable;
    }

    public int getIsApplicable() {
        return isApplicable;
    }

    public void setIsApplicable(int isApplicable) {
        this.isApplicable = isApplicable;
    }

    public int getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(int isDisabled) {
        this.isDisabled = isDisabled;
    }

    public double getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(double serialNo) {
        this.serialNo = serialNo;
    }

    public double getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(double orderNo) {
        this.orderNo = orderNo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }    

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }

    public int getField1() {
        return field1;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public int getField2() {
        return field2;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }

}
