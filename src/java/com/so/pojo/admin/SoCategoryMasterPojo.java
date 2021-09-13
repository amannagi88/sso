package com.so.pojo.admin;

import java.io.Serializable;
import java.sql.Timestamp;

public class SoCategoryMasterPojo implements Serializable {

    private int categoryId;
    private String categoryType;
    private String categoryDescription;
    private Long specializationId;
    private Long specializationCategoryId;
    private Timestamp createAt;
    private Timestamp updateAt;
    private Long createBy;
    private Long updateBy;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public Long getSpecializationId() {
        return specializationId;
    }

    public void setSpecializationId(Long specializationId) {
        this.specializationId = specializationId;
    }

    public Long getSpecializationCategoryId() {
        return specializationCategoryId;
    }

    public void setSpecializationCategoryId(Long specializationCategoryId) {
        this.specializationCategoryId = specializationCategoryId;
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
