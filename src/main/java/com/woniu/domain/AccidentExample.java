package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class AccidentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccidentExample() {
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

        public Criteria andAccidentidIsNull() {
            addCriterion("accidentId is null");
            return (Criteria) this;
        }

        public Criteria andAccidentidIsNotNull() {
            addCriterion("accidentId is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentidEqualTo(Integer value) {
            addCriterion("accidentId =", value, "accidentid");
            return (Criteria) this;
        }

        public Criteria andAccidentidNotEqualTo(Integer value) {
            addCriterion("accidentId <>", value, "accidentid");
            return (Criteria) this;
        }

        public Criteria andAccidentidGreaterThan(Integer value) {
            addCriterion("accidentId >", value, "accidentid");
            return (Criteria) this;
        }

        public Criteria andAccidentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("accidentId >=", value, "accidentid");
            return (Criteria) this;
        }

        public Criteria andAccidentidLessThan(Integer value) {
            addCriterion("accidentId <", value, "accidentid");
            return (Criteria) this;
        }

        public Criteria andAccidentidLessThanOrEqualTo(Integer value) {
            addCriterion("accidentId <=", value, "accidentid");
            return (Criteria) this;
        }

        public Criteria andAccidentidIn(List<Integer> values) {
            addCriterion("accidentId in", values, "accidentid");
            return (Criteria) this;
        }

        public Criteria andAccidentidNotIn(List<Integer> values) {
            addCriterion("accidentId not in", values, "accidentid");
            return (Criteria) this;
        }

        public Criteria andAccidentidBetween(Integer value1, Integer value2) {
            addCriterion("accidentId between", value1, value2, "accidentid");
            return (Criteria) this;
        }

        public Criteria andAccidentidNotBetween(Integer value1, Integer value2) {
            addCriterion("accidentId not between", value1, value2, "accidentid");
            return (Criteria) this;
        }

        public Criteria andRecordidIsNull() {
            addCriterion("recordId is null");
            return (Criteria) this;
        }

        public Criteria andRecordidIsNotNull() {
            addCriterion("recordId is not null");
            return (Criteria) this;
        }

        public Criteria andRecordidEqualTo(Integer value) {
            addCriterion("recordId =", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotEqualTo(Integer value) {
            addCriterion("recordId <>", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidGreaterThan(Integer value) {
            addCriterion("recordId >", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidGreaterThanOrEqualTo(Integer value) {
            addCriterion("recordId >=", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidLessThan(Integer value) {
            addCriterion("recordId <", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidLessThanOrEqualTo(Integer value) {
            addCriterion("recordId <=", value, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidIn(List<Integer> values) {
            addCriterion("recordId in", values, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotIn(List<Integer> values) {
            addCriterion("recordId not in", values, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidBetween(Integer value1, Integer value2) {
            addCriterion("recordId between", value1, value2, "recordid");
            return (Criteria) this;
        }

        public Criteria andRecordidNotBetween(Integer value1, Integer value2) {
            addCriterion("recordId not between", value1, value2, "recordid");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeIsNull() {
            addCriterion("accidentType is null");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeIsNotNull() {
            addCriterion("accidentType is not null");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeEqualTo(String value) {
            addCriterion("accidentType =", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeNotEqualTo(String value) {
            addCriterion("accidentType <>", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeGreaterThan(String value) {
            addCriterion("accidentType >", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("accidentType >=", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeLessThan(String value) {
            addCriterion("accidentType <", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeLessThanOrEqualTo(String value) {
            addCriterion("accidentType <=", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeLike(String value) {
            addCriterion("accidentType like", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeNotLike(String value) {
            addCriterion("accidentType not like", value, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeIn(List<String> values) {
            addCriterion("accidentType in", values, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeNotIn(List<String> values) {
            addCriterion("accidentType not in", values, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeBetween(String value1, String value2) {
            addCriterion("accidentType between", value1, value2, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andAccidenttypeNotBetween(String value1, String value2) {
            addCriterion("accidentType not between", value1, value2, "accidenttype");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelIsNull() {
            addCriterion("accidentLevel is null");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelIsNotNull() {
            addCriterion("accidentLevel is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelEqualTo(String value) {
            addCriterion("accidentLevel =", value, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelNotEqualTo(String value) {
            addCriterion("accidentLevel <>", value, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelGreaterThan(String value) {
            addCriterion("accidentLevel >", value, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelGreaterThanOrEqualTo(String value) {
            addCriterion("accidentLevel >=", value, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelLessThan(String value) {
            addCriterion("accidentLevel <", value, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelLessThanOrEqualTo(String value) {
            addCriterion("accidentLevel <=", value, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelLike(String value) {
            addCriterion("accidentLevel like", value, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelNotLike(String value) {
            addCriterion("accidentLevel not like", value, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelIn(List<String> values) {
            addCriterion("accidentLevel in", values, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelNotIn(List<String> values) {
            addCriterion("accidentLevel not in", values, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelBetween(String value1, String value2) {
            addCriterion("accidentLevel between", value1, value2, "accidentlevel");
            return (Criteria) this;
        }

        public Criteria andAccidentlevelNotBetween(String value1, String value2) {
            addCriterion("accidentLevel not between", value1, value2, "accidentlevel");
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