package com.ljm.bean;

import java.util.Date;

public class MemberBasicInfo {
    private Integer memberId;

    private String memberName;

    private String memberSex;

    private String memberEmail;

    private String memberAddre;

    private String memberTel;

    private String memberQq;

    private String memberIntr;

    private String memberImgId;

    private Date memberJoinTime;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    public String getMemberSex() {
        return memberSex;
    }

    public void setMemberSex(String memberSex) {
        this.memberSex = memberSex == null ? null : memberSex.trim();
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail == null ? null : memberEmail.trim();
    }

    public String getMemberAddre() {
        return memberAddre;
    }

    public void setMemberAddre(String memberAddre) {
        this.memberAddre = memberAddre == null ? null : memberAddre.trim();
    }

    public String getMemberTel() {
        return memberTel;
    }

    public void setMemberTel(String memberTel) {
        this.memberTel = memberTel == null ? null : memberTel.trim();
    }

    public String getMemberQq() {
        return memberQq;
    }

    public void setMemberQq(String memberQq) {
        this.memberQq = memberQq == null ? null : memberQq.trim();
    }

    public String getMemberIntr() {
        return memberIntr;
    }

    public void setMemberIntr(String memberIntr) {
        this.memberIntr = memberIntr == null ? null : memberIntr.trim();
    }

    public String getMemberImgId() {
        return memberImgId;
    }

    public void setMemberImgId(String memberImgId) {
        this.memberImgId = memberImgId == null ? null : memberImgId.trim();
    }

    public Date getMemberJoinTime() {
        return memberJoinTime;
    }

    public void setMemberJoinTime(Date memberJoinTime) {
        this.memberJoinTime = memberJoinTime;
    }
}