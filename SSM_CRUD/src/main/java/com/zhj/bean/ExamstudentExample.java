package com.zhj.bean;

import java.util.ArrayList;
import java.util.List;

public class ExamstudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamstudentExample() {
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

        public Criteria andFlowidIsNull() {
            addCriterion("FlowID is null");
            return (Criteria) this;
        }

        public Criteria andFlowidIsNotNull() {
            addCriterion("FlowID is not null");
            return (Criteria) this;
        }

        public Criteria andFlowidEqualTo(Integer value) {
            addCriterion("FlowID =", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidNotEqualTo(Integer value) {
            addCriterion("FlowID <>", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidGreaterThan(Integer value) {
            addCriterion("FlowID >", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FlowID >=", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidLessThan(Integer value) {
            addCriterion("FlowID <", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidLessThanOrEqualTo(Integer value) {
            addCriterion("FlowID <=", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidIn(List<Integer> values) {
            addCriterion("FlowID in", values, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidNotIn(List<Integer> values) {
            addCriterion("FlowID not in", values, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidBetween(Integer value1, Integer value2) {
            addCriterion("FlowID between", value1, value2, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidNotBetween(Integer value1, Integer value2) {
            addCriterion("FlowID not between", value1, value2, "flowid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andExamcardIsNull() {
            addCriterion("ExamCard is null");
            return (Criteria) this;
        }

        public Criteria andExamcardIsNotNull() {
            addCriterion("ExamCard is not null");
            return (Criteria) this;
        }

        public Criteria andExamcardEqualTo(String value) {
            addCriterion("ExamCard =", value, "examcard");
            return (Criteria) this;
        }

        public Criteria andExamcardNotEqualTo(String value) {
            addCriterion("ExamCard <>", value, "examcard");
            return (Criteria) this;
        }

        public Criteria andExamcardGreaterThan(String value) {
            addCriterion("ExamCard >", value, "examcard");
            return (Criteria) this;
        }

        public Criteria andExamcardGreaterThanOrEqualTo(String value) {
            addCriterion("ExamCard >=", value, "examcard");
            return (Criteria) this;
        }

        public Criteria andExamcardLessThan(String value) {
            addCriterion("ExamCard <", value, "examcard");
            return (Criteria) this;
        }

        public Criteria andExamcardLessThanOrEqualTo(String value) {
            addCriterion("ExamCard <=", value, "examcard");
            return (Criteria) this;
        }

        public Criteria andExamcardLike(String value) {
            addCriterion("ExamCard like", value, "examcard");
            return (Criteria) this;
        }

        public Criteria andExamcardNotLike(String value) {
            addCriterion("ExamCard not like", value, "examcard");
            return (Criteria) this;
        }

        public Criteria andExamcardIn(List<String> values) {
            addCriterion("ExamCard in", values, "examcard");
            return (Criteria) this;
        }

        public Criteria andExamcardNotIn(List<String> values) {
            addCriterion("ExamCard not in", values, "examcard");
            return (Criteria) this;
        }

        public Criteria andExamcardBetween(String value1, String value2) {
            addCriterion("ExamCard between", value1, value2, "examcard");
            return (Criteria) this;
        }

        public Criteria andExamcardNotBetween(String value1, String value2) {
            addCriterion("ExamCard not between", value1, value2, "examcard");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNull() {
            addCriterion("StudentName is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNotNull() {
            addCriterion("StudentName is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameEqualTo(String value) {
            addCriterion("StudentName =", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotEqualTo(String value) {
            addCriterion("StudentName <>", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThan(String value) {
            addCriterion("StudentName >", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("StudentName >=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThan(String value) {
            addCriterion("StudentName <", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThanOrEqualTo(String value) {
            addCriterion("StudentName <=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLike(String value) {
            addCriterion("StudentName like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotLike(String value) {
            addCriterion("StudentName not like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameIn(List<String> values) {
            addCriterion("StudentName in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotIn(List<String> values) {
            addCriterion("StudentName not in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameBetween(String value1, String value2) {
            addCriterion("StudentName between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotBetween(String value1, String value2) {
            addCriterion("StudentName not between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("Location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("Location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("Location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("Location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("Location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("Location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("Location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("Location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("Location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("Location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("Location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("Location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("Location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("Location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("Grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("Grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("Grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("Grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("Grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("Grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("Grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("Grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("Grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("Grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("Grade not between", value1, value2, "grade");
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