package com.ljm.bean;

public class Works {
    private Integer worksId;

    private String worksTitle;

    private String worksIntr;

    private Integer worksImgs;

    public Integer getWorksId() {
        return worksId;
    }

    public void setWorksId(Integer worksId) {
        this.worksId = worksId;
    }

    public String getWorksTitle() {
        return worksTitle;
    }

    public void setWorksTitle(String worksTitle) {
        this.worksTitle = worksTitle == null ? null : worksTitle.trim();
    }

    public String getWorksIntr() {
        return worksIntr;
    }

    public void setWorksIntr(String worksIntr) {
        this.worksIntr = worksIntr == null ? null : worksIntr.trim();
    }

    public Integer getWorksImgs() {
        return worksImgs;
    }

    public void setWorksImgs(Integer worksImgs) {
        this.worksImgs = worksImgs;
    }
}