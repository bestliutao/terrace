package cn.sznk.terrace.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbMonitorabnormalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMonitorabnormalExample() {
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

        public Criteria andMonitorIpIsNull() {
            addCriterion("monitor_ip is null");
            return (Criteria) this;
        }

        public Criteria andMonitorIpIsNotNull() {
            addCriterion("monitor_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorIpEqualTo(String value) {
            addCriterion("monitor_ip =", value, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpNotEqualTo(String value) {
            addCriterion("monitor_ip <>", value, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpGreaterThan(String value) {
            addCriterion("monitor_ip >", value, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_ip >=", value, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpLessThan(String value) {
            addCriterion("monitor_ip <", value, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpLessThanOrEqualTo(String value) {
            addCriterion("monitor_ip <=", value, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpLike(String value) {
            addCriterion("monitor_ip like", value, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpNotLike(String value) {
            addCriterion("monitor_ip not like", value, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpIn(List<String> values) {
            addCriterion("monitor_ip in", values, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpNotIn(List<String> values) {
            addCriterion("monitor_ip not in", values, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpBetween(String value1, String value2) {
            addCriterion("monitor_ip between", value1, value2, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorIpNotBetween(String value1, String value2) {
            addCriterion("monitor_ip not between", value1, value2, "monitorIp");
            return (Criteria) this;
        }

        public Criteria andMonitorTimeIsNull() {
            addCriterion("monitor_time is null");
            return (Criteria) this;
        }

        public Criteria andMonitorTimeIsNotNull() {
            addCriterion("monitor_time is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorTimeEqualTo(Date value) {
            addCriterion("monitor_time =", value, "monitorTime");
            return (Criteria) this;
        }

        public Criteria andMonitorTimeNotEqualTo(Date value) {
            addCriterion("monitor_time <>", value, "monitorTime");
            return (Criteria) this;
        }

        public Criteria andMonitorTimeGreaterThan(Date value) {
            addCriterion("monitor_time >", value, "monitorTime");
            return (Criteria) this;
        }

        public Criteria andMonitorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("monitor_time >=", value, "monitorTime");
            return (Criteria) this;
        }

        public Criteria andMonitorTimeLessThan(Date value) {
            addCriterion("monitor_time <", value, "monitorTime");
            return (Criteria) this;
        }

        public Criteria andMonitorTimeLessThanOrEqualTo(Date value) {
            addCriterion("monitor_time <=", value, "monitorTime");
            return (Criteria) this;
        }

        public Criteria andMonitorTimeIn(List<Date> values) {
            addCriterion("monitor_time in", values, "monitorTime");
            return (Criteria) this;
        }

        public Criteria andMonitorTimeNotIn(List<Date> values) {
            addCriterion("monitor_time not in", values, "monitorTime");
            return (Criteria) this;
        }

        public Criteria andMonitorTimeBetween(Date value1, Date value2) {
            addCriterion("monitor_time between", value1, value2, "monitorTime");
            return (Criteria) this;
        }

        public Criteria andMonitorTimeNotBetween(Date value1, Date value2) {
            addCriterion("monitor_time not between", value1, value2, "monitorTime");
            return (Criteria) this;
        }

        public Criteria andMonitorStateIsNull() {
            addCriterion("monitor_state is null");
            return (Criteria) this;
        }

        public Criteria andMonitorStateIsNotNull() {
            addCriterion("monitor_state is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorStateEqualTo(Integer value) {
            addCriterion("monitor_state =", value, "monitorState");
            return (Criteria) this;
        }

        public Criteria andMonitorStateNotEqualTo(Integer value) {
            addCriterion("monitor_state <>", value, "monitorState");
            return (Criteria) this;
        }

        public Criteria andMonitorStateGreaterThan(Integer value) {
            addCriterion("monitor_state >", value, "monitorState");
            return (Criteria) this;
        }

        public Criteria andMonitorStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("monitor_state >=", value, "monitorState");
            return (Criteria) this;
        }

        public Criteria andMonitorStateLessThan(Integer value) {
            addCriterion("monitor_state <", value, "monitorState");
            return (Criteria) this;
        }

        public Criteria andMonitorStateLessThanOrEqualTo(Integer value) {
            addCriterion("monitor_state <=", value, "monitorState");
            return (Criteria) this;
        }

        public Criteria andMonitorStateIn(List<Integer> values) {
            addCriterion("monitor_state in", values, "monitorState");
            return (Criteria) this;
        }

        public Criteria andMonitorStateNotIn(List<Integer> values) {
            addCriterion("monitor_state not in", values, "monitorState");
            return (Criteria) this;
        }

        public Criteria andMonitorStateBetween(Integer value1, Integer value2) {
            addCriterion("monitor_state between", value1, value2, "monitorState");
            return (Criteria) this;
        }

        public Criteria andMonitorStateNotBetween(Integer value1, Integer value2) {
            addCriterion("monitor_state not between", value1, value2, "monitorState");
            return (Criteria) this;
        }

        public Criteria andMonitorLevelIsNull() {
            addCriterion("monitor_level is null");
            return (Criteria) this;
        }

        public Criteria andMonitorLevelIsNotNull() {
            addCriterion("monitor_level is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorLevelEqualTo(String value) {
            addCriterion("monitor_level =", value, "monitorLevel");
            return (Criteria) this;
        }

        public Criteria andMonitorLevelNotEqualTo(String value) {
            addCriterion("monitor_level <>", value, "monitorLevel");
            return (Criteria) this;
        }

        public Criteria andMonitorLevelGreaterThan(String value) {
            addCriterion("monitor_level >", value, "monitorLevel");
            return (Criteria) this;
        }

        public Criteria andMonitorLevelGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_level >=", value, "monitorLevel");
            return (Criteria) this;
        }

        public Criteria andMonitorLevelLessThan(String value) {
            addCriterion("monitor_level <", value, "monitorLevel");
            return (Criteria) this;
        }

        public Criteria andMonitorLevelLessThanOrEqualTo(String value) {
            addCriterion("monitor_level <=", value, "monitorLevel");
            return (Criteria) this;
        }

        public Criteria andMonitorLevelLike(String value) {
            addCriterion("monitor_level like", value, "monitorLevel");
            return (Criteria) this;
        }

        public Criteria andMonitorLevelNotLike(String value) {
            addCriterion("monitor_level not like", value, "monitorLevel");
            return (Criteria) this;
        }

        public Criteria andMonitorLevelIn(List<String> values) {
            addCriterion("monitor_level in", values, "monitorLevel");
            return (Criteria) this;
        }

        public Criteria andMonitorLevelNotIn(List<String> values) {
            addCriterion("monitor_level not in", values, "monitorLevel");
            return (Criteria) this;
        }

        public Criteria andMonitorLevelBetween(String value1, String value2) {
            addCriterion("monitor_level between", value1, value2, "monitorLevel");
            return (Criteria) this;
        }

        public Criteria andMonitorLevelNotBetween(String value1, String value2) {
            addCriterion("monitor_level not between", value1, value2, "monitorLevel");
            return (Criteria) this;
        }

        public Criteria andMonitorGroupIsNull() {
            addCriterion("monitor_group is null");
            return (Criteria) this;
        }

        public Criteria andMonitorGroupIsNotNull() {
            addCriterion("monitor_group is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorGroupEqualTo(String value) {
            addCriterion("monitor_group =", value, "monitorGroup");
            return (Criteria) this;
        }

        public Criteria andMonitorGroupNotEqualTo(String value) {
            addCriterion("monitor_group <>", value, "monitorGroup");
            return (Criteria) this;
        }

        public Criteria andMonitorGroupGreaterThan(String value) {
            addCriterion("monitor_group >", value, "monitorGroup");
            return (Criteria) this;
        }

        public Criteria andMonitorGroupGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_group >=", value, "monitorGroup");
            return (Criteria) this;
        }

        public Criteria andMonitorGroupLessThan(String value) {
            addCriterion("monitor_group <", value, "monitorGroup");
            return (Criteria) this;
        }

        public Criteria andMonitorGroupLessThanOrEqualTo(String value) {
            addCriterion("monitor_group <=", value, "monitorGroup");
            return (Criteria) this;
        }

        public Criteria andMonitorGroupLike(String value) {
            addCriterion("monitor_group like", value, "monitorGroup");
            return (Criteria) this;
        }

        public Criteria andMonitorGroupNotLike(String value) {
            addCriterion("monitor_group not like", value, "monitorGroup");
            return (Criteria) this;
        }

        public Criteria andMonitorGroupIn(List<String> values) {
            addCriterion("monitor_group in", values, "monitorGroup");
            return (Criteria) this;
        }

        public Criteria andMonitorGroupNotIn(List<String> values) {
            addCriterion("monitor_group not in", values, "monitorGroup");
            return (Criteria) this;
        }

        public Criteria andMonitorGroupBetween(String value1, String value2) {
            addCriterion("monitor_group between", value1, value2, "monitorGroup");
            return (Criteria) this;
        }

        public Criteria andMonitorGroupNotBetween(String value1, String value2) {
            addCriterion("monitor_group not between", value1, value2, "monitorGroup");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaIsNull() {
            addCriterion("monitor_area is null");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaIsNotNull() {
            addCriterion("monitor_area is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaEqualTo(String value) {
            addCriterion("monitor_area =", value, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaNotEqualTo(String value) {
            addCriterion("monitor_area <>", value, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaGreaterThan(String value) {
            addCriterion("monitor_area >", value, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_area >=", value, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaLessThan(String value) {
            addCriterion("monitor_area <", value, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaLessThanOrEqualTo(String value) {
            addCriterion("monitor_area <=", value, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaLike(String value) {
            addCriterion("monitor_area like", value, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaNotLike(String value) {
            addCriterion("monitor_area not like", value, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaIn(List<String> values) {
            addCriterion("monitor_area in", values, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaNotIn(List<String> values) {
            addCriterion("monitor_area not in", values, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaBetween(String value1, String value2) {
            addCriterion("monitor_area between", value1, value2, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorAreaNotBetween(String value1, String value2) {
            addCriterion("monitor_area not between", value1, value2, "monitorArea");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeIsNull() {
            addCriterion("monitor_type is null");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeIsNotNull() {
            addCriterion("monitor_type is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeEqualTo(String value) {
            addCriterion("monitor_type =", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeNotEqualTo(String value) {
            addCriterion("monitor_type <>", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeGreaterThan(String value) {
            addCriterion("monitor_type >", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_type >=", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeLessThan(String value) {
            addCriterion("monitor_type <", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeLessThanOrEqualTo(String value) {
            addCriterion("monitor_type <=", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeLike(String value) {
            addCriterion("monitor_type like", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeNotLike(String value) {
            addCriterion("monitor_type not like", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeIn(List<String> values) {
            addCriterion("monitor_type in", values, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeNotIn(List<String> values) {
            addCriterion("monitor_type not in", values, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeBetween(String value1, String value2) {
            addCriterion("monitor_type between", value1, value2, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeNotBetween(String value1, String value2) {
            addCriterion("monitor_type not between", value1, value2, "monitorType");
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