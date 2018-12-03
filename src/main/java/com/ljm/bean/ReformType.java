package com.ljm.bean;

public class ReformType {
    private Integer reformTypeId;

    private String reformType;

    private String reformContent;

    public Integer getReformTypeId() {
        return reformTypeId;
    }

    public void setReformTypeId(Integer reformTypeId) {
        this.reformTypeId = reformTypeId;
    }

    public String getReformType() {
        return reformType;
    }

    public void setReformType(String reformType) {
        this.reformType = reformType == null ? null : reformType.trim();
    }

    public String getReformContent() {
        return reformContent;
    }

    public void setReformContent(String reformContent) {
        this.reformContent = reformContent == null ? null : reformContent.trim();
    }
}