package com.ljm.bean;

import java.util.Date;

public class Question {
    private Integer questionId;

    private Integer questionWriter;

    private String questionTitle;

    private String questionContent;

    private Date questionTime;

    private Integer questionImgs;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getQuestionWriter() {
        return questionWriter;
    }

    public void setQuestionWriter(Integer questionWriter) {
        this.questionWriter = questionWriter;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle == null ? null : questionTitle.trim();
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent == null ? null : questionContent.trim();
    }

    public Date getQuestionTime() {
        return questionTime;
    }

    public void setQuestionTime(Date questionTime) {
        this.questionTime = questionTime;
    }

    public Integer getQuestionImgs() {
        return questionImgs;
    }

    public void setQuestionImgs(Integer questionImgs) {
        this.questionImgs = questionImgs;
    }
}