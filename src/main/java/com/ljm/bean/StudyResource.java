package com.ljm.bean;

import java.util.Date;

public class StudyResource {
    private Integer resourceId;

    private String resourceType;

    private Integer publishMemberId;

    private Date publishTime;

    private String resourceIntr;

    private String resourceLink;

    private String remark;

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    public Integer getPublishMemberId() {
        return publishMemberId;
    }

    public void setPublishMemberId(Integer publishMemberId) {
        this.publishMemberId = publishMemberId;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getResourceIntr() {
        return resourceIntr;
    }

    public void setResourceIntr(String resourceIntr) {
        this.resourceIntr = resourceIntr == null ? null : resourceIntr.trim();
    }

    public String getResourceLink() {
        return resourceLink;
    }

    public void setResourceLink(String resourceLink) {
        this.resourceLink = resourceLink == null ? null : resourceLink.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}