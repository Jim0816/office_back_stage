package com.ljm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudyTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudyTaskExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskContentIsNull() {
            addCriterion("task_content is null");
            return (Criteria) this;
        }

        public Criteria andTaskContentIsNotNull() {
            addCriterion("task_content is not null");
            return (Criteria) this;
        }

        public Criteria andTaskContentEqualTo(String value) {
            addCriterion("task_content =", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentNotEqualTo(String value) {
            addCriterion("task_content <>", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentGreaterThan(String value) {
            addCriterion("task_content >", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentGreaterThanOrEqualTo(String value) {
            addCriterion("task_content >=", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentLessThan(String value) {
            addCriterion("task_content <", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentLessThanOrEqualTo(String value) {
            addCriterion("task_content <=", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentLike(String value) {
            addCriterion("task_content like", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentNotLike(String value) {
            addCriterion("task_content not like", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentIn(List<String> values) {
            addCriterion("task_content in", values, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentNotIn(List<String> values) {
            addCriterion("task_content not in", values, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentBetween(String value1, String value2) {
            addCriterion("task_content between", value1, value2, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentNotBetween(String value1, String value2) {
            addCriterion("task_content not between", value1, value2, "taskContent");
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

        public Criteria andSubmitDeadlineIsNull() {
            addCriterion("submit_deadline is null");
            return (Criteria) this;
        }

        public Criteria andSubmitDeadlineIsNotNull() {
            addCriterion("submit_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitDeadlineEqualTo(Date value) {
            addCriterion("submit_deadline =", value, "submitDeadline");
            return (Criteria) this;
        }

        public Criteria andSubmitDeadlineNotEqualTo(Date value) {
            addCriterion("submit_deadline <>", value, "submitDeadline");
            return (Criteria) this;
        }

        public Criteria andSubmitDeadlineGreaterThan(Date value) {
            addCriterion("submit_deadline >", value, "submitDeadline");
            return (Criteria) this;
        }

        public Criteria andSubmitDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("submit_deadline >=", value, "submitDeadline");
            return (Criteria) this;
        }

        public Criteria andSubmitDeadlineLessThan(Date value) {
            addCriterion("submit_deadline <", value, "submitDeadline");
            return (Criteria) this;
        }

        public Criteria andSubmitDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("submit_deadline <=", value, "submitDeadline");
            return (Criteria) this;
        }

        public Criteria andSubmitDeadlineIn(List<Date> values) {
            addCriterion("submit_deadline in", values, "submitDeadline");
            return (Criteria) this;
        }

        public Criteria andSubmitDeadlineNotIn(List<Date> values) {
            addCriterion("submit_deadline not in", values, "submitDeadline");
            return (Criteria) this;
        }

        public Criteria andSubmitDeadlineBetween(Date value1, Date value2) {
            addCriterion("submit_deadline between", value1, value2, "submitDeadline");
            return (Criteria) this;
        }

        public Criteria andSubmitDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("submit_deadline not between", value1, value2, "submitDeadline");
            return (Criteria) this;
        }

        public Criteria andExpireSignIsNull() {
            addCriterion("expire_sign is null");
            return (Criteria) this;
        }

        public Criteria andExpireSignIsNotNull() {
            addCriterion("expire_sign is not null");
            return (Criteria) this;
        }

        public Criteria andExpireSignEqualTo(String value) {
            addCriterion("expire_sign =", value, "expireSign");
            return (Criteria) this;
        }

        public Criteria andExpireSignNotEqualTo(String value) {
            addCriterion("expire_sign <>", value, "expireSign");
            return (Criteria) this;
        }

        public Criteria andExpireSignGreaterThan(String value) {
            addCriterion("expire_sign >", value, "expireSign");
            return (Criteria) this;
        }

        public Criteria andExpireSignGreaterThanOrEqualTo(String value) {
            addCriterion("expire_sign >=", value, "expireSign");
            return (Criteria) this;
        }

        public Criteria andExpireSignLessThan(String value) {
            addCriterion("expire_sign <", value, "expireSign");
            return (Criteria) this;
        }

        public Criteria andExpireSignLessThanOrEqualTo(String value) {
            addCriterion("expire_sign <=", value, "expireSign");
            return (Criteria) this;
        }

        public Criteria andExpireSignLike(String value) {
            addCriterion("expire_sign like", value, "expireSign");
            return (Criteria) this;
        }

        public Criteria andExpireSignNotLike(String value) {
            addCriterion("expire_sign not like", value, "expireSign");
            return (Criteria) this;
        }

        public Criteria andExpireSignIn(List<String> values) {
            addCriterion("expire_sign in", values, "expireSign");
            return (Criteria) this;
        }

        public Criteria andExpireSignNotIn(List<String> values) {
            addCriterion("expire_sign not in", values, "expireSign");
            return (Criteria) this;
        }

        public Criteria andExpireSignBetween(String value1, String value2) {
            addCriterion("expire_sign between", value1, value2, "expireSign");
            return (Criteria) this;
        }

        public Criteria andExpireSignNotBetween(String value1, String value2) {
            addCriterion("expire_sign not between", value1, value2, "expireSign");
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