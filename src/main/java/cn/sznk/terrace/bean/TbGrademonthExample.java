package cn.sznk.terrace.bean;

import java.util.ArrayList;
import java.util.List;

public class TbGrademonthExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbGrademonthExample() {
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
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

        public Criteria andUserGradeIsNull() {
            addCriterion("user_grade is null");
            return (Criteria) this;
        }

        public Criteria andUserGradeIsNotNull() {
            addCriterion("user_grade is not null");
            return (Criteria) this;
        }

        public Criteria andUserGradeEqualTo(String value) {
            addCriterion("user_grade =", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotEqualTo(String value) {
            addCriterion("user_grade <>", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeGreaterThan(String value) {
            addCriterion("user_grade >", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeGreaterThanOrEqualTo(String value) {
            addCriterion("user_grade >=", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeLessThan(String value) {
            addCriterion("user_grade <", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeLessThanOrEqualTo(String value) {
            addCriterion("user_grade <=", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeLike(String value) {
            addCriterion("user_grade like", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotLike(String value) {
            addCriterion("user_grade not like", value, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeIn(List<String> values) {
            addCriterion("user_grade in", values, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotIn(List<String> values) {
            addCriterion("user_grade not in", values, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeBetween(String value1, String value2) {
            addCriterion("user_grade between", value1, value2, "userGrade");
            return (Criteria) this;
        }

        public Criteria andUserGradeNotBetween(String value1, String value2) {
            addCriterion("user_grade not between", value1, value2, "userGrade");
            return (Criteria) this;
        }

        public Criteria andGradePoorIsNull() {
            addCriterion("grade_poor is null");
            return (Criteria) this;
        }

        public Criteria andGradePoorIsNotNull() {
            addCriterion("grade_poor is not null");
            return (Criteria) this;
        }

        public Criteria andGradePoorEqualTo(String value) {
            addCriterion("grade_poor =", value, "gradePoor");
            return (Criteria) this;
        }

        public Criteria andGradePoorNotEqualTo(String value) {
            addCriterion("grade_poor <>", value, "gradePoor");
            return (Criteria) this;
        }

        public Criteria andGradePoorGreaterThan(String value) {
            addCriterion("grade_poor >", value, "gradePoor");
            return (Criteria) this;
        }

        public Criteria andGradePoorGreaterThanOrEqualTo(String value) {
            addCriterion("grade_poor >=", value, "gradePoor");
            return (Criteria) this;
        }

        public Criteria andGradePoorLessThan(String value) {
            addCriterion("grade_poor <", value, "gradePoor");
            return (Criteria) this;
        }

        public Criteria andGradePoorLessThanOrEqualTo(String value) {
            addCriterion("grade_poor <=", value, "gradePoor");
            return (Criteria) this;
        }

        public Criteria andGradePoorLike(String value) {
            addCriterion("grade_poor like", value, "gradePoor");
            return (Criteria) this;
        }

        public Criteria andGradePoorNotLike(String value) {
            addCriterion("grade_poor not like", value, "gradePoor");
            return (Criteria) this;
        }

        public Criteria andGradePoorIn(List<String> values) {
            addCriterion("grade_poor in", values, "gradePoor");
            return (Criteria) this;
        }

        public Criteria andGradePoorNotIn(List<String> values) {
            addCriterion("grade_poor not in", values, "gradePoor");
            return (Criteria) this;
        }

        public Criteria andGradePoorBetween(String value1, String value2) {
            addCriterion("grade_poor between", value1, value2, "gradePoor");
            return (Criteria) this;
        }

        public Criteria andGradePoorNotBetween(String value1, String value2) {
            addCriterion("grade_poor not between", value1, value2, "gradePoor");
            return (Criteria) this;
        }

        public Criteria andZsjlGradeIsNull() {
            addCriterion("zsjl_grade is null");
            return (Criteria) this;
        }

        public Criteria andZsjlGradeIsNotNull() {
            addCriterion("zsjl_grade is not null");
            return (Criteria) this;
        }

        public Criteria andZsjlGradeEqualTo(String value) {
            addCriterion("zsjl_grade =", value, "zsjlGrade");
            return (Criteria) this;
        }

        public Criteria andZsjlGradeNotEqualTo(String value) {
            addCriterion("zsjl_grade <>", value, "zsjlGrade");
            return (Criteria) this;
        }

        public Criteria andZsjlGradeGreaterThan(String value) {
            addCriterion("zsjl_grade >", value, "zsjlGrade");
            return (Criteria) this;
        }

        public Criteria andZsjlGradeGreaterThanOrEqualTo(String value) {
            addCriterion("zsjl_grade >=", value, "zsjlGrade");
            return (Criteria) this;
        }

        public Criteria andZsjlGradeLessThan(String value) {
            addCriterion("zsjl_grade <", value, "zsjlGrade");
            return (Criteria) this;
        }

        public Criteria andZsjlGradeLessThanOrEqualTo(String value) {
            addCriterion("zsjl_grade <=", value, "zsjlGrade");
            return (Criteria) this;
        }

        public Criteria andZsjlGradeLike(String value) {
            addCriterion("zsjl_grade like", value, "zsjlGrade");
            return (Criteria) this;
        }

        public Criteria andZsjlGradeNotLike(String value) {
            addCriterion("zsjl_grade not like", value, "zsjlGrade");
            return (Criteria) this;
        }

        public Criteria andZsjlGradeIn(List<String> values) {
            addCriterion("zsjl_grade in", values, "zsjlGrade");
            return (Criteria) this;
        }

        public Criteria andZsjlGradeNotIn(List<String> values) {
            addCriterion("zsjl_grade not in", values, "zsjlGrade");
            return (Criteria) this;
        }

        public Criteria andZsjlGradeBetween(String value1, String value2) {
            addCriterion("zsjl_grade between", value1, value2, "zsjlGrade");
            return (Criteria) this;
        }

        public Criteria andZsjlGradeNotBetween(String value1, String value2) {
            addCriterion("zsjl_grade not between", value1, value2, "zsjlGrade");
            return (Criteria) this;
        }

        public Criteria andJdkfGradeIsNull() {
            addCriterion("jdkf_grade is null");
            return (Criteria) this;
        }

        public Criteria andJdkfGradeIsNotNull() {
            addCriterion("jdkf_grade is not null");
            return (Criteria) this;
        }

        public Criteria andJdkfGradeEqualTo(String value) {
            addCriterion("jdkf_grade =", value, "jdkfGrade");
            return (Criteria) this;
        }

        public Criteria andJdkfGradeNotEqualTo(String value) {
            addCriterion("jdkf_grade <>", value, "jdkfGrade");
            return (Criteria) this;
        }

        public Criteria andJdkfGradeGreaterThan(String value) {
            addCriterion("jdkf_grade >", value, "jdkfGrade");
            return (Criteria) this;
        }

        public Criteria andJdkfGradeGreaterThanOrEqualTo(String value) {
            addCriterion("jdkf_grade >=", value, "jdkfGrade");
            return (Criteria) this;
        }

        public Criteria andJdkfGradeLessThan(String value) {
            addCriterion("jdkf_grade <", value, "jdkfGrade");
            return (Criteria) this;
        }

        public Criteria andJdkfGradeLessThanOrEqualTo(String value) {
            addCriterion("jdkf_grade <=", value, "jdkfGrade");
            return (Criteria) this;
        }

        public Criteria andJdkfGradeLike(String value) {
            addCriterion("jdkf_grade like", value, "jdkfGrade");
            return (Criteria) this;
        }

        public Criteria andJdkfGradeNotLike(String value) {
            addCriterion("jdkf_grade not like", value, "jdkfGrade");
            return (Criteria) this;
        }

        public Criteria andJdkfGradeIn(List<String> values) {
            addCriterion("jdkf_grade in", values, "jdkfGrade");
            return (Criteria) this;
        }

        public Criteria andJdkfGradeNotIn(List<String> values) {
            addCriterion("jdkf_grade not in", values, "jdkfGrade");
            return (Criteria) this;
        }

        public Criteria andJdkfGradeBetween(String value1, String value2) {
            addCriterion("jdkf_grade between", value1, value2, "jdkfGrade");
            return (Criteria) this;
        }

        public Criteria andJdkfGradeNotBetween(String value1, String value2) {
            addCriterion("jdkf_grade not between", value1, value2, "jdkfGrade");
            return (Criteria) this;
        }

        public Criteria andJyxxIsNull() {
            addCriterion("jyxx is null");
            return (Criteria) this;
        }

        public Criteria andJyxxIsNotNull() {
            addCriterion("jyxx is not null");
            return (Criteria) this;
        }

        public Criteria andJyxxEqualTo(String value) {
            addCriterion("jyxx =", value, "jyxx");
            return (Criteria) this;
        }

        public Criteria andJyxxNotEqualTo(String value) {
            addCriterion("jyxx <>", value, "jyxx");
            return (Criteria) this;
        }

        public Criteria andJyxxGreaterThan(String value) {
            addCriterion("jyxx >", value, "jyxx");
            return (Criteria) this;
        }

        public Criteria andJyxxGreaterThanOrEqualTo(String value) {
            addCriterion("jyxx >=", value, "jyxx");
            return (Criteria) this;
        }

        public Criteria andJyxxLessThan(String value) {
            addCriterion("jyxx <", value, "jyxx");
            return (Criteria) this;
        }

        public Criteria andJyxxLessThanOrEqualTo(String value) {
            addCriterion("jyxx <=", value, "jyxx");
            return (Criteria) this;
        }

        public Criteria andJyxxLike(String value) {
            addCriterion("jyxx like", value, "jyxx");
            return (Criteria) this;
        }

        public Criteria andJyxxNotLike(String value) {
            addCriterion("jyxx not like", value, "jyxx");
            return (Criteria) this;
        }

        public Criteria andJyxxIn(List<String> values) {
            addCriterion("jyxx in", values, "jyxx");
            return (Criteria) this;
        }

        public Criteria andJyxxNotIn(List<String> values) {
            addCriterion("jyxx not in", values, "jyxx");
            return (Criteria) this;
        }

        public Criteria andJyxxBetween(String value1, String value2) {
            addCriterion("jyxx between", value1, value2, "jyxx");
            return (Criteria) this;
        }

        public Criteria andJyxxNotBetween(String value1, String value2) {
            addCriterion("jyxx not between", value1, value2, "jyxx");
            return (Criteria) this;
        }

        public Criteria andShwsIsNull() {
            addCriterion("shws is null");
            return (Criteria) this;
        }

        public Criteria andShwsIsNotNull() {
            addCriterion("shws is not null");
            return (Criteria) this;
        }

        public Criteria andShwsEqualTo(String value) {
            addCriterion("shws =", value, "shws");
            return (Criteria) this;
        }

        public Criteria andShwsNotEqualTo(String value) {
            addCriterion("shws <>", value, "shws");
            return (Criteria) this;
        }

        public Criteria andShwsGreaterThan(String value) {
            addCriterion("shws >", value, "shws");
            return (Criteria) this;
        }

        public Criteria andShwsGreaterThanOrEqualTo(String value) {
            addCriterion("shws >=", value, "shws");
            return (Criteria) this;
        }

        public Criteria andShwsLessThan(String value) {
            addCriterion("shws <", value, "shws");
            return (Criteria) this;
        }

        public Criteria andShwsLessThanOrEqualTo(String value) {
            addCriterion("shws <=", value, "shws");
            return (Criteria) this;
        }

        public Criteria andShwsLike(String value) {
            addCriterion("shws like", value, "shws");
            return (Criteria) this;
        }

        public Criteria andShwsNotLike(String value) {
            addCriterion("shws not like", value, "shws");
            return (Criteria) this;
        }

        public Criteria andShwsIn(List<String> values) {
            addCriterion("shws in", values, "shws");
            return (Criteria) this;
        }

        public Criteria andShwsNotIn(List<String> values) {
            addCriterion("shws not in", values, "shws");
            return (Criteria) this;
        }

        public Criteria andShwsBetween(String value1, String value2) {
            addCriterion("shws between", value1, value2, "shws");
            return (Criteria) this;
        }

        public Criteria andShwsNotBetween(String value1, String value2) {
            addCriterion("shws not between", value1, value2, "shws");
            return (Criteria) this;
        }

        public Criteria andXyndIsNull() {
            addCriterion("xynd is null");
            return (Criteria) this;
        }

        public Criteria andXyndIsNotNull() {
            addCriterion("xynd is not null");
            return (Criteria) this;
        }

        public Criteria andXyndEqualTo(String value) {
            addCriterion("xynd =", value, "xynd");
            return (Criteria) this;
        }

        public Criteria andXyndNotEqualTo(String value) {
            addCriterion("xynd <>", value, "xynd");
            return (Criteria) this;
        }

        public Criteria andXyndGreaterThan(String value) {
            addCriterion("xynd >", value, "xynd");
            return (Criteria) this;
        }

        public Criteria andXyndGreaterThanOrEqualTo(String value) {
            addCriterion("xynd >=", value, "xynd");
            return (Criteria) this;
        }

        public Criteria andXyndLessThan(String value) {
            addCriterion("xynd <", value, "xynd");
            return (Criteria) this;
        }

        public Criteria andXyndLessThanOrEqualTo(String value) {
            addCriterion("xynd <=", value, "xynd");
            return (Criteria) this;
        }

        public Criteria andXyndLike(String value) {
            addCriterion("xynd like", value, "xynd");
            return (Criteria) this;
        }

        public Criteria andXyndNotLike(String value) {
            addCriterion("xynd not like", value, "xynd");
            return (Criteria) this;
        }

        public Criteria andXyndIn(List<String> values) {
            addCriterion("xynd in", values, "xynd");
            return (Criteria) this;
        }

        public Criteria andXyndNotIn(List<String> values) {
            addCriterion("xynd not in", values, "xynd");
            return (Criteria) this;
        }

        public Criteria andXyndBetween(String value1, String value2) {
            addCriterion("xynd between", value1, value2, "xynd");
            return (Criteria) this;
        }

        public Criteria andXyndNotBetween(String value1, String value2) {
            addCriterion("xynd not between", value1, value2, "xynd");
            return (Criteria) this;
        }

        public Criteria andTbjcIsNull() {
            addCriterion("tbjc is null");
            return (Criteria) this;
        }

        public Criteria andTbjcIsNotNull() {
            addCriterion("tbjc is not null");
            return (Criteria) this;
        }

        public Criteria andTbjcEqualTo(String value) {
            addCriterion("tbjc =", value, "tbjc");
            return (Criteria) this;
        }

        public Criteria andTbjcNotEqualTo(String value) {
            addCriterion("tbjc <>", value, "tbjc");
            return (Criteria) this;
        }

        public Criteria andTbjcGreaterThan(String value) {
            addCriterion("tbjc >", value, "tbjc");
            return (Criteria) this;
        }

        public Criteria andTbjcGreaterThanOrEqualTo(String value) {
            addCriterion("tbjc >=", value, "tbjc");
            return (Criteria) this;
        }

        public Criteria andTbjcLessThan(String value) {
            addCriterion("tbjc <", value, "tbjc");
            return (Criteria) this;
        }

        public Criteria andTbjcLessThanOrEqualTo(String value) {
            addCriterion("tbjc <=", value, "tbjc");
            return (Criteria) this;
        }

        public Criteria andTbjcLike(String value) {
            addCriterion("tbjc like", value, "tbjc");
            return (Criteria) this;
        }

        public Criteria andTbjcNotLike(String value) {
            addCriterion("tbjc not like", value, "tbjc");
            return (Criteria) this;
        }

        public Criteria andTbjcIn(List<String> values) {
            addCriterion("tbjc in", values, "tbjc");
            return (Criteria) this;
        }

        public Criteria andTbjcNotIn(List<String> values) {
            addCriterion("tbjc not in", values, "tbjc");
            return (Criteria) this;
        }

        public Criteria andTbjcBetween(String value1, String value2) {
            addCriterion("tbjc between", value1, value2, "tbjc");
            return (Criteria) this;
        }

        public Criteria andTbjcNotBetween(String value1, String value2) {
            addCriterion("tbjc not between", value1, value2, "tbjc");
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