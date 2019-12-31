package cn.sznk.terrace.bean;

import java.util.ArrayList;
import java.util.List;

public class TbInsidenumberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbInsidenumberExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTotalnumberIsNull() {
            addCriterion("totalNumber is null");
            return (Criteria) this;
        }

        public Criteria andTotalnumberIsNotNull() {
            addCriterion("totalNumber is not null");
            return (Criteria) this;
        }

        public Criteria andTotalnumberEqualTo(String value) {
            addCriterion("totalNumber =", value, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberNotEqualTo(String value) {
            addCriterion("totalNumber <>", value, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberGreaterThan(String value) {
            addCriterion("totalNumber >", value, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberGreaterThanOrEqualTo(String value) {
            addCriterion("totalNumber >=", value, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberLessThan(String value) {
            addCriterion("totalNumber <", value, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberLessThanOrEqualTo(String value) {
            addCriterion("totalNumber <=", value, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberLike(String value) {
            addCriterion("totalNumber like", value, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberNotLike(String value) {
            addCriterion("totalNumber not like", value, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberIn(List<String> values) {
            addCriterion("totalNumber in", values, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberNotIn(List<String> values) {
            addCriterion("totalNumber not in", values, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberBetween(String value1, String value2) {
            addCriterion("totalNumber between", value1, value2, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andTotalnumberNotBetween(String value1, String value2) {
            addCriterion("totalNumber not between", value1, value2, "totalnumber");
            return (Criteria) this;
        }

        public Criteria andEntrynumberIsNull() {
            addCriterion("entryNumber is null");
            return (Criteria) this;
        }

        public Criteria andEntrynumberIsNotNull() {
            addCriterion("entryNumber is not null");
            return (Criteria) this;
        }

        public Criteria andEntrynumberEqualTo(String value) {
            addCriterion("entryNumber =", value, "entrynumber");
            return (Criteria) this;
        }

        public Criteria andEntrynumberNotEqualTo(String value) {
            addCriterion("entryNumber <>", value, "entrynumber");
            return (Criteria) this;
        }

        public Criteria andEntrynumberGreaterThan(String value) {
            addCriterion("entryNumber >", value, "entrynumber");
            return (Criteria) this;
        }

        public Criteria andEntrynumberGreaterThanOrEqualTo(String value) {
            addCriterion("entryNumber >=", value, "entrynumber");
            return (Criteria) this;
        }

        public Criteria andEntrynumberLessThan(String value) {
            addCriterion("entryNumber <", value, "entrynumber");
            return (Criteria) this;
        }

        public Criteria andEntrynumberLessThanOrEqualTo(String value) {
            addCriterion("entryNumber <=", value, "entrynumber");
            return (Criteria) this;
        }

        public Criteria andEntrynumberLike(String value) {
            addCriterion("entryNumber like", value, "entrynumber");
            return (Criteria) this;
        }

        public Criteria andEntrynumberNotLike(String value) {
            addCriterion("entryNumber not like", value, "entrynumber");
            return (Criteria) this;
        }

        public Criteria andEntrynumberIn(List<String> values) {
            addCriterion("entryNumber in", values, "entrynumber");
            return (Criteria) this;
        }

        public Criteria andEntrynumberNotIn(List<String> values) {
            addCriterion("entryNumber not in", values, "entrynumber");
            return (Criteria) this;
        }

        public Criteria andEntrynumberBetween(String value1, String value2) {
            addCriterion("entryNumber between", value1, value2, "entrynumber");
            return (Criteria) this;
        }

        public Criteria andEntrynumberNotBetween(String value1, String value2) {
            addCriterion("entryNumber not between", value1, value2, "entrynumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberIsNull() {
            addCriterion("outNumber is null");
            return (Criteria) this;
        }

        public Criteria andOutnumberIsNotNull() {
            addCriterion("outNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOutnumberEqualTo(String value) {
            addCriterion("outNumber =", value, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberNotEqualTo(String value) {
            addCriterion("outNumber <>", value, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberGreaterThan(String value) {
            addCriterion("outNumber >", value, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberGreaterThanOrEqualTo(String value) {
            addCriterion("outNumber >=", value, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberLessThan(String value) {
            addCriterion("outNumber <", value, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberLessThanOrEqualTo(String value) {
            addCriterion("outNumber <=", value, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberLike(String value) {
            addCriterion("outNumber like", value, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberNotLike(String value) {
            addCriterion("outNumber not like", value, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberIn(List<String> values) {
            addCriterion("outNumber in", values, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberNotIn(List<String> values) {
            addCriterion("outNumber not in", values, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberBetween(String value1, String value2) {
            addCriterion("outNumber between", value1, value2, "outnumber");
            return (Criteria) this;
        }

        public Criteria andOutnumberNotBetween(String value1, String value2) {
            addCriterion("outNumber not between", value1, value2, "outnumber");
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