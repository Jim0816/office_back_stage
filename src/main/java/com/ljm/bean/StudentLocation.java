package com.ljm.bean;

public class StudentLocation {
    private Integer studentLocationId;

    private String stuAcademy;

    private String stuGrade;

    private String stuClass;

    private Integer studentId;

    public Integer getStudentLocationId() {
        return studentLocationId;
    }

    public void setStudentLocationId(Integer studentLocationId) {
        this.studentLocationId = studentLocationId;
    }

    public String getStuAcademy() {
        return stuAcademy;
    }

    public void setStuAcademy(String stuAcademy) {
        this.stuAcademy = stuAcademy == null ? null : stuAcademy.trim();
    }

    public String getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(String stuGrade) {
        this.stuGrade = stuGrade == null ? null : stuGrade.trim();
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass == null ? null : stuClass.trim();
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}