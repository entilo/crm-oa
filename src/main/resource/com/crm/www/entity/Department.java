package com.crm.www.entity;

public class Department {
    private Integer deptId;

    private String deptName;

    private String deptDescribe;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptDescribe() {
        return deptDescribe;
    }

    public void setDeptDescribe(String deptDescribe) {
        this.deptDescribe = deptDescribe;
    }
}