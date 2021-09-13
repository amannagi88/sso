package com.so.pojo.admin;

import java.io.Serializable;
import java.sql.Timestamp;

public class SoHospitalMasterPojo implements Serializable {

    private Long hospitalId;
    private String hospitalName;
    private String hospitalType;
    private int hospitalState;
    private int hospitalCity;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Long createBy;
    private Long updateBy;

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(String hospitalType) {
        this.hospitalType = hospitalType;
    }

    public int getHospitalState() {
        return hospitalState;
    }

    public void setHospitalState(int hospitalState) {
        this.hospitalState = hospitalState;
    }

    public int getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(int hospitalCity) {
        this.hospitalCity = hospitalCity;
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
