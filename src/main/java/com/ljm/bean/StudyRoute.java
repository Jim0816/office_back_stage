package com.ljm.bean;

import java.util.Date;

public class StudyRoute {
    private Integer memberId;

    private String studyContent;

    private String remark;

    private Date nowTime;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getStudyContent() {
        return studyContent;
    }

    public void setStudyContent(String studyContent) {
        this.studyContent = studyContent == null ? null : studyContent.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getNowTime() {
        return nowTime;
    }

    public void setNowTime(Date nowTime) {
        this.nowTime = nowTime;
    }
}