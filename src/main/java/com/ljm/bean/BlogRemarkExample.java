package com.ljm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogRemarkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogRemarkExample() {
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

        public Criteria andBlogRemarkIdIsNull() {
            addCriterion("blog_remark_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogRemarkIdIsNotNull() {
            addCriterion("blog_remark_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogRemarkIdEqualTo(Integer value) {
            addCriterion("blog_remark_id =", value, "blogRemarkId");
            return (Criteria) this;
        }

        public Criteria andBlogRemarkIdNotEqualTo(Integer value) {
            addCriterion("blog_remark_id <>", value, "blogRemarkId");
            return (Criteria) this;
        }

        public Criteria andBlogRemarkIdGreaterThan(Integer value) {
            addCriterion("blog_remark_id >", value, "blogRemarkId");
            return (Criteria) this;
        }

        public Criteria andBlogRemarkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_remark_id >=", value, "blogRemarkId");
            return (Criteria) this;
        }

        public Criteria andBlogRemarkIdLessThan(Integer value) {
            addCriterion("blog_remark_id <", value, "blogRemarkId");
            return (Criteria) this;
        }

        public Criteria andBlogRemarkIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_remark_id <=", value, "blogRemarkId");
            return (Criteria) this;
        }

        public Criteria andBlogRemarkIdIn(List<Integer> values) {
            addCriterion("blog_remark_id in", values, "blogRemarkId");
            return (Criteria) this;
        }

        public Criteria andBlogRemarkIdNotIn(List<Integer> values) {
            addCriterion("blog_remark_id not in", values, "blogRemarkId");
            return (Criteria) this;
        }

        public Criteria andBlogRemarkIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_remark_id between", value1, value2, "blogRemarkId");
            return (Criteria) this;
        }

        public Criteria andBlogRemarkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_remark_id not between", value1, value2, "blogRemarkId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(Integer value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(Integer value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(Integer value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(Integer value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<Integer> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<Integer> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andRemarkerIsNull() {
            addCriterion("remarker is null");
            return (Criteria) this;
        }

        public Criteria andRemarkerIsNotNull() {
            addCriterion("remarker is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkerEqualTo(Integer value) {
            addCriterion("remarker =", value, "remarker");
            return (Criteria) this;
        }

        public Criteria andRemarkerNotEqualTo(Integer value) {
            addCriterion("remarker <>", value, "remarker");
            return (Criteria) this;
        }

        public Criteria andRemarkerGreaterThan(Integer value) {
            addCriterion("remarker >", value, "remarker");
            return (Criteria) this;
        }

        public Criteria andRemarkerGreaterThanOrEqualTo(Integer value) {
            addCriterion("remarker >=", value, "remarker");
            return (Criteria) this;
        }

        public Criteria andRemarkerLessThan(Integer value) {
            addCriterion("remarker <", value, "remarker");
            return (Criteria) this;
        }

        public Criteria andRemarkerLessThanOrEqualTo(Integer value) {
            addCriterion("remarker <=", value, "remarker");
            return (Criteria) this;
        }

        public Criteria andRemarkerIn(List<Integer> values) {
            addCriterion("remarker in", values, "remarker");
            return (Criteria) this;
        }

        public Criteria andRemarkerNotIn(List<Integer> values) {
            addCriterion("remarker not in", values, "remarker");
            return (Criteria) this;
        }

        public Criteria andRemarkerBetween(Integer value1, Integer value2) {
            addCriterion("remarker between", value1, value2, "remarker");
            return (Criteria) this;
        }

        public Criteria andRemarkerNotBetween(Integer value1, Integer value2) {
            addCriterion("remarker not between", value1, value2, "remarker");
            return (Criteria) this;
        }

        public Criteria andRemarkContentIsNull() {
            addCriterion("remark_content is null");
            return (Criteria) this;
        }

        public Criteria andRemarkContentIsNotNull() {
            addCriterion("remark_content is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkContentEqualTo(String value) {
            addCriterion("remark_content =", value, "remarkContent");
            return (Criteria) this;
        }

        public Criteria andRemarkContentNotEqualTo(String value) {
            addCriterion("remark_content <>", value, "remarkContent");
            return (Criteria) this;
        }

        public Criteria andRemarkContentGreaterThan(String value) {
            addCriterion("remark_content >", value, "remarkContent");
            return (Criteria) this;
        }

        public Criteria andRemarkContentGreaterThanOrEqualTo(String value) {
            addCriterion("remark_content >=", value, "remarkContent");
            return (Criteria) this;
        }

        public Criteria andRemarkContentLessThan(String value) {
            addCriterion("remark_content <", value, "remarkContent");
            return (Criteria) this;
        }

        public Criteria andRemarkContentLessThanOrEqualTo(String value) {
            addCriterion("remark_content <=", value, "remarkContent");
            return (Criteria) this;
        }

        public Criteria andRemarkContentLike(String value) {
            addCriterion("remark_content like", value, "remarkContent");
            return (Criteria) this;
        }

        public Criteria andRemarkContentNotLike(String value) {
            addCriterion("remark_content not like", value, "remarkContent");
            return (Criteria) this;
        }

        public Criteria andRemarkContentIn(List<String> values) {
            addCriterion("remark_content in", values, "remarkContent");
            return (Criteria) this;
        }

        public Criteria andRemarkContentNotIn(List<String> values) {
            addCriterion("remark_content not in", values, "remarkContent");
            return (Criteria) this;
        }

        public Criteria andRemarkContentBetween(String value1, String value2) {
            addCriterion("remark_content between", value1, value2, "remarkContent");
            return (Criteria) this;
        }

        public Criteria andRemarkContentNotBetween(String value1, String value2) {
            addCriterion("remark_content not between", value1, value2, "remarkContent");
            return (Criteria) this;
        }

        public Criteria andRemarkTimeIsNull() {
            addCriterion("remark_time is null");
            return (Criteria) this;
        }

        public Criteria andRemarkTimeIsNotNull() {
            addCriterion("remark_time is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkTimeEqualTo(Date value) {
            addCriterion("remark_time =", value, "remarkTime");
            return (Criteria) this;
        }

        public Criteria andRemarkTimeNotEqualTo(Date value) {
            addCriterion("remark_time <>", value, "remarkTime");
            return (Criteria) this;
        }

        public Criteria andRemarkTimeGreaterThan(Date value) {
            addCriterion("remark_time >", value, "remarkTime");
            return (Criteria) this;
        }

        public Criteria andRemarkTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("remark_time >=", value, "remarkTime");
            return (Criteria) this;
        }

        public Criteria andRemarkTimeLessThan(Date value) {
            addCriterion("remark_time <", value, "remarkTime");
            return (Criteria) this;
        }

        public Criteria andRemarkTimeLessThanOrEqualTo(Date value) {
            addCriterion("remark_time <=", value, "remarkTime");
            return (Criteria) this;
        }

        public Criteria andRemarkTimeIn(List<Date> values) {
            addCriterion("remark_time in", values, "remarkTime");
            return (Criteria) this;
        }

        public Criteria andRemarkTimeNotIn(List<Date> values) {
            addCriterion("remark_time not in", values, "remarkTime");
            return (Criteria) this;
        }

        public Criteria andRemarkTimeBetween(Date value1, Date value2) {
            addCriterion("remark_time between", value1, value2, "remarkTime");
            return (Criteria) this;
        }

        public Criteria andRemarkTimeNotBetween(Date value1, Date value2) {
            addCriterion("remark_time not between", value1, value2, "remarkTime");
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