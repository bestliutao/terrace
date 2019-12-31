package cn.sznk.terrace.bean;

import java.util.ArrayList;
import java.util.List;

public class TbLabellibExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbLabellibExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdioctoniaIsNull() {
            addCriterion("idioctonia is null");
            return (Criteria) this;
        }

        public Criteria andIdioctoniaIsNotNull() {
            addCriterion("idioctonia is not null");
            return (Criteria) this;
        }

        public Criteria andIdioctoniaEqualTo(Integer value) {
            addCriterion("idioctonia =", value, "idioctonia");
            return (Criteria) this;
        }

        public Criteria andIdioctoniaNotEqualTo(Integer value) {
            addCriterion("idioctonia <>", value, "idioctonia");
            return (Criteria) this;
        }

        public Criteria andIdioctoniaGreaterThan(Integer value) {
            addCriterion("idioctonia >", value, "idioctonia");
            return (Criteria) this;
        }

        public Criteria andIdioctoniaGreaterThanOrEqualTo(Integer value) {
            addCriterion("idioctonia >=", value, "idioctonia");
            return (Criteria) this;
        }

        public Criteria andIdioctoniaLessThan(Integer value) {
            addCriterion("idioctonia <", value, "idioctonia");
            return (Criteria) this;
        }

        public Criteria andIdioctoniaLessThanOrEqualTo(Integer value) {
            addCriterion("idioctonia <=", value, "idioctonia");
            return (Criteria) this;
        }

        public Criteria andIdioctoniaIn(List<Integer> values) {
            addCriterion("idioctonia in", values, "idioctonia");
            return (Criteria) this;
        }

        public Criteria andIdioctoniaNotIn(List<Integer> values) {
            addCriterion("idioctonia not in", values, "idioctonia");
            return (Criteria) this;
        }

        public Criteria andIdioctoniaBetween(Integer value1, Integer value2) {
            addCriterion("idioctonia between", value1, value2, "idioctonia");
            return (Criteria) this;
        }

        public Criteria andIdioctoniaNotBetween(Integer value1, Integer value2) {
            addCriterion("idioctonia not between", value1, value2, "idioctonia");
            return (Criteria) this;
        }

        public Criteria andGetawayIsNull() {
            addCriterion("getAway is null");
            return (Criteria) this;
        }

        public Criteria andGetawayIsNotNull() {
            addCriterion("getAway is not null");
            return (Criteria) this;
        }

        public Criteria andGetawayEqualTo(Integer value) {
            addCriterion("getAway =", value, "getaway");
            return (Criteria) this;
        }

        public Criteria andGetawayNotEqualTo(Integer value) {
            addCriterion("getAway <>", value, "getaway");
            return (Criteria) this;
        }

        public Criteria andGetawayGreaterThan(Integer value) {
            addCriterion("getAway >", value, "getaway");
            return (Criteria) this;
        }

        public Criteria andGetawayGreaterThanOrEqualTo(Integer value) {
            addCriterion("getAway >=", value, "getaway");
            return (Criteria) this;
        }

        public Criteria andGetawayLessThan(Integer value) {
            addCriterion("getAway <", value, "getaway");
            return (Criteria) this;
        }

        public Criteria andGetawayLessThanOrEqualTo(Integer value) {
            addCriterion("getAway <=", value, "getaway");
            return (Criteria) this;
        }

        public Criteria andGetawayIn(List<Integer> values) {
            addCriterion("getAway in", values, "getaway");
            return (Criteria) this;
        }

        public Criteria andGetawayNotIn(List<Integer> values) {
            addCriterion("getAway not in", values, "getaway");
            return (Criteria) this;
        }

        public Criteria andGetawayBetween(Integer value1, Integer value2) {
            addCriterion("getAway between", value1, value2, "getaway");
            return (Criteria) this;
        }

        public Criteria andGetawayNotBetween(Integer value1, Integer value2) {
            addCriterion("getAway not between", value1, value2, "getaway");
            return (Criteria) this;
        }

        public Criteria andCommitmurderIsNull() {
            addCriterion("commitMurder is null");
            return (Criteria) this;
        }

        public Criteria andCommitmurderIsNotNull() {
            addCriterion("commitMurder is not null");
            return (Criteria) this;
        }

        public Criteria andCommitmurderEqualTo(Integer value) {
            addCriterion("commitMurder =", value, "commitmurder");
            return (Criteria) this;
        }

        public Criteria andCommitmurderNotEqualTo(Integer value) {
            addCriterion("commitMurder <>", value, "commitmurder");
            return (Criteria) this;
        }

        public Criteria andCommitmurderGreaterThan(Integer value) {
            addCriterion("commitMurder >", value, "commitmurder");
            return (Criteria) this;
        }

        public Criteria andCommitmurderGreaterThanOrEqualTo(Integer value) {
            addCriterion("commitMurder >=", value, "commitmurder");
            return (Criteria) this;
        }

        public Criteria andCommitmurderLessThan(Integer value) {
            addCriterion("commitMurder <", value, "commitmurder");
            return (Criteria) this;
        }

        public Criteria andCommitmurderLessThanOrEqualTo(Integer value) {
            addCriterion("commitMurder <=", value, "commitmurder");
            return (Criteria) this;
        }

        public Criteria andCommitmurderIn(List<Integer> values) {
            addCriterion("commitMurder in", values, "commitmurder");
            return (Criteria) this;
        }

        public Criteria andCommitmurderNotIn(List<Integer> values) {
            addCriterion("commitMurder not in", values, "commitmurder");
            return (Criteria) this;
        }

        public Criteria andCommitmurderBetween(Integer value1, Integer value2) {
            addCriterion("commitMurder between", value1, value2, "commitmurder");
            return (Criteria) this;
        }

        public Criteria andCommitmurderNotBetween(Integer value1, Integer value2) {
            addCriterion("commitMurder not between", value1, value2, "commitmurder");
            return (Criteria) this;
        }

        public Criteria andSuddendeathIsNull() {
            addCriterion("suddenDeath is null");
            return (Criteria) this;
        }

        public Criteria andSuddendeathIsNotNull() {
            addCriterion("suddenDeath is not null");
            return (Criteria) this;
        }

        public Criteria andSuddendeathEqualTo(Integer value) {
            addCriterion("suddenDeath =", value, "suddendeath");
            return (Criteria) this;
        }

        public Criteria andSuddendeathNotEqualTo(Integer value) {
            addCriterion("suddenDeath <>", value, "suddendeath");
            return (Criteria) this;
        }

        public Criteria andSuddendeathGreaterThan(Integer value) {
            addCriterion("suddenDeath >", value, "suddendeath");
            return (Criteria) this;
        }

        public Criteria andSuddendeathGreaterThanOrEqualTo(Integer value) {
            addCriterion("suddenDeath >=", value, "suddendeath");
            return (Criteria) this;
        }

        public Criteria andSuddendeathLessThan(Integer value) {
            addCriterion("suddenDeath <", value, "suddendeath");
            return (Criteria) this;
        }

        public Criteria andSuddendeathLessThanOrEqualTo(Integer value) {
            addCriterion("suddenDeath <=", value, "suddendeath");
            return (Criteria) this;
        }

        public Criteria andSuddendeathIn(List<Integer> values) {
            addCriterion("suddenDeath in", values, "suddendeath");
            return (Criteria) this;
        }

        public Criteria andSuddendeathNotIn(List<Integer> values) {
            addCriterion("suddenDeath not in", values, "suddendeath");
            return (Criteria) this;
        }

        public Criteria andSuddendeathBetween(Integer value1, Integer value2) {
            addCriterion("suddenDeath between", value1, value2, "suddendeath");
            return (Criteria) this;
        }

        public Criteria andSuddendeathNotBetween(Integer value1, Integer value2) {
            addCriterion("suddenDeath not between", value1, value2, "suddendeath");
            return (Criteria) this;
        }

        public Criteria andTermvalidityIsNull() {
            addCriterion("termValidity is null");
            return (Criteria) this;
        }

        public Criteria andTermvalidityIsNotNull() {
            addCriterion("termValidity is not null");
            return (Criteria) this;
        }

        public Criteria andTermvalidityEqualTo(String value) {
            addCriterion("termValidity =", value, "termvalidity");
            return (Criteria) this;
        }

        public Criteria andTermvalidityNotEqualTo(String value) {
            addCriterion("termValidity <>", value, "termvalidity");
            return (Criteria) this;
        }

        public Criteria andTermvalidityGreaterThan(String value) {
            addCriterion("termValidity >", value, "termvalidity");
            return (Criteria) this;
        }

        public Criteria andTermvalidityGreaterThanOrEqualTo(String value) {
            addCriterion("termValidity >=", value, "termvalidity");
            return (Criteria) this;
        }

        public Criteria andTermvalidityLessThan(String value) {
            addCriterion("termValidity <", value, "termvalidity");
            return (Criteria) this;
        }

        public Criteria andTermvalidityLessThanOrEqualTo(String value) {
            addCriterion("termValidity <=", value, "termvalidity");
            return (Criteria) this;
        }

        public Criteria andTermvalidityLike(String value) {
            addCriterion("termValidity like", value, "termvalidity");
            return (Criteria) this;
        }

        public Criteria andTermvalidityNotLike(String value) {
            addCriterion("termValidity not like", value, "termvalidity");
            return (Criteria) this;
        }

        public Criteria andTermvalidityIn(List<String> values) {
            addCriterion("termValidity in", values, "termvalidity");
            return (Criteria) this;
        }

        public Criteria andTermvalidityNotIn(List<String> values) {
            addCriterion("termValidity not in", values, "termvalidity");
            return (Criteria) this;
        }

        public Criteria andTermvalidityBetween(String value1, String value2) {
            addCriterion("termValidity between", value1, value2, "termvalidity");
            return (Criteria) this;
        }

        public Criteria andTermvalidityNotBetween(String value1, String value2) {
            addCriterion("termValidity not between", value1, value2, "termvalidity");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNull() {
            addCriterion("frequency is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNotNull() {
            addCriterion("frequency is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyEqualTo(Integer value) {
            addCriterion("frequency =", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotEqualTo(Integer value) {
            addCriterion("frequency <>", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThan(Integer value) {
            addCriterion("frequency >", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("frequency >=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThan(Integer value) {
            addCriterion("frequency <", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("frequency <=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyIn(List<Integer> values) {
            addCriterion("frequency in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotIn(List<Integer> values) {
            addCriterion("frequency not in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("frequency between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("frequency not between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andProposalIsNull() {
            addCriterion("proposal is null");
            return (Criteria) this;
        }

        public Criteria andProposalIsNotNull() {
            addCriterion("proposal is not null");
            return (Criteria) this;
        }

        public Criteria andProposalEqualTo(String value) {
            addCriterion("proposal =", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalNotEqualTo(String value) {
            addCriterion("proposal <>", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalGreaterThan(String value) {
            addCriterion("proposal >", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalGreaterThanOrEqualTo(String value) {
            addCriterion("proposal >=", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalLessThan(String value) {
            addCriterion("proposal <", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalLessThanOrEqualTo(String value) {
            addCriterion("proposal <=", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalLike(String value) {
            addCriterion("proposal like", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalNotLike(String value) {
            addCriterion("proposal not like", value, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalIn(List<String> values) {
            addCriterion("proposal in", values, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalNotIn(List<String> values) {
            addCriterion("proposal not in", values, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalBetween(String value1, String value2) {
            addCriterion("proposal between", value1, value2, "proposal");
            return (Criteria) this;
        }

        public Criteria andProposalNotBetween(String value1, String value2) {
            addCriterion("proposal not between", value1, value2, "proposal");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
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