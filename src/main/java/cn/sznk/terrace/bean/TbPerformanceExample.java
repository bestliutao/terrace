package cn.sznk.terrace.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPerformanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPerformanceExample() {
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

        public Criteria andPerformanceIdIsNull() {
            addCriterion("performance_id is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceIdIsNotNull() {
            addCriterion("performance_id is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceIdEqualTo(Integer value) {
            addCriterion("performance_id =", value, "performanceId");
            return (Criteria) this;
        }

        public Criteria andPerformanceIdNotEqualTo(Integer value) {
            addCriterion("performance_id <>", value, "performanceId");
            return (Criteria) this;
        }

        public Criteria andPerformanceIdGreaterThan(Integer value) {
            addCriterion("performance_id >", value, "performanceId");
            return (Criteria) this;
        }

        public Criteria andPerformanceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("performance_id >=", value, "performanceId");
            return (Criteria) this;
        }

        public Criteria andPerformanceIdLessThan(Integer value) {
            addCriterion("performance_id <", value, "performanceId");
            return (Criteria) this;
        }

        public Criteria andPerformanceIdLessThanOrEqualTo(Integer value) {
            addCriterion("performance_id <=", value, "performanceId");
            return (Criteria) this;
        }

        public Criteria andPerformanceIdIn(List<Integer> values) {
            addCriterion("performance_id in", values, "performanceId");
            return (Criteria) this;
        }

        public Criteria andPerformanceIdNotIn(List<Integer> values) {
            addCriterion("performance_id not in", values, "performanceId");
            return (Criteria) this;
        }

        public Criteria andPerformanceIdBetween(Integer value1, Integer value2) {
            addCriterion("performance_id between", value1, value2, "performanceId");
            return (Criteria) this;
        }

        public Criteria andPerformanceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("performance_id not between", value1, value2, "performanceId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPerformanceTypeIsNull() {
            addCriterion("performance_type is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceTypeIsNotNull() {
            addCriterion("performance_type is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceTypeEqualTo(String value) {
            addCriterion("performance_type =", value, "performanceType");
            return (Criteria) this;
        }

        public Criteria andPerformanceTypeNotEqualTo(String value) {
            addCriterion("performance_type <>", value, "performanceType");
            return (Criteria) this;
        }

        public Criteria andPerformanceTypeGreaterThan(String value) {
            addCriterion("performance_type >", value, "performanceType");
            return (Criteria) this;
        }

        public Criteria andPerformanceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("performance_type >=", value, "performanceType");
            return (Criteria) this;
        }

        public Criteria andPerformanceTypeLessThan(String value) {
            addCriterion("performance_type <", value, "performanceType");
            return (Criteria) this;
        }

        public Criteria andPerformanceTypeLessThanOrEqualTo(String value) {
            addCriterion("performance_type <=", value, "performanceType");
            return (Criteria) this;
        }

        public Criteria andPerformanceTypeLike(String value) {
            addCriterion("performance_type like", value, "performanceType");
            return (Criteria) this;
        }

        public Criteria andPerformanceTypeNotLike(String value) {
            addCriterion("performance_type not like", value, "performanceType");
            return (Criteria) this;
        }

        public Criteria andPerformanceTypeIn(List<String> values) {
            addCriterion("performance_type in", values, "performanceType");
            return (Criteria) this;
        }

        public Criteria andPerformanceTypeNotIn(List<String> values) {
            addCriterion("performance_type not in", values, "performanceType");
            return (Criteria) this;
        }

        public Criteria andPerformanceTypeBetween(String value1, String value2) {
            addCriterion("performance_type between", value1, value2, "performanceType");
            return (Criteria) this;
        }

        public Criteria andPerformanceTypeNotBetween(String value1, String value2) {
            addCriterion("performance_type not between", value1, value2, "performanceType");
            return (Criteria) this;
        }

        public Criteria andPerformanceLevelIsNull() {
            addCriterion("performance_level is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceLevelIsNotNull() {
            addCriterion("performance_level is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceLevelEqualTo(String value) {
            addCriterion("performance_level =", value, "performanceLevel");
            return (Criteria) this;
        }

        public Criteria andPerformanceLevelNotEqualTo(String value) {
            addCriterion("performance_level <>", value, "performanceLevel");
            return (Criteria) this;
        }

        public Criteria andPerformanceLevelGreaterThan(String value) {
            addCriterion("performance_level >", value, "performanceLevel");
            return (Criteria) this;
        }

        public Criteria andPerformanceLevelGreaterThanOrEqualTo(String value) {
            addCriterion("performance_level >=", value, "performanceLevel");
            return (Criteria) this;
        }

        public Criteria andPerformanceLevelLessThan(String value) {
            addCriterion("performance_level <", value, "performanceLevel");
            return (Criteria) this;
        }

        public Criteria andPerformanceLevelLessThanOrEqualTo(String value) {
            addCriterion("performance_level <=", value, "performanceLevel");
            return (Criteria) this;
        }

        public Criteria andPerformanceLevelLike(String value) {
            addCriterion("performance_level like", value, "performanceLevel");
            return (Criteria) this;
        }

        public Criteria andPerformanceLevelNotLike(String value) {
            addCriterion("performance_level not like", value, "performanceLevel");
            return (Criteria) this;
        }

        public Criteria andPerformanceLevelIn(List<String> values) {
            addCriterion("performance_level in", values, "performanceLevel");
            return (Criteria) this;
        }

        public Criteria andPerformanceLevelNotIn(List<String> values) {
            addCriterion("performance_level not in", values, "performanceLevel");
            return (Criteria) this;
        }

        public Criteria andPerformanceLevelBetween(String value1, String value2) {
            addCriterion("performance_level between", value1, value2, "performanceLevel");
            return (Criteria) this;
        }

        public Criteria andPerformanceLevelNotBetween(String value1, String value2) {
            addCriterion("performance_level not between", value1, value2, "performanceLevel");
            return (Criteria) this;
        }

        public Criteria andPerformanceTimeIsNull() {
            addCriterion("performance_time is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceTimeIsNotNull() {
            addCriterion("performance_time is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceTimeEqualTo(Date value) {
            addCriterion("performance_time =", value, "performanceTime");
            return (Criteria) this;
        }

        public Criteria andPerformanceTimeNotEqualTo(Date value) {
            addCriterion("performance_time <>", value, "performanceTime");
            return (Criteria) this;
        }

        public Criteria andPerformanceTimeGreaterThan(Date value) {
            addCriterion("performance_time >", value, "performanceTime");
            return (Criteria) this;
        }

        public Criteria andPerformanceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("performance_time >=", value, "performanceTime");
            return (Criteria) this;
        }

        public Criteria andPerformanceTimeLessThan(Date value) {
            addCriterion("performance_time <", value, "performanceTime");
            return (Criteria) this;
        }

        public Criteria andPerformanceTimeLessThanOrEqualTo(Date value) {
            addCriterion("performance_time <=", value, "performanceTime");
            return (Criteria) this;
        }

        public Criteria andPerformanceTimeIn(List<Date> values) {
            addCriterion("performance_time in", values, "performanceTime");
            return (Criteria) this;
        }

        public Criteria andPerformanceTimeNotIn(List<Date> values) {
            addCriterion("performance_time not in", values, "performanceTime");
            return (Criteria) this;
        }

        public Criteria andPerformanceTimeBetween(Date value1, Date value2) {
            addCriterion("performance_time between", value1, value2, "performanceTime");
            return (Criteria) this;
        }

        public Criteria andPerformanceTimeNotBetween(Date value1, Date value2) {
            addCriterion("performance_time not between", value1, value2, "performanceTime");
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