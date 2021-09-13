package com.so.pojo.doctor;

import java.io.Serializable;
import java.sql.Timestamp;

public class SoDoctorHospitalAssociationPojo implements Serializable {

    private Long pkId;
    private Long hospitalId;
    private Long doctorId;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Long createBy;
    private Long updateBy;

    public Long getPkId() {
        return pkId;
    }

    public void setPkId(Long pkId) {
        this.pkId = pkId;
    }    

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long dctorId) {
        this.doctorId = doctorId;
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
