package com.crm.www.entity;

public class Customer {
    private Integer customerId;

    private String customerName;

    private String customerCity;

    private String cuntomerProvince;

    private Integer phone;

    private Boolean isCustomerStatusOk;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCuntomerProvince() {
        return cuntomerProvince;
    }

    public void setCuntomerProvince(String cuntomerProvince) {
        this.cuntomerProvince = cuntomerProvince;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Boolean getIsCustomerStatusOk() {
        return isCustomerStatusOk;
    }

    public void setIsCustomerStatusOk(Boolean isCustomerStatusOk) {
        this.isCustomerStatusOk = isCustomerStatusOk;
    }
}