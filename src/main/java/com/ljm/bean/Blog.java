package com.ljm.bean;

import java.util.Date;

public class Blog {
    private Integer blogId;

    private Integer blogWriter;

    private String blogTitle;

    private String blogContent;

    private Integer blogImgs;

    private Date writeTime;

    private Integer lookNums;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public Integer getBlogWriter() {
        return blogWriter;
    }

    public void setBlogWriter(Integer blogWriter) {
        this.blogWriter = blogWriter;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }

    public Integer getBlogImgs() {
        return blogImgs;
    }

    public void setBlogImgs(Integer blogImgs) {
        this.blogImgs = blogImgs;
    }

    public Date getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(Date writeTime) {
        this.writeTime = writeTime;
    }

    public Integer getLookNums() {
        return lookNums;
    }

    public void setLookNums(Integer lookNums) {
        this.lookNums = lookNums;
    }
}