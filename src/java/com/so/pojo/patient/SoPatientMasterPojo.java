package com.so.pojo.patient;

import java.io.Serializable;
import java.sql.Timestamp;

public class SoPatientMasterPojo implements Serializable {

    private Long patientId;
    private String firstName;
    private String lastName;    
    private Timestamp dob;
    private String gender;
    private String immediateContectPerson;
    private String immediateContactNo;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Long createBy;
    private Long updateBy;

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
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

    public Timestamp getDob() {
        return dob;
    }

    public void setDob(Timestamp dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImmediateContectPerson() {
        return immediateContectPerson;
    }

    public void setImmediateContectPerson(String immediateContectPerson) {
        this.immediateContectPerson = immediateContectPerson;
    }

    public String getImmediateContactNo() {
        return immediateContactNo;
    }

    public void setImmediateContactNo(String immediateContactNo) {
        this.immediateContactNo = immediateContactNo;
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
