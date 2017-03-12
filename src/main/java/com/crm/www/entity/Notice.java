package com.crm.www.entity;

import java.util.Date;

public class Notice {
    private Integer noticeId;

    private Integer noticeFromId;

    private String noticeToIds;

    private Date noticeStartTime;

    private String noticeContent;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public Integer getNoticeFromId() {
        return noticeFromId;
    }

    public void setNoticeFromId(Integer noticeFromId) {
        this.noticeFromId = noticeFromId;
    }

    public String getNoticeToIds() {
        return noticeToIds;
    }

    public void setNoticeToIds(String noticeToIds) {
        this.noticeToIds = noticeToIds;
    }

    public Date getNoticeStartTime() {
        return noticeStartTime;
    }

    public void setNoticeStartTime(Date noticeStartTime) {
        this.noticeStartTime = noticeStartTime;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }
}