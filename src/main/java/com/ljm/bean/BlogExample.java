package com.ljm.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogExample() {
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

        public Criteria andBlogWriterIsNull() {
            addCriterion("blog_writer is null");
            return (Criteria) this;
        }

        public Criteria andBlogWriterIsNotNull() {
            addCriterion("blog_writer is not null");
            return (Criteria) this;
        }

        public Criteria andBlogWriterEqualTo(Integer value) {
            addCriterion("blog_writer =", value, "blogWriter");
            return (Criteria) this;
        }

        public Criteria andBlogWriterNotEqualTo(Integer value) {
            addCriterion("blog_writer <>", value, "blogWriter");
            return (Criteria) this;
        }

        public Criteria andBlogWriterGreaterThan(Integer value) {
            addCriterion("blog_writer >", value, "blogWriter");
            return (Criteria) this;
        }

        public Criteria andBlogWriterGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_writer >=", value, "blogWriter");
            return (Criteria) this;
        }

        public Criteria andBlogWriterLessThan(Integer value) {
            addCriterion("blog_writer <", value, "blogWriter");
            return (Criteria) this;
        }

        public Criteria andBlogWriterLessThanOrEqualTo(Integer value) {
            addCriterion("blog_writer <=", value, "blogWriter");
            return (Criteria) this;
        }

        public Criteria andBlogWriterIn(List<Integer> values) {
            addCriterion("blog_writer in", values, "blogWriter");
            return (Criteria) this;
        }

        public Criteria andBlogWriterNotIn(List<Integer> values) {
            addCriterion("blog_writer not in", values, "blogWriter");
            return (Criteria) this;
        }

        public Criteria andBlogWriterBetween(Integer value1, Integer value2) {
            addCriterion("blog_writer between", value1, value2, "blogWriter");
            return (Criteria) this;
        }

        public Criteria andBlogWriterNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_writer not between", value1, value2, "blogWriter");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNull() {
            addCriterion("blog_title is null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNotNull() {
            addCriterion("blog_title is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleEqualTo(String value) {
            addCriterion("blog_title =", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotEqualTo(String value) {
            addCriterion("blog_title <>", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThan(String value) {
            addCriterion("blog_title >", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThanOrEqualTo(String value) {
            addCriterion("blog_title >=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThan(String value) {
            addCriterion("blog_title <", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThanOrEqualTo(String value) {
            addCriterion("blog_title <=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLike(String value) {
            addCriterion("blog_title like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotLike(String value) {
            addCriterion("blog_title not like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIn(List<String> values) {
            addCriterion("blog_title in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotIn(List<String> values) {
            addCriterion("blog_title not in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleBetween(String value1, String value2) {
            addCriterion("blog_title between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotBetween(String value1, String value2) {
            addCriterion("blog_title not between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogContentIsNull() {
            addCriterion("blog_content is null");
            return (Criteria) this;
        }

        public Criteria andBlogContentIsNotNull() {
            addCriterion("blog_content is not null");
            return (Criteria) this;
        }

        public Criteria andBlogContentEqualTo(String value) {
            addCriterion("blog_content =", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotEqualTo(String value) {
            addCriterion("blog_content <>", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentGreaterThan(String value) {
            addCriterion("blog_content >", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentGreaterThanOrEqualTo(String value) {
            addCriterion("blog_content >=", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLessThan(String value) {
            addCriterion("blog_content <", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLessThanOrEqualTo(String value) {
            addCriterion("blog_content <=", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLike(String value) {
            addCriterion("blog_content like", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotLike(String value) {
            addCriterion("blog_content not like", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentIn(List<String> values) {
            addCriterion("blog_content in", values, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotIn(List<String> values) {
            addCriterion("blog_content not in", values, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentBetween(String value1, String value2) {
            addCriterion("blog_content between", value1, value2, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotBetween(String value1, String value2) {
            addCriterion("blog_content not between", value1, value2, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogImgsIsNull() {
            addCriterion("blog_imgs is null");
            return (Criteria) this;
        }

        public Criteria andBlogImgsIsNotNull() {
            addCriterion("blog_imgs is not null");
            return (Criteria) this;
        }

        public Criteria andBlogImgsEqualTo(Integer value) {
            addCriterion("blog_imgs =", value, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsNotEqualTo(Integer value) {
            addCriterion("blog_imgs <>", value, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsGreaterThan(Integer value) {
            addCriterion("blog_imgs >", value, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_imgs >=", value, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsLessThan(Integer value) {
            addCriterion("blog_imgs <", value, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsLessThanOrEqualTo(Integer value) {
            addCriterion("blog_imgs <=", value, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsIn(List<Integer> values) {
            addCriterion("blog_imgs in", values, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsNotIn(List<Integer> values) {
            addCriterion("blog_imgs not in", values, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsBetween(Integer value1, Integer value2) {
            addCriterion("blog_imgs between", value1, value2, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andBlogImgsNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_imgs not between", value1, value2, "blogImgs");
            return (Criteria) this;
        }

        public Criteria andWriteTimeIsNull() {
            addCriterion("write_time is null");
            return (Criteria) this;
        }

        public Criteria andWriteTimeIsNotNull() {
            addCriterion("write_time is not null");
            return (Criteria) this;
        }

        public Criteria andWriteTimeEqualTo(Date value) {
            addCriterion("write_time =", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeNotEqualTo(Date value) {
            addCriterion("write_time <>", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeGreaterThan(Date value) {
            addCriterion("write_time >", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("write_time >=", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeLessThan(Date value) {
            addCriterion("write_time <", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeLessThanOrEqualTo(Date value) {
            addCriterion("write_time <=", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeIn(List<Date> values) {
            addCriterion("write_time in", values, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeNotIn(List<Date> values) {
            addCriterion("write_time not in", values, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeBetween(Date value1, Date value2) {
            addCriterion("write_time between", value1, value2, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeNotBetween(Date value1, Date value2) {
            addCriterion("write_time not between", value1, value2, "writeTime");
            return (Criteria) this;
        }

        public Criteria andLookNumsIsNull() {
            addCriterion("look_nums is null");
            return (Criteria) this;
        }

        public Criteria andLookNumsIsNotNull() {
            addCriterion("look_nums is not null");
            return (Criteria) this;
        }

        public Criteria andLookNumsEqualTo(Integer value) {
            addCriterion("look_nums =", value, "lookNums");
            return (Criteria) this;
        }

        public Criteria andLookNumsNotEqualTo(Integer value) {
            addCriterion("look_nums <>", value, "lookNums");
            return (Criteria) this;
        }

        public Criteria andLookNumsGreaterThan(Integer value) {
            addCriterion("look_nums >", value, "lookNums");
            return (Criteria) this;
        }

        public Criteria andLookNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("look_nums >=", value, "lookNums");
            return (Criteria) this;
        }

        public Criteria andLookNumsLessThan(Integer value) {
            addCriterion("look_nums <", value, "lookNums");
            return (Criteria) this;
        }

        public Criteria andLookNumsLessThanOrEqualTo(Integer value) {
            addCriterion("look_nums <=", value, "lookNums");
            return (Criteria) this;
        }

        public Criteria andLookNumsIn(List<Integer> values) {
            addCriterion("look_nums in", values, "lookNums");
            return (Criteria) this;
        }

        public Criteria andLookNumsNotIn(List<Integer> values) {
            addCriterion("look_nums not in", values, "lookNums");
            return (Criteria) this;
        }

        public Criteria andLookNumsBetween(Integer value1, Integer value2) {
            addCriterion("look_nums between", value1, value2, "lookNums");
            return (Criteria) this;
        }

        public Criteria andLookNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("look_nums not between", value1, value2, "lookNums");
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