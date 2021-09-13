/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.beans;

import java.sql.Timestamp;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author Dell India
 */
public class LicenseBean implements java.io.Serializable {

    private Integer pkId;
    private int fieldType;
    private String fieldName;
    private String fieldDesc;
    private Integer isMandatory;
    private Integer isNameEditable;
    private Integer isApplicable;
    private Integer isDisabled;
    private Integer serialNo;
    private Double orderNo;
    private String clientId;
    private Integer active;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private Integer createdBy;
    private Integer updatedBy;

    private int number;
    private int userId;
    private int assignedToUserId;
    private int assignedByUserId;
    private String name;
    private String validationVal;
    private int licenseSrNo;
    private String licenseNo;
    private String assignedToUser;
    private String assignedToName;
    private String licenseType;
    private String serialNo6;
    private String serialNo7;
    private String serialNo8;
    private String serialNo9;
    private String serialNo10;
    private String serialNo11;
    private String serialNo12;
    private String serialNo13;
    private String serialNo14;
    private String serialNo15;
    private String serialNo16;
    private String serialNo17;
    private String serialNo18;
    private String serialNo19;
    private String serialNo20;
    private int userIdR;
    private int assignedToUserIdR;
    private int assignedByUserIdR;
    private String nameR;
    private String validationValR;
    private int licenseSrNoR;
    private String licenseNoR;
    private String assignedToUserR;
    private String assignedToNameR;
    private String licenseTypeR;
    private String serialNo6R;
    private String serialNo7R;
    private String serialNo8R;
    private String serialNo9R;
    private String serialNo10R;
    private String serialNo11R;
    private String serialNo12R;
    private String serialNo13R;
    private String serialNo14R;
    private String serialNo15R;
    private String serialNo16R;
    private String serialNo17R;
    private String serialNo18R;
    private String serialNo19R;
    private String serialNo20R;
    private int applied;
    private int currentLevel;
    private int approvalLevel;
    private int approverTypeId1;
    private int approverUserId1;
    private int approverTypeId2;
    private int approverUserId2;
    private int approverTypeId3;
    private int approverUserId3;
    private int approverTypeId4;
    private int approverUserId4;
    private int approverTypeId5;
    private int approverUserId5;
    private int field1;
    private int field2;
    private int field3;
    private int field4;
    private int field5;
    private String field6;
    private String field7;
    private String field6R;
    private String field7R;
    private String field8;
    private String field9;
    private String field10;
    private FormFile licenseAtt;
    private String licenseAttPath;
    private FormFile attachment1;
    private String attachmentPath1;
    private FormFile attachment2;
    private String attachmentPath2;
    private String licenseAttPathR;
    private String attachmentPath1R;
    private String attachmentPath2R;
    private String activityType;
    private String activityTitle;
    private String activityDesc;
    private String fieldNameSerial;
    private Integer addOrEdit;
    private Integer otherId1;
    private Integer otherId2;
    private String oldValue;
    private String newValue;
    private String user;
    private int count;
    private int newCounter;
    private int readCounter;
    private int noOfRecords;
    private int totalCounter;

    public int getNewCounter() {
        return newCounter;
    }

    public void setNewCounter(int newCounter) {
        this.newCounter = newCounter;
    }

    public int getReadCounter() {
        return readCounter;
    }

    public void setReadCounter(int readCounter) {
        this.readCounter = readCounter;
    }

    public int getNoOfRecords() {
        return noOfRecords;
    }

    public void setNoOfRecords(int noOfRecords) {
        this.noOfRecords = noOfRecords;
    }

    public int getTotalCounter() {
        return totalCounter;
    }

    public void setTotalCounter(int totalCounter) {
        this.totalCounter = totalCounter;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
    }

    public String getFieldNameSerial() {
        return fieldNameSerial;
    }

    public void setFieldNameSerial(String fieldNameSerial) {
        this.fieldNameSerial = fieldNameSerial;
    }

    public Integer getAddOrEdit() {
        return addOrEdit;
    }

    public void setAddOrEdit(Integer addOrEdit) {
        this.addOrEdit = addOrEdit;
    }

    public Integer getOtherId1() {
        return otherId1;
    }

    public void setOtherId1(Integer otherId1) {
        this.otherId1 = otherId1;
    }

    public Integer getOtherId2() {
        return otherId2;
    }

    public void setOtherId2(Integer otherId2) {
        this.otherId2 = otherId2;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public String getLicenseAttPathR() {
        return licenseAttPathR;
    }

    public void setLicenseAttPathR(String licenseAttPathR) {
        this.licenseAttPathR = licenseAttPathR;
    }

    public String getAttachmentPath1R() {
        return attachmentPath1R;
    }

    public void setAttachmentPath1R(String attachmentPath1R) {
        this.attachmentPath1R = attachmentPath1R;
    }

    public String getAttachmentPath2R() {
        return attachmentPath2R;
    }

    public void setAttachmentPath2R(String attachmentPath2R) {
        this.attachmentPath2R = attachmentPath2R;
    }

    public int getUserIdR() {
        return userIdR;
    }

    public void setUserIdR(int userIdR) {
        this.userIdR = userIdR;
    }

    public int getAssignedToUserIdR() {
        return assignedToUserIdR;
    }

    public void setAssignedToUserIdR(int assignedToUserIdR) {
        this.assignedToUserIdR = assignedToUserIdR;
    }

    public int getAssignedByUserIdR() {
        return assignedByUserIdR;
    }

    public void setAssignedByUserIdR(int assignedByUserIdR) {
        this.assignedByUserIdR = assignedByUserIdR;
    }

    public String getNameR() {
        return nameR;
    }

    public void setNameR(String nameR) {
        this.nameR = nameR;
    }

    public String getValidationValR() {
        return validationValR;
    }

    public void setValidationValR(String validationValR) {
        this.validationValR = validationValR;
    }

    public int getLicenseSrNoR() {
        return licenseSrNoR;
    }

    public void setLicenseSrNoR(int licenseSrNoR) {
        this.licenseSrNoR = licenseSrNoR;
    }

    public String getLicenseNoR() {
        return licenseNoR;
    }

    public void setLicenseNoR(String licenseNoR) {
        this.licenseNoR = licenseNoR;
    }

    public String getAssignedToUserR() {
        return assignedToUserR;
    }

    public void setAssignedToUserR(String assignedToUserR) {
        this.assignedToUserR = assignedToUserR;
    }

    public String getAssignedToNameR() {
        return assignedToNameR;
    }

    public void setAssignedToNameR(String assignedToNameR) {
        this.assignedToNameR = assignedToNameR;
    }

    public String getLicenseTypeR() {
        return licenseTypeR;
    }

    public void setLicenseTypeR(String licenseTypeR) {
        this.licenseTypeR = licenseTypeR;
    }

    public String getSerialNo6R() {
        return serialNo6R;
    }

    public void setSerialNo6R(String serialNo6R) {
        this.serialNo6R = serialNo6R;
    }

    public String getSerialNo7R() {
        return serialNo7R;
    }

    public void setSerialNo7R(String serialNo7R) {
        this.serialNo7R = serialNo7R;
    }

    public String getSerialNo8R() {
        return serialNo8R;
    }

    public void setSerialNo8R(String serialNo8R) {
        this.serialNo8R = serialNo8R;
    }

    public String getSerialNo9R() {
        return serialNo9R;
    }

    public void setSerialNo9R(String serialNo9R) {
        this.serialNo9R = serialNo9R;
    }

    public String getSerialNo10R() {
        return serialNo10R;
    }

    public void setSerialNo10R(String serialNo10R) {
        this.serialNo10R = serialNo10R;
    }

    public String getSerialNo11R() {
        return serialNo11R;
    }

    public void setSerialNo11R(String serialNo11R) {
        this.serialNo11R = serialNo11R;
    }

    public String getSerialNo12R() {
        return serialNo12R;
    }

    public void setSerialNo12R(String serialNo12R) {
        this.serialNo12R = serialNo12R;
    }

    public String getSerialNo13R() {
        return serialNo13R;
    }

    public void setSerialNo13R(String serialNo13R) {
        this.serialNo13R = serialNo13R;
    }

    public String getSerialNo14R() {
        return serialNo14R;
    }

    public void setSerialNo14R(String serialNo14R) {
        this.serialNo14R = serialNo14R;
    }

    public String getSerialNo15R() {
        return serialNo15R;
    }

    public void setSerialNo15R(String serialNo15R) {
        this.serialNo15R = serialNo15R;
    }

    public String getSerialNo16R() {
        return serialNo16R;
    }

    public void setSerialNo16R(String serialNo16R) {
        this.serialNo16R = serialNo16R;
    }

    public String getSerialNo17R() {
        return serialNo17R;
    }

    public void setSerialNo17R(String serialNo17R) {
        this.serialNo17R = serialNo17R;
    }

    public String getSerialNo18R() {
        return serialNo18R;
    }

    public void setSerialNo18R(String serialNo18R) {
        this.serialNo18R = serialNo18R;
    }

    public String getSerialNo19R() {
        return serialNo19R;
    }

    public void setSerialNo19R(String serialNo19R) {
        this.serialNo19R = serialNo19R;
    }

    public String getSerialNo20R() {
        return serialNo20R;
    }

    public void setSerialNo20R(String serialNo20R) {
        this.serialNo20R = serialNo20R;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public String getField6R() {
        return field6R;
    }

    public void setField6R(String field6R) {
        this.field6R = field6R;
    }

    public String getField7R() {
        return field7R;
    }

    public void setField7R(String field7R) {
        this.field7R = field7R;
    }

    public int getApplied() {
        return applied;
    }

    public void setApplied(int applied) {
        this.applied = applied;
    }

    public int getApprovalLevel() {
        return approvalLevel;
    }

    public void setApprovalLevel(int approvalLevel) {
        this.approvalLevel = approvalLevel;
    }

    public int getApproverTypeId1() {
        return approverTypeId1;
    }

    public void setApproverTypeId1(int approverTypeId1) {
        this.approverTypeId1 = approverTypeId1;
    }

    public int getApproverUserId1() {
        return approverUserId1;
    }

    public void setApproverUserId1(int approverUserId1) {
        this.approverUserId1 = approverUserId1;
    }

    public int getApproverTypeId2() {
        return approverTypeId2;
    }

    public void setApproverTypeId2(int approverTypeId2) {
        this.approverTypeId2 = approverTypeId2;
    }

    public int getApproverUserId2() {
        return approverUserId2;
    }

    public void setApproverUserId2(int approverUserId2) {
        this.approverUserId2 = approverUserId2;
    }

    public int getApproverTypeId3() {
        return approverTypeId3;
    }

    public void setApproverTypeId3(int approverTypeId3) {
        this.approverTypeId3 = approverTypeId3;
    }

    public int getApproverUserId3() {
        return approverUserId3;
    }

    public void setApproverUserId3(int approverUserId3) {
        this.approverUserId3 = approverUserId3;
    }

    public int getApproverTypeId4() {
        return approverTypeId4;
    }

    public void setApproverTypeId4(int approverTypeId4) {
        this.approverTypeId4 = approverTypeId4;
    }

    public int getApproverUserId4() {
        return approverUserId4;
    }

    public void setApproverUserId4(int approverUserId4) {
        this.approverUserId4 = approverUserId4;
    }

    public int getApproverTypeId5() {
        return approverTypeId5;
    }

    public void setApproverTypeId5(int approverTypeId5) {
        this.approverTypeId5 = approverTypeId5;
    }

    public int getApproverUserId5() {
        return approverUserId5;
    }

    public void setApproverUserId5(int approverUserId5) {
        this.approverUserId5 = approverUserId5;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAssignedToUserId() {
        return assignedToUserId;
    }

    public void setAssignedToUserId(int assignedToUserId) {
        this.assignedToUserId = assignedToUserId;
    }

    public int getAssignedByUserId() {
        return assignedByUserId;
    }

    public void setAssignedByUserId(int assignedByUserId) {
        this.assignedByUserId = assignedByUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValidationVal() {
        return validationVal;
    }

    public void setValidationVal(String validationVal) {
        this.validationVal = validationVal;
    }

    public int getLicenseSrNo() {
        return licenseSrNo;
    }

    public void setLicenseSrNo(int licenseSrNo) {
        this.licenseSrNo = licenseSrNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getAssignedToUser() {
        return assignedToUser;
    }

    public void setAssignedToUser(String assignedToUser) {
        this.assignedToUser = assignedToUser;
    }

    public String getAssignedToName() {
        return assignedToName;
    }

    public void setAssignedToName(String assignedToName) {
        this.assignedToName = assignedToName;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getSerialNo6() {
        return serialNo6;
    }

    public void setSerialNo6(String serialNo6) {
        this.serialNo6 = serialNo6;
    }

    public String getSerialNo7() {
        return serialNo7;
    }

    public void setSerialNo7(String serialNo7) {
        this.serialNo7 = serialNo7;
    }

    public String getSerialNo8() {
        return serialNo8;
    }

    public void setSerialNo8(String serialNo8) {
        this.serialNo8 = serialNo8;
    }

    public String getSerialNo9() {
        return serialNo9;
    }

    public void setSerialNo9(String serialNo9) {
        this.serialNo9 = serialNo9;
    }

    public String getSerialNo10() {
        return serialNo10;
    }

    public void setSerialNo10(String serialNo10) {
        this.serialNo10 = serialNo10;
    }

    public String getSerialNo11() {
        return serialNo11;
    }

    public void setSerialNo11(String serialNo11) {
        this.serialNo11 = serialNo11;
    }

    public String getSerialNo12() {
        return serialNo12;
    }

    public void setSerialNo12(String serialNo12) {
        this.serialNo12 = serialNo12;
    }

    public String getSerialNo13() {
        return serialNo13;
    }

    public void setSerialNo13(String serialNo13) {
        this.serialNo13 = serialNo13;
    }

    public String getSerialNo14() {
        return serialNo14;
    }

    public void setSerialNo14(String serialNo14) {
        this.serialNo14 = serialNo14;
    }

    public String getSerialNo15() {
        return serialNo15;
    }

    public void setSerialNo15(String serialNo15) {
        this.serialNo15 = serialNo15;
    }

    public String getSerialNo16() {
        return serialNo16;
    }

    public void setSerialNo16(String serialNo16) {
        this.serialNo16 = serialNo16;
    }

    public String getSerialNo17() {
        return serialNo17;
    }

    public void setSerialNo17(String serialNo17) {
        this.serialNo17 = serialNo17;
    }

    public String getSerialNo18() {
        return serialNo18;
    }

    public void setSerialNo18(String serialNo18) {
        this.serialNo18 = serialNo18;
    }

    public String getSerialNo19() {
        return serialNo19;
    }

    public void setSerialNo19(String serialNo19) {
        this.serialNo19 = serialNo19;
    }

    public String getSerialNo20() {
        return serialNo20;
    }

    public void setSerialNo20(String serialNo20) {
        this.serialNo20 = serialNo20;
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

    public int getField3() {
        return field3;
    }

    public void setField3(int field3) {
        this.field3 = field3;
    }

    public int getField4() {
        return field4;
    }

    public void setField4(int field4) {
        this.field4 = field4;
    }

    public int getField5() {
        return field5;
    }

    public void setField5(int field5) {
        this.field5 = field5;
    }

    public String getField6() {
        return field6;
    }

    public void setField6(String field6) {
        this.field6 = field6;
    }

    public String getField7() {
        return field7;
    }

    public void setField7(String field7) {
        this.field7 = field7;
    }

    public String getField8() {
        return field8;
    }

    public void setField8(String field8) {
        this.field8 = field8;
    }

    public String getField9() {
        return field9;
    }

    public void setField9(String field9) {
        this.field9 = field9;
    }

    public String getField10() {
        return field10;
    }

    public void setField10(String field10) {
        this.field10 = field10;
    }

    public FormFile getLicenseAtt() {
        return licenseAtt;
    }

    public void setLicenseAtt(FormFile licenseAtt) {
        this.licenseAtt = licenseAtt;
    }

    public String getLicenseAttPath() {
        return licenseAttPath;
    }

    public void setLicenseAttPath(String licenseAttPath) {
        this.licenseAttPath = licenseAttPath;
    }

    public FormFile getAttachment1() {
        return attachment1;
    }

    public void setAttachment1(FormFile attachment1) {
        this.attachment1 = attachment1;
    }

    public String getAttachmentPath1() {
        return attachmentPath1;
    }

    public void setAttachmentPath1(String attachmentPath1) {
        this.attachmentPath1 = attachmentPath1;
    }

    public FormFile getAttachment2() {
        return attachment2;
    }

    public void setAttachment2(FormFile attachment2) {
        this.attachment2 = attachment2;
    }

    public String getAttachmentPath2() {
        return attachmentPath2;
    }

    public void setAttachmentPath2(String attachmentPath2) {
        this.attachmentPath2 = attachmentPath2;
    }

    public Integer getPkId() {
        return pkId;
    }

    public void setPkId(Integer pkId) {
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

    public Integer getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(Integer isMandatory) {
        this.isMandatory = isMandatory;
    }

    public Integer getIsNameEditable() {
        return isNameEditable;
    }

    public void setIsNameEditable(Integer isNameEditable) {
        this.isNameEditable = isNameEditable;
    }

    public Integer getIsApplicable() {
        return isApplicable;
    }

    public void setIsApplicable(Integer isApplicable) {
        this.isApplicable = isApplicable;
    }

    public Integer getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Integer getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }

    public Double getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Double orderNo) {
        this.orderNo = orderNo;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
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

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

}
