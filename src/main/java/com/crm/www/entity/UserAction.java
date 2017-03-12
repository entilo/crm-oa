package com.crm.www.entity;

import java.util.Date;

public class UserAction {
    private Integer id;

    private Integer userId;

    private Integer targetId;

    private Integer actionNameId;

    private Date actionTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public Integer getActionNameId() {
        return actionNameId;
    }

    public void setActionNameId(Integer actionNameId) {
        this.actionNameId = actionNameId;
    }

    public Date getActionTime() {
        return actionTime;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }
}