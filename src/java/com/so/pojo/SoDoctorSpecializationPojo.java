package com.so.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class SoDoctorSpecializationPojo implements Serializable {

    private Long doctorSpecializationId;
    private Long doctorId;
    private Double yearOfExperience;
    private Double fee;
    private int noOfSurgery;
    private int noOfCasesHandled;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Long createBy;
    private Long updateBy;

    public Long getDoctorSpecializationId() {
        return doctorSpecializationId;
    }

    public void setDoctorSpecializationId(Long doctorSpecializationId) {
        this.doctorSpecializationId = doctorSpecializationId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Double getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(Double yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public int getNoOfSurgery() {
        return noOfSurgery;
    }

    public void setNoOfSurgery(int noOfSurgery) {
        this.noOfSurgery = noOfSurgery;
    }

    public int getNoOfCasesHandled() {
        return noOfCasesHandled;
    }

    public void setNoOfCasesHandled(int noOfCasesHandled) {
        this.noOfCasesHandled = noOfCasesHandled;
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
