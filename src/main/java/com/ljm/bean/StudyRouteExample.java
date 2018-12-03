package com.ljm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudyRouteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudyRouteExample() {
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

        public Criteria andStudyContentIsNull() {
            addCriterion("study_content is null");
            return (Criteria) this;
        }

        public Criteria andStudyContentIsNotNull() {
            addCriterion("study_content is not null");
            return (Criteria) this;
        }

        public Criteria andStudyContentEqualTo(String value) {
            addCriterion("study_content =", value, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentNotEqualTo(String value) {
            addCriterion("study_content <>", value, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentGreaterThan(String value) {
            addCriterion("study_content >", value, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentGreaterThanOrEqualTo(String value) {
            addCriterion("study_content >=", value, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentLessThan(String value) {
            addCriterion("study_content <", value, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentLessThanOrEqualTo(String value) {
            addCriterion("study_content <=", value, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentLike(String value) {
            addCriterion("study_content like", value, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentNotLike(String value) {
            addCriterion("study_content not like", value, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentIn(List<String> values) {
            addCriterion("study_content in", values, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentNotIn(List<String> values) {
            addCriterion("study_content not in", values, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentBetween(String value1, String value2) {
            addCriterion("study_content between", value1, value2, "studyContent");
            return (Criteria) this;
        }

        public Criteria andStudyContentNotBetween(String value1, String value2) {
            addCriterion("study_content not between", value1, value2, "studyContent");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andNowTimeIsNull() {
            addCriterion("now_time is null");
            return (Criteria) this;
        }

        public Criteria andNowTimeIsNotNull() {
            addCriterion("now_time is not null");
            return (Criteria) this;
        }

        public Criteria andNowTimeEqualTo(Date value) {
            addCriterion("now_time =", value, "nowTime");
            return (Criteria) this;
        }

        public Criteria andNowTimeNotEqualTo(Date value) {
            addCriterion("now_time <>", value, "nowTime");
            return (Criteria) this;
        }

        public Criteria andNowTimeGreaterThan(Date value) {
            addCriterion("now_time >", value, "nowTime");
            return (Criteria) this;
        }

        public Criteria andNowTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("now_time >=", value, "nowTime");
            return (Criteria) this;
        }

        public Criteria andNowTimeLessThan(Date value) {
            addCriterion("now_time <", value, "nowTime");
            return (Criteria) this;
        }

        public Criteria andNowTimeLessThanOrEqualTo(Date value) {
            addCriterion("now_time <=", value, "nowTime");
            return (Criteria) this;
        }

        public Criteria andNowTimeIn(List<Date> values) {
            addCriterion("now_time in", values, "nowTime");
            return (Criteria) this;
        }

        public Criteria andNowTimeNotIn(List<Date> values) {
            addCriterion("now_time not in", values, "nowTime");
            return (Criteria) this;
        }

        public Criteria andNowTimeBetween(Date value1, Date value2) {
            addCriterion("now_time between", value1, value2, "nowTime");
            return (Criteria) this;
        }

        public Criteria andNowTimeNotBetween(Date value1, Date value2) {
            addCriterion("now_time not between", value1, value2, "nowTime");
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