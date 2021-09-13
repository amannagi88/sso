package com.so.pojo.doctor;

import java.io.Serializable;
import java.sql.Timestamp;

public class SoDoctorDegreeAssociationPojo implements Serializable {

    private Long doctorDegreeId;
    private Long doctorId;
    private int degreeId;
    private String degreeDistinction;
    private Timestamp startFrom;
    private Timestamp toDate;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Long createBy;
    private Long updateBy;

    public Long getDoctorDegreeId() {
        return doctorDegreeId;
    }

    public void setDoctorDegreeId(Long doctorDegreeId) {
        this.doctorDegreeId = doctorDegreeId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public int getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(int degreeId) {
        this.degreeId = degreeId;
    }

    public String getDegreeDistinction() {
        return degreeDistinction;
    }

    public void setDegreeDistinction(String degreeDistinction) {
        this.degreeDistinction = degreeDistinction;
    }

    public Timestamp getStartFrom() {
        return startFrom;
    }

    public void setStartFrom(Timestamp startFrom) {
        this.startFrom = startFrom;
    }

    public Timestamp getToDate() {
        return toDate;
    }

    public void setToDate(Timestamp toDate) {
        this.toDate = toDate;
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
