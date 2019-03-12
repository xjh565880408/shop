package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BirdgeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BirdgeExample() {
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

        public Criteria andBirdgenameIsNull() {
            addCriterion("birdgeName is null");
            return (Criteria) this;
        }

        public Criteria andBirdgenameIsNotNull() {
            addCriterion("birdgeName is not null");
            return (Criteria) this;
        }

        public Criteria andBirdgenameEqualTo(String value) {
            addCriterion("birdgeName =", value, "birdgename");
            return (Criteria) this;
        }

        public Criteria andBirdgenameNotEqualTo(String value) {
            addCriterion("birdgeName <>", value, "birdgename");
            return (Criteria) this;
        }

        public Criteria andBirdgenameGreaterThan(String value) {
            addCriterion("birdgeName >", value, "birdgename");
            return (Criteria) this;
        }

        public Criteria andBirdgenameGreaterThanOrEqualTo(String value) {
            addCriterion("birdgeName >=", value, "birdgename");
            return (Criteria) this;
        }

        public Criteria andBirdgenameLessThan(String value) {
            addCriterion("birdgeName <", value, "birdgename");
            return (Criteria) this;
        }

        public Criteria andBirdgenameLessThanOrEqualTo(String value) {
            addCriterion("birdgeName <=", value, "birdgename");
            return (Criteria) this;
        }

        public Criteria andBirdgenameLike(String value) {
            addCriterion("birdgeName like", value, "birdgename");
            return (Criteria) this;
        }

        public Criteria andBirdgenameNotLike(String value) {
            addCriterion("birdgeName not like", value, "birdgename");
            return (Criteria) this;
        }

        public Criteria andBirdgenameIn(List<String> values) {
            addCriterion("birdgeName in", values, "birdgename");
            return (Criteria) this;
        }

        public Criteria andBirdgenameNotIn(List<String> values) {
            addCriterion("birdgeName not in", values, "birdgename");
            return (Criteria) this;
        }

        public Criteria andBirdgenameBetween(String value1, String value2) {
            addCriterion("birdgeName between", value1, value2, "birdgename");
            return (Criteria) this;
        }

        public Criteria andBirdgenameNotBetween(String value1, String value2) {
            addCriterion("birdgeName not between", value1, value2, "birdgename");
            return (Criteria) this;
        }

        public Criteria andBuildtimeIsNull() {
            addCriterion("buildTime is null");
            return (Criteria) this;
        }

        public Criteria andBuildtimeIsNotNull() {
            addCriterion("buildTime is not null");
            return (Criteria) this;
        }

        public Criteria andBuildtimeEqualTo(Date value) {
            addCriterionForJDBCDate("buildTime =", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("buildTime <>", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("buildTime >", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("buildTime >=", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeLessThan(Date value) {
            addCriterionForJDBCDate("buildTime <", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("buildTime <=", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeIn(List<Date> values) {
            addCriterionForJDBCDate("buildTime in", values, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("buildTime not in", values, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("buildTime between", value1, value2, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("buildTime not between", value1, value2, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildcompanyIsNull() {
            addCriterion("buildCompany is null");
            return (Criteria) this;
        }

        public Criteria andBuildcompanyIsNotNull() {
            addCriterion("buildCompany is not null");
            return (Criteria) this;
        }

        public Criteria andBuildcompanyEqualTo(String value) {
            addCriterion("buildCompany =", value, "buildcompany");
            return (Criteria) this;
        }

        public Criteria andBuildcompanyNotEqualTo(String value) {
            addCriterion("buildCompany <>", value, "buildcompany");
            return (Criteria) this;
        }

        public Criteria andBuildcompanyGreaterThan(String value) {
            addCriterion("buildCompany >", value, "buildcompany");
            return (Criteria) this;
        }

        public Criteria andBuildcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("buildCompany >=", value, "buildcompany");
            return (Criteria) this;
        }

        public Criteria andBuildcompanyLessThan(String value) {
            addCriterion("buildCompany <", value, "buildcompany");
            return (Criteria) this;
        }

        public Criteria andBuildcompanyLessThanOrEqualTo(String value) {
            addCriterion("buildCompany <=", value, "buildcompany");
            return (Criteria) this;
        }

        public Criteria andBuildcompanyLike(String value) {
            addCriterion("buildCompany like", value, "buildcompany");
            return (Criteria) this;
        }

        public Criteria andBuildcompanyNotLike(String value) {
            addCriterion("buildCompany not like", value, "buildcompany");
            return (Criteria) this;
        }

        public Criteria andBuildcompanyIn(List<String> values) {
            addCriterion("buildCompany in", values, "buildcompany");
            return (Criteria) this;
        }

        public Criteria andBuildcompanyNotIn(List<String> values) {
            addCriterion("buildCompany not in", values, "buildcompany");
            return (Criteria) this;
        }

        public Criteria andBuildcompanyBetween(String value1, String value2) {
            addCriterion("buildCompany between", value1, value2, "buildcompany");
            return (Criteria) this;
        }

        public Criteria andBuildcompanyNotBetween(String value1, String value2) {
            addCriterion("buildCompany not between", value1, value2, "buildcompany");
            return (Criteria) this;
        }

        public Criteria andMaintenanceperiodIsNull() {
            addCriterion("maintenancePeriod is null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceperiodIsNotNull() {
            addCriterion("maintenancePeriod is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceperiodEqualTo(String value) {
            addCriterion("maintenancePeriod =", value, "maintenanceperiod");
            return (Criteria) this;
        }

        public Criteria andMaintenanceperiodNotEqualTo(String value) {
            addCriterion("maintenancePeriod <>", value, "maintenanceperiod");
            return (Criteria) this;
        }

        public Criteria andMaintenanceperiodGreaterThan(String value) {
            addCriterion("maintenancePeriod >", value, "maintenanceperiod");
            return (Criteria) this;
        }

        public Criteria andMaintenanceperiodGreaterThanOrEqualTo(String value) {
            addCriterion("maintenancePeriod >=", value, "maintenanceperiod");
            return (Criteria) this;
        }

        public Criteria andMaintenanceperiodLessThan(String value) {
            addCriterion("maintenancePeriod <", value, "maintenanceperiod");
            return (Criteria) this;
        }

        public Criteria andMaintenanceperiodLessThanOrEqualTo(String value) {
            addCriterion("maintenancePeriod <=", value, "maintenanceperiod");
            return (Criteria) this;
        }

        public Criteria andMaintenanceperiodLike(String value) {
            addCriterion("maintenancePeriod like", value, "maintenanceperiod");
            return (Criteria) this;
        }

        public Criteria andMaintenanceperiodNotLike(String value) {
            addCriterion("maintenancePeriod not like", value, "maintenanceperiod");
            return (Criteria) this;
        }

        public Criteria andMaintenanceperiodIn(List<String> values) {
            addCriterion("maintenancePeriod in", values, "maintenanceperiod");
            return (Criteria) this;
        }

        public Criteria andMaintenanceperiodNotIn(List<String> values) {
            addCriterion("maintenancePeriod not in", values, "maintenanceperiod");
            return (Criteria) this;
        }

        public Criteria andMaintenanceperiodBetween(String value1, String value2) {
            addCriterion("maintenancePeriod between", value1, value2, "maintenanceperiod");
            return (Criteria) this;
        }

        public Criteria andMaintenanceperiodNotBetween(String value1, String value2) {
            addCriterion("maintenancePeriod not between", value1, value2, "maintenanceperiod");
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