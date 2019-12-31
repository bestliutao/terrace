package cn.sznk.terrace.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbEnvirmsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbEnvirmsgExample() {
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

        public Criteria andEnvirOidIsNull() {
            addCriterion("envir_oid is null");
            return (Criteria) this;
        }

        public Criteria andEnvirOidIsNotNull() {
            addCriterion("envir_oid is not null");
            return (Criteria) this;
        }

        public Criteria andEnvirOidEqualTo(String value) {
            addCriterion("envir_oid =", value, "envirOid");
            return (Criteria) this;
        }

        public Criteria andEnvirOidNotEqualTo(String value) {
            addCriterion("envir_oid <>", value, "envirOid");
            return (Criteria) this;
        }

        public Criteria andEnvirOidGreaterThan(String value) {
            addCriterion("envir_oid >", value, "envirOid");
            return (Criteria) this;
        }

        public Criteria andEnvirOidGreaterThanOrEqualTo(String value) {
            addCriterion("envir_oid >=", value, "envirOid");
            return (Criteria) this;
        }

        public Criteria andEnvirOidLessThan(String value) {
            addCriterion("envir_oid <", value, "envirOid");
            return (Criteria) this;
        }

        public Criteria andEnvirOidLessThanOrEqualTo(String value) {
            addCriterion("envir_oid <=", value, "envirOid");
            return (Criteria) this;
        }

        public Criteria andEnvirOidLike(String value) {
            addCriterion("envir_oid like", value, "envirOid");
            return (Criteria) this;
        }

        public Criteria andEnvirOidNotLike(String value) {
            addCriterion("envir_oid not like", value, "envirOid");
            return (Criteria) this;
        }

        public Criteria andEnvirOidIn(List<String> values) {
            addCriterion("envir_oid in", values, "envirOid");
            return (Criteria) this;
        }

        public Criteria andEnvirOidNotIn(List<String> values) {
            addCriterion("envir_oid not in", values, "envirOid");
            return (Criteria) this;
        }

        public Criteria andEnvirOidBetween(String value1, String value2) {
            addCriterion("envir_oid between", value1, value2, "envirOid");
            return (Criteria) this;
        }

        public Criteria andEnvirOidNotBetween(String value1, String value2) {
            addCriterion("envir_oid not between", value1, value2, "envirOid");
            return (Criteria) this;
        }

        public Criteria andEnvirDescIsNull() {
            addCriterion("envir_desc is null");
            return (Criteria) this;
        }

        public Criteria andEnvirDescIsNotNull() {
            addCriterion("envir_desc is not null");
            return (Criteria) this;
        }

        public Criteria andEnvirDescEqualTo(String value) {
            addCriterion("envir_desc =", value, "envirDesc");
            return (Criteria) this;
        }

        public Criteria andEnvirDescNotEqualTo(String value) {
            addCriterion("envir_desc <>", value, "envirDesc");
            return (Criteria) this;
        }

        public Criteria andEnvirDescGreaterThan(String value) {
            addCriterion("envir_desc >", value, "envirDesc");
            return (Criteria) this;
        }

        public Criteria andEnvirDescGreaterThanOrEqualTo(String value) {
            addCriterion("envir_desc >=", value, "envirDesc");
            return (Criteria) this;
        }

        public Criteria andEnvirDescLessThan(String value) {
            addCriterion("envir_desc <", value, "envirDesc");
            return (Criteria) this;
        }

        public Criteria andEnvirDescLessThanOrEqualTo(String value) {
            addCriterion("envir_desc <=", value, "envirDesc");
            return (Criteria) this;
        }

        public Criteria andEnvirDescLike(String value) {
            addCriterion("envir_desc like", value, "envirDesc");
            return (Criteria) this;
        }

        public Criteria andEnvirDescNotLike(String value) {
            addCriterion("envir_desc not like", value, "envirDesc");
            return (Criteria) this;
        }

        public Criteria andEnvirDescIn(List<String> values) {
            addCriterion("envir_desc in", values, "envirDesc");
            return (Criteria) this;
        }

        public Criteria andEnvirDescNotIn(List<String> values) {
            addCriterion("envir_desc not in", values, "envirDesc");
            return (Criteria) this;
        }

        public Criteria andEnvirDescBetween(String value1, String value2) {
            addCriterion("envir_desc between", value1, value2, "envirDesc");
            return (Criteria) this;
        }

        public Criteria andEnvirDescNotBetween(String value1, String value2) {
            addCriterion("envir_desc not between", value1, value2, "envirDesc");
            return (Criteria) this;
        }

        public Criteria andEnvirValueIsNull() {
            addCriterion("envir_value is null");
            return (Criteria) this;
        }

        public Criteria andEnvirValueIsNotNull() {
            addCriterion("envir_value is not null");
            return (Criteria) this;
        }

        public Criteria andEnvirValueEqualTo(String value) {
            addCriterion("envir_value =", value, "envirValue");
            return (Criteria) this;
        }

        public Criteria andEnvirValueNotEqualTo(String value) {
            addCriterion("envir_value <>", value, "envirValue");
            return (Criteria) this;
        }

        public Criteria andEnvirValueGreaterThan(String value) {
            addCriterion("envir_value >", value, "envirValue");
            return (Criteria) this;
        }

        public Criteria andEnvirValueGreaterThanOrEqualTo(String value) {
            addCriterion("envir_value >=", value, "envirValue");
            return (Criteria) this;
        }

        public Criteria andEnvirValueLessThan(String value) {
            addCriterion("envir_value <", value, "envirValue");
            return (Criteria) this;
        }

        public Criteria andEnvirValueLessThanOrEqualTo(String value) {
            addCriterion("envir_value <=", value, "envirValue");
            return (Criteria) this;
        }

        public Criteria andEnvirValueLike(String value) {
            addCriterion("envir_value like", value, "envirValue");
            return (Criteria) this;
        }

        public Criteria andEnvirValueNotLike(String value) {
            addCriterion("envir_value not like", value, "envirValue");
            return (Criteria) this;
        }

        public Criteria andEnvirValueIn(List<String> values) {
            addCriterion("envir_value in", values, "envirValue");
            return (Criteria) this;
        }

        public Criteria andEnvirValueNotIn(List<String> values) {
            addCriterion("envir_value not in", values, "envirValue");
            return (Criteria) this;
        }

        public Criteria andEnvirValueBetween(String value1, String value2) {
            addCriterion("envir_value between", value1, value2, "envirValue");
            return (Criteria) this;
        }

        public Criteria andEnvirValueNotBetween(String value1, String value2) {
            addCriterion("envir_value not between", value1, value2, "envirValue");
            return (Criteria) this;
        }

        public Criteria andEnvirLevelIsNull() {
            addCriterion("envir_level is null");
            return (Criteria) this;
        }

        public Criteria andEnvirLevelIsNotNull() {
            addCriterion("envir_level is not null");
            return (Criteria) this;
        }

        public Criteria andEnvirLevelEqualTo(String value) {
            addCriterion("envir_level =", value, "envirLevel");
            return (Criteria) this;
        }

        public Criteria andEnvirLevelNotEqualTo(String value) {
            addCriterion("envir_level <>", value, "envirLevel");
            return (Criteria) this;
        }

        public Criteria andEnvirLevelGreaterThan(String value) {
            addCriterion("envir_level >", value, "envirLevel");
            return (Criteria) this;
        }

        public Criteria andEnvirLevelGreaterThanOrEqualTo(String value) {
            addCriterion("envir_level >=", value, "envirLevel");
            return (Criteria) this;
        }

        public Criteria andEnvirLevelLessThan(String value) {
            addCriterion("envir_level <", value, "envirLevel");
            return (Criteria) this;
        }

        public Criteria andEnvirLevelLessThanOrEqualTo(String value) {
            addCriterion("envir_level <=", value, "envirLevel");
            return (Criteria) this;
        }

        public Criteria andEnvirLevelLike(String value) {
            addCriterion("envir_level like", value, "envirLevel");
            return (Criteria) this;
        }

        public Criteria andEnvirLevelNotLike(String value) {
            addCriterion("envir_level not like", value, "envirLevel");
            return (Criteria) this;
        }

        public Criteria andEnvirLevelIn(List<String> values) {
            addCriterion("envir_level in", values, "envirLevel");
            return (Criteria) this;
        }

        public Criteria andEnvirLevelNotIn(List<String> values) {
            addCriterion("envir_level not in", values, "envirLevel");
            return (Criteria) this;
        }

        public Criteria andEnvirLevelBetween(String value1, String value2) {
            addCriterion("envir_level between", value1, value2, "envirLevel");
            return (Criteria) this;
        }

        public Criteria andEnvirLevelNotBetween(String value1, String value2) {
            addCriterion("envir_level not between", value1, value2, "envirLevel");
            return (Criteria) this;
        }

        public Criteria andEnvirTypeIsNull() {
            addCriterion("envir_type is null");
            return (Criteria) this;
        }

        public Criteria andEnvirTypeIsNotNull() {
            addCriterion("envir_type is not null");
            return (Criteria) this;
        }

        public Criteria andEnvirTypeEqualTo(String value) {
            addCriterion("envir_type =", value, "envirType");
            return (Criteria) this;
        }

        public Criteria andEnvirTypeNotEqualTo(String value) {
            addCriterion("envir_type <>", value, "envirType");
            return (Criteria) this;
        }

        public Criteria andEnvirTypeGreaterThan(String value) {
            addCriterion("envir_type >", value, "envirType");
            return (Criteria) this;
        }

        public Criteria andEnvirTypeGreaterThanOrEqualTo(String value) {
            addCriterion("envir_type >=", value, "envirType");
            return (Criteria) this;
        }

        public Criteria andEnvirTypeLessThan(String value) {
            addCriterion("envir_type <", value, "envirType");
            return (Criteria) this;
        }

        public Criteria andEnvirTypeLessThanOrEqualTo(String value) {
            addCriterion("envir_type <=", value, "envirType");
            return (Criteria) this;
        }

        public Criteria andEnvirTypeLike(String value) {
            addCriterion("envir_type like", value, "envirType");
            return (Criteria) this;
        }

        public Criteria andEnvirTypeNotLike(String value) {
            addCriterion("envir_type not like", value, "envirType");
            return (Criteria) this;
        }

        public Criteria andEnvirTypeIn(List<String> values) {
            addCriterion("envir_type in", values, "envirType");
            return (Criteria) this;
        }

        public Criteria andEnvirTypeNotIn(List<String> values) {
            addCriterion("envir_type not in", values, "envirType");
            return (Criteria) this;
        }

        public Criteria andEnvirTypeBetween(String value1, String value2) {
            addCriterion("envir_type between", value1, value2, "envirType");
            return (Criteria) this;
        }

        public Criteria andEnvirTypeNotBetween(String value1, String value2) {
            addCriterion("envir_type not between", value1, value2, "envirType");
            return (Criteria) this;
        }

        public Criteria andEnvirTimeIsNull() {
            addCriterion("envir_time is null");
            return (Criteria) this;
        }

        public Criteria andEnvirTimeIsNotNull() {
            addCriterion("envir_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnvirTimeEqualTo(Date value) {
            addCriterion("envir_time =", value, "envirTime");
            return (Criteria) this;
        }

        public Criteria andEnvirTimeNotEqualTo(Date value) {
            addCriterion("envir_time <>", value, "envirTime");
            return (Criteria) this;
        }

        public Criteria andEnvirTimeGreaterThan(Date value) {
            addCriterion("envir_time >", value, "envirTime");
            return (Criteria) this;
        }

        public Criteria andEnvirTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("envir_time >=", value, "envirTime");
            return (Criteria) this;
        }

        public Criteria andEnvirTimeLessThan(Date value) {
            addCriterion("envir_time <", value, "envirTime");
            return (Criteria) this;
        }

        public Criteria andEnvirTimeLessThanOrEqualTo(Date value) {
            addCriterion("envir_time <=", value, "envirTime");
            return (Criteria) this;
        }

        public Criteria andEnvirTimeIn(List<Date> values) {
            addCriterion("envir_time in", values, "envirTime");
            return (Criteria) this;
        }

        public Criteria andEnvirTimeNotIn(List<Date> values) {
            addCriterion("envir_time not in", values, "envirTime");
            return (Criteria) this;
        }

        public Criteria andEnvirTimeBetween(Date value1, Date value2) {
            addCriterion("envir_time between", value1, value2, "envirTime");
            return (Criteria) this;
        }

        public Criteria andEnvirTimeNotBetween(Date value1, Date value2) {
            addCriterion("envir_time not between", value1, value2, "envirTime");
            return (Criteria) this;
        }

        public Criteria andEnvirStatusIsNull() {
            addCriterion("envir_status is null");
            return (Criteria) this;
        }

        public Criteria andEnvirStatusIsNotNull() {
            addCriterion("envir_status is not null");
            return (Criteria) this;
        }

        public Criteria andEnvirStatusEqualTo(String value) {
            addCriterion("envir_status =", value, "envirStatus");
            return (Criteria) this;
        }

        public Criteria andEnvirStatusNotEqualTo(String value) {
            addCriterion("envir_status <>", value, "envirStatus");
            return (Criteria) this;
        }

        public Criteria andEnvirStatusGreaterThan(String value) {
            addCriterion("envir_status >", value, "envirStatus");
            return (Criteria) this;
        }

        public Criteria andEnvirStatusGreaterThanOrEqualTo(String value) {
            addCriterion("envir_status >=", value, "envirStatus");
            return (Criteria) this;
        }

        public Criteria andEnvirStatusLessThan(String value) {
            addCriterion("envir_status <", value, "envirStatus");
            return (Criteria) this;
        }

        public Criteria andEnvirStatusLessThanOrEqualTo(String value) {
            addCriterion("envir_status <=", value, "envirStatus");
            return (Criteria) this;
        }

        public Criteria andEnvirStatusLike(String value) {
            addCriterion("envir_status like", value, "envirStatus");
            return (Criteria) this;
        }

        public Criteria andEnvirStatusNotLike(String value) {
            addCriterion("envir_status not like", value, "envirStatus");
            return (Criteria) this;
        }

        public Criteria andEnvirStatusIn(List<String> values) {
            addCriterion("envir_status in", values, "envirStatus");
            return (Criteria) this;
        }

        public Criteria andEnvirStatusNotIn(List<String> values) {
            addCriterion("envir_status not in", values, "envirStatus");
            return (Criteria) this;
        }

        public Criteria andEnvirStatusBetween(String value1, String value2) {
            addCriterion("envir_status between", value1, value2, "envirStatus");
            return (Criteria) this;
        }

        public Criteria andEnvirStatusNotBetween(String value1, String value2) {
            addCriterion("envir_status not between", value1, value2, "envirStatus");
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