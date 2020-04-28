package cn.sznk.terrace.bean;

import java.util.ArrayList;
import java.util.List;

public class TbManlablelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbManlablelExample() {
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

        public Criteria andLabelTypeIsNull() {
            addCriterion("label_type is null");
            return (Criteria) this;
        }

        public Criteria andLabelTypeIsNotNull() {
            addCriterion("label_type is not null");
            return (Criteria) this;
        }

        public Criteria andLabelTypeEqualTo(String value) {
            addCriterion("label_type =", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeNotEqualTo(String value) {
            addCriterion("label_type <>", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeGreaterThan(String value) {
            addCriterion("label_type >", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("label_type >=", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeLessThan(String value) {
            addCriterion("label_type <", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeLessThanOrEqualTo(String value) {
            addCriterion("label_type <=", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeLike(String value) {
            addCriterion("label_type like", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeNotLike(String value) {
            addCriterion("label_type not like", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeIn(List<String> values) {
            addCriterion("label_type in", values, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeNotIn(List<String> values) {
            addCriterion("label_type not in", values, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeBetween(String value1, String value2) {
            addCriterion("label_type between", value1, value2, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeNotBetween(String value1, String value2) {
            addCriterion("label_type not between", value1, value2, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelIdIsNull() {
            addCriterion("label_id is null");
            return (Criteria) this;
        }

        public Criteria andLabelIdIsNotNull() {
            addCriterion("label_id is not null");
            return (Criteria) this;
        }

        public Criteria andLabelIdEqualTo(Integer value) {
            addCriterion("label_id =", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotEqualTo(Integer value) {
            addCriterion("label_id <>", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdGreaterThan(Integer value) {
            addCriterion("label_id >", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("label_id >=", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLessThan(Integer value) {
            addCriterion("label_id <", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLessThanOrEqualTo(Integer value) {
            addCriterion("label_id <=", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdIn(List<Integer> values) {
            addCriterion("label_id in", values, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotIn(List<Integer> values) {
            addCriterion("label_id not in", values, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdBetween(Integer value1, Integer value2) {
            addCriterion("label_id between", value1, value2, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("label_id not between", value1, value2, "labelId");
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

        public Criteria andLabelNameIsNull() {
            addCriterion("label_name is null");
            return (Criteria) this;
        }

        public Criteria andLabelNameIsNotNull() {
            addCriterion("label_name is not null");
            return (Criteria) this;
        }

        public Criteria andLabelNameEqualTo(String value) {
            addCriterion("label_name =", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotEqualTo(String value) {
            addCriterion("label_name <>", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameGreaterThan(String value) {
            addCriterion("label_name >", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameGreaterThanOrEqualTo(String value) {
            addCriterion("label_name >=", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLessThan(String value) {
            addCriterion("label_name <", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLessThanOrEqualTo(String value) {
            addCriterion("label_name <=", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameLike(String value) {
            addCriterion("label_name like", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotLike(String value) {
            addCriterion("label_name not like", value, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameIn(List<String> values) {
            addCriterion("label_name in", values, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotIn(List<String> values) {
            addCriterion("label_name not in", values, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameBetween(String value1, String value2) {
            addCriterion("label_name between", value1, value2, "labelName");
            return (Criteria) this;
        }

        public Criteria andLabelNameNotBetween(String value1, String value2) {
            addCriterion("label_name not between", value1, value2, "labelName");
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