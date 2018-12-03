package com.ljm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DailyPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DailyPlanExample() {
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

        public Criteria andPlanIdIsNull() {
            addCriterion("plan_id is null");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNotNull() {
            addCriterion("plan_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlanIdEqualTo(Integer value) {
            addCriterion("plan_id =", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotEqualTo(Integer value) {
            addCriterion("plan_id <>", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThan(Integer value) {
            addCriterion("plan_id >", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plan_id >=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThan(Integer value) {
            addCriterion("plan_id <", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThanOrEqualTo(Integer value) {
            addCriterion("plan_id <=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdIn(List<Integer> values) {
            addCriterion("plan_id in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotIn(List<Integer> values) {
            addCriterion("plan_id not in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdBetween(Integer value1, Integer value2) {
            addCriterion("plan_id between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plan_id not between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanContentIsNull() {
            addCriterion("plan_content is null");
            return (Criteria) this;
        }

        public Criteria andPlanContentIsNotNull() {
            addCriterion("plan_content is not null");
            return (Criteria) this;
        }

        public Criteria andPlanContentEqualTo(String value) {
            addCriterion("plan_content =", value, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentNotEqualTo(String value) {
            addCriterion("plan_content <>", value, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentGreaterThan(String value) {
            addCriterion("plan_content >", value, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentGreaterThanOrEqualTo(String value) {
            addCriterion("plan_content >=", value, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentLessThan(String value) {
            addCriterion("plan_content <", value, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentLessThanOrEqualTo(String value) {
            addCriterion("plan_content <=", value, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentLike(String value) {
            addCriterion("plan_content like", value, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentNotLike(String value) {
            addCriterion("plan_content not like", value, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentIn(List<String> values) {
            addCriterion("plan_content in", values, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentNotIn(List<String> values) {
            addCriterion("plan_content not in", values, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentBetween(String value1, String value2) {
            addCriterion("plan_content between", value1, value2, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanContentNotBetween(String value1, String value2) {
            addCriterion("plan_content not between", value1, value2, "planContent");
            return (Criteria) this;
        }

        public Criteria andPlanTimeIsNull() {
            addCriterion("plan_time is null");
            return (Criteria) this;
        }

        public Criteria andPlanTimeIsNotNull() {
            addCriterion("plan_time is not null");
            return (Criteria) this;
        }

        public Criteria andPlanTimeEqualTo(Date value) {
            addCriterion("plan_time =", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeNotEqualTo(Date value) {
            addCriterion("plan_time <>", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeGreaterThan(Date value) {
            addCriterion("plan_time >", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_time >=", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeLessThan(Date value) {
            addCriterion("plan_time <", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeLessThanOrEqualTo(Date value) {
            addCriterion("plan_time <=", value, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeIn(List<Date> values) {
            addCriterion("plan_time in", values, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeNotIn(List<Date> values) {
            addCriterion("plan_time not in", values, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeBetween(Date value1, Date value2) {
            addCriterion("plan_time between", value1, value2, "planTime");
            return (Criteria) this;
        }

        public Criteria andPlanTimeNotBetween(Date value1, Date value2) {
            addCriterion("plan_time not between", value1, value2, "planTime");
            return (Criteria) this;
        }

        public Criteria andReformTimeIsNull() {
            addCriterion("reform_time is null");
            return (Criteria) this;
        }

        public Criteria andReformTimeIsNotNull() {
            addCriterion("reform_time is not null");
            return (Criteria) this;
        }

        public Criteria andReformTimeEqualTo(Date value) {
            addCriterion("reform_time =", value, "reformTime");
            return (Criteria) this;
        }

        public Criteria andReformTimeNotEqualTo(Date value) {
            addCriterion("reform_time <>", value, "reformTime");
            return (Criteria) this;
        }

        public Criteria andReformTimeGreaterThan(Date value) {
            addCriterion("reform_time >", value, "reformTime");
            return (Criteria) this;
        }

        public Criteria andReformTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reform_time >=", value, "reformTime");
            return (Criteria) this;
        }

        public Criteria andReformTimeLessThan(Date value) {
            addCriterion("reform_time <", value, "reformTime");
            return (Criteria) this;
        }

        public Criteria andReformTimeLessThanOrEqualTo(Date value) {
            addCriterion("reform_time <=", value, "reformTime");
            return (Criteria) this;
        }

        public Criteria andReformTimeIn(List<Date> values) {
            addCriterion("reform_time in", values, "reformTime");
            return (Criteria) this;
        }

        public Criteria andReformTimeNotIn(List<Date> values) {
            addCriterion("reform_time not in", values, "reformTime");
            return (Criteria) this;
        }

        public Criteria andReformTimeBetween(Date value1, Date value2) {
            addCriterion("reform_time between", value1, value2, "reformTime");
            return (Criteria) this;
        }

        public Criteria andReformTimeNotBetween(Date value1, Date value2) {
            addCriterion("reform_time not between", value1, value2, "reformTime");
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