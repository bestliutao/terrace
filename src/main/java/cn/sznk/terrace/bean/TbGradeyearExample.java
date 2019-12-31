package cn.sznk.terrace.bean;

import java.util.ArrayList;
import java.util.List;

public class TbGradeyearExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbGradeyearExample() {
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

        public Criteria andStatgeIsNull() {
            addCriterion("statge is null");
            return (Criteria) this;
        }

        public Criteria andStatgeIsNotNull() {
            addCriterion("statge is not null");
            return (Criteria) this;
        }

        public Criteria andStatgeEqualTo(String value) {
            addCriterion("statge =", value, "statge");
            return (Criteria) this;
        }

        public Criteria andStatgeNotEqualTo(String value) {
            addCriterion("statge <>", value, "statge");
            return (Criteria) this;
        }

        public Criteria andStatgeGreaterThan(String value) {
            addCriterion("statge >", value, "statge");
            return (Criteria) this;
        }

        public Criteria andStatgeGreaterThanOrEqualTo(String value) {
            addCriterion("statge >=", value, "statge");
            return (Criteria) this;
        }

        public Criteria andStatgeLessThan(String value) {
            addCriterion("statge <", value, "statge");
            return (Criteria) this;
        }

        public Criteria andStatgeLessThanOrEqualTo(String value) {
            addCriterion("statge <=", value, "statge");
            return (Criteria) this;
        }

        public Criteria andStatgeLike(String value) {
            addCriterion("statge like", value, "statge");
            return (Criteria) this;
        }

        public Criteria andStatgeNotLike(String value) {
            addCriterion("statge not like", value, "statge");
            return (Criteria) this;
        }

        public Criteria andStatgeIn(List<String> values) {
            addCriterion("statge in", values, "statge");
            return (Criteria) this;
        }

        public Criteria andStatgeNotIn(List<String> values) {
            addCriterion("statge not in", values, "statge");
            return (Criteria) this;
        }

        public Criteria andStatgeBetween(String value1, String value2) {
            addCriterion("statge between", value1, value2, "statge");
            return (Criteria) this;
        }

        public Criteria andStatgeNotBetween(String value1, String value2) {
            addCriterion("statge not between", value1, value2, "statge");
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

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andJanGradeIsNull() {
            addCriterion("jan_grade is null");
            return (Criteria) this;
        }

        public Criteria andJanGradeIsNotNull() {
            addCriterion("jan_grade is not null");
            return (Criteria) this;
        }

        public Criteria andJanGradeEqualTo(String value) {
            addCriterion("jan_grade =", value, "janGrade");
            return (Criteria) this;
        }

        public Criteria andJanGradeNotEqualTo(String value) {
            addCriterion("jan_grade <>", value, "janGrade");
            return (Criteria) this;
        }

        public Criteria andJanGradeGreaterThan(String value) {
            addCriterion("jan_grade >", value, "janGrade");
            return (Criteria) this;
        }

        public Criteria andJanGradeGreaterThanOrEqualTo(String value) {
            addCriterion("jan_grade >=", value, "janGrade");
            return (Criteria) this;
        }

        public Criteria andJanGradeLessThan(String value) {
            addCriterion("jan_grade <", value, "janGrade");
            return (Criteria) this;
        }

        public Criteria andJanGradeLessThanOrEqualTo(String value) {
            addCriterion("jan_grade <=", value, "janGrade");
            return (Criteria) this;
        }

        public Criteria andJanGradeLike(String value) {
            addCriterion("jan_grade like", value, "janGrade");
            return (Criteria) this;
        }

        public Criteria andJanGradeNotLike(String value) {
            addCriterion("jan_grade not like", value, "janGrade");
            return (Criteria) this;
        }

        public Criteria andJanGradeIn(List<String> values) {
            addCriterion("jan_grade in", values, "janGrade");
            return (Criteria) this;
        }

        public Criteria andJanGradeNotIn(List<String> values) {
            addCriterion("jan_grade not in", values, "janGrade");
            return (Criteria) this;
        }

        public Criteria andJanGradeBetween(String value1, String value2) {
            addCriterion("jan_grade between", value1, value2, "janGrade");
            return (Criteria) this;
        }

        public Criteria andJanGradeNotBetween(String value1, String value2) {
            addCriterion("jan_grade not between", value1, value2, "janGrade");
            return (Criteria) this;
        }

        public Criteria andFebGradeIsNull() {
            addCriterion("feb_grade is null");
            return (Criteria) this;
        }

        public Criteria andFebGradeIsNotNull() {
            addCriterion("feb_grade is not null");
            return (Criteria) this;
        }

        public Criteria andFebGradeEqualTo(String value) {
            addCriterion("feb_grade =", value, "febGrade");
            return (Criteria) this;
        }

        public Criteria andFebGradeNotEqualTo(String value) {
            addCriterion("feb_grade <>", value, "febGrade");
            return (Criteria) this;
        }

        public Criteria andFebGradeGreaterThan(String value) {
            addCriterion("feb_grade >", value, "febGrade");
            return (Criteria) this;
        }

        public Criteria andFebGradeGreaterThanOrEqualTo(String value) {
            addCriterion("feb_grade >=", value, "febGrade");
            return (Criteria) this;
        }

        public Criteria andFebGradeLessThan(String value) {
            addCriterion("feb_grade <", value, "febGrade");
            return (Criteria) this;
        }

        public Criteria andFebGradeLessThanOrEqualTo(String value) {
            addCriterion("feb_grade <=", value, "febGrade");
            return (Criteria) this;
        }

        public Criteria andFebGradeLike(String value) {
            addCriterion("feb_grade like", value, "febGrade");
            return (Criteria) this;
        }

        public Criteria andFebGradeNotLike(String value) {
            addCriterion("feb_grade not like", value, "febGrade");
            return (Criteria) this;
        }

        public Criteria andFebGradeIn(List<String> values) {
            addCriterion("feb_grade in", values, "febGrade");
            return (Criteria) this;
        }

        public Criteria andFebGradeNotIn(List<String> values) {
            addCriterion("feb_grade not in", values, "febGrade");
            return (Criteria) this;
        }

        public Criteria andFebGradeBetween(String value1, String value2) {
            addCriterion("feb_grade between", value1, value2, "febGrade");
            return (Criteria) this;
        }

        public Criteria andFebGradeNotBetween(String value1, String value2) {
            addCriterion("feb_grade not between", value1, value2, "febGrade");
            return (Criteria) this;
        }

        public Criteria andMarGradeIsNull() {
            addCriterion("mar_grade is null");
            return (Criteria) this;
        }

        public Criteria andMarGradeIsNotNull() {
            addCriterion("mar_grade is not null");
            return (Criteria) this;
        }

        public Criteria andMarGradeEqualTo(String value) {
            addCriterion("mar_grade =", value, "marGrade");
            return (Criteria) this;
        }

        public Criteria andMarGradeNotEqualTo(String value) {
            addCriterion("mar_grade <>", value, "marGrade");
            return (Criteria) this;
        }

        public Criteria andMarGradeGreaterThan(String value) {
            addCriterion("mar_grade >", value, "marGrade");
            return (Criteria) this;
        }

        public Criteria andMarGradeGreaterThanOrEqualTo(String value) {
            addCriterion("mar_grade >=", value, "marGrade");
            return (Criteria) this;
        }

        public Criteria andMarGradeLessThan(String value) {
            addCriterion("mar_grade <", value, "marGrade");
            return (Criteria) this;
        }

        public Criteria andMarGradeLessThanOrEqualTo(String value) {
            addCriterion("mar_grade <=", value, "marGrade");
            return (Criteria) this;
        }

        public Criteria andMarGradeLike(String value) {
            addCriterion("mar_grade like", value, "marGrade");
            return (Criteria) this;
        }

        public Criteria andMarGradeNotLike(String value) {
            addCriterion("mar_grade not like", value, "marGrade");
            return (Criteria) this;
        }

        public Criteria andMarGradeIn(List<String> values) {
            addCriterion("mar_grade in", values, "marGrade");
            return (Criteria) this;
        }

        public Criteria andMarGradeNotIn(List<String> values) {
            addCriterion("mar_grade not in", values, "marGrade");
            return (Criteria) this;
        }

        public Criteria andMarGradeBetween(String value1, String value2) {
            addCriterion("mar_grade between", value1, value2, "marGrade");
            return (Criteria) this;
        }

        public Criteria andMarGradeNotBetween(String value1, String value2) {
            addCriterion("mar_grade not between", value1, value2, "marGrade");
            return (Criteria) this;
        }

        public Criteria andAprGradeIsNull() {
            addCriterion("apr_grade is null");
            return (Criteria) this;
        }

        public Criteria andAprGradeIsNotNull() {
            addCriterion("apr_grade is not null");
            return (Criteria) this;
        }

        public Criteria andAprGradeEqualTo(String value) {
            addCriterion("apr_grade =", value, "aprGrade");
            return (Criteria) this;
        }

        public Criteria andAprGradeNotEqualTo(String value) {
            addCriterion("apr_grade <>", value, "aprGrade");
            return (Criteria) this;
        }

        public Criteria andAprGradeGreaterThan(String value) {
            addCriterion("apr_grade >", value, "aprGrade");
            return (Criteria) this;
        }

        public Criteria andAprGradeGreaterThanOrEqualTo(String value) {
            addCriterion("apr_grade >=", value, "aprGrade");
            return (Criteria) this;
        }

        public Criteria andAprGradeLessThan(String value) {
            addCriterion("apr_grade <", value, "aprGrade");
            return (Criteria) this;
        }

        public Criteria andAprGradeLessThanOrEqualTo(String value) {
            addCriterion("apr_grade <=", value, "aprGrade");
            return (Criteria) this;
        }

        public Criteria andAprGradeLike(String value) {
            addCriterion("apr_grade like", value, "aprGrade");
            return (Criteria) this;
        }

        public Criteria andAprGradeNotLike(String value) {
            addCriterion("apr_grade not like", value, "aprGrade");
            return (Criteria) this;
        }

        public Criteria andAprGradeIn(List<String> values) {
            addCriterion("apr_grade in", values, "aprGrade");
            return (Criteria) this;
        }

        public Criteria andAprGradeNotIn(List<String> values) {
            addCriterion("apr_grade not in", values, "aprGrade");
            return (Criteria) this;
        }

        public Criteria andAprGradeBetween(String value1, String value2) {
            addCriterion("apr_grade between", value1, value2, "aprGrade");
            return (Criteria) this;
        }

        public Criteria andAprGradeNotBetween(String value1, String value2) {
            addCriterion("apr_grade not between", value1, value2, "aprGrade");
            return (Criteria) this;
        }

        public Criteria andMayGradeIsNull() {
            addCriterion("may_grade is null");
            return (Criteria) this;
        }

        public Criteria andMayGradeIsNotNull() {
            addCriterion("may_grade is not null");
            return (Criteria) this;
        }

        public Criteria andMayGradeEqualTo(String value) {
            addCriterion("may_grade =", value, "mayGrade");
            return (Criteria) this;
        }

        public Criteria andMayGradeNotEqualTo(String value) {
            addCriterion("may_grade <>", value, "mayGrade");
            return (Criteria) this;
        }

        public Criteria andMayGradeGreaterThan(String value) {
            addCriterion("may_grade >", value, "mayGrade");
            return (Criteria) this;
        }

        public Criteria andMayGradeGreaterThanOrEqualTo(String value) {
            addCriterion("may_grade >=", value, "mayGrade");
            return (Criteria) this;
        }

        public Criteria andMayGradeLessThan(String value) {
            addCriterion("may_grade <", value, "mayGrade");
            return (Criteria) this;
        }

        public Criteria andMayGradeLessThanOrEqualTo(String value) {
            addCriterion("may_grade <=", value, "mayGrade");
            return (Criteria) this;
        }

        public Criteria andMayGradeLike(String value) {
            addCriterion("may_grade like", value, "mayGrade");
            return (Criteria) this;
        }

        public Criteria andMayGradeNotLike(String value) {
            addCriterion("may_grade not like", value, "mayGrade");
            return (Criteria) this;
        }

        public Criteria andMayGradeIn(List<String> values) {
            addCriterion("may_grade in", values, "mayGrade");
            return (Criteria) this;
        }

        public Criteria andMayGradeNotIn(List<String> values) {
            addCriterion("may_grade not in", values, "mayGrade");
            return (Criteria) this;
        }

        public Criteria andMayGradeBetween(String value1, String value2) {
            addCriterion("may_grade between", value1, value2, "mayGrade");
            return (Criteria) this;
        }

        public Criteria andMayGradeNotBetween(String value1, String value2) {
            addCriterion("may_grade not between", value1, value2, "mayGrade");
            return (Criteria) this;
        }

        public Criteria andJunGradeIsNull() {
            addCriterion("jun_grade is null");
            return (Criteria) this;
        }

        public Criteria andJunGradeIsNotNull() {
            addCriterion("jun_grade is not null");
            return (Criteria) this;
        }

        public Criteria andJunGradeEqualTo(String value) {
            addCriterion("jun_grade =", value, "junGrade");
            return (Criteria) this;
        }

        public Criteria andJunGradeNotEqualTo(String value) {
            addCriterion("jun_grade <>", value, "junGrade");
            return (Criteria) this;
        }

        public Criteria andJunGradeGreaterThan(String value) {
            addCriterion("jun_grade >", value, "junGrade");
            return (Criteria) this;
        }

        public Criteria andJunGradeGreaterThanOrEqualTo(String value) {
            addCriterion("jun_grade >=", value, "junGrade");
            return (Criteria) this;
        }

        public Criteria andJunGradeLessThan(String value) {
            addCriterion("jun_grade <", value, "junGrade");
            return (Criteria) this;
        }

        public Criteria andJunGradeLessThanOrEqualTo(String value) {
            addCriterion("jun_grade <=", value, "junGrade");
            return (Criteria) this;
        }

        public Criteria andJunGradeLike(String value) {
            addCriterion("jun_grade like", value, "junGrade");
            return (Criteria) this;
        }

        public Criteria andJunGradeNotLike(String value) {
            addCriterion("jun_grade not like", value, "junGrade");
            return (Criteria) this;
        }

        public Criteria andJunGradeIn(List<String> values) {
            addCriterion("jun_grade in", values, "junGrade");
            return (Criteria) this;
        }

        public Criteria andJunGradeNotIn(List<String> values) {
            addCriterion("jun_grade not in", values, "junGrade");
            return (Criteria) this;
        }

        public Criteria andJunGradeBetween(String value1, String value2) {
            addCriterion("jun_grade between", value1, value2, "junGrade");
            return (Criteria) this;
        }

        public Criteria andJunGradeNotBetween(String value1, String value2) {
            addCriterion("jun_grade not between", value1, value2, "junGrade");
            return (Criteria) this;
        }

        public Criteria andJulGradeIsNull() {
            addCriterion("jul_grade is null");
            return (Criteria) this;
        }

        public Criteria andJulGradeIsNotNull() {
            addCriterion("jul_grade is not null");
            return (Criteria) this;
        }

        public Criteria andJulGradeEqualTo(String value) {
            addCriterion("jul_grade =", value, "julGrade");
            return (Criteria) this;
        }

        public Criteria andJulGradeNotEqualTo(String value) {
            addCriterion("jul_grade <>", value, "julGrade");
            return (Criteria) this;
        }

        public Criteria andJulGradeGreaterThan(String value) {
            addCriterion("jul_grade >", value, "julGrade");
            return (Criteria) this;
        }

        public Criteria andJulGradeGreaterThanOrEqualTo(String value) {
            addCriterion("jul_grade >=", value, "julGrade");
            return (Criteria) this;
        }

        public Criteria andJulGradeLessThan(String value) {
            addCriterion("jul_grade <", value, "julGrade");
            return (Criteria) this;
        }

        public Criteria andJulGradeLessThanOrEqualTo(String value) {
            addCriterion("jul_grade <=", value, "julGrade");
            return (Criteria) this;
        }

        public Criteria andJulGradeLike(String value) {
            addCriterion("jul_grade like", value, "julGrade");
            return (Criteria) this;
        }

        public Criteria andJulGradeNotLike(String value) {
            addCriterion("jul_grade not like", value, "julGrade");
            return (Criteria) this;
        }

        public Criteria andJulGradeIn(List<String> values) {
            addCriterion("jul_grade in", values, "julGrade");
            return (Criteria) this;
        }

        public Criteria andJulGradeNotIn(List<String> values) {
            addCriterion("jul_grade not in", values, "julGrade");
            return (Criteria) this;
        }

        public Criteria andJulGradeBetween(String value1, String value2) {
            addCriterion("jul_grade between", value1, value2, "julGrade");
            return (Criteria) this;
        }

        public Criteria andJulGradeNotBetween(String value1, String value2) {
            addCriterion("jul_grade not between", value1, value2, "julGrade");
            return (Criteria) this;
        }

        public Criteria andAugGradeIsNull() {
            addCriterion("aug_grade is null");
            return (Criteria) this;
        }

        public Criteria andAugGradeIsNotNull() {
            addCriterion("aug_grade is not null");
            return (Criteria) this;
        }

        public Criteria andAugGradeEqualTo(String value) {
            addCriterion("aug_grade =", value, "augGrade");
            return (Criteria) this;
        }

        public Criteria andAugGradeNotEqualTo(String value) {
            addCriterion("aug_grade <>", value, "augGrade");
            return (Criteria) this;
        }

        public Criteria andAugGradeGreaterThan(String value) {
            addCriterion("aug_grade >", value, "augGrade");
            return (Criteria) this;
        }

        public Criteria andAugGradeGreaterThanOrEqualTo(String value) {
            addCriterion("aug_grade >=", value, "augGrade");
            return (Criteria) this;
        }

        public Criteria andAugGradeLessThan(String value) {
            addCriterion("aug_grade <", value, "augGrade");
            return (Criteria) this;
        }

        public Criteria andAugGradeLessThanOrEqualTo(String value) {
            addCriterion("aug_grade <=", value, "augGrade");
            return (Criteria) this;
        }

        public Criteria andAugGradeLike(String value) {
            addCriterion("aug_grade like", value, "augGrade");
            return (Criteria) this;
        }

        public Criteria andAugGradeNotLike(String value) {
            addCriterion("aug_grade not like", value, "augGrade");
            return (Criteria) this;
        }

        public Criteria andAugGradeIn(List<String> values) {
            addCriterion("aug_grade in", values, "augGrade");
            return (Criteria) this;
        }

        public Criteria andAugGradeNotIn(List<String> values) {
            addCriterion("aug_grade not in", values, "augGrade");
            return (Criteria) this;
        }

        public Criteria andAugGradeBetween(String value1, String value2) {
            addCriterion("aug_grade between", value1, value2, "augGrade");
            return (Criteria) this;
        }

        public Criteria andAugGradeNotBetween(String value1, String value2) {
            addCriterion("aug_grade not between", value1, value2, "augGrade");
            return (Criteria) this;
        }

        public Criteria andSeptGradeIsNull() {
            addCriterion("sept_grade is null");
            return (Criteria) this;
        }

        public Criteria andSeptGradeIsNotNull() {
            addCriterion("sept_grade is not null");
            return (Criteria) this;
        }

        public Criteria andSeptGradeEqualTo(String value) {
            addCriterion("sept_grade =", value, "septGrade");
            return (Criteria) this;
        }

        public Criteria andSeptGradeNotEqualTo(String value) {
            addCriterion("sept_grade <>", value, "septGrade");
            return (Criteria) this;
        }

        public Criteria andSeptGradeGreaterThan(String value) {
            addCriterion("sept_grade >", value, "septGrade");
            return (Criteria) this;
        }

        public Criteria andSeptGradeGreaterThanOrEqualTo(String value) {
            addCriterion("sept_grade >=", value, "septGrade");
            return (Criteria) this;
        }

        public Criteria andSeptGradeLessThan(String value) {
            addCriterion("sept_grade <", value, "septGrade");
            return (Criteria) this;
        }

        public Criteria andSeptGradeLessThanOrEqualTo(String value) {
            addCriterion("sept_grade <=", value, "septGrade");
            return (Criteria) this;
        }

        public Criteria andSeptGradeLike(String value) {
            addCriterion("sept_grade like", value, "septGrade");
            return (Criteria) this;
        }

        public Criteria andSeptGradeNotLike(String value) {
            addCriterion("sept_grade not like", value, "septGrade");
            return (Criteria) this;
        }

        public Criteria andSeptGradeIn(List<String> values) {
            addCriterion("sept_grade in", values, "septGrade");
            return (Criteria) this;
        }

        public Criteria andSeptGradeNotIn(List<String> values) {
            addCriterion("sept_grade not in", values, "septGrade");
            return (Criteria) this;
        }

        public Criteria andSeptGradeBetween(String value1, String value2) {
            addCriterion("sept_grade between", value1, value2, "septGrade");
            return (Criteria) this;
        }

        public Criteria andSeptGradeNotBetween(String value1, String value2) {
            addCriterion("sept_grade not between", value1, value2, "septGrade");
            return (Criteria) this;
        }

        public Criteria andOctGradeIsNull() {
            addCriterion("oct_grade is null");
            return (Criteria) this;
        }

        public Criteria andOctGradeIsNotNull() {
            addCriterion("oct_grade is not null");
            return (Criteria) this;
        }

        public Criteria andOctGradeEqualTo(String value) {
            addCriterion("oct_grade =", value, "octGrade");
            return (Criteria) this;
        }

        public Criteria andOctGradeNotEqualTo(String value) {
            addCriterion("oct_grade <>", value, "octGrade");
            return (Criteria) this;
        }

        public Criteria andOctGradeGreaterThan(String value) {
            addCriterion("oct_grade >", value, "octGrade");
            return (Criteria) this;
        }

        public Criteria andOctGradeGreaterThanOrEqualTo(String value) {
            addCriterion("oct_grade >=", value, "octGrade");
            return (Criteria) this;
        }

        public Criteria andOctGradeLessThan(String value) {
            addCriterion("oct_grade <", value, "octGrade");
            return (Criteria) this;
        }

        public Criteria andOctGradeLessThanOrEqualTo(String value) {
            addCriterion("oct_grade <=", value, "octGrade");
            return (Criteria) this;
        }

        public Criteria andOctGradeLike(String value) {
            addCriterion("oct_grade like", value, "octGrade");
            return (Criteria) this;
        }

        public Criteria andOctGradeNotLike(String value) {
            addCriterion("oct_grade not like", value, "octGrade");
            return (Criteria) this;
        }

        public Criteria andOctGradeIn(List<String> values) {
            addCriterion("oct_grade in", values, "octGrade");
            return (Criteria) this;
        }

        public Criteria andOctGradeNotIn(List<String> values) {
            addCriterion("oct_grade not in", values, "octGrade");
            return (Criteria) this;
        }

        public Criteria andOctGradeBetween(String value1, String value2) {
            addCriterion("oct_grade between", value1, value2, "octGrade");
            return (Criteria) this;
        }

        public Criteria andOctGradeNotBetween(String value1, String value2) {
            addCriterion("oct_grade not between", value1, value2, "octGrade");
            return (Criteria) this;
        }

        public Criteria andNovGradeIsNull() {
            addCriterion("nov_grade is null");
            return (Criteria) this;
        }

        public Criteria andNovGradeIsNotNull() {
            addCriterion("nov_grade is not null");
            return (Criteria) this;
        }

        public Criteria andNovGradeEqualTo(String value) {
            addCriterion("nov_grade =", value, "novGrade");
            return (Criteria) this;
        }

        public Criteria andNovGradeNotEqualTo(String value) {
            addCriterion("nov_grade <>", value, "novGrade");
            return (Criteria) this;
        }

        public Criteria andNovGradeGreaterThan(String value) {
            addCriterion("nov_grade >", value, "novGrade");
            return (Criteria) this;
        }

        public Criteria andNovGradeGreaterThanOrEqualTo(String value) {
            addCriterion("nov_grade >=", value, "novGrade");
            return (Criteria) this;
        }

        public Criteria andNovGradeLessThan(String value) {
            addCriterion("nov_grade <", value, "novGrade");
            return (Criteria) this;
        }

        public Criteria andNovGradeLessThanOrEqualTo(String value) {
            addCriterion("nov_grade <=", value, "novGrade");
            return (Criteria) this;
        }

        public Criteria andNovGradeLike(String value) {
            addCriterion("nov_grade like", value, "novGrade");
            return (Criteria) this;
        }

        public Criteria andNovGradeNotLike(String value) {
            addCriterion("nov_grade not like", value, "novGrade");
            return (Criteria) this;
        }

        public Criteria andNovGradeIn(List<String> values) {
            addCriterion("nov_grade in", values, "novGrade");
            return (Criteria) this;
        }

        public Criteria andNovGradeNotIn(List<String> values) {
            addCriterion("nov_grade not in", values, "novGrade");
            return (Criteria) this;
        }

        public Criteria andNovGradeBetween(String value1, String value2) {
            addCriterion("nov_grade between", value1, value2, "novGrade");
            return (Criteria) this;
        }

        public Criteria andNovGradeNotBetween(String value1, String value2) {
            addCriterion("nov_grade not between", value1, value2, "novGrade");
            return (Criteria) this;
        }

        public Criteria andDecGradeIsNull() {
            addCriterion("dec_grade is null");
            return (Criteria) this;
        }

        public Criteria andDecGradeIsNotNull() {
            addCriterion("dec_grade is not null");
            return (Criteria) this;
        }

        public Criteria andDecGradeEqualTo(String value) {
            addCriterion("dec_grade =", value, "decGrade");
            return (Criteria) this;
        }

        public Criteria andDecGradeNotEqualTo(String value) {
            addCriterion("dec_grade <>", value, "decGrade");
            return (Criteria) this;
        }

        public Criteria andDecGradeGreaterThan(String value) {
            addCriterion("dec_grade >", value, "decGrade");
            return (Criteria) this;
        }

        public Criteria andDecGradeGreaterThanOrEqualTo(String value) {
            addCriterion("dec_grade >=", value, "decGrade");
            return (Criteria) this;
        }

        public Criteria andDecGradeLessThan(String value) {
            addCriterion("dec_grade <", value, "decGrade");
            return (Criteria) this;
        }

        public Criteria andDecGradeLessThanOrEqualTo(String value) {
            addCriterion("dec_grade <=", value, "decGrade");
            return (Criteria) this;
        }

        public Criteria andDecGradeLike(String value) {
            addCriterion("dec_grade like", value, "decGrade");
            return (Criteria) this;
        }

        public Criteria andDecGradeNotLike(String value) {
            addCriterion("dec_grade not like", value, "decGrade");
            return (Criteria) this;
        }

        public Criteria andDecGradeIn(List<String> values) {
            addCriterion("dec_grade in", values, "decGrade");
            return (Criteria) this;
        }

        public Criteria andDecGradeNotIn(List<String> values) {
            addCriterion("dec_grade not in", values, "decGrade");
            return (Criteria) this;
        }

        public Criteria andDecGradeBetween(String value1, String value2) {
            addCriterion("dec_grade between", value1, value2, "decGrade");
            return (Criteria) this;
        }

        public Criteria andDecGradeNotBetween(String value1, String value2) {
            addCriterion("dec_grade not between", value1, value2, "decGrade");
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