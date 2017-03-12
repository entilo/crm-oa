package com.crm.www.entity;

import java.util.Date;

public class Goods {
    private Integer goodsId;

    private String goodsName;

    private Date goodsInsertDate;

    private Boolean goodsStatus;

    private Integer goodsLeft;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Date getGoodsInsertDate() {
        return goodsInsertDate;
    }

    public void setGoodsInsertDate(Date goodsInsertDate) {
        this.goodsInsertDate = goodsInsertDate;
    }

    public Boolean getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Boolean goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Integer getGoodsLeft() {
        return goodsLeft;
    }

    public void setGoodsLeft(Integer goodsLeft) {
        this.goodsLeft = goodsLeft;
    }
}