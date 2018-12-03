package com.ljm.bean;

import java.util.ArrayList;
import java.util.List;

public class WorksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorksExample() {
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

        public Criteria andWorksIdIsNull() {
            addCriterion("works_id is null");
            return (Criteria) this;
        }

        public Criteria andWorksIdIsNotNull() {
            addCriterion("works_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorksIdEqualTo(Integer value) {
            addCriterion("works_id =", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdNotEqualTo(Integer value) {
            addCriterion("works_id <>", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdGreaterThan(Integer value) {
            addCriterion("works_id >", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("works_id >=", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdLessThan(Integer value) {
            addCriterion("works_id <", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdLessThanOrEqualTo(Integer value) {
            addCriterion("works_id <=", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdIn(List<Integer> values) {
            addCriterion("works_id in", values, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdNotIn(List<Integer> values) {
            addCriterion("works_id not in", values, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdBetween(Integer value1, Integer value2) {
            addCriterion("works_id between", value1, value2, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdNotBetween(Integer value1, Integer value2) {
            addCriterion("works_id not between", value1, value2, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksTitleIsNull() {
            addCriterion("works_title is null");
            return (Criteria) this;
        }

        public Criteria andWorksTitleIsNotNull() {
            addCriterion("works_title is not null");
            return (Criteria) this;
        }

        public Criteria andWorksTitleEqualTo(String value) {
            addCriterion("works_title =", value, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleNotEqualTo(String value) {
            addCriterion("works_title <>", value, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleGreaterThan(String value) {
            addCriterion("works_title >", value, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleGreaterThanOrEqualTo(String value) {
            addCriterion("works_title >=", value, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleLessThan(String value) {
            addCriterion("works_title <", value, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleLessThanOrEqualTo(String value) {
            addCriterion("works_title <=", value, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleLike(String value) {
            addCriterion("works_title like", value, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleNotLike(String value) {
            addCriterion("works_title not like", value, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleIn(List<String> values) {
            addCriterion("works_title in", values, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleNotIn(List<String> values) {
            addCriterion("works_title not in", values, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleBetween(String value1, String value2) {
            addCriterion("works_title between", value1, value2, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksTitleNotBetween(String value1, String value2) {
            addCriterion("works_title not between", value1, value2, "worksTitle");
            return (Criteria) this;
        }

        public Criteria andWorksIntrIsNull() {
            addCriterion("works_intr is null");
            return (Criteria) this;
        }

        public Criteria andWorksIntrIsNotNull() {
            addCriterion("works_intr is not null");
            return (Criteria) this;
        }

        public Criteria andWorksIntrEqualTo(String value) {
            addCriterion("works_intr =", value, "worksIntr");
            return (Criteria) this;
        }

        public Criteria andWorksIntrNotEqualTo(String value) {
            addCriterion("works_intr <>", value, "worksIntr");
            return (Criteria) this;
        }

        public Criteria andWorksIntrGreaterThan(String value) {
            addCriterion("works_intr >", value, "worksIntr");
            return (Criteria) this;
        }

        public Criteria andWorksIntrGreaterThanOrEqualTo(String value) {
            addCriterion("works_intr >=", value, "worksIntr");
            return (Criteria) this;
        }

        public Criteria andWorksIntrLessThan(String value) {
            addCriterion("works_intr <", value, "worksIntr");
            return (Criteria) this;
        }

        public Criteria andWorksIntrLessThanOrEqualTo(String value) {
            addCriterion("works_intr <=", value, "worksIntr");
            return (Criteria) this;
        }

        public Criteria andWorksIntrLike(String value) {
            addCriterion("works_intr like", value, "worksIntr");
            return (Criteria) this;
        }

        public Criteria andWorksIntrNotLike(String value) {
            addCriterion("works_intr not like", value, "worksIntr");
            return (Criteria) this;
        }

        public Criteria andWorksIntrIn(List<String> values) {
            addCriterion("works_intr in", values, "worksIntr");
            return (Criteria) this;
        }

        public Criteria andWorksIntrNotIn(List<String> values) {
            addCriterion("works_intr not in", values, "worksIntr");
            return (Criteria) this;
        }

        public Criteria andWorksIntrBetween(String value1, String value2) {
            addCriterion("works_intr between", value1, value2, "worksIntr");
            return (Criteria) this;
        }

        public Criteria andWorksIntrNotBetween(String value1, String value2) {
            addCriterion("works_intr not between", value1, value2, "worksIntr");
            return (Criteria) this;
        }

        public Criteria andWorksImgsIsNull() {
            addCriterion("works_imgs is null");
            return (Criteria) this;
        }

        public Criteria andWorksImgsIsNotNull() {
            addCriterion("works_imgs is not null");
            return (Criteria) this;
        }

        public Criteria andWorksImgsEqualTo(Integer value) {
            addCriterion("works_imgs =", value, "worksImgs");
            return (Criteria) this;
        }

        public Criteria andWorksImgsNotEqualTo(Integer value) {
            addCriterion("works_imgs <>", value, "worksImgs");
            return (Criteria) this;
        }

        public Criteria andWorksImgsGreaterThan(Integer value) {
            addCriterion("works_imgs >", value, "worksImgs");
            return (Criteria) this;
        }

        public Criteria andWorksImgsGreaterThanOrEqualTo(Integer value) {
            addCriterion("works_imgs >=", value, "worksImgs");
            return (Criteria) this;
        }

        public Criteria andWorksImgsLessThan(Integer value) {
            addCriterion("works_imgs <", value, "worksImgs");
            return (Criteria) this;
        }

        public Criteria andWorksImgsLessThanOrEqualTo(Integer value) {
            addCriterion("works_imgs <=", value, "worksImgs");
            return (Criteria) this;
        }

        public Criteria andWorksImgsIn(List<Integer> values) {
            addCriterion("works_imgs in", values, "worksImgs");
            return (Criteria) this;
        }

        public Criteria andWorksImgsNotIn(List<Integer> values) {
            addCriterion("works_imgs not in", values, "worksImgs");
            return (Criteria) this;
        }

        public Criteria andWorksImgsBetween(Integer value1, Integer value2) {
            addCriterion("works_imgs between", value1, value2, "worksImgs");
            return (Criteria) this;
        }

        public Criteria andWorksImgsNotBetween(Integer value1, Integer value2) {
            addCriterion("works_imgs not between", value1, value2, "worksImgs");
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