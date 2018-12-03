package com.ljm.bean;

import java.util.Date;

public class StudyTask {
    private Integer taskId;

    private String taskContent;

    private Date publishTime;

    private Date submitDeadline;

    private String expireSign;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent == null ? null : taskContent.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getSubmitDeadline() {
        return submitDeadline;
    }

    public void setSubmitDeadline(Date submitDeadline) {
        this.submitDeadline = submitDeadline;
    }

    public String getExpireSign() {
        return expireSign;
    }

    public void setExpireSign(String expireSign) {
        this.expireSign = expireSign == null ? null : expireSign.trim();
    }
}