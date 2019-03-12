package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class RoadStructureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoadStructureExample() {
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

        public Criteria andConidIsNull() {
            addCriterion("conid is null");
            return (Criteria) this;
        }

        public Criteria andConidIsNotNull() {
            addCriterion("conid is not null");
            return (Criteria) this;
        }

        public Criteria andConidEqualTo(Integer value) {
            addCriterion("conid =", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidNotEqualTo(Integer value) {
            addCriterion("conid <>", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidGreaterThan(Integer value) {
            addCriterion("conid >", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidGreaterThanOrEqualTo(Integer value) {
            addCriterion("conid >=", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidLessThan(Integer value) {
            addCriterion("conid <", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidLessThanOrEqualTo(Integer value) {
            addCriterion("conid <=", value, "conid");
            return (Criteria) this;
        }

        public Criteria andConidIn(List<Integer> values) {
            addCriterion("conid in", values, "conid");
            return (Criteria) this;
        }

        public Criteria andConidNotIn(List<Integer> values) {
            addCriterion("conid not in", values, "conid");
            return (Criteria) this;
        }

        public Criteria andConidBetween(Integer value1, Integer value2) {
            addCriterion("conid between", value1, value2, "conid");
            return (Criteria) this;
        }

        public Criteria andConidNotBetween(Integer value1, Integer value2) {
            addCriterion("conid not between", value1, value2, "conid");
            return (Criteria) this;
        }

        public Criteria andRoadidIsNull() {
            addCriterion("roadId is null");
            return (Criteria) this;
        }

        public Criteria andRoadidIsNotNull() {
            addCriterion("roadId is not null");
            return (Criteria) this;
        }

        public Criteria andRoadidEqualTo(Integer value) {
            addCriterion("roadId =", value, "roadid");
            return (Criteria) this;
        }

        public Criteria andRoadidNotEqualTo(Integer value) {
            addCriterion("roadId <>", value, "roadid");
            return (Criteria) this;
        }

        public Criteria andRoadidGreaterThan(Integer value) {
            addCriterion("roadId >", value, "roadid");
            return (Criteria) this;
        }

        public Criteria andRoadidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roadId >=", value, "roadid");
            return (Criteria) this;
        }

        public Criteria andRoadidLessThan(Integer value) {
            addCriterion("roadId <", value, "roadid");
            return (Criteria) this;
        }

        public Criteria andRoadidLessThanOrEqualTo(Integer value) {
            addCriterion("roadId <=", value, "roadid");
            return (Criteria) this;
        }

        public Criteria andRoadidIn(List<Integer> values) {
            addCriterion("roadId in", values, "roadid");
            return (Criteria) this;
        }

        public Criteria andRoadidNotIn(List<Integer> values) {
            addCriterion("roadId not in", values, "roadid");
            return (Criteria) this;
        }

        public Criteria andRoadidBetween(Integer value1, Integer value2) {
            addCriterion("roadId between", value1, value2, "roadid");
            return (Criteria) this;
        }

        public Criteria andRoadidNotBetween(Integer value1, Integer value2) {
            addCriterion("roadId not between", value1, value2, "roadid");
            return (Criteria) this;
        }

        public Criteria andBaseidIsNull() {
            addCriterion("baseId is null");
            return (Criteria) this;
        }

        public Criteria andBaseidIsNotNull() {
            addCriterion("baseId is not null");
            return (Criteria) this;
        }

        public Criteria andBaseidEqualTo(Integer value) {
            addCriterion("baseId =", value, "baseid");
            return (Criteria) this;
        }

        public Criteria andBaseidNotEqualTo(Integer value) {
            addCriterion("baseId <>", value, "baseid");
            return (Criteria) this;
        }

        public Criteria andBaseidGreaterThan(Integer value) {
            addCriterion("baseId >", value, "baseid");
            return (Criteria) this;
        }

        public Criteria andBaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("baseId >=", value, "baseid");
            return (Criteria) this;
        }

        public Criteria andBaseidLessThan(Integer value) {
            addCriterion("baseId <", value, "baseid");
            return (Criteria) this;
        }

        public Criteria andBaseidLessThanOrEqualTo(Integer value) {
            addCriterion("baseId <=", value, "baseid");
            return (Criteria) this;
        }

        public Criteria andBaseidIn(List<Integer> values) {
            addCriterion("baseId in", values, "baseid");
            return (Criteria) this;
        }

        public Criteria andBaseidNotIn(List<Integer> values) {
            addCriterion("baseId not in", values, "baseid");
            return (Criteria) this;
        }

        public Criteria andBaseidBetween(Integer value1, Integer value2) {
            addCriterion("baseId between", value1, value2, "baseid");
            return (Criteria) this;
        }

        public Criteria andBaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("baseId not between", value1, value2, "baseid");
            return (Criteria) this;
        }

        public Criteria andBirdgeidIsNull() {
            addCriterion("birdgeId is null");
            return (Criteria) this;
        }

        public Criteria andBirdgeidIsNotNull() {
            addCriterion("birdgeId is not null");
            return (Criteria) this;
        }

        public Criteria andBirdgeidEqualTo(Integer value) {
            addCriterion("birdgeId =", value, "birdgeid");
            return (Criteria) this;
        }

        public Criteria andBirdgeidNotEqualTo(Integer value) {
            addCriterion("birdgeId <>", value, "birdgeid");
            return (Criteria) this;
        }

        public Criteria andBirdgeidGreaterThan(Integer value) {
            addCriterion("birdgeId >", value, "birdgeid");
            return (Criteria) this;
        }

        public Criteria andBirdgeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("birdgeId >=", value, "birdgeid");
            return (Criteria) this;
        }

        public Criteria andBirdgeidLessThan(Integer value) {
            addCriterion("birdgeId <", value, "birdgeid");
            return (Criteria) this;
        }

        public Criteria andBirdgeidLessThanOrEqualTo(Integer value) {
            addCriterion("birdgeId <=", value, "birdgeid");
            return (Criteria) this;
        }

        public Criteria andBirdgeidIn(List<Integer> values) {
            addCriterion("birdgeId in", values, "birdgeid");
            return (Criteria) this;
        }

        public Criteria andBirdgeidNotIn(List<Integer> values) {
            addCriterion("birdgeId not in", values, "birdgeid");
            return (Criteria) this;
        }

        public Criteria andBirdgeidBetween(Integer value1, Integer value2) {
            addCriterion("birdgeId between", value1, value2, "birdgeid");
            return (Criteria) this;
        }

        public Criteria andBirdgeidNotBetween(Integer value1, Integer value2) {
            addCriterion("birdgeId not between", value1, value2, "birdgeid");
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