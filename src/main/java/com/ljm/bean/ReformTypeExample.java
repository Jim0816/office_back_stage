package com.ljm.bean;

import java.util.ArrayList;
import java.util.List;

public class ReformTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReformTypeExample() {
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

        public Criteria andReformTypeIsNull() {
            addCriterion("reform_type is null");
            return (Criteria) this;
        }

        public Criteria andReformTypeIsNotNull() {
            addCriterion("reform_type is not null");
            return (Criteria) this;
        }

        public Criteria andReformTypeEqualTo(String value) {
            addCriterion("reform_type =", value, "reformType");
            return (Criteria) this;
        }

        public Criteria andReformTypeNotEqualTo(String value) {
            addCriterion("reform_type <>", value, "reformType");
            return (Criteria) this;
        }

        public Criteria andReformTypeGreaterThan(String value) {
            addCriterion("reform_type >", value, "reformType");
            return (Criteria) this;
        }

        public Criteria andReformTypeGreaterThanOrEqualTo(String value) {
            addCriterion("reform_type >=", value, "reformType");
            return (Criteria) this;
        }

        public Criteria andReformTypeLessThan(String value) {
            addCriterion("reform_type <", value, "reformType");
            return (Criteria) this;
        }

        public Criteria andReformTypeLessThanOrEqualTo(String value) {
            addCriterion("reform_type <=", value, "reformType");
            return (Criteria) this;
        }

        public Criteria andReformTypeLike(String value) {
            addCriterion("reform_type like", value, "reformType");
            return (Criteria) this;
        }

        public Criteria andReformTypeNotLike(String value) {
            addCriterion("reform_type not like", value, "reformType");
            return (Criteria) this;
        }

        public Criteria andReformTypeIn(List<String> values) {
            addCriterion("reform_type in", values, "reformType");
            return (Criteria) this;
        }

        public Criteria andReformTypeNotIn(List<String> values) {
            addCriterion("reform_type not in", values, "reformType");
            return (Criteria) this;
        }

        public Criteria andReformTypeBetween(String value1, String value2) {
            addCriterion("reform_type between", value1, value2, "reformType");
            return (Criteria) this;
        }

        public Criteria andReformTypeNotBetween(String value1, String value2) {
            addCriterion("reform_type not between", value1, value2, "reformType");
            return (Criteria) this;
        }

        public Criteria andReformContentIsNull() {
            addCriterion("reform_content is null");
            return (Criteria) this;
        }

        public Criteria andReformContentIsNotNull() {
            addCriterion("reform_content is not null");
            return (Criteria) this;
        }

        public Criteria andReformContentEqualTo(String value) {
            addCriterion("reform_content =", value, "reformContent");
            return (Criteria) this;
        }

        public Criteria andReformContentNotEqualTo(String value) {
            addCriterion("reform_content <>", value, "reformContent");
            return (Criteria) this;
        }

        public Criteria andReformContentGreaterThan(String value) {
            addCriterion("reform_content >", value, "reformContent");
            return (Criteria) this;
        }

        public Criteria andReformContentGreaterThanOrEqualTo(String value) {
            addCriterion("reform_content >=", value, "reformContent");
            return (Criteria) this;
        }

        public Criteria andReformContentLessThan(String value) {
            addCriterion("reform_content <", value, "reformContent");
            return (Criteria) this;
        }

        public Criteria andReformContentLessThanOrEqualTo(String value) {
            addCriterion("reform_content <=", value, "reformContent");
            return (Criteria) this;
        }

        public Criteria andReformContentLike(String value) {
            addCriterion("reform_content like", value, "reformContent");
            return (Criteria) this;
        }

        public Criteria andReformContentNotLike(String value) {
            addCriterion("reform_content not like", value, "reformContent");
            return (Criteria) this;
        }

        public Criteria andReformContentIn(List<String> values) {
            addCriterion("reform_content in", values, "reformContent");
            return (Criteria) this;
        }

        public Criteria andReformContentNotIn(List<String> values) {
            addCriterion("reform_content not in", values, "reformContent");
            return (Criteria) this;
        }

        public Criteria andReformContentBetween(String value1, String value2) {
            addCriterion("reform_content between", value1, value2, "reformContent");
            return (Criteria) this;
        }

        public Criteria andReformContentNotBetween(String value1, String value2) {
            addCriterion("reform_content not between", value1, value2, "reformContent");
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