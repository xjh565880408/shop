package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RoadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoadExample() {
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

        public Criteria andTypeidIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("typeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("typeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("typeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("typeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("typeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("typeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeId not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andRoadlevelidIsNull() {
            addCriterion("roadLevelId is null");
            return (Criteria) this;
        }

        public Criteria andRoadlevelidIsNotNull() {
            addCriterion("roadLevelId is not null");
            return (Criteria) this;
        }

        public Criteria andRoadlevelidEqualTo(Integer value) {
            addCriterion("roadLevelId =", value, "roadlevelid");
            return (Criteria) this;
        }

        public Criteria andRoadlevelidNotEqualTo(Integer value) {
            addCriterion("roadLevelId <>", value, "roadlevelid");
            return (Criteria) this;
        }

        public Criteria andRoadlevelidGreaterThan(Integer value) {
            addCriterion("roadLevelId >", value, "roadlevelid");
            return (Criteria) this;
        }

        public Criteria andRoadlevelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("roadLevelId >=", value, "roadlevelid");
            return (Criteria) this;
        }

        public Criteria andRoadlevelidLessThan(Integer value) {
            addCriterion("roadLevelId <", value, "roadlevelid");
            return (Criteria) this;
        }

        public Criteria andRoadlevelidLessThanOrEqualTo(Integer value) {
            addCriterion("roadLevelId <=", value, "roadlevelid");
            return (Criteria) this;
        }

        public Criteria andRoadlevelidIn(List<Integer> values) {
            addCriterion("roadLevelId in", values, "roadlevelid");
            return (Criteria) this;
        }

        public Criteria andRoadlevelidNotIn(List<Integer> values) {
            addCriterion("roadLevelId not in", values, "roadlevelid");
            return (Criteria) this;
        }

        public Criteria andRoadlevelidBetween(Integer value1, Integer value2) {
            addCriterion("roadLevelId between", value1, value2, "roadlevelid");
            return (Criteria) this;
        }

        public Criteria andRoadlevelidNotBetween(Integer value1, Integer value2) {
            addCriterion("roadLevelId not between", value1, value2, "roadlevelid");
            return (Criteria) this;
        }

        public Criteria andRoadnameIsNull() {
            addCriterion("roadName is null");
            return (Criteria) this;
        }

        public Criteria andRoadnameIsNotNull() {
            addCriterion("roadName is not null");
            return (Criteria) this;
        }

        public Criteria andRoadnameEqualTo(String value) {
            addCriterion("roadName =", value, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameNotEqualTo(String value) {
            addCriterion("roadName <>", value, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameGreaterThan(String value) {
            addCriterion("roadName >", value, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameGreaterThanOrEqualTo(String value) {
            addCriterion("roadName >=", value, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameLessThan(String value) {
            addCriterion("roadName <", value, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameLessThanOrEqualTo(String value) {
            addCriterion("roadName <=", value, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameLike(String value) {
            addCriterion("roadName like", value, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameNotLike(String value) {
            addCriterion("roadName not like", value, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameIn(List<String> values) {
            addCriterion("roadName in", values, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameNotIn(List<String> values) {
            addCriterion("roadName not in", values, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameBetween(String value1, String value2) {
            addCriterion("roadName between", value1, value2, "roadname");
            return (Criteria) this;
        }

        public Criteria andRoadnameNotBetween(String value1, String value2) {
            addCriterion("roadName not between", value1, value2, "roadname");
            return (Criteria) this;
        }

        public Criteria andBeginpositionIsNull() {
            addCriterion("beginPosition is null");
            return (Criteria) this;
        }

        public Criteria andBeginpositionIsNotNull() {
            addCriterion("beginPosition is not null");
            return (Criteria) this;
        }

        public Criteria andBeginpositionEqualTo(String value) {
            addCriterion("beginPosition =", value, "beginposition");
            return (Criteria) this;
        }

        public Criteria andBeginpositionNotEqualTo(String value) {
            addCriterion("beginPosition <>", value, "beginposition");
            return (Criteria) this;
        }

        public Criteria andBeginpositionGreaterThan(String value) {
            addCriterion("beginPosition >", value, "beginposition");
            return (Criteria) this;
        }

        public Criteria andBeginpositionGreaterThanOrEqualTo(String value) {
            addCriterion("beginPosition >=", value, "beginposition");
            return (Criteria) this;
        }

        public Criteria andBeginpositionLessThan(String value) {
            addCriterion("beginPosition <", value, "beginposition");
            return (Criteria) this;
        }

        public Criteria andBeginpositionLessThanOrEqualTo(String value) {
            addCriterion("beginPosition <=", value, "beginposition");
            return (Criteria) this;
        }

        public Criteria andBeginpositionLike(String value) {
            addCriterion("beginPosition like", value, "beginposition");
            return (Criteria) this;
        }

        public Criteria andBeginpositionNotLike(String value) {
            addCriterion("beginPosition not like", value, "beginposition");
            return (Criteria) this;
        }

        public Criteria andBeginpositionIn(List<String> values) {
            addCriterion("beginPosition in", values, "beginposition");
            return (Criteria) this;
        }

        public Criteria andBeginpositionNotIn(List<String> values) {
            addCriterion("beginPosition not in", values, "beginposition");
            return (Criteria) this;
        }

        public Criteria andBeginpositionBetween(String value1, String value2) {
            addCriterion("beginPosition between", value1, value2, "beginposition");
            return (Criteria) this;
        }

        public Criteria andBeginpositionNotBetween(String value1, String value2) {
            addCriterion("beginPosition not between", value1, value2, "beginposition");
            return (Criteria) this;
        }

        public Criteria andEndpositionIsNull() {
            addCriterion("endPosition is null");
            return (Criteria) this;
        }

        public Criteria andEndpositionIsNotNull() {
            addCriterion("endPosition is not null");
            return (Criteria) this;
        }

        public Criteria andEndpositionEqualTo(String value) {
            addCriterion("endPosition =", value, "endposition");
            return (Criteria) this;
        }

        public Criteria andEndpositionNotEqualTo(String value) {
            addCriterion("endPosition <>", value, "endposition");
            return (Criteria) this;
        }

        public Criteria andEndpositionGreaterThan(String value) {
            addCriterion("endPosition >", value, "endposition");
            return (Criteria) this;
        }

        public Criteria andEndpositionGreaterThanOrEqualTo(String value) {
            addCriterion("endPosition >=", value, "endposition");
            return (Criteria) this;
        }

        public Criteria andEndpositionLessThan(String value) {
            addCriterion("endPosition <", value, "endposition");
            return (Criteria) this;
        }

        public Criteria andEndpositionLessThanOrEqualTo(String value) {
            addCriterion("endPosition <=", value, "endposition");
            return (Criteria) this;
        }

        public Criteria andEndpositionLike(String value) {
            addCriterion("endPosition like", value, "endposition");
            return (Criteria) this;
        }

        public Criteria andEndpositionNotLike(String value) {
            addCriterion("endPosition not like", value, "endposition");
            return (Criteria) this;
        }

        public Criteria andEndpositionIn(List<String> values) {
            addCriterion("endPosition in", values, "endposition");
            return (Criteria) this;
        }

        public Criteria andEndpositionNotIn(List<String> values) {
            addCriterion("endPosition not in", values, "endposition");
            return (Criteria) this;
        }

        public Criteria andEndpositionBetween(String value1, String value2) {
            addCriterion("endPosition between", value1, value2, "endposition");
            return (Criteria) this;
        }

        public Criteria andEndpositionNotBetween(String value1, String value2) {
            addCriterion("endPosition not between", value1, value2, "endposition");
            return (Criteria) this;
        }

        public Criteria andBeginsignIsNull() {
            addCriterion("beginSign is null");
            return (Criteria) this;
        }

        public Criteria andBeginsignIsNotNull() {
            addCriterion("beginSign is not null");
            return (Criteria) this;
        }

        public Criteria andBeginsignEqualTo(String value) {
            addCriterion("beginSign =", value, "beginsign");
            return (Criteria) this;
        }

        public Criteria andBeginsignNotEqualTo(String value) {
            addCriterion("beginSign <>", value, "beginsign");
            return (Criteria) this;
        }

        public Criteria andBeginsignGreaterThan(String value) {
            addCriterion("beginSign >", value, "beginsign");
            return (Criteria) this;
        }

        public Criteria andBeginsignGreaterThanOrEqualTo(String value) {
            addCriterion("beginSign >=", value, "beginsign");
            return (Criteria) this;
        }

        public Criteria andBeginsignLessThan(String value) {
            addCriterion("beginSign <", value, "beginsign");
            return (Criteria) this;
        }

        public Criteria andBeginsignLessThanOrEqualTo(String value) {
            addCriterion("beginSign <=", value, "beginsign");
            return (Criteria) this;
        }

        public Criteria andBeginsignLike(String value) {
            addCriterion("beginSign like", value, "beginsign");
            return (Criteria) this;
        }

        public Criteria andBeginsignNotLike(String value) {
            addCriterion("beginSign not like", value, "beginsign");
            return (Criteria) this;
        }

        public Criteria andBeginsignIn(List<String> values) {
            addCriterion("beginSign in", values, "beginsign");
            return (Criteria) this;
        }

        public Criteria andBeginsignNotIn(List<String> values) {
            addCriterion("beginSign not in", values, "beginsign");
            return (Criteria) this;
        }

        public Criteria andBeginsignBetween(String value1, String value2) {
            addCriterion("beginSign between", value1, value2, "beginsign");
            return (Criteria) this;
        }

        public Criteria andBeginsignNotBetween(String value1, String value2) {
            addCriterion("beginSign not between", value1, value2, "beginsign");
            return (Criteria) this;
        }

        public Criteria andEndsignIsNull() {
            addCriterion("endSign is null");
            return (Criteria) this;
        }

        public Criteria andEndsignIsNotNull() {
            addCriterion("endSign is not null");
            return (Criteria) this;
        }

        public Criteria andEndsignEqualTo(String value) {
            addCriterion("endSign =", value, "endsign");
            return (Criteria) this;
        }

        public Criteria andEndsignNotEqualTo(String value) {
            addCriterion("endSign <>", value, "endsign");
            return (Criteria) this;
        }

        public Criteria andEndsignGreaterThan(String value) {
            addCriterion("endSign >", value, "endsign");
            return (Criteria) this;
        }

        public Criteria andEndsignGreaterThanOrEqualTo(String value) {
            addCriterion("endSign >=", value, "endsign");
            return (Criteria) this;
        }

        public Criteria andEndsignLessThan(String value) {
            addCriterion("endSign <", value, "endsign");
            return (Criteria) this;
        }

        public Criteria andEndsignLessThanOrEqualTo(String value) {
            addCriterion("endSign <=", value, "endsign");
            return (Criteria) this;
        }

        public Criteria andEndsignLike(String value) {
            addCriterion("endSign like", value, "endsign");
            return (Criteria) this;
        }

        public Criteria andEndsignNotLike(String value) {
            addCriterion("endSign not like", value, "endsign");
            return (Criteria) this;
        }

        public Criteria andEndsignIn(List<String> values) {
            addCriterion("endSign in", values, "endsign");
            return (Criteria) this;
        }

        public Criteria andEndsignNotIn(List<String> values) {
            addCriterion("endSign not in", values, "endsign");
            return (Criteria) this;
        }

        public Criteria andEndsignBetween(String value1, String value2) {
            addCriterion("endSign between", value1, value2, "endsign");
            return (Criteria) this;
        }

        public Criteria andEndsignNotBetween(String value1, String value2) {
            addCriterion("endSign not between", value1, value2, "endsign");
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