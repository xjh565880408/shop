package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UpkeepplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UpkeepplanExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUpkeepidIsNull() {
            addCriterion("upkeepId is null");
            return (Criteria) this;
        }

        public Criteria andUpkeepidIsNotNull() {
            addCriterion("upkeepId is not null");
            return (Criteria) this;
        }

        public Criteria andUpkeepidEqualTo(Integer value) {
            addCriterion("upkeepId =", value, "upkeepid");
            return (Criteria) this;
        }

        public Criteria andUpkeepidNotEqualTo(Integer value) {
            addCriterion("upkeepId <>", value, "upkeepid");
            return (Criteria) this;
        }

        public Criteria andUpkeepidGreaterThan(Integer value) {
            addCriterion("upkeepId >", value, "upkeepid");
            return (Criteria) this;
        }

        public Criteria andUpkeepidGreaterThanOrEqualTo(Integer value) {
            addCriterion("upkeepId >=", value, "upkeepid");
            return (Criteria) this;
        }

        public Criteria andUpkeepidLessThan(Integer value) {
            addCriterion("upkeepId <", value, "upkeepid");
            return (Criteria) this;
        }

        public Criteria andUpkeepidLessThanOrEqualTo(Integer value) {
            addCriterion("upkeepId <=", value, "upkeepid");
            return (Criteria) this;
        }

        public Criteria andUpkeepidIn(List<Integer> values) {
            addCriterion("upkeepId in", values, "upkeepid");
            return (Criteria) this;
        }

        public Criteria andUpkeepidNotIn(List<Integer> values) {
            addCriterion("upkeepId not in", values, "upkeepid");
            return (Criteria) this;
        }

        public Criteria andUpkeepidBetween(Integer value1, Integer value2) {
            addCriterion("upkeepId between", value1, value2, "upkeepid");
            return (Criteria) this;
        }

        public Criteria andUpkeepidNotBetween(Integer value1, Integer value2) {
            addCriterion("upkeepId not between", value1, value2, "upkeepid");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeIsNull() {
            addCriterion("planStartTime is null");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeIsNotNull() {
            addCriterion("planStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("planStartTime =", value, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("planStartTime <>", value, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("planStartTime >", value, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("planStartTime >=", value, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeLessThan(Date value) {
            addCriterionForJDBCDate("planStartTime <", value, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("planStartTime <=", value, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("planStartTime in", values, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("planStartTime not in", values, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("planStartTime between", value1, value2, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andPlanstarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("planStartTime not between", value1, value2, "planstarttime");
            return (Criteria) this;
        }

        public Criteria andExpectantperiodIsNull() {
            addCriterion("expectantPeriod is null");
            return (Criteria) this;
        }

        public Criteria andExpectantperiodIsNotNull() {
            addCriterion("expectantPeriod is not null");
            return (Criteria) this;
        }

        public Criteria andExpectantperiodEqualTo(String value) {
            addCriterion("expectantPeriod =", value, "expectantperiod");
            return (Criteria) this;
        }

        public Criteria andExpectantperiodNotEqualTo(String value) {
            addCriterion("expectantPeriod <>", value, "expectantperiod");
            return (Criteria) this;
        }

        public Criteria andExpectantperiodGreaterThan(String value) {
            addCriterion("expectantPeriod >", value, "expectantperiod");
            return (Criteria) this;
        }

        public Criteria andExpectantperiodGreaterThanOrEqualTo(String value) {
            addCriterion("expectantPeriod >=", value, "expectantperiod");
            return (Criteria) this;
        }

        public Criteria andExpectantperiodLessThan(String value) {
            addCriterion("expectantPeriod <", value, "expectantperiod");
            return (Criteria) this;
        }

        public Criteria andExpectantperiodLessThanOrEqualTo(String value) {
            addCriterion("expectantPeriod <=", value, "expectantperiod");
            return (Criteria) this;
        }

        public Criteria andExpectantperiodLike(String value) {
            addCriterion("expectantPeriod like", value, "expectantperiod");
            return (Criteria) this;
        }

        public Criteria andExpectantperiodNotLike(String value) {
            addCriterion("expectantPeriod not like", value, "expectantperiod");
            return (Criteria) this;
        }

        public Criteria andExpectantperiodIn(List<String> values) {
            addCriterion("expectantPeriod in", values, "expectantperiod");
            return (Criteria) this;
        }

        public Criteria andExpectantperiodNotIn(List<String> values) {
            addCriterion("expectantPeriod not in", values, "expectantperiod");
            return (Criteria) this;
        }

        public Criteria andExpectantperiodBetween(String value1, String value2) {
            addCriterion("expectantPeriod between", value1, value2, "expectantperiod");
            return (Criteria) this;
        }

        public Criteria andExpectantperiodNotBetween(String value1, String value2) {
            addCriterion("expectantPeriod not between", value1, value2, "expectantperiod");
            return (Criteria) this;
        }

        public Criteria andExpectantfeesIsNull() {
            addCriterion("expectantFees is null");
            return (Criteria) this;
        }

        public Criteria andExpectantfeesIsNotNull() {
            addCriterion("expectantFees is not null");
            return (Criteria) this;
        }

        public Criteria andExpectantfeesEqualTo(Double value) {
            addCriterion("expectantFees =", value, "expectantfees");
            return (Criteria) this;
        }

        public Criteria andExpectantfeesNotEqualTo(Double value) {
            addCriterion("expectantFees <>", value, "expectantfees");
            return (Criteria) this;
        }

        public Criteria andExpectantfeesGreaterThan(Double value) {
            addCriterion("expectantFees >", value, "expectantfees");
            return (Criteria) this;
        }

        public Criteria andExpectantfeesGreaterThanOrEqualTo(Double value) {
            addCriterion("expectantFees >=", value, "expectantfees");
            return (Criteria) this;
        }

        public Criteria andExpectantfeesLessThan(Double value) {
            addCriterion("expectantFees <", value, "expectantfees");
            return (Criteria) this;
        }

        public Criteria andExpectantfeesLessThanOrEqualTo(Double value) {
            addCriterion("expectantFees <=", value, "expectantfees");
            return (Criteria) this;
        }

        public Criteria andExpectantfeesIn(List<Double> values) {
            addCriterion("expectantFees in", values, "expectantfees");
            return (Criteria) this;
        }

        public Criteria andExpectantfeesNotIn(List<Double> values) {
            addCriterion("expectantFees not in", values, "expectantfees");
            return (Criteria) this;
        }

        public Criteria andExpectantfeesBetween(Double value1, Double value2) {
            addCriterion("expectantFees between", value1, value2, "expectantfees");
            return (Criteria) this;
        }

        public Criteria andExpectantfeesNotBetween(Double value1, Double value2) {
            addCriterion("expectantFees not between", value1, value2, "expectantfees");
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