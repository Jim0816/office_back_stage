package com.ljm.bean;

import java.util.Date;

public class DailyPlan {
    private Integer planId;

    private String planContent;

    private Date planTime;

    private Date reformTime;

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getPlanContent() {
        return planContent;
    }

    public void setPlanContent(String planContent) {
        this.planContent = planContent == null ? null : planContent.trim();
    }

    public Date getPlanTime() {
        return planTime;
    }

    public void setPlanTime(Date planTime) {
        this.planTime = planTime;
    }

    public Date getReformTime() {
        return reformTime;
    }

    public void setReformTime(Date reformTime) {
        this.reformTime = reformTime;
    }
}