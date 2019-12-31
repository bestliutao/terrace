package cn.sznk.terrace.bean;

import java.util.ArrayList;
import java.util.List;

public class EnvirOidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnvirOidExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(String value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(String value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(String value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(String value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(String value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(String value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLike(String value) {
            addCriterion("oid like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotLike(String value) {
            addCriterion("oid not like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<String> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<String> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(String value1, String value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(String value1, String value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andVarNameIsNull() {
            addCriterion("var_name is null");
            return (Criteria) this;
        }

        public Criteria andVarNameIsNotNull() {
            addCriterion("var_name is not null");
            return (Criteria) this;
        }

        public Criteria andVarNameEqualTo(String value) {
            addCriterion("var_name =", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameNotEqualTo(String value) {
            addCriterion("var_name <>", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameGreaterThan(String value) {
            addCriterion("var_name >", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameGreaterThanOrEqualTo(String value) {
            addCriterion("var_name >=", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameLessThan(String value) {
            addCriterion("var_name <", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameLessThanOrEqualTo(String value) {
            addCriterion("var_name <=", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameLike(String value) {
            addCriterion("var_name like", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameNotLike(String value) {
            addCriterion("var_name not like", value, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameIn(List<String> values) {
            addCriterion("var_name in", values, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameNotIn(List<String> values) {
            addCriterion("var_name not in", values, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameBetween(String value1, String value2) {
            addCriterion("var_name between", value1, value2, "varName");
            return (Criteria) this;
        }

        public Criteria andVarNameNotBetween(String value1, String value2) {
            addCriterion("var_name not between", value1, value2, "varName");
            return (Criteria) this;
        }

        public Criteria andVarDescIsNull() {
            addCriterion("var_desc is null");
            return (Criteria) this;
        }

        public Criteria andVarDescIsNotNull() {
            addCriterion("var_desc is not null");
            return (Criteria) this;
        }

        public Criteria andVarDescEqualTo(String value) {
            addCriterion("var_desc =", value, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescNotEqualTo(String value) {
            addCriterion("var_desc <>", value, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescGreaterThan(String value) {
            addCriterion("var_desc >", value, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescGreaterThanOrEqualTo(String value) {
            addCriterion("var_desc >=", value, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescLessThan(String value) {
            addCriterion("var_desc <", value, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescLessThanOrEqualTo(String value) {
            addCriterion("var_desc <=", value, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescLike(String value) {
            addCriterion("var_desc like", value, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescNotLike(String value) {
            addCriterion("var_desc not like", value, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescIn(List<String> values) {
            addCriterion("var_desc in", values, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescNotIn(List<String> values) {
            addCriterion("var_desc not in", values, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescBetween(String value1, String value2) {
            addCriterion("var_desc between", value1, value2, "varDesc");
            return (Criteria) this;
        }

        public Criteria andVarDescNotBetween(String value1, String value2) {
            addCriterion("var_desc not between", value1, value2, "varDesc");
            return (Criteria) this;
        }

        public Criteria andMinValueIsNull() {
            addCriterion("min_value is null");
            return (Criteria) this;
        }

        public Criteria andMinValueIsNotNull() {
            addCriterion("min_value is not null");
            return (Criteria) this;
        }

        public Criteria andMinValueEqualTo(Double value) {
            addCriterion("min_value =", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotEqualTo(Double value) {
            addCriterion("min_value <>", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueGreaterThan(Double value) {
            addCriterion("min_value >", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueGreaterThanOrEqualTo(Double value) {
            addCriterion("min_value >=", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueLessThan(Double value) {
            addCriterion("min_value <", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueLessThanOrEqualTo(Double value) {
            addCriterion("min_value <=", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueIn(List<Double> values) {
            addCriterion("min_value in", values, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotIn(List<Double> values) {
            addCriterion("min_value not in", values, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueBetween(Double value1, Double value2) {
            addCriterion("min_value between", value1, value2, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotBetween(Double value1, Double value2) {
            addCriterion("min_value not between", value1, value2, "minValue");
            return (Criteria) this;
        }

        public Criteria andInitValueIsNull() {
            addCriterion("init_value is null");
            return (Criteria) this;
        }

        public Criteria andInitValueIsNotNull() {
            addCriterion("init_value is not null");
            return (Criteria) this;
        }

        public Criteria andInitValueEqualTo(Double value) {
            addCriterion("init_value =", value, "initValue");
            return (Criteria) this;
        }

        public Criteria andInitValueNotEqualTo(Double value) {
            addCriterion("init_value <>", value, "initValue");
            return (Criteria) this;
        }

        public Criteria andInitValueGreaterThan(Double value) {
            addCriterion("init_value >", value, "initValue");
            return (Criteria) this;
        }

        public Criteria andInitValueGreaterThanOrEqualTo(Double value) {
            addCriterion("init_value >=", value, "initValue");
            return (Criteria) this;
        }

        public Criteria andInitValueLessThan(Double value) {
            addCriterion("init_value <", value, "initValue");
            return (Criteria) this;
        }

        public Criteria andInitValueLessThanOrEqualTo(Double value) {
            addCriterion("init_value <=", value, "initValue");
            return (Criteria) this;
        }

        public Criteria andInitValueIn(List<Double> values) {
            addCriterion("init_value in", values, "initValue");
            return (Criteria) this;
        }

        public Criteria andInitValueNotIn(List<Double> values) {
            addCriterion("init_value not in", values, "initValue");
            return (Criteria) this;
        }

        public Criteria andInitValueBetween(Double value1, Double value2) {
            addCriterion("init_value between", value1, value2, "initValue");
            return (Criteria) this;
        }

        public Criteria andInitValueNotBetween(Double value1, Double value2) {
            addCriterion("init_value not between", value1, value2, "initValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueIsNull() {
            addCriterion("max_value is null");
            return (Criteria) this;
        }

        public Criteria andMaxValueIsNotNull() {
            addCriterion("max_value is not null");
            return (Criteria) this;
        }

        public Criteria andMaxValueEqualTo(Double value) {
            addCriterion("max_value =", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotEqualTo(Double value) {
            addCriterion("max_value <>", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueGreaterThan(Double value) {
            addCriterion("max_value >", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueGreaterThanOrEqualTo(Double value) {
            addCriterion("max_value >=", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLessThan(Double value) {
            addCriterion("max_value <", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLessThanOrEqualTo(Double value) {
            addCriterion("max_value <=", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueIn(List<Double> values) {
            addCriterion("max_value in", values, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotIn(List<Double> values) {
            addCriterion("max_value not in", values, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueBetween(Double value1, Double value2) {
            addCriterion("max_value between", value1, value2, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotBetween(Double value1, Double value2) {
            addCriterion("max_value not between", value1, value2, "maxValue");
            return (Criteria) this;
        }

        public Criteria andLowerBoundIsNull() {
            addCriterion("lower_bound is null");
            return (Criteria) this;
        }

        public Criteria andLowerBoundIsNotNull() {
            addCriterion("lower_bound is not null");
            return (Criteria) this;
        }

        public Criteria andLowerBoundEqualTo(Double value) {
            addCriterion("lower_bound =", value, "lowerBound");
            return (Criteria) this;
        }

        public Criteria andLowerBoundNotEqualTo(Double value) {
            addCriterion("lower_bound <>", value, "lowerBound");
            return (Criteria) this;
        }

        public Criteria andLowerBoundGreaterThan(Double value) {
            addCriterion("lower_bound >", value, "lowerBound");
            return (Criteria) this;
        }

        public Criteria andLowerBoundGreaterThanOrEqualTo(Double value) {
            addCriterion("lower_bound >=", value, "lowerBound");
            return (Criteria) this;
        }

        public Criteria andLowerBoundLessThan(Double value) {
            addCriterion("lower_bound <", value, "lowerBound");
            return (Criteria) this;
        }

        public Criteria andLowerBoundLessThanOrEqualTo(Double value) {
            addCriterion("lower_bound <=", value, "lowerBound");
            return (Criteria) this;
        }

        public Criteria andLowerBoundIn(List<Double> values) {
            addCriterion("lower_bound in", values, "lowerBound");
            return (Criteria) this;
        }

        public Criteria andLowerBoundNotIn(List<Double> values) {
            addCriterion("lower_bound not in", values, "lowerBound");
            return (Criteria) this;
        }

        public Criteria andLowerBoundBetween(Double value1, Double value2) {
            addCriterion("lower_bound between", value1, value2, "lowerBound");
            return (Criteria) this;
        }

        public Criteria andLowerBoundNotBetween(Double value1, Double value2) {
            addCriterion("lower_bound not between", value1, value2, "lowerBound");
            return (Criteria) this;
        }

        public Criteria andUpperBoundIsNull() {
            addCriterion("upper_bound is null");
            return (Criteria) this;
        }

        public Criteria andUpperBoundIsNotNull() {
            addCriterion("upper_bound is not null");
            return (Criteria) this;
        }

        public Criteria andUpperBoundEqualTo(Double value) {
            addCriterion("upper_bound =", value, "upperBound");
            return (Criteria) this;
        }

        public Criteria andUpperBoundNotEqualTo(Double value) {
            addCriterion("upper_bound <>", value, "upperBound");
            return (Criteria) this;
        }

        public Criteria andUpperBoundGreaterThan(Double value) {
            addCriterion("upper_bound >", value, "upperBound");
            return (Criteria) this;
        }

        public Criteria andUpperBoundGreaterThanOrEqualTo(Double value) {
            addCriterion("upper_bound >=", value, "upperBound");
            return (Criteria) this;
        }

        public Criteria andUpperBoundLessThan(Double value) {
            addCriterion("upper_bound <", value, "upperBound");
            return (Criteria) this;
        }

        public Criteria andUpperBoundLessThanOrEqualTo(Double value) {
            addCriterion("upper_bound <=", value, "upperBound");
            return (Criteria) this;
        }

        public Criteria andUpperBoundIn(List<Double> values) {
            addCriterion("upper_bound in", values, "upperBound");
            return (Criteria) this;
        }

        public Criteria andUpperBoundNotIn(List<Double> values) {
            addCriterion("upper_bound not in", values, "upperBound");
            return (Criteria) this;
        }

        public Criteria andUpperBoundBetween(Double value1, Double value2) {
            addCriterion("upper_bound between", value1, value2, "upperBound");
            return (Criteria) this;
        }

        public Criteria andUpperBoundNotBetween(Double value1, Double value2) {
            addCriterion("upper_bound not between", value1, value2, "upperBound");
            return (Criteria) this;
        }

        public Criteria andNormalValueIsNull() {
            addCriterion("normal_value is null");
            return (Criteria) this;
        }

        public Criteria andNormalValueIsNotNull() {
            addCriterion("normal_value is not null");
            return (Criteria) this;
        }

        public Criteria andNormalValueEqualTo(Double value) {
            addCriterion("normal_value =", value, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueNotEqualTo(Double value) {
            addCriterion("normal_value <>", value, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueGreaterThan(Double value) {
            addCriterion("normal_value >", value, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueGreaterThanOrEqualTo(Double value) {
            addCriterion("normal_value >=", value, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueLessThan(Double value) {
            addCriterion("normal_value <", value, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueLessThanOrEqualTo(Double value) {
            addCriterion("normal_value <=", value, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueIn(List<Double> values) {
            addCriterion("normal_value in", values, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueNotIn(List<Double> values) {
            addCriterion("normal_value not in", values, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueBetween(Double value1, Double value2) {
            addCriterion("normal_value between", value1, value2, "normalValue");
            return (Criteria) this;
        }

        public Criteria andNormalValueNotBetween(Double value1, Double value2) {
            addCriterion("normal_value not between", value1, value2, "normalValue");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
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