package com.ljm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberBasicInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberBasicInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNull() {
            addCriterion("member_sex is null");
            return (Criteria) this;
        }

        public Criteria andMemberSexIsNotNull() {
            addCriterion("member_sex is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSexEqualTo(String value) {
            addCriterion("member_sex =", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotEqualTo(String value) {
            addCriterion("member_sex <>", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThan(String value) {
            addCriterion("member_sex >", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexGreaterThanOrEqualTo(String value) {
            addCriterion("member_sex >=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThan(String value) {
            addCriterion("member_sex <", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLessThanOrEqualTo(String value) {
            addCriterion("member_sex <=", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexLike(String value) {
            addCriterion("member_sex like", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotLike(String value) {
            addCriterion("member_sex not like", value, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexIn(List<String> values) {
            addCriterion("member_sex in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotIn(List<String> values) {
            addCriterion("member_sex not in", values, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexBetween(String value1, String value2) {
            addCriterion("member_sex between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberSexNotBetween(String value1, String value2) {
            addCriterion("member_sex not between", value1, value2, "memberSex");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNull() {
            addCriterion("member_email is null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNotNull() {
            addCriterion("member_email is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailEqualTo(String value) {
            addCriterion("member_email =", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotEqualTo(String value) {
            addCriterion("member_email <>", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThan(String value) {
            addCriterion("member_email >", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThanOrEqualTo(String value) {
            addCriterion("member_email >=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThan(String value) {
            addCriterion("member_email <", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThanOrEqualTo(String value) {
            addCriterion("member_email <=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLike(String value) {
            addCriterion("member_email like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotLike(String value) {
            addCriterion("member_email not like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIn(List<String> values) {
            addCriterion("member_email in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotIn(List<String> values) {
            addCriterion("member_email not in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailBetween(String value1, String value2) {
            addCriterion("member_email between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotBetween(String value1, String value2) {
            addCriterion("member_email not between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberAddreIsNull() {
            addCriterion("member_addre is null");
            return (Criteria) this;
        }

        public Criteria andMemberAddreIsNotNull() {
            addCriterion("member_addre is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAddreEqualTo(String value) {
            addCriterion("member_addre =", value, "memberAddre");
            return (Criteria) this;
        }

        public Criteria andMemberAddreNotEqualTo(String value) {
            addCriterion("member_addre <>", value, "memberAddre");
            return (Criteria) this;
        }

        public Criteria andMemberAddreGreaterThan(String value) {
            addCriterion("member_addre >", value, "memberAddre");
            return (Criteria) this;
        }

        public Criteria andMemberAddreGreaterThanOrEqualTo(String value) {
            addCriterion("member_addre >=", value, "memberAddre");
            return (Criteria) this;
        }

        public Criteria andMemberAddreLessThan(String value) {
            addCriterion("member_addre <", value, "memberAddre");
            return (Criteria) this;
        }

        public Criteria andMemberAddreLessThanOrEqualTo(String value) {
            addCriterion("member_addre <=", value, "memberAddre");
            return (Criteria) this;
        }

        public Criteria andMemberAddreLike(String value) {
            addCriterion("member_addre like", value, "memberAddre");
            return (Criteria) this;
        }

        public Criteria andMemberAddreNotLike(String value) {
            addCriterion("member_addre not like", value, "memberAddre");
            return (Criteria) this;
        }

        public Criteria andMemberAddreIn(List<String> values) {
            addCriterion("member_addre in", values, "memberAddre");
            return (Criteria) this;
        }

        public Criteria andMemberAddreNotIn(List<String> values) {
            addCriterion("member_addre not in", values, "memberAddre");
            return (Criteria) this;
        }

        public Criteria andMemberAddreBetween(String value1, String value2) {
            addCriterion("member_addre between", value1, value2, "memberAddre");
            return (Criteria) this;
        }

        public Criteria andMemberAddreNotBetween(String value1, String value2) {
            addCriterion("member_addre not between", value1, value2, "memberAddre");
            return (Criteria) this;
        }

        public Criteria andMemberTelIsNull() {
            addCriterion("member_tel is null");
            return (Criteria) this;
        }

        public Criteria andMemberTelIsNotNull() {
            addCriterion("member_tel is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTelEqualTo(String value) {
            addCriterion("member_tel =", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelNotEqualTo(String value) {
            addCriterion("member_tel <>", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelGreaterThan(String value) {
            addCriterion("member_tel >", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelGreaterThanOrEqualTo(String value) {
            addCriterion("member_tel >=", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelLessThan(String value) {
            addCriterion("member_tel <", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelLessThanOrEqualTo(String value) {
            addCriterion("member_tel <=", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelLike(String value) {
            addCriterion("member_tel like", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelNotLike(String value) {
            addCriterion("member_tel not like", value, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelIn(List<String> values) {
            addCriterion("member_tel in", values, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelNotIn(List<String> values) {
            addCriterion("member_tel not in", values, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelBetween(String value1, String value2) {
            addCriterion("member_tel between", value1, value2, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberTelNotBetween(String value1, String value2) {
            addCriterion("member_tel not between", value1, value2, "memberTel");
            return (Criteria) this;
        }

        public Criteria andMemberQqIsNull() {
            addCriterion("member_qq is null");
            return (Criteria) this;
        }

        public Criteria andMemberQqIsNotNull() {
            addCriterion("member_qq is not null");
            return (Criteria) this;
        }

        public Criteria andMemberQqEqualTo(String value) {
            addCriterion("member_qq =", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotEqualTo(String value) {
            addCriterion("member_qq <>", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqGreaterThan(String value) {
            addCriterion("member_qq >", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqGreaterThanOrEqualTo(String value) {
            addCriterion("member_qq >=", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLessThan(String value) {
            addCriterion("member_qq <", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLessThanOrEqualTo(String value) {
            addCriterion("member_qq <=", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqLike(String value) {
            addCriterion("member_qq like", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotLike(String value) {
            addCriterion("member_qq not like", value, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqIn(List<String> values) {
            addCriterion("member_qq in", values, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotIn(List<String> values) {
            addCriterion("member_qq not in", values, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqBetween(String value1, String value2) {
            addCriterion("member_qq between", value1, value2, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberQqNotBetween(String value1, String value2) {
            addCriterion("member_qq not between", value1, value2, "memberQq");
            return (Criteria) this;
        }

        public Criteria andMemberIntrIsNull() {
            addCriterion("member_intr is null");
            return (Criteria) this;
        }

        public Criteria andMemberIntrIsNotNull() {
            addCriterion("member_intr is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIntrEqualTo(String value) {
            addCriterion("member_intr =", value, "memberIntr");
            return (Criteria) this;
        }

        public Criteria andMemberIntrNotEqualTo(String value) {
            addCriterion("member_intr <>", value, "memberIntr");
            return (Criteria) this;
        }

        public Criteria andMemberIntrGreaterThan(String value) {
            addCriterion("member_intr >", value, "memberIntr");
            return (Criteria) this;
        }

        public Criteria andMemberIntrGreaterThanOrEqualTo(String value) {
            addCriterion("member_intr >=", value, "memberIntr");
            return (Criteria) this;
        }

        public Criteria andMemberIntrLessThan(String value) {
            addCriterion("member_intr <", value, "memberIntr");
            return (Criteria) this;
        }

        public Criteria andMemberIntrLessThanOrEqualTo(String value) {
            addCriterion("member_intr <=", value, "memberIntr");
            return (Criteria) this;
        }

        public Criteria andMemberIntrLike(String value) {
            addCriterion("member_intr like", value, "memberIntr");
            return (Criteria) this;
        }

        public Criteria andMemberIntrNotLike(String value) {
            addCriterion("member_intr not like", value, "memberIntr");
            return (Criteria) this;
        }

        public Criteria andMemberIntrIn(List<String> values) {
            addCriterion("member_intr in", values, "memberIntr");
            return (Criteria) this;
        }

        public Criteria andMemberIntrNotIn(List<String> values) {
            addCriterion("member_intr not in", values, "memberIntr");
            return (Criteria) this;
        }

        public Criteria andMemberIntrBetween(String value1, String value2) {
            addCriterion("member_intr between", value1, value2, "memberIntr");
            return (Criteria) this;
        }

        public Criteria andMemberIntrNotBetween(String value1, String value2) {
            addCriterion("member_intr not between", value1, value2, "memberIntr");
            return (Criteria) this;
        }

        public Criteria andMemberImgIdIsNull() {
            addCriterion("member_img_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberImgIdIsNotNull() {
            addCriterion("member_img_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberImgIdEqualTo(String value) {
            addCriterion("member_img_id =", value, "memberImgId");
            return (Criteria) this;
        }

        public Criteria andMemberImgIdNotEqualTo(String value) {
            addCriterion("member_img_id <>", value, "memberImgId");
            return (Criteria) this;
        }

        public Criteria andMemberImgIdGreaterThan(String value) {
            addCriterion("member_img_id >", value, "memberImgId");
            return (Criteria) this;
        }

        public Criteria andMemberImgIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_img_id >=", value, "memberImgId");
            return (Criteria) this;
        }

        public Criteria andMemberImgIdLessThan(String value) {
            addCriterion("member_img_id <", value, "memberImgId");
            return (Criteria) this;
        }

        public Criteria andMemberImgIdLessThanOrEqualTo(String value) {
            addCriterion("member_img_id <=", value, "memberImgId");
            return (Criteria) this;
        }

        public Criteria andMemberImgIdLike(String value) {
            addCriterion("member_img_id like", value, "memberImgId");
            return (Criteria) this;
        }

        public Criteria andMemberImgIdNotLike(String value) {
            addCriterion("member_img_id not like", value, "memberImgId");
            return (Criteria) this;
        }

        public Criteria andMemberImgIdIn(List<String> values) {
            addCriterion("member_img_id in", values, "memberImgId");
            return (Criteria) this;
        }

        public Criteria andMemberImgIdNotIn(List<String> values) {
            addCriterion("member_img_id not in", values, "memberImgId");
            return (Criteria) this;
        }

        public Criteria andMemberImgIdBetween(String value1, String value2) {
            addCriterion("member_img_id between", value1, value2, "memberImgId");
            return (Criteria) this;
        }

        public Criteria andMemberImgIdNotBetween(String value1, String value2) {
            addCriterion("member_img_id not between", value1, value2, "memberImgId");
            return (Criteria) this;
        }

        public Criteria andMemberJoinTimeIsNull() {
            addCriterion("member_join_time is null");
            return (Criteria) this;
        }

        public Criteria andMemberJoinTimeIsNotNull() {
            addCriterion("member_join_time is not null");
            return (Criteria) this;
        }

        public Criteria andMemberJoinTimeEqualTo(Date value) {
            addCriterionForJDBCDate("member_join_time =", value, "memberJoinTime");
            return (Criteria) this;
        }

        public Criteria andMemberJoinTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("member_join_time <>", value, "memberJoinTime");
            return (Criteria) this;
        }

        public Criteria andMemberJoinTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("member_join_time >", value, "memberJoinTime");
            return (Criteria) this;
        }

        public Criteria andMemberJoinTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("member_join_time >=", value, "memberJoinTime");
            return (Criteria) this;
        }

        public Criteria andMemberJoinTimeLessThan(Date value) {
            addCriterionForJDBCDate("member_join_time <", value, "memberJoinTime");
            return (Criteria) this;
        }

        public Criteria andMemberJoinTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("member_join_time <=", value, "memberJoinTime");
            return (Criteria) this;
        }

        public Criteria andMemberJoinTimeIn(List<Date> values) {
            addCriterionForJDBCDate("member_join_time in", values, "memberJoinTime");
            return (Criteria) this;
        }

        public Criteria andMemberJoinTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("member_join_time not in", values, "memberJoinTime");
            return (Criteria) this;
        }

        public Criteria andMemberJoinTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("member_join_time between", value1, value2, "memberJoinTime");
            return (Criteria) this;
        }

        public Criteria andMemberJoinTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("member_join_time not between", value1, value2, "memberJoinTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}