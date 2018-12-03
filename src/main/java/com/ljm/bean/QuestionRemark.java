package com.ljm.bean;

import java.util.Date;

public class QuestionRemark {
    private Integer questionRemarkId;

    private Integer questionId;

    private Integer remarker;

    private String remarkContent;

    private Date remarkTime;

    public Integer getQuestionRemarkId() {
        return questionRemarkId;
    }

    public void setQuestionRemarkId(Integer questionRemarkId) {
        this.questionRemarkId = questionRemarkId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getRemarker() {
        return remarker;
    }

    public void setRemarker(Integer remarker) {
        this.remarker = remarker;
    }

    public String getRemarkContent() {
        return remarkContent;
    }

    public void setRemarkContent(String remarkContent) {
        this.remarkContent = remarkContent == null ? null : remarkContent.trim();
    }

    public Date getRemarkTime() {
        return remarkTime;
    }

    public void setRemarkTime(Date remarkTime) {
        this.remarkTime = remarkTime;
    }
}