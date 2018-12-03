package com.ljm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendanceRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceRecordExample() {
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

        public Criteria andAttendanceIdIsNull() {
            addCriterion("attendance_id is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdIsNotNull() {
            addCriterion("attendance_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdEqualTo(Integer value) {
            addCriterion("attendance_id =", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdNotEqualTo(Integer value) {
            addCriterion("attendance_id <>", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdGreaterThan(Integer value) {
            addCriterion("attendance_id >", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attendance_id >=", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdLessThan(Integer value) {
            addCriterion("attendance_id <", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdLessThanOrEqualTo(Integer value) {
            addCriterion("attendance_id <=", value, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdIn(List<Integer> values) {
            addCriterion("attendance_id in", values, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdNotIn(List<Integer> values) {
            addCriterion("attendance_id not in", values, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdBetween(Integer value1, Integer value2) {
            addCriterion("attendance_id between", value1, value2, "attendanceId");
            return (Criteria) this;
        }

        public Criteria andAttendanceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attendance_id not between", value1, value2, "attendanceId");
            return (Criteria) this;
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

        public Criteria andAttendTimeIsNull() {
            addCriterion("attend_time is null");
            return (Criteria) this;
        }

        public Criteria andAttendTimeIsNotNull() {
            addCriterion("attend_time is not null");
            return (Criteria) this;
        }

        public Criteria andAttendTimeEqualTo(Date value) {
            addCriterion("attend_time =", value, "attendTime");
            return (Criteria) this;
        }

        public Criteria andAttendTimeNotEqualTo(Date value) {
            addCriterion("attend_time <>", value, "attendTime");
            return (Criteria) this;
        }

        public Criteria andAttendTimeGreaterThan(Date value) {
            addCriterion("attend_time >", value, "attendTime");
            return (Criteria) this;
        }

        public Criteria andAttendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("attend_time >=", value, "attendTime");
            return (Criteria) this;
        }

        public Criteria andAttendTimeLessThan(Date value) {
            addCriterion("attend_time <", value, "attendTime");
            return (Criteria) this;
        }

        public Criteria andAttendTimeLessThanOrEqualTo(Date value) {
            addCriterion("attend_time <=", value, "attendTime");
            return (Criteria) this;
        }

        public Criteria andAttendTimeIn(List<Date> values) {
            addCriterion("attend_time in", values, "attendTime");
            return (Criteria) this;
        }

        public Criteria andAttendTimeNotIn(List<Date> values) {
            addCriterion("attend_time not in", values, "attendTime");
            return (Criteria) this;
        }

        public Criteria andAttendTimeBetween(Date value1, Date value2) {
            addCriterion("attend_time between", value1, value2, "attendTime");
            return (Criteria) this;
        }

        public Criteria andAttendTimeNotBetween(Date value1, Date value2) {
            addCriterion("attend_time not between", value1, value2, "attendTime");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andAttendSignIsNull() {
            addCriterion("attend_sign is null");
            return (Criteria) this;
        }

        public Criteria andAttendSignIsNotNull() {
            addCriterion("attend_sign is not null");
            return (Criteria) this;
        }

        public Criteria andAttendSignEqualTo(String value) {
            addCriterion("attend_sign =", value, "attendSign");
            return (Criteria) this;
        }

        public Criteria andAttendSignNotEqualTo(String value) {
            addCriterion("attend_sign <>", value, "attendSign");
            return (Criteria) this;
        }

        public Criteria andAttendSignGreaterThan(String value) {
            addCriterion("attend_sign >", value, "attendSign");
            return (Criteria) this;
        }

        public Criteria andAttendSignGreaterThanOrEqualTo(String value) {
            addCriterion("attend_sign >=", value, "attendSign");
            return (Criteria) this;
        }

        public Criteria andAttendSignLessThan(String value) {
            addCriterion("attend_sign <", value, "attendSign");
            return (Criteria) this;
        }

        public Criteria andAttendSignLessThanOrEqualTo(String value) {
            addCriterion("attend_sign <=", value, "attendSign");
            return (Criteria) this;
        }

        public Criteria andAttendSignLike(String value) {
            addCriterion("attend_sign like", value, "attendSign");
            return (Criteria) this;
        }

        public Criteria andAttendSignNotLike(String value) {
            addCriterion("attend_sign not like", value, "attendSign");
            return (Criteria) this;
        }

        public Criteria andAttendSignIn(List<String> values) {
            addCriterion("attend_sign in", values, "attendSign");
            return (Criteria) this;
        }

        public Criteria andAttendSignNotIn(List<String> values) {
            addCriterion("attend_sign not in", values, "attendSign");
            return (Criteria) this;
        }

        public Criteria andAttendSignBetween(String value1, String value2) {
            addCriterion("attend_sign between", value1, value2, "attendSign");
            return (Criteria) this;
        }

        public Criteria andAttendSignNotBetween(String value1, String value2) {
            addCriterion("attend_sign not between", value1, value2, "attendSign");
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