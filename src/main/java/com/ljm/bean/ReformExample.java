package com.ljm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReformExample() {
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

        public Criteria andReformIdIsNull() {
            addCriterion("reform_id is null");
            return (Criteria) this;
        }

        public Criteria andReformIdIsNotNull() {
            addCriterion("reform_id is not null");
            return (Criteria) this;
        }

        public Criteria andReformIdEqualTo(Integer value) {
            addCriterion("reform_id =", value, "reformId");
            return (Criteria) this;
        }

        public Criteria andReformIdNotEqualTo(Integer value) {
            addCriterion("reform_id <>", value, "reformId");
            return (Criteria) this;
        }

        public Criteria andReformIdGreaterThan(Integer value) {
            addCriterion("reform_id >", value, "reformId");
            return (Criteria) this;
        }

        public Criteria andReformIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reform_id >=", value, "reformId");
            return (Criteria) this;
        }

        public Criteria andReformIdLessThan(Integer value) {
            addCriterion("reform_id <", value, "reformId");
            return (Criteria) this;
        }

        public Criteria andReformIdLessThanOrEqualTo(Integer value) {
            addCriterion("reform_id <=", value, "reformId");
            return (Criteria) this;
        }

        public Criteria andReformIdIn(List<Integer> values) {
            addCriterion("reform_id in", values, "reformId");
            return (Criteria) this;
        }

        public Criteria andReformIdNotIn(List<Integer> values) {
            addCriterion("reform_id not in", values, "reformId");
            return (Criteria) this;
        }

        public Criteria andReformIdBetween(Integer value1, Integer value2) {
            addCriterion("reform_id between", value1, value2, "reformId");
            return (Criteria) this;
        }

        public Criteria andReformIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reform_id not between", value1, value2, "reformId");
            return (Criteria) this;
        }

        public Criteria andReformTypeIdIsNull() {
            addCriterion("reform_type_id is null");
            return (Criteria) this;
        }

        public Criteria andReformTypeIdIsNotNull() {
            addCriterion("reform_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andReformTypeIdEqualTo(Integer value) {
            addCriterion("reform_type_id =", value, "reformTypeId");
            return (Criteria) this;
        }

        public Criteria andReformTypeIdNotEqualTo(Integer value) {
            addCriterion("reform_type_id <>", value, "reformTypeId");
            return (Criteria) this;
        }

        public Criteria andReformTypeIdGreaterThan(Integer value) {
            addCriterion("reform_type_id >", value, "reformTypeId");
            return (Criteria) this;
        }

        public Criteria andReformTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reform_type_id >=", value, "reformTypeId");
            return (Criteria) this;
        }

        public Criteria andReformTypeIdLessThan(Integer value) {
            addCriterion("reform_type_id <", value, "reformTypeId");
            return (Criteria) this;
        }

        public Criteria andReformTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("reform_type_id <=", value, "reformTypeId");
            return (Criteria) this;
        }

        public Criteria andReformTypeIdIn(List<Integer> values) {
            addCriterion("reform_type_id in", values, "reformTypeId");
            return (Criteria) this;
        }

        public Criteria andReformTypeIdNotIn(List<Integer> values) {
            addCriterion("reform_type_id not in", values, "reformTypeId");
            return (Criteria) this;
        }

        public Criteria andReformTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("reform_type_id between", value1, value2, "reformTypeId");
            return (Criteria) this;
        }

        public Criteria andReformTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reform_type_id not between", value1, value2, "reformTypeId");
            return (Criteria) this;
        }

        public Criteria andTheTypeIdIsNull() {
            addCriterion("the_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTheTypeIdIsNotNull() {
            addCriterion("the_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTheTypeIdEqualTo(Integer value) {
            addCriterion("the_type_id =", value, "theTypeId");
            return (Criteria) this;
        }

        public Criteria andTheTypeIdNotEqualTo(Integer value) {
            addCriterion("the_type_id <>", value, "theTypeId");
            return (Criteria) this;
        }

        public Criteria andTheTypeIdGreaterThan(Integer value) {
            addCriterion("the_type_id >", value, "theTypeId");
            return (Criteria) this;
        }

        public Criteria andTheTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("the_type_id >=", value, "theTypeId");
            return (Criteria) this;
        }

        public Criteria andTheTypeIdLessThan(Integer value) {
            addCriterion("the_type_id <", value, "theTypeId");
            return (Criteria) this;
        }

        public Criteria andTheTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("the_type_id <=", value, "theTypeId");
            return (Criteria) this;
        }

        public Criteria andTheTypeIdIn(List<Integer> values) {
            addCriterion("the_type_id in", values, "theTypeId");
            return (Criteria) this;
        }

        public Criteria andTheTypeIdNotIn(List<Integer> values) {
            addCriterion("the_type_id not in", values, "theTypeId");
            return (Criteria) this;
        }

        public Criteria andTheTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("the_type_id between", value1, value2, "theTypeId");
            return (Criteria) this;
        }

        public Criteria andTheTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("the_type_id not between", value1, value2, "theTypeId");
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

        public Criteria andReformStateIsNull() {
            addCriterion("reform_state is null");
            return (Criteria) this;
        }

        public Criteria andReformStateIsNotNull() {
            addCriterion("reform_state is not null");
            return (Criteria) this;
        }

        public Criteria andReformStateEqualTo(String value) {
            addCriterion("reform_state =", value, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateNotEqualTo(String value) {
            addCriterion("reform_state <>", value, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateGreaterThan(String value) {
            addCriterion("reform_state >", value, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateGreaterThanOrEqualTo(String value) {
            addCriterion("reform_state >=", value, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateLessThan(String value) {
            addCriterion("reform_state <", value, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateLessThanOrEqualTo(String value) {
            addCriterion("reform_state <=", value, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateLike(String value) {
            addCriterion("reform_state like", value, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateNotLike(String value) {
            addCriterion("reform_state not like", value, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateIn(List<String> values) {
            addCriterion("reform_state in", values, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateNotIn(List<String> values) {
            addCriterion("reform_state not in", values, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateBetween(String value1, String value2) {
            addCriterion("reform_state between", value1, value2, "reformState");
            return (Criteria) this;
        }

        public Criteria andReformStateNotBetween(String value1, String value2) {
            addCriterion("reform_state not between", value1, value2, "reformState");
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