package com.so.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class SoContactMasterPojo implements Serializable {

    private Long contactId;
    private int userType;
    private Long userId;
    private String mobile1;
    private String mobile2;
    private String aadhaarNo;
    private String mailId;
    private String availableDays;
    private Timestamp availableTimeFrom;
    private Timestamp availableTimeTo;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Long createBy;
    private Long updateBy;

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }

    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }

    public String getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(String aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getAvailableDays() {
        return availableDays;
    }

    public void setAvailableDays(String availableDays) {
        this.availableDays = availableDays;
    }

    public Timestamp getAvailableTimeFrom() {
        return availableTimeFrom;
    }

    public void setAvailableTimeFrom(Timestamp availableTimeFrom) {
        this.availableTimeFrom = availableTimeFrom;
    }

    public Timestamp getAvailableTimeTo() {
        return availableTimeTo;
    }

    public void setAvailableTimeTo(Timestamp availableTimeTo) {
        this.availableTimeTo = availableTimeTo;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

}
