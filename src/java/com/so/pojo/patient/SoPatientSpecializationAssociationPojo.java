package com.so.pojo.patient;

import java.io.Serializable;
import java.sql.Timestamp;

public class SoPatientSpecializationAssociationPojo implements Serializable {

    private Long patientSpecId;
    private Long patientId;
    private int specializationId;
    private int detectedMonth;
    private int detectedYear;
    private Timestamp detectionDate;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Long createBy;
    private Long updateBy;

    public Long getPatientSpecId() {
        return patientSpecId;
    }

    public void setPatientSpecId(Long patientSpecId) {
        this.patientSpecId = patientSpecId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public int getSpecializationId() {
        return specializationId;
    }

    public void setSpecializationId(int specializationId) {
        this.specializationId = specializationId;
    }

    public int getDetectedMonth() {
        return detectedMonth;
    }

    public void setDetectedMonth(int detectedMonth) {
        this.detectedMonth = detectedMonth;
    }

    public int getDetectedYear() {
        return detectedYear;
    }

    public void setDetectedYear(int detectedYear) {
        this.detectedYear = detectedYear;
    }

    public Timestamp getDetectionDate() {
        return detectionDate;
    }

    public void setDetectionDate(Timestamp detectionDate) {
        this.detectionDate = detectionDate;
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
