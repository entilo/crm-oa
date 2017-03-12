package com.crm.www.entity;

import java.util.Date;

public class UserCustomer {
    private Integer relationId;

    private Integer userId;

    private Integer customerId;

    private Date relationStartTime;

    private Boolean isRelationStatusOk;

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Date getRelationStartTime() {
        return relationStartTime;
    }

    public void setRelationStartTime(Date relationStartTime) {
        this.relationStartTime = relationStartTime;
    }

    public Boolean getIsRelationStatusOk() {
        return isRelationStatusOk;
    }

    public void setIsRelationStatusOk(Boolean isRelationStatusOk) {
        this.isRelationStatusOk = isRelationStatusOk;
    }
}