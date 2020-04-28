package cn.sznk.terrace.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbDynamicalarmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbDynamicalarmExample() {
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

        public Criteria andAlarmIdIsNull() {
            addCriterion("alarm_id is null");
            return (Criteria) this;
        }

        public Criteria andAlarmIdIsNotNull() {
            addCriterion("alarm_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmIdEqualTo(Integer value) {
            addCriterion("alarm_id =", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdNotEqualTo(Integer value) {
            addCriterion("alarm_id <>", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdGreaterThan(Integer value) {
            addCriterion("alarm_id >", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_id >=", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdLessThan(Integer value) {
            addCriterion("alarm_id <", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_id <=", value, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdIn(List<Integer> values) {
            addCriterion("alarm_id in", values, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdNotIn(List<Integer> values) {
            addCriterion("alarm_id not in", values, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdBetween(Integer value1, Integer value2) {
            addCriterion("alarm_id between", value1, value2, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_id not between", value1, value2, "alarmId");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIsNull() {
            addCriterion("alarm_time is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIsNotNull() {
            addCriterion("alarm_time is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeEqualTo(Date value) {
            addCriterion("alarm_time =", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotEqualTo(Date value) {
            addCriterion("alarm_time <>", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeGreaterThan(Date value) {
            addCriterion("alarm_time >", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("alarm_time >=", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeLessThan(Date value) {
            addCriterion("alarm_time <", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeLessThanOrEqualTo(Date value) {
            addCriterion("alarm_time <=", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIn(List<Date> values) {
            addCriterion("alarm_time in", values, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotIn(List<Date> values) {
            addCriterion("alarm_time not in", values, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeBetween(Date value1, Date value2) {
            addCriterion("alarm_time between", value1, value2, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotBetween(Date value1, Date value2) {
            addCriterion("alarm_time not between", value1, value2, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmStateIsNull() {
            addCriterion("alarm_state is null");
            return (Criteria) this;
        }

        public Criteria andAlarmStateIsNotNull() {
            addCriterion("alarm_state is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmStateEqualTo(Integer value) {
            addCriterion("alarm_state =", value, "alarmState");
            return (Criteria) this;
        }

        public Criteria andAlarmStateNotEqualTo(Integer value) {
            addCriterion("alarm_state <>", value, "alarmState");
            return (Criteria) this;
        }

        public Criteria andAlarmStateGreaterThan(Integer value) {
            addCriterion("alarm_state >", value, "alarmState");
            return (Criteria) this;
        }

        public Criteria andAlarmStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_state >=", value, "alarmState");
            return (Criteria) this;
        }

        public Criteria andAlarmStateLessThan(Integer value) {
            addCriterion("alarm_state <", value, "alarmState");
            return (Criteria) this;
        }

        public Criteria andAlarmStateLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_state <=", value, "alarmState");
            return (Criteria) this;
        }

        public Criteria andAlarmStateIn(List<Integer> values) {
            addCriterion("alarm_state in", values, "alarmState");
            return (Criteria) this;
        }

        public Criteria andAlarmStateNotIn(List<Integer> values) {
            addCriterion("alarm_state not in", values, "alarmState");
            return (Criteria) this;
        }

        public Criteria andAlarmStateBetween(Integer value1, Integer value2) {
            addCriterion("alarm_state between", value1, value2, "alarmState");
            return (Criteria) this;
        }

        public Criteria andAlarmStateNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_state not between", value1, value2, "alarmState");
            return (Criteria) this;
        }

        public Criteria andAlarmTitleIsNull() {
            addCriterion("alarm_title is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTitleIsNotNull() {
            addCriterion("alarm_title is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTitleEqualTo(String value) {
            addCriterion("alarm_title =", value, "alarmTitle");
            return (Criteria) this;
        }

        public Criteria andAlarmTitleNotEqualTo(String value) {
            addCriterion("alarm_title <>", value, "alarmTitle");
            return (Criteria) this;
        }

        public Criteria andAlarmTitleGreaterThan(String value) {
            addCriterion("alarm_title >", value, "alarmTitle");
            return (Criteria) this;
        }

        public Criteria andAlarmTitleGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_title >=", value, "alarmTitle");
            return (Criteria) this;
        }

        public Criteria andAlarmTitleLessThan(String value) {
            addCriterion("alarm_title <", value, "alarmTitle");
            return (Criteria) this;
        }

        public Criteria andAlarmTitleLessThanOrEqualTo(String value) {
            addCriterion("alarm_title <=", value, "alarmTitle");
            return (Criteria) this;
        }

        public Criteria andAlarmTitleLike(String value) {
            addCriterion("alarm_title like", value, "alarmTitle");
            return (Criteria) this;
        }

        public Criteria andAlarmTitleNotLike(String value) {
            addCriterion("alarm_title not like", value, "alarmTitle");
            return (Criteria) this;
        }

        public Criteria andAlarmTitleIn(List<String> values) {
            addCriterion("alarm_title in", values, "alarmTitle");
            return (Criteria) this;
        }

        public Criteria andAlarmTitleNotIn(List<String> values) {
            addCriterion("alarm_title not in", values, "alarmTitle");
            return (Criteria) this;
        }

        public Criteria andAlarmTitleBetween(String value1, String value2) {
            addCriterion("alarm_title between", value1, value2, "alarmTitle");
            return (Criteria) this;
        }

        public Criteria andAlarmTitleNotBetween(String value1, String value2) {
            addCriterion("alarm_title not between", value1, value2, "alarmTitle");
            return (Criteria) this;
        }

        public Criteria andAlarmDetilsIsNull() {
            addCriterion("alarm_detils is null");
            return (Criteria) this;
        }

        public Criteria andAlarmDetilsIsNotNull() {
            addCriterion("alarm_detils is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmDetilsEqualTo(String value) {
            addCriterion("alarm_detils =", value, "alarmDetils");
            return (Criteria) this;
        }

        public Criteria andAlarmDetilsNotEqualTo(String value) {
            addCriterion("alarm_detils <>", value, "alarmDetils");
            return (Criteria) this;
        }

        public Criteria andAlarmDetilsGreaterThan(String value) {
            addCriterion("alarm_detils >", value, "alarmDetils");
            return (Criteria) this;
        }

        public Criteria andAlarmDetilsGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_detils >=", value, "alarmDetils");
            return (Criteria) this;
        }

        public Criteria andAlarmDetilsLessThan(String value) {
            addCriterion("alarm_detils <", value, "alarmDetils");
            return (Criteria) this;
        }

        public Criteria andAlarmDetilsLessThanOrEqualTo(String value) {
            addCriterion("alarm_detils <=", value, "alarmDetils");
            return (Criteria) this;
        }

        public Criteria andAlarmDetilsLike(String value) {
            addCriterion("alarm_detils like", value, "alarmDetils");
            return (Criteria) this;
        }

        public Criteria andAlarmDetilsNotLike(String value) {
            addCriterion("alarm_detils not like", value, "alarmDetils");
            return (Criteria) this;
        }

        public Criteria andAlarmDetilsIn(List<String> values) {
            addCriterion("alarm_detils in", values, "alarmDetils");
            return (Criteria) this;
        }

        public Criteria andAlarmDetilsNotIn(List<String> values) {
            addCriterion("alarm_detils not in", values, "alarmDetils");
            return (Criteria) this;
        }

        public Criteria andAlarmDetilsBetween(String value1, String value2) {
            addCriterion("alarm_detils between", value1, value2, "alarmDetils");
            return (Criteria) this;
        }

        public Criteria andAlarmDetilsNotBetween(String value1, String value2) {
            addCriterion("alarm_detils not between", value1, value2, "alarmDetils");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelIsNull() {
            addCriterion("alarm_level is null");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelIsNotNull() {
            addCriterion("alarm_level is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelEqualTo(String value) {
            addCriterion("alarm_level =", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelNotEqualTo(String value) {
            addCriterion("alarm_level <>", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelGreaterThan(String value) {
            addCriterion("alarm_level >", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_level >=", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelLessThan(String value) {
            addCriterion("alarm_level <", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelLessThanOrEqualTo(String value) {
            addCriterion("alarm_level <=", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelLike(String value) {
            addCriterion("alarm_level like", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelNotLike(String value) {
            addCriterion("alarm_level not like", value, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelIn(List<String> values) {
            addCriterion("alarm_level in", values, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelNotIn(List<String> values) {
            addCriterion("alarm_level not in", values, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelBetween(String value1, String value2) {
            addCriterion("alarm_level between", value1, value2, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmLevelNotBetween(String value1, String value2) {
            addCriterion("alarm_level not between", value1, value2, "alarmLevel");
            return (Criteria) this;
        }

        public Criteria andAlarmGroupIsNull() {
            addCriterion("alarm_group is null");
            return (Criteria) this;
        }

        public Criteria andAlarmGroupIsNotNull() {
            addCriterion("alarm_group is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmGroupEqualTo(String value) {
            addCriterion("alarm_group =", value, "alarmGroup");
            return (Criteria) this;
        }

        public Criteria andAlarmGroupNotEqualTo(String value) {
            addCriterion("alarm_group <>", value, "alarmGroup");
            return (Criteria) this;
        }

        public Criteria andAlarmGroupGreaterThan(String value) {
            addCriterion("alarm_group >", value, "alarmGroup");
            return (Criteria) this;
        }

        public Criteria andAlarmGroupGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_group >=", value, "alarmGroup");
            return (Criteria) this;
        }

        public Criteria andAlarmGroupLessThan(String value) {
            addCriterion("alarm_group <", value, "alarmGroup");
            return (Criteria) this;
        }

        public Criteria andAlarmGroupLessThanOrEqualTo(String value) {
            addCriterion("alarm_group <=", value, "alarmGroup");
            return (Criteria) this;
        }

        public Criteria andAlarmGroupLike(String value) {
            addCriterion("alarm_group like", value, "alarmGroup");
            return (Criteria) this;
        }

        public Criteria andAlarmGroupNotLike(String value) {
            addCriterion("alarm_group not like", value, "alarmGroup");
            return (Criteria) this;
        }

        public Criteria andAlarmGroupIn(List<String> values) {
            addCriterion("alarm_group in", values, "alarmGroup");
            return (Criteria) this;
        }

        public Criteria andAlarmGroupNotIn(List<String> values) {
            addCriterion("alarm_group not in", values, "alarmGroup");
            return (Criteria) this;
        }

        public Criteria andAlarmGroupBetween(String value1, String value2) {
            addCriterion("alarm_group between", value1, value2, "alarmGroup");
            return (Criteria) this;
        }

        public Criteria andAlarmGroupNotBetween(String value1, String value2) {
            addCriterion("alarm_group not between", value1, value2, "alarmGroup");
            return (Criteria) this;
        }

        public Criteria andAlarmAreaIsNull() {
            addCriterion("alarm_area is null");
            return (Criteria) this;
        }

        public Criteria andAlarmAreaIsNotNull() {
            addCriterion("alarm_area is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmAreaEqualTo(String value) {
            addCriterion("alarm_area =", value, "alarmArea");
            return (Criteria) this;
        }

        public Criteria andAlarmAreaNotEqualTo(String value) {
            addCriterion("alarm_area <>", value, "alarmArea");
            return (Criteria) this;
        }

        public Criteria andAlarmAreaGreaterThan(String value) {
            addCriterion("alarm_area >", value, "alarmArea");
            return (Criteria) this;
        }

        public Criteria andAlarmAreaGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_area >=", value, "alarmArea");
            return (Criteria) this;
        }

        public Criteria andAlarmAreaLessThan(String value) {
            addCriterion("alarm_area <", value, "alarmArea");
            return (Criteria) this;
        }

        public Criteria andAlarmAreaLessThanOrEqualTo(String value) {
            addCriterion("alarm_area <=", value, "alarmArea");
            return (Criteria) this;
        }

        public Criteria andAlarmAreaLike(String value) {
            addCriterion("alarm_area like", value, "alarmArea");
            return (Criteria) this;
        }

        public Criteria andAlarmAreaNotLike(String value) {
            addCriterion("alarm_area not like", value, "alarmArea");
            return (Criteria) this;
        }

        public Criteria andAlarmAreaIn(List<String> values) {
            addCriterion("alarm_area in", values, "alarmArea");
            return (Criteria) this;
        }

        public Criteria andAlarmAreaNotIn(List<String> values) {
            addCriterion("alarm_area not in", values, "alarmArea");
            return (Criteria) this;
        }

        public Criteria andAlarmAreaBetween(String value1, String value2) {
            addCriterion("alarm_area between", value1, value2, "alarmArea");
            return (Criteria) this;
        }

        public Criteria andAlarmAreaNotBetween(String value1, String value2) {
            addCriterion("alarm_area not between", value1, value2, "alarmArea");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIsNull() {
            addCriterion("alarm_type is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIsNotNull() {
            addCriterion("alarm_type is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeEqualTo(Integer value) {
            addCriterion("alarm_type =", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotEqualTo(Integer value) {
            addCriterion("alarm_type <>", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeGreaterThan(Integer value) {
            addCriterion("alarm_type >", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_type >=", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLessThan(Integer value) {
            addCriterion("alarm_type <", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_type <=", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIn(List<Integer> values) {
            addCriterion("alarm_type in", values, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotIn(List<Integer> values) {
            addCriterion("alarm_type not in", values, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeBetween(Integer value1, Integer value2) {
            addCriterion("alarm_type between", value1, value2, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_type not between", value1, value2, "alarmType");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNull() {
            addCriterion("dept_code is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("dept_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("dept_code =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("dept_code <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("dept_code >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dept_code >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("dept_code <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("dept_code <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("dept_code like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("dept_code not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("dept_code in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("dept_code not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("dept_code between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("dept_code not between", value1, value2, "deptCode");
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