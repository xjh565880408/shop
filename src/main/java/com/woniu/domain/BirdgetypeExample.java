package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class BirdgetypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BirdgetypeExample() {
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

        public Criteria andBridgetypeidIsNull() {
            addCriterion("bridgeTypeId is null");
            return (Criteria) this;
        }

        public Criteria andBridgetypeidIsNotNull() {
            addCriterion("bridgeTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andBridgetypeidEqualTo(Integer value) {
            addCriterion("bridgeTypeId =", value, "bridgetypeid");
            return (Criteria) this;
        }

        public Criteria andBridgetypeidNotEqualTo(Integer value) {
            addCriterion("bridgeTypeId <>", value, "bridgetypeid");
            return (Criteria) this;
        }

        public Criteria andBridgetypeidGreaterThan(Integer value) {
            addCriterion("bridgeTypeId >", value, "bridgetypeid");
            return (Criteria) this;
        }

        public Criteria andBridgetypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bridgeTypeId >=", value, "bridgetypeid");
            return (Criteria) this;
        }

        public Criteria andBridgetypeidLessThan(Integer value) {
            addCriterion("bridgeTypeId <", value, "bridgetypeid");
            return (Criteria) this;
        }

        public Criteria andBridgetypeidLessThanOrEqualTo(Integer value) {
            addCriterion("bridgeTypeId <=", value, "bridgetypeid");
            return (Criteria) this;
        }

        public Criteria andBridgetypeidIn(List<Integer> values) {
            addCriterion("bridgeTypeId in", values, "bridgetypeid");
            return (Criteria) this;
        }

        public Criteria andBridgetypeidNotIn(List<Integer> values) {
            addCriterion("bridgeTypeId not in", values, "bridgetypeid");
            return (Criteria) this;
        }

        public Criteria andBridgetypeidBetween(Integer value1, Integer value2) {
            addCriterion("bridgeTypeId between", value1, value2, "bridgetypeid");
            return (Criteria) this;
        }

        public Criteria andBridgetypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("bridgeTypeId not between", value1, value2, "bridgetypeid");
            return (Criteria) this;
        }

        public Criteria andBirdgetypenameIsNull() {
            addCriterion("birdgeTypeName is null");
            return (Criteria) this;
        }

        public Criteria andBirdgetypenameIsNotNull() {
            addCriterion("birdgeTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andBirdgetypenameEqualTo(String value) {
            addCriterion("birdgeTypeName =", value, "birdgetypename");
            return (Criteria) this;
        }

        public Criteria andBirdgetypenameNotEqualTo(String value) {
            addCriterion("birdgeTypeName <>", value, "birdgetypename");
            return (Criteria) this;
        }

        public Criteria andBirdgetypenameGreaterThan(String value) {
            addCriterion("birdgeTypeName >", value, "birdgetypename");
            return (Criteria) this;
        }

        public Criteria andBirdgetypenameGreaterThanOrEqualTo(String value) {
            addCriterion("birdgeTypeName >=", value, "birdgetypename");
            return (Criteria) this;
        }

        public Criteria andBirdgetypenameLessThan(String value) {
            addCriterion("birdgeTypeName <", value, "birdgetypename");
            return (Criteria) this;
        }

        public Criteria andBirdgetypenameLessThanOrEqualTo(String value) {
            addCriterion("birdgeTypeName <=", value, "birdgetypename");
            return (Criteria) this;
        }

        public Criteria andBirdgetypenameLike(String value) {
            addCriterion("birdgeTypeName like", value, "birdgetypename");
            return (Criteria) this;
        }

        public Criteria andBirdgetypenameNotLike(String value) {
            addCriterion("birdgeTypeName not like", value, "birdgetypename");
            return (Criteria) this;
        }

        public Criteria andBirdgetypenameIn(List<String> values) {
            addCriterion("birdgeTypeName in", values, "birdgetypename");
            return (Criteria) this;
        }

        public Criteria andBirdgetypenameNotIn(List<String> values) {
            addCriterion("birdgeTypeName not in", values, "birdgetypename");
            return (Criteria) this;
        }

        public Criteria andBirdgetypenameBetween(String value1, String value2) {
            addCriterion("birdgeTypeName between", value1, value2, "birdgetypename");
            return (Criteria) this;
        }

        public Criteria andBirdgetypenameNotBetween(String value1, String value2) {
            addCriterion("birdgeTypeName not between", value1, value2, "birdgetypename");
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