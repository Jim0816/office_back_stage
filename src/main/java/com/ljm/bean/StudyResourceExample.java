package com.ljm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudyResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudyResourceExample() {
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

        public Criteria andResourceIdIsNull() {
            addCriterion("resource_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(Integer value) {
            addCriterion("resource_id =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(Integer value) {
            addCriterion("resource_id <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(Integer value) {
            addCriterion("resource_id >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_id >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(Integer value) {
            addCriterion("resource_id <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("resource_id <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<Integer> values) {
            addCriterion("resource_id in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<Integer> values) {
            addCriterion("resource_id not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("resource_id between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_id not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNull() {
            addCriterion("resource_type is null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNotNull() {
            addCriterion("resource_type is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeEqualTo(String value) {
            addCriterion("resource_type =", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotEqualTo(String value) {
            addCriterion("resource_type <>", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThan(String value) {
            addCriterion("resource_type >", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("resource_type >=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThan(String value) {
            addCriterion("resource_type <", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThanOrEqualTo(String value) {
            addCriterion("resource_type <=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLike(String value) {
            addCriterion("resource_type like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotLike(String value) {
            addCriterion("resource_type not like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIn(List<String> values) {
            addCriterion("resource_type in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotIn(List<String> values) {
            addCriterion("resource_type not in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeBetween(String value1, String value2) {
            addCriterion("resource_type between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotBetween(String value1, String value2) {
            addCriterion("resource_type not between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andPublishMemberIdIsNull() {
            addCriterion("publish_member_id is null");
            return (Criteria) this;
        }

        public Criteria andPublishMemberIdIsNotNull() {
            addCriterion("publish_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andPublishMemberIdEqualTo(Integer value) {
            addCriterion("publish_member_id =", value, "publishMemberId");
            return (Criteria) this;
        }

        public Criteria andPublishMemberIdNotEqualTo(Integer value) {
            addCriterion("publish_member_id <>", value, "publishMemberId");
            return (Criteria) this;
        }

        public Criteria andPublishMemberIdGreaterThan(Integer value) {
            addCriterion("publish_member_id >", value, "publishMemberId");
            return (Criteria) this;
        }

        public Criteria andPublishMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish_member_id >=", value, "publishMemberId");
            return (Criteria) this;
        }

        public Criteria andPublishMemberIdLessThan(Integer value) {
            addCriterion("publish_member_id <", value, "publishMemberId");
            return (Criteria) this;
        }

        public Criteria andPublishMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("publish_member_id <=", value, "publishMemberId");
            return (Criteria) this;
        }

        public Criteria andPublishMemberIdIn(List<Integer> values) {
            addCriterion("publish_member_id in", values, "publishMemberId");
            return (Criteria) this;
        }

        public Criteria andPublishMemberIdNotIn(List<Integer> values) {
            addCriterion("publish_member_id not in", values, "publishMemberId");
            return (Criteria) this;
        }

        public Criteria andPublishMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("publish_member_id between", value1, value2, "publishMemberId");
            return (Criteria) this;
        }

        public Criteria andPublishMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("publish_member_id not between", value1, value2, "publishMemberId");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andResourceIntrIsNull() {
            addCriterion("resource_intr is null");
            return (Criteria) this;
        }

        public Criteria andResourceIntrIsNotNull() {
            addCriterion("resource_intr is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIntrEqualTo(String value) {
            addCriterion("resource_intr =", value, "resourceIntr");
            return (Criteria) this;
        }

        public Criteria andResourceIntrNotEqualTo(String value) {
            addCriterion("resource_intr <>", value, "resourceIntr");
            return (Criteria) this;
        }

        public Criteria andResourceIntrGreaterThan(String value) {
            addCriterion("resource_intr >", value, "resourceIntr");
            return (Criteria) this;
        }

        public Criteria andResourceIntrGreaterThanOrEqualTo(String value) {
            addCriterion("resource_intr >=", value, "resourceIntr");
            return (Criteria) this;
        }

        public Criteria andResourceIntrLessThan(String value) {
            addCriterion("resource_intr <", value, "resourceIntr");
            return (Criteria) this;
        }

        public Criteria andResourceIntrLessThanOrEqualTo(String value) {
            addCriterion("resource_intr <=", value, "resourceIntr");
            return (Criteria) this;
        }

        public Criteria andResourceIntrLike(String value) {
            addCriterion("resource_intr like", value, "resourceIntr");
            return (Criteria) this;
        }

        public Criteria andResourceIntrNotLike(String value) {
            addCriterion("resource_intr not like", value, "resourceIntr");
            return (Criteria) this;
        }

        public Criteria andResourceIntrIn(List<String> values) {
            addCriterion("resource_intr in", values, "resourceIntr");
            return (Criteria) this;
        }

        public Criteria andResourceIntrNotIn(List<String> values) {
            addCriterion("resource_intr not in", values, "resourceIntr");
            return (Criteria) this;
        }

        public Criteria andResourceIntrBetween(String value1, String value2) {
            addCriterion("resource_intr between", value1, value2, "resourceIntr");
            return (Criteria) this;
        }

        public Criteria andResourceIntrNotBetween(String value1, String value2) {
            addCriterion("resource_intr not between", value1, value2, "resourceIntr");
            return (Criteria) this;
        }

        public Criteria andResourceLinkIsNull() {
            addCriterion("resource_link is null");
            return (Criteria) this;
        }

        public Criteria andResourceLinkIsNotNull() {
            addCriterion("resource_link is not null");
            return (Criteria) this;
        }

        public Criteria andResourceLinkEqualTo(String value) {
            addCriterion("resource_link =", value, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkNotEqualTo(String value) {
            addCriterion("resource_link <>", value, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkGreaterThan(String value) {
            addCriterion("resource_link >", value, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkGreaterThanOrEqualTo(String value) {
            addCriterion("resource_link >=", value, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkLessThan(String value) {
            addCriterion("resource_link <", value, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkLessThanOrEqualTo(String value) {
            addCriterion("resource_link <=", value, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkLike(String value) {
            addCriterion("resource_link like", value, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkNotLike(String value) {
            addCriterion("resource_link not like", value, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkIn(List<String> values) {
            addCriterion("resource_link in", values, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkNotIn(List<String> values) {
            addCriterion("resource_link not in", values, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkBetween(String value1, String value2) {
            addCriterion("resource_link between", value1, value2, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkNotBetween(String value1, String value2) {
            addCriterion("resource_link not between", value1, value2, "resourceLink");
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