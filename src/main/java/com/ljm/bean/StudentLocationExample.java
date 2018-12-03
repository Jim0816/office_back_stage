package com.ljm.bean;

import java.util.ArrayList;
import java.util.List;

public class StudentLocationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentLocationExample() {
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

        public Criteria andStudentLocationIdIsNull() {
            addCriterion("student_location_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentLocationIdIsNotNull() {
            addCriterion("student_location_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentLocationIdEqualTo(Integer value) {
            addCriterion("student_location_id =", value, "studentLocationId");
            return (Criteria) this;
        }

        public Criteria andStudentLocationIdNotEqualTo(Integer value) {
            addCriterion("student_location_id <>", value, "studentLocationId");
            return (Criteria) this;
        }

        public Criteria andStudentLocationIdGreaterThan(Integer value) {
            addCriterion("student_location_id >", value, "studentLocationId");
            return (Criteria) this;
        }

        public Criteria andStudentLocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_location_id >=", value, "studentLocationId");
            return (Criteria) this;
        }

        public Criteria andStudentLocationIdLessThan(Integer value) {
            addCriterion("student_location_id <", value, "studentLocationId");
            return (Criteria) this;
        }

        public Criteria andStudentLocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_location_id <=", value, "studentLocationId");
            return (Criteria) this;
        }

        public Criteria andStudentLocationIdIn(List<Integer> values) {
            addCriterion("student_location_id in", values, "studentLocationId");
            return (Criteria) this;
        }

        public Criteria andStudentLocationIdNotIn(List<Integer> values) {
            addCriterion("student_location_id not in", values, "studentLocationId");
            return (Criteria) this;
        }

        public Criteria andStudentLocationIdBetween(Integer value1, Integer value2) {
            addCriterion("student_location_id between", value1, value2, "studentLocationId");
            return (Criteria) this;
        }

        public Criteria andStudentLocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_location_id not between", value1, value2, "studentLocationId");
            return (Criteria) this;
        }

        public Criteria andStuAcademyIsNull() {
            addCriterion("stu_academy is null");
            return (Criteria) this;
        }

        public Criteria andStuAcademyIsNotNull() {
            addCriterion("stu_academy is not null");
            return (Criteria) this;
        }

        public Criteria andStuAcademyEqualTo(String value) {
            addCriterion("stu_academy =", value, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyNotEqualTo(String value) {
            addCriterion("stu_academy <>", value, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyGreaterThan(String value) {
            addCriterion("stu_academy >", value, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyGreaterThanOrEqualTo(String value) {
            addCriterion("stu_academy >=", value, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyLessThan(String value) {
            addCriterion("stu_academy <", value, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyLessThanOrEqualTo(String value) {
            addCriterion("stu_academy <=", value, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyLike(String value) {
            addCriterion("stu_academy like", value, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyNotLike(String value) {
            addCriterion("stu_academy not like", value, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyIn(List<String> values) {
            addCriterion("stu_academy in", values, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyNotIn(List<String> values) {
            addCriterion("stu_academy not in", values, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyBetween(String value1, String value2) {
            addCriterion("stu_academy between", value1, value2, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuAcademyNotBetween(String value1, String value2) {
            addCriterion("stu_academy not between", value1, value2, "stuAcademy");
            return (Criteria) this;
        }

        public Criteria andStuGradeIsNull() {
            addCriterion("stu_grade is null");
            return (Criteria) this;
        }

        public Criteria andStuGradeIsNotNull() {
            addCriterion("stu_grade is not null");
            return (Criteria) this;
        }

        public Criteria andStuGradeEqualTo(String value) {
            addCriterion("stu_grade =", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotEqualTo(String value) {
            addCriterion("stu_grade <>", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeGreaterThan(String value) {
            addCriterion("stu_grade >", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeGreaterThanOrEqualTo(String value) {
            addCriterion("stu_grade >=", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeLessThan(String value) {
            addCriterion("stu_grade <", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeLessThanOrEqualTo(String value) {
            addCriterion("stu_grade <=", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeLike(String value) {
            addCriterion("stu_grade like", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotLike(String value) {
            addCriterion("stu_grade not like", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeIn(List<String> values) {
            addCriterion("stu_grade in", values, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotIn(List<String> values) {
            addCriterion("stu_grade not in", values, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeBetween(String value1, String value2) {
            addCriterion("stu_grade between", value1, value2, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotBetween(String value1, String value2) {
            addCriterion("stu_grade not between", value1, value2, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuClassIsNull() {
            addCriterion("stu_class is null");
            return (Criteria) this;
        }

        public Criteria andStuClassIsNotNull() {
            addCriterion("stu_class is not null");
            return (Criteria) this;
        }

        public Criteria andStuClassEqualTo(String value) {
            addCriterion("stu_class =", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotEqualTo(String value) {
            addCriterion("stu_class <>", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassGreaterThan(String value) {
            addCriterion("stu_class >", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassGreaterThanOrEqualTo(String value) {
            addCriterion("stu_class >=", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLessThan(String value) {
            addCriterion("stu_class <", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLessThanOrEqualTo(String value) {
            addCriterion("stu_class <=", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassLike(String value) {
            addCriterion("stu_class like", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotLike(String value) {
            addCriterion("stu_class not like", value, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassIn(List<String> values) {
            addCriterion("stu_class in", values, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotIn(List<String> values) {
            addCriterion("stu_class not in", values, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassBetween(String value1, String value2) {
            addCriterion("stu_class between", value1, value2, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStuClassNotBetween(String value1, String value2) {
            addCriterion("stu_class not between", value1, value2, "stuClass");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
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