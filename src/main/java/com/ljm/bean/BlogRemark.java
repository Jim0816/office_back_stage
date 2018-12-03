package com.ljm.bean;

import java.util.Date;

public class BlogRemark {
    private Integer blogRemarkId;

    private Integer blogId;

    private Integer remarker;

    private String remarkContent;

    private Date remarkTime;

    public Integer getBlogRemarkId() {
        return blogRemarkId;
    }

    public void setBlogRemarkId(Integer blogRemarkId) {
        this.blogRemarkId = blogRemarkId;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
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