package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InspectrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspectrecordExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
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

        public Criteria andRespecttimeIsNull() {
            addCriterion("respectTime is null");
            return (Criteria) this;
        }

        public Criteria andRespecttimeIsNotNull() {
            addCriterion("respectTime is not null");
            return (Criteria) this;
        }

        public Criteria andRespecttimeEqualTo(Date value) {
            addCriterionForJDBCDate("respectTime =", value, "respecttime");
            return (Criteria) this;
        }

        public Criteria andRespecttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("respectTime <>", value, "respecttime");
            return (Criteria) this;
        }

        public Criteria andRespecttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("respectTime >", value, "respecttime");
            return (Criteria) this;
        }

        public Criteria andRespecttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("respectTime >=", value, "respecttime");
            return (Criteria) this;
        }

        public Criteria andRespecttimeLessThan(Date value) {
            addCriterionForJDBCDate("respectTime <", value, "respecttime");
            return (Criteria) this;
        }

        public Criteria andRespecttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("respectTime <=", value, "respecttime");
            return (Criteria) this;
        }

        public Criteria andRespecttimeIn(List<Date> values) {
            addCriterionForJDBCDate("respectTime in", values, "respecttime");
            return (Criteria) this;
        }

        public Criteria andRespecttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("respectTime not in", values, "respecttime");
            return (Criteria) this;
        }

        public Criteria andRespecttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("respectTime between", value1, value2, "respecttime");
            return (Criteria) this;
        }

        public Criteria andRespecttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("respectTime not between", value1, value2, "respecttime");
            return (Criteria) this;
        }

        public Criteria andIsnormalIsNull() {
            addCriterion("isNormal is null");
            return (Criteria) this;
        }

        public Criteria andIsnormalIsNotNull() {
            addCriterion("isNormal is not null");
            return (Criteria) this;
        }

        public Criteria andIsnormalEqualTo(Boolean value) {
            addCriterion("isNormal =", value, "isnormal");
            return (Criteria) this;
        }

        public Criteria andIsnormalNotEqualTo(Boolean value) {
            addCriterion("isNormal <>", value, "isnormal");
            return (Criteria) this;
        }

        public Criteria andIsnormalGreaterThan(Boolean value) {
            addCriterion("isNormal >", value, "isnormal");
            return (Criteria) this;
        }

        public Criteria andIsnormalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isNormal >=", value, "isnormal");
            return (Criteria) this;
        }

        public Criteria andIsnormalLessThan(Boolean value) {
            addCriterion("isNormal <", value, "isnormal");
            return (Criteria) this;
        }

        public Criteria andIsnormalLessThanOrEqualTo(Boolean value) {
            addCriterion("isNormal <=", value, "isnormal");
            return (Criteria) this;
        }

        public Criteria andIsnormalIn(List<Boolean> values) {
            addCriterion("isNormal in", values, "isnormal");
            return (Criteria) this;
        }

        public Criteria andIsnormalNotIn(List<Boolean> values) {
            addCriterion("isNormal not in", values, "isnormal");
            return (Criteria) this;
        }

        public Criteria andIsnormalBetween(Boolean value1, Boolean value2) {
            addCriterion("isNormal between", value1, value2, "isnormal");
            return (Criteria) this;
        }

        public Criteria andIsnormalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isNormal not between", value1, value2, "isnormal");
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