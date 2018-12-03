package com.ljm.bean;

import java.util.Date;

public class AttendanceRecord {
    private Integer attendanceId;

    private Integer memberId;

    private Date attendTime;

    private String location;

    private String attendSign;

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Date getAttendTime() {
        return attendTime;
    }

    public void setAttendTime(Date attendTime) {
        this.attendTime = attendTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getAttendSign() {
        return attendSign;
    }

    public void setAttendSign(String attendSign) {
        this.attendSign = attendSign == null ? null : attendSign.trim();
    }
}