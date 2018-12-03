package com.ljm.bean;

import java.util.Date;

public class Reform {
    private Integer reformId;

    private Integer reformTypeId;

    private Integer theTypeId;

    private Date reformTime;

    private String reformState;

    public Integer getReformId() {
        return reformId;
    }

    public void setReformId(Integer reformId) {
        this.reformId = reformId;
    }

    public Integer getReformTypeId() {
        return reformTypeId;
    }

    public void setReformTypeId(Integer reformTypeId) {
        this.reformTypeId = reformTypeId;
    }

    public Integer getTheTypeId() {
        return theTypeId;
    }

    public void setTheTypeId(Integer theTypeId) {
        this.theTypeId = theTypeId;
    }

    public Date getReformTime() {
        return reformTime;
    }

    public void setReformTime(Date reformTime) {
        this.reformTime = reformTime;
    }

    public String getReformState() {
        return reformState;
    }

    public void setReformState(String reformState) {
        this.reformState = reformState == null ? null : reformState.trim();
    }
}