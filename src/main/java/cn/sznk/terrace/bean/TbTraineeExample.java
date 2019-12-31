package cn.sznk.terrace.bean;

import java.util.ArrayList;
import java.util.List;

public class TbTraineeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTraineeExample() {
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

        public Criteria andTraineecodeIsNull() {
            addCriterion("traineeCode is null");
            return (Criteria) this;
        }

        public Criteria andTraineecodeIsNotNull() {
            addCriterion("traineeCode is not null");
            return (Criteria) this;
        }

        public Criteria andTraineecodeEqualTo(String value) {
            addCriterion("traineeCode =", value, "traineecode");
            return (Criteria) this;
        }

        public Criteria andTraineecodeNotEqualTo(String value) {
            addCriterion("traineeCode <>", value, "traineecode");
            return (Criteria) this;
        }

        public Criteria andTraineecodeGreaterThan(String value) {
            addCriterion("traineeCode >", value, "traineecode");
            return (Criteria) this;
        }

        public Criteria andTraineecodeGreaterThanOrEqualTo(String value) {
            addCriterion("traineeCode >=", value, "traineecode");
            return (Criteria) this;
        }

        public Criteria andTraineecodeLessThan(String value) {
            addCriterion("traineeCode <", value, "traineecode");
            return (Criteria) this;
        }

        public Criteria andTraineecodeLessThanOrEqualTo(String value) {
            addCriterion("traineeCode <=", value, "traineecode");
            return (Criteria) this;
        }

        public Criteria andTraineecodeLike(String value) {
            addCriterion("traineeCode like", value, "traineecode");
            return (Criteria) this;
        }

        public Criteria andTraineecodeNotLike(String value) {
            addCriterion("traineeCode not like", value, "traineecode");
            return (Criteria) this;
        }

        public Criteria andTraineecodeIn(List<String> values) {
            addCriterion("traineeCode in", values, "traineecode");
            return (Criteria) this;
        }

        public Criteria andTraineecodeNotIn(List<String> values) {
            addCriterion("traineeCode not in", values, "traineecode");
            return (Criteria) this;
        }

        public Criteria andTraineecodeBetween(String value1, String value2) {
            addCriterion("traineeCode between", value1, value2, "traineecode");
            return (Criteria) this;
        }

        public Criteria andTraineecodeNotBetween(String value1, String value2) {
            addCriterion("traineeCode not between", value1, value2, "traineecode");
            return (Criteria) this;
        }

        public Criteria andTraineenameIsNull() {
            addCriterion("traineeName is null");
            return (Criteria) this;
        }

        public Criteria andTraineenameIsNotNull() {
            addCriterion("traineeName is not null");
            return (Criteria) this;
        }

        public Criteria andTraineenameEqualTo(String value) {
            addCriterion("traineeName =", value, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameNotEqualTo(String value) {
            addCriterion("traineeName <>", value, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameGreaterThan(String value) {
            addCriterion("traineeName >", value, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameGreaterThanOrEqualTo(String value) {
            addCriterion("traineeName >=", value, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameLessThan(String value) {
            addCriterion("traineeName <", value, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameLessThanOrEqualTo(String value) {
            addCriterion("traineeName <=", value, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameLike(String value) {
            addCriterion("traineeName like", value, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameNotLike(String value) {
            addCriterion("traineeName not like", value, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameIn(List<String> values) {
            addCriterion("traineeName in", values, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameNotIn(List<String> values) {
            addCriterion("traineeName not in", values, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameBetween(String value1, String value2) {
            addCriterion("traineeName between", value1, value2, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameNotBetween(String value1, String value2) {
            addCriterion("traineeName not between", value1, value2, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineeoldnameIsNull() {
            addCriterion("traineeOldName is null");
            return (Criteria) this;
        }

        public Criteria andTraineeoldnameIsNotNull() {
            addCriterion("traineeOldName is not null");
            return (Criteria) this;
        }

        public Criteria andTraineeoldnameEqualTo(String value) {
            addCriterion("traineeOldName =", value, "traineeoldname");
            return (Criteria) this;
        }

        public Criteria andTraineeoldnameNotEqualTo(String value) {
            addCriterion("traineeOldName <>", value, "traineeoldname");
            return (Criteria) this;
        }

        public Criteria andTraineeoldnameGreaterThan(String value) {
            addCriterion("traineeOldName >", value, "traineeoldname");
            return (Criteria) this;
        }

        public Criteria andTraineeoldnameGreaterThanOrEqualTo(String value) {
            addCriterion("traineeOldName >=", value, "traineeoldname");
            return (Criteria) this;
        }

        public Criteria andTraineeoldnameLessThan(String value) {
            addCriterion("traineeOldName <", value, "traineeoldname");
            return (Criteria) this;
        }

        public Criteria andTraineeoldnameLessThanOrEqualTo(String value) {
            addCriterion("traineeOldName <=", value, "traineeoldname");
            return (Criteria) this;
        }

        public Criteria andTraineeoldnameLike(String value) {
            addCriterion("traineeOldName like", value, "traineeoldname");
            return (Criteria) this;
        }

        public Criteria andTraineeoldnameNotLike(String value) {
            addCriterion("traineeOldName not like", value, "traineeoldname");
            return (Criteria) this;
        }

        public Criteria andTraineeoldnameIn(List<String> values) {
            addCriterion("traineeOldName in", values, "traineeoldname");
            return (Criteria) this;
        }

        public Criteria andTraineeoldnameNotIn(List<String> values) {
            addCriterion("traineeOldName not in", values, "traineeoldname");
            return (Criteria) this;
        }

        public Criteria andTraineeoldnameBetween(String value1, String value2) {
            addCriterion("traineeOldName between", value1, value2, "traineeoldname");
            return (Criteria) this;
        }

        public Criteria andTraineeoldnameNotBetween(String value1, String value2) {
            addCriterion("traineeOldName not between", value1, value2, "traineeoldname");
            return (Criteria) this;
        }

        public Criteria andTraineealiasIsNull() {
            addCriterion("traineeAlias is null");
            return (Criteria) this;
        }

        public Criteria andTraineealiasIsNotNull() {
            addCriterion("traineeAlias is not null");
            return (Criteria) this;
        }

        public Criteria andTraineealiasEqualTo(String value) {
            addCriterion("traineeAlias =", value, "traineealias");
            return (Criteria) this;
        }

        public Criteria andTraineealiasNotEqualTo(String value) {
            addCriterion("traineeAlias <>", value, "traineealias");
            return (Criteria) this;
        }

        public Criteria andTraineealiasGreaterThan(String value) {
            addCriterion("traineeAlias >", value, "traineealias");
            return (Criteria) this;
        }

        public Criteria andTraineealiasGreaterThanOrEqualTo(String value) {
            addCriterion("traineeAlias >=", value, "traineealias");
            return (Criteria) this;
        }

        public Criteria andTraineealiasLessThan(String value) {
            addCriterion("traineeAlias <", value, "traineealias");
            return (Criteria) this;
        }

        public Criteria andTraineealiasLessThanOrEqualTo(String value) {
            addCriterion("traineeAlias <=", value, "traineealias");
            return (Criteria) this;
        }

        public Criteria andTraineealiasLike(String value) {
            addCriterion("traineeAlias like", value, "traineealias");
            return (Criteria) this;
        }

        public Criteria andTraineealiasNotLike(String value) {
            addCriterion("traineeAlias not like", value, "traineealias");
            return (Criteria) this;
        }

        public Criteria andTraineealiasIn(List<String> values) {
            addCriterion("traineeAlias in", values, "traineealias");
            return (Criteria) this;
        }

        public Criteria andTraineealiasNotIn(List<String> values) {
            addCriterion("traineeAlias not in", values, "traineealias");
            return (Criteria) this;
        }

        public Criteria andTraineealiasBetween(String value1, String value2) {
            addCriterion("traineeAlias between", value1, value2, "traineealias");
            return (Criteria) this;
        }

        public Criteria andTraineealiasNotBetween(String value1, String value2) {
            addCriterion("traineeAlias not between", value1, value2, "traineealias");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("birthDate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("birthDate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(String value) {
            addCriterion("birthDate =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(String value) {
            addCriterion("birthDate <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(String value) {
            addCriterion("birthDate >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(String value) {
            addCriterion("birthDate >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(String value) {
            addCriterion("birthDate <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(String value) {
            addCriterion("birthDate <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLike(String value) {
            addCriterion("birthDate like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotLike(String value) {
            addCriterion("birthDate not like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<String> values) {
            addCriterion("birthDate in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<String> values) {
            addCriterion("birthDate not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(String value1, String value2) {
            addCriterion("birthDate between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(String value1, String value2) {
            addCriterion("birthDate not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andNationtypeIsNull() {
            addCriterion("nationType is null");
            return (Criteria) this;
        }

        public Criteria andNationtypeIsNotNull() {
            addCriterion("nationType is not null");
            return (Criteria) this;
        }

        public Criteria andNationtypeEqualTo(String value) {
            addCriterion("nationType =", value, "nationtype");
            return (Criteria) this;
        }

        public Criteria andNationtypeNotEqualTo(String value) {
            addCriterion("nationType <>", value, "nationtype");
            return (Criteria) this;
        }

        public Criteria andNationtypeGreaterThan(String value) {
            addCriterion("nationType >", value, "nationtype");
            return (Criteria) this;
        }

        public Criteria andNationtypeGreaterThanOrEqualTo(String value) {
            addCriterion("nationType >=", value, "nationtype");
            return (Criteria) this;
        }

        public Criteria andNationtypeLessThan(String value) {
            addCriterion("nationType <", value, "nationtype");
            return (Criteria) this;
        }

        public Criteria andNationtypeLessThanOrEqualTo(String value) {
            addCriterion("nationType <=", value, "nationtype");
            return (Criteria) this;
        }

        public Criteria andNationtypeLike(String value) {
            addCriterion("nationType like", value, "nationtype");
            return (Criteria) this;
        }

        public Criteria andNationtypeNotLike(String value) {
            addCriterion("nationType not like", value, "nationtype");
            return (Criteria) this;
        }

        public Criteria andNationtypeIn(List<String> values) {
            addCriterion("nationType in", values, "nationtype");
            return (Criteria) this;
        }

        public Criteria andNationtypeNotIn(List<String> values) {
            addCriterion("nationType not in", values, "nationtype");
            return (Criteria) this;
        }

        public Criteria andNationtypeBetween(String value1, String value2) {
            addCriterion("nationType between", value1, value2, "nationtype");
            return (Criteria) this;
        }

        public Criteria andNationtypeNotBetween(String value1, String value2) {
            addCriterion("nationType not between", value1, value2, "nationtype");
            return (Criteria) this;
        }

        public Criteria andEducationdegreeIsNull() {
            addCriterion("educationDegree is null");
            return (Criteria) this;
        }

        public Criteria andEducationdegreeIsNotNull() {
            addCriterion("educationDegree is not null");
            return (Criteria) this;
        }

        public Criteria andEducationdegreeEqualTo(String value) {
            addCriterion("educationDegree =", value, "educationdegree");
            return (Criteria) this;
        }

        public Criteria andEducationdegreeNotEqualTo(String value) {
            addCriterion("educationDegree <>", value, "educationdegree");
            return (Criteria) this;
        }

        public Criteria andEducationdegreeGreaterThan(String value) {
            addCriterion("educationDegree >", value, "educationdegree");
            return (Criteria) this;
        }

        public Criteria andEducationdegreeGreaterThanOrEqualTo(String value) {
            addCriterion("educationDegree >=", value, "educationdegree");
            return (Criteria) this;
        }

        public Criteria andEducationdegreeLessThan(String value) {
            addCriterion("educationDegree <", value, "educationdegree");
            return (Criteria) this;
        }

        public Criteria andEducationdegreeLessThanOrEqualTo(String value) {
            addCriterion("educationDegree <=", value, "educationdegree");
            return (Criteria) this;
        }

        public Criteria andEducationdegreeLike(String value) {
            addCriterion("educationDegree like", value, "educationdegree");
            return (Criteria) this;
        }

        public Criteria andEducationdegreeNotLike(String value) {
            addCriterion("educationDegree not like", value, "educationdegree");
            return (Criteria) this;
        }

        public Criteria andEducationdegreeIn(List<String> values) {
            addCriterion("educationDegree in", values, "educationdegree");
            return (Criteria) this;
        }

        public Criteria andEducationdegreeNotIn(List<String> values) {
            addCriterion("educationDegree not in", values, "educationdegree");
            return (Criteria) this;
        }

        public Criteria andEducationdegreeBetween(String value1, String value2) {
            addCriterion("educationDegree between", value1, value2, "educationdegree");
            return (Criteria) this;
        }

        public Criteria andEducationdegreeNotBetween(String value1, String value2) {
            addCriterion("educationDegree not between", value1, value2, "educationdegree");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIsNull() {
            addCriterion("idCardNo is null");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIsNotNull() {
            addCriterion("idCardNo is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardnoEqualTo(String value) {
            addCriterion("idCardNo =", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotEqualTo(String value) {
            addCriterion("idCardNo <>", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoGreaterThan(String value) {
            addCriterion("idCardNo >", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("idCardNo >=", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLessThan(String value) {
            addCriterion("idCardNo <", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLessThanOrEqualTo(String value) {
            addCriterion("idCardNo <=", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLike(String value) {
            addCriterion("idCardNo like", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotLike(String value) {
            addCriterion("idCardNo not like", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIn(List<String> values) {
            addCriterion("idCardNo in", values, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotIn(List<String> values) {
            addCriterion("idCardNo not in", values, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoBetween(String value1, String value2) {
            addCriterion("idCardNo between", value1, value2, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotBetween(String value1, String value2) {
            addCriterion("idCardNo not between", value1, value2, "idcardno");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNull() {
            addCriterion("nativePlace is null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNotNull() {
            addCriterion("nativePlace is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceEqualTo(String value) {
            addCriterion("nativePlace =", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotEqualTo(String value) {
            addCriterion("nativePlace <>", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThan(String value) {
            addCriterion("nativePlace >", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("nativePlace >=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThan(String value) {
            addCriterion("nativePlace <", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("nativePlace <=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLike(String value) {
            addCriterion("nativePlace like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotLike(String value) {
            addCriterion("nativePlace not like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIn(List<String> values) {
            addCriterion("nativePlace in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotIn(List<String> values) {
            addCriterion("nativePlace not in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceBetween(String value1, String value2) {
            addCriterion("nativePlace between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotBetween(String value1, String value2) {
            addCriterion("nativePlace not between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andIsmarriedIsNull() {
            addCriterion("isMarried is null");
            return (Criteria) this;
        }

        public Criteria andIsmarriedIsNotNull() {
            addCriterion("isMarried is not null");
            return (Criteria) this;
        }

        public Criteria andIsmarriedEqualTo(String value) {
            addCriterion("isMarried =", value, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedNotEqualTo(String value) {
            addCriterion("isMarried <>", value, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedGreaterThan(String value) {
            addCriterion("isMarried >", value, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedGreaterThanOrEqualTo(String value) {
            addCriterion("isMarried >=", value, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedLessThan(String value) {
            addCriterion("isMarried <", value, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedLessThanOrEqualTo(String value) {
            addCriterion("isMarried <=", value, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedLike(String value) {
            addCriterion("isMarried like", value, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedNotLike(String value) {
            addCriterion("isMarried not like", value, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedIn(List<String> values) {
            addCriterion("isMarried in", values, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedNotIn(List<String> values) {
            addCriterion("isMarried not in", values, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedBetween(String value1, String value2) {
            addCriterion("isMarried between", value1, value2, "ismarried");
            return (Criteria) this;
        }

        public Criteria andIsmarriedNotBetween(String value1, String value2) {
            addCriterion("isMarried not between", value1, value2, "ismarried");
            return (Criteria) this;
        }

        public Criteria andHealthtypeIsNull() {
            addCriterion("healthType is null");
            return (Criteria) this;
        }

        public Criteria andHealthtypeIsNotNull() {
            addCriterion("healthType is not null");
            return (Criteria) this;
        }

        public Criteria andHealthtypeEqualTo(String value) {
            addCriterion("healthType =", value, "healthtype");
            return (Criteria) this;
        }

        public Criteria andHealthtypeNotEqualTo(String value) {
            addCriterion("healthType <>", value, "healthtype");
            return (Criteria) this;
        }

        public Criteria andHealthtypeGreaterThan(String value) {
            addCriterion("healthType >", value, "healthtype");
            return (Criteria) this;
        }

        public Criteria andHealthtypeGreaterThanOrEqualTo(String value) {
            addCriterion("healthType >=", value, "healthtype");
            return (Criteria) this;
        }

        public Criteria andHealthtypeLessThan(String value) {
            addCriterion("healthType <", value, "healthtype");
            return (Criteria) this;
        }

        public Criteria andHealthtypeLessThanOrEqualTo(String value) {
            addCriterion("healthType <=", value, "healthtype");
            return (Criteria) this;
        }

        public Criteria andHealthtypeLike(String value) {
            addCriterion("healthType like", value, "healthtype");
            return (Criteria) this;
        }

        public Criteria andHealthtypeNotLike(String value) {
            addCriterion("healthType not like", value, "healthtype");
            return (Criteria) this;
        }

        public Criteria andHealthtypeIn(List<String> values) {
            addCriterion("healthType in", values, "healthtype");
            return (Criteria) this;
        }

        public Criteria andHealthtypeNotIn(List<String> values) {
            addCriterion("healthType not in", values, "healthtype");
            return (Criteria) this;
        }

        public Criteria andHealthtypeBetween(String value1, String value2) {
            addCriterion("healthType between", value1, value2, "healthtype");
            return (Criteria) this;
        }

        public Criteria andHealthtypeNotBetween(String value1, String value2) {
            addCriterion("healthType not between", value1, value2, "healthtype");
            return (Criteria) this;
        }

        public Criteria andDomicilelocationIsNull() {
            addCriterion("domicileLocation is null");
            return (Criteria) this;
        }

        public Criteria andDomicilelocationIsNotNull() {
            addCriterion("domicileLocation is not null");
            return (Criteria) this;
        }

        public Criteria andDomicilelocationEqualTo(String value) {
            addCriterion("domicileLocation =", value, "domicilelocation");
            return (Criteria) this;
        }

        public Criteria andDomicilelocationNotEqualTo(String value) {
            addCriterion("domicileLocation <>", value, "domicilelocation");
            return (Criteria) this;
        }

        public Criteria andDomicilelocationGreaterThan(String value) {
            addCriterion("domicileLocation >", value, "domicilelocation");
            return (Criteria) this;
        }

        public Criteria andDomicilelocationGreaterThanOrEqualTo(String value) {
            addCriterion("domicileLocation >=", value, "domicilelocation");
            return (Criteria) this;
        }

        public Criteria andDomicilelocationLessThan(String value) {
            addCriterion("domicileLocation <", value, "domicilelocation");
            return (Criteria) this;
        }

        public Criteria andDomicilelocationLessThanOrEqualTo(String value) {
            addCriterion("domicileLocation <=", value, "domicilelocation");
            return (Criteria) this;
        }

        public Criteria andDomicilelocationLike(String value) {
            addCriterion("domicileLocation like", value, "domicilelocation");
            return (Criteria) this;
        }

        public Criteria andDomicilelocationNotLike(String value) {
            addCriterion("domicileLocation not like", value, "domicilelocation");
            return (Criteria) this;
        }

        public Criteria andDomicilelocationIn(List<String> values) {
            addCriterion("domicileLocation in", values, "domicilelocation");
            return (Criteria) this;
        }

        public Criteria andDomicilelocationNotIn(List<String> values) {
            addCriterion("domicileLocation not in", values, "domicilelocation");
            return (Criteria) this;
        }

        public Criteria andDomicilelocationBetween(String value1, String value2) {
            addCriterion("domicileLocation between", value1, value2, "domicilelocation");
            return (Criteria) this;
        }

        public Criteria andDomicilelocationNotBetween(String value1, String value2) {
            addCriterion("domicileLocation not between", value1, value2, "domicilelocation");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNull() {
            addCriterion("homeAddress is null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIsNotNull() {
            addCriterion("homeAddress is not null");
            return (Criteria) this;
        }

        public Criteria andHomeaddressEqualTo(String value) {
            addCriterion("homeAddress =", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotEqualTo(String value) {
            addCriterion("homeAddress <>", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThan(String value) {
            addCriterion("homeAddress >", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressGreaterThanOrEqualTo(String value) {
            addCriterion("homeAddress >=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThan(String value) {
            addCriterion("homeAddress <", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLessThanOrEqualTo(String value) {
            addCriterion("homeAddress <=", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressLike(String value) {
            addCriterion("homeAddress like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotLike(String value) {
            addCriterion("homeAddress not like", value, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressIn(List<String> values) {
            addCriterion("homeAddress in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotIn(List<String> values) {
            addCriterion("homeAddress not in", values, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressBetween(String value1, String value2) {
            addCriterion("homeAddress between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andHomeaddressNotBetween(String value1, String value2) {
            addCriterion("homeAddress not between", value1, value2, "homeaddress");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIsNull() {
            addCriterion("deptCode is null");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIsNotNull() {
            addCriterion("deptCode is not null");
            return (Criteria) this;
        }

        public Criteria andDeptcodeEqualTo(String value) {
            addCriterion("deptCode =", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotEqualTo(String value) {
            addCriterion("deptCode <>", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeGreaterThan(String value) {
            addCriterion("deptCode >", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeGreaterThanOrEqualTo(String value) {
            addCriterion("deptCode >=", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLessThan(String value) {
            addCriterion("deptCode <", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLessThanOrEqualTo(String value) {
            addCriterion("deptCode <=", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLike(String value) {
            addCriterion("deptCode like", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotLike(String value) {
            addCriterion("deptCode not like", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIn(List<String> values) {
            addCriterion("deptCode in", values, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotIn(List<String> values) {
            addCriterion("deptCode not in", values, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeBetween(String value1, String value2) {
            addCriterion("deptCode between", value1, value2, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotBetween(String value1, String value2) {
            addCriterion("deptCode not between", value1, value2, "deptcode");
            return (Criteria) this;
        }

        public Criteria andCurrentstatusIsNull() {
            addCriterion("currentStatus is null");
            return (Criteria) this;
        }

        public Criteria andCurrentstatusIsNotNull() {
            addCriterion("currentStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentstatusEqualTo(String value) {
            addCriterion("currentStatus =", value, "currentstatus");
            return (Criteria) this;
        }

        public Criteria andCurrentstatusNotEqualTo(String value) {
            addCriterion("currentStatus <>", value, "currentstatus");
            return (Criteria) this;
        }

        public Criteria andCurrentstatusGreaterThan(String value) {
            addCriterion("currentStatus >", value, "currentstatus");
            return (Criteria) this;
        }

        public Criteria andCurrentstatusGreaterThanOrEqualTo(String value) {
            addCriterion("currentStatus >=", value, "currentstatus");
            return (Criteria) this;
        }

        public Criteria andCurrentstatusLessThan(String value) {
            addCriterion("currentStatus <", value, "currentstatus");
            return (Criteria) this;
        }

        public Criteria andCurrentstatusLessThanOrEqualTo(String value) {
            addCriterion("currentStatus <=", value, "currentstatus");
            return (Criteria) this;
        }

        public Criteria andCurrentstatusLike(String value) {
            addCriterion("currentStatus like", value, "currentstatus");
            return (Criteria) this;
        }

        public Criteria andCurrentstatusNotLike(String value) {
            addCriterion("currentStatus not like", value, "currentstatus");
            return (Criteria) this;
        }

        public Criteria andCurrentstatusIn(List<String> values) {
            addCriterion("currentStatus in", values, "currentstatus");
            return (Criteria) this;
        }

        public Criteria andCurrentstatusNotIn(List<String> values) {
            addCriterion("currentStatus not in", values, "currentstatus");
            return (Criteria) this;
        }

        public Criteria andCurrentstatusBetween(String value1, String value2) {
            addCriterion("currentStatus between", value1, value2, "currentstatus");
            return (Criteria) this;
        }

        public Criteria andCurrentstatusNotBetween(String value1, String value2) {
            addCriterion("currentStatus not between", value1, value2, "currentstatus");
            return (Criteria) this;
        }

        public Criteria andEntrytypeIsNull() {
            addCriterion("entryType is null");
            return (Criteria) this;
        }

        public Criteria andEntrytypeIsNotNull() {
            addCriterion("entryType is not null");
            return (Criteria) this;
        }

        public Criteria andEntrytypeEqualTo(String value) {
            addCriterion("entryType =", value, "entrytype");
            return (Criteria) this;
        }

        public Criteria andEntrytypeNotEqualTo(String value) {
            addCriterion("entryType <>", value, "entrytype");
            return (Criteria) this;
        }

        public Criteria andEntrytypeGreaterThan(String value) {
            addCriterion("entryType >", value, "entrytype");
            return (Criteria) this;
        }

        public Criteria andEntrytypeGreaterThanOrEqualTo(String value) {
            addCriterion("entryType >=", value, "entrytype");
            return (Criteria) this;
        }

        public Criteria andEntrytypeLessThan(String value) {
            addCriterion("entryType <", value, "entrytype");
            return (Criteria) this;
        }

        public Criteria andEntrytypeLessThanOrEqualTo(String value) {
            addCriterion("entryType <=", value, "entrytype");
            return (Criteria) this;
        }

        public Criteria andEntrytypeLike(String value) {
            addCriterion("entryType like", value, "entrytype");
            return (Criteria) this;
        }

        public Criteria andEntrytypeNotLike(String value) {
            addCriterion("entryType not like", value, "entrytype");
            return (Criteria) this;
        }

        public Criteria andEntrytypeIn(List<String> values) {
            addCriterion("entryType in", values, "entrytype");
            return (Criteria) this;
        }

        public Criteria andEntrytypeNotIn(List<String> values) {
            addCriterion("entryType not in", values, "entrytype");
            return (Criteria) this;
        }

        public Criteria andEntrytypeBetween(String value1, String value2) {
            addCriterion("entryType between", value1, value2, "entrytype");
            return (Criteria) this;
        }

        public Criteria andEntrytypeNotBetween(String value1, String value2) {
            addCriterion("entryType not between", value1, value2, "entrytype");
            return (Criteria) this;
        }

        public Criteria andManageperiodIsNull() {
            addCriterion("managePeriod is null");
            return (Criteria) this;
        }

        public Criteria andManageperiodIsNotNull() {
            addCriterion("managePeriod is not null");
            return (Criteria) this;
        }

        public Criteria andManageperiodEqualTo(String value) {
            addCriterion("managePeriod =", value, "manageperiod");
            return (Criteria) this;
        }

        public Criteria andManageperiodNotEqualTo(String value) {
            addCriterion("managePeriod <>", value, "manageperiod");
            return (Criteria) this;
        }

        public Criteria andManageperiodGreaterThan(String value) {
            addCriterion("managePeriod >", value, "manageperiod");
            return (Criteria) this;
        }

        public Criteria andManageperiodGreaterThanOrEqualTo(String value) {
            addCriterion("managePeriod >=", value, "manageperiod");
            return (Criteria) this;
        }

        public Criteria andManageperiodLessThan(String value) {
            addCriterion("managePeriod <", value, "manageperiod");
            return (Criteria) this;
        }

        public Criteria andManageperiodLessThanOrEqualTo(String value) {
            addCriterion("managePeriod <=", value, "manageperiod");
            return (Criteria) this;
        }

        public Criteria andManageperiodLike(String value) {
            addCriterion("managePeriod like", value, "manageperiod");
            return (Criteria) this;
        }

        public Criteria andManageperiodNotLike(String value) {
            addCriterion("managePeriod not like", value, "manageperiod");
            return (Criteria) this;
        }

        public Criteria andManageperiodIn(List<String> values) {
            addCriterion("managePeriod in", values, "manageperiod");
            return (Criteria) this;
        }

        public Criteria andManageperiodNotIn(List<String> values) {
            addCriterion("managePeriod not in", values, "manageperiod");
            return (Criteria) this;
        }

        public Criteria andManageperiodBetween(String value1, String value2) {
            addCriterion("managePeriod between", value1, value2, "manageperiod");
            return (Criteria) this;
        }

        public Criteria andManageperiodNotBetween(String value1, String value2) {
            addCriterion("managePeriod not between", value1, value2, "manageperiod");
            return (Criteria) this;
        }

        public Criteria andLeavedateIsNull() {
            addCriterion("leaveDate is null");
            return (Criteria) this;
        }

        public Criteria andLeavedateIsNotNull() {
            addCriterion("leaveDate is not null");
            return (Criteria) this;
        }

        public Criteria andLeavedateEqualTo(String value) {
            addCriterion("leaveDate =", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateNotEqualTo(String value) {
            addCriterion("leaveDate <>", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateGreaterThan(String value) {
            addCriterion("leaveDate >", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateGreaterThanOrEqualTo(String value) {
            addCriterion("leaveDate >=", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateLessThan(String value) {
            addCriterion("leaveDate <", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateLessThanOrEqualTo(String value) {
            addCriterion("leaveDate <=", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateLike(String value) {
            addCriterion("leaveDate like", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateNotLike(String value) {
            addCriterion("leaveDate not like", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateIn(List<String> values) {
            addCriterion("leaveDate in", values, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateNotIn(List<String> values) {
            addCriterion("leaveDate not in", values, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateBetween(String value1, String value2) {
            addCriterion("leaveDate between", value1, value2, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateNotBetween(String value1, String value2) {
            addCriterion("leaveDate not between", value1, value2, "leavedate");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(String value) {
            addCriterion("startDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(String value) {
            addCriterion("startDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(String value) {
            addCriterion("startDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("startDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(String value) {
            addCriterion("startDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(String value) {
            addCriterion("startDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLike(String value) {
            addCriterion("startDate like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotLike(String value) {
            addCriterion("startDate not like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<String> values) {
            addCriterion("startDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<String> values) {
            addCriterion("startDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(String value1, String value2) {
            addCriterion("startDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(String value1, String value2) {
            addCriterion("startDate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("endDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("endDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(String value) {
            addCriterion("endDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(String value) {
            addCriterion("endDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(String value) {
            addCriterion("endDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("endDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(String value) {
            addCriterion("endDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(String value) {
            addCriterion("endDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLike(String value) {
            addCriterion("endDate like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotLike(String value) {
            addCriterion("endDate not like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<String> values) {
            addCriterion("endDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<String> values) {
            addCriterion("endDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(String value1, String value2) {
            addCriterion("endDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(String value1, String value2) {
            addCriterion("endDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andDutypoliceIsNull() {
            addCriterion("dutyPolice is null");
            return (Criteria) this;
        }

        public Criteria andDutypoliceIsNotNull() {
            addCriterion("dutyPolice is not null");
            return (Criteria) this;
        }

        public Criteria andDutypoliceEqualTo(String value) {
            addCriterion("dutyPolice =", value, "dutypolice");
            return (Criteria) this;
        }

        public Criteria andDutypoliceNotEqualTo(String value) {
            addCriterion("dutyPolice <>", value, "dutypolice");
            return (Criteria) this;
        }

        public Criteria andDutypoliceGreaterThan(String value) {
            addCriterion("dutyPolice >", value, "dutypolice");
            return (Criteria) this;
        }

        public Criteria andDutypoliceGreaterThanOrEqualTo(String value) {
            addCriterion("dutyPolice >=", value, "dutypolice");
            return (Criteria) this;
        }

        public Criteria andDutypoliceLessThan(String value) {
            addCriterion("dutyPolice <", value, "dutypolice");
            return (Criteria) this;
        }

        public Criteria andDutypoliceLessThanOrEqualTo(String value) {
            addCriterion("dutyPolice <=", value, "dutypolice");
            return (Criteria) this;
        }

        public Criteria andDutypoliceLike(String value) {
            addCriterion("dutyPolice like", value, "dutypolice");
            return (Criteria) this;
        }

        public Criteria andDutypoliceNotLike(String value) {
            addCriterion("dutyPolice not like", value, "dutypolice");
            return (Criteria) this;
        }

        public Criteria andDutypoliceIn(List<String> values) {
            addCriterion("dutyPolice in", values, "dutypolice");
            return (Criteria) this;
        }

        public Criteria andDutypoliceNotIn(List<String> values) {
            addCriterion("dutyPolice not in", values, "dutypolice");
            return (Criteria) this;
        }

        public Criteria andDutypoliceBetween(String value1, String value2) {
            addCriterion("dutyPolice between", value1, value2, "dutypolice");
            return (Criteria) this;
        }

        public Criteria andDutypoliceNotBetween(String value1, String value2) {
            addCriterion("dutyPolice not between", value1, value2, "dutypolice");
            return (Criteria) this;
        }

        public Criteria andIsaidsIsNull() {
            addCriterion("isAids is null");
            return (Criteria) this;
        }

        public Criteria andIsaidsIsNotNull() {
            addCriterion("isAids is not null");
            return (Criteria) this;
        }

        public Criteria andIsaidsEqualTo(String value) {
            addCriterion("isAids =", value, "isaids");
            return (Criteria) this;
        }

        public Criteria andIsaidsNotEqualTo(String value) {
            addCriterion("isAids <>", value, "isaids");
            return (Criteria) this;
        }

        public Criteria andIsaidsGreaterThan(String value) {
            addCriterion("isAids >", value, "isaids");
            return (Criteria) this;
        }

        public Criteria andIsaidsGreaterThanOrEqualTo(String value) {
            addCriterion("isAids >=", value, "isaids");
            return (Criteria) this;
        }

        public Criteria andIsaidsLessThan(String value) {
            addCriterion("isAids <", value, "isaids");
            return (Criteria) this;
        }

        public Criteria andIsaidsLessThanOrEqualTo(String value) {
            addCriterion("isAids <=", value, "isaids");
            return (Criteria) this;
        }

        public Criteria andIsaidsLike(String value) {
            addCriterion("isAids like", value, "isaids");
            return (Criteria) this;
        }

        public Criteria andIsaidsNotLike(String value) {
            addCriterion("isAids not like", value, "isaids");
            return (Criteria) this;
        }

        public Criteria andIsaidsIn(List<String> values) {
            addCriterion("isAids in", values, "isaids");
            return (Criteria) this;
        }

        public Criteria andIsaidsNotIn(List<String> values) {
            addCriterion("isAids not in", values, "isaids");
            return (Criteria) this;
        }

        public Criteria andIsaidsBetween(String value1, String value2) {
            addCriterion("isAids between", value1, value2, "isaids");
            return (Criteria) this;
        }

        public Criteria andIsaidsNotBetween(String value1, String value2) {
            addCriterion("isAids not between", value1, value2, "isaids");
            return (Criteria) this;
        }

        public Criteria andPersonnelsourceIsNull() {
            addCriterion("personnelSource is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelsourceIsNotNull() {
            addCriterion("personnelSource is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelsourceEqualTo(String value) {
            addCriterion("personnelSource =", value, "personnelsource");
            return (Criteria) this;
        }

        public Criteria andPersonnelsourceNotEqualTo(String value) {
            addCriterion("personnelSource <>", value, "personnelsource");
            return (Criteria) this;
        }

        public Criteria andPersonnelsourceGreaterThan(String value) {
            addCriterion("personnelSource >", value, "personnelsource");
            return (Criteria) this;
        }

        public Criteria andPersonnelsourceGreaterThanOrEqualTo(String value) {
            addCriterion("personnelSource >=", value, "personnelsource");
            return (Criteria) this;
        }

        public Criteria andPersonnelsourceLessThan(String value) {
            addCriterion("personnelSource <", value, "personnelsource");
            return (Criteria) this;
        }

        public Criteria andPersonnelsourceLessThanOrEqualTo(String value) {
            addCriterion("personnelSource <=", value, "personnelsource");
            return (Criteria) this;
        }

        public Criteria andPersonnelsourceLike(String value) {
            addCriterion("personnelSource like", value, "personnelsource");
            return (Criteria) this;
        }

        public Criteria andPersonnelsourceNotLike(String value) {
            addCriterion("personnelSource not like", value, "personnelsource");
            return (Criteria) this;
        }

        public Criteria andPersonnelsourceIn(List<String> values) {
            addCriterion("personnelSource in", values, "personnelsource");
            return (Criteria) this;
        }

        public Criteria andPersonnelsourceNotIn(List<String> values) {
            addCriterion("personnelSource not in", values, "personnelsource");
            return (Criteria) this;
        }

        public Criteria andPersonnelsourceBetween(String value1, String value2) {
            addCriterion("personnelSource between", value1, value2, "personnelsource");
            return (Criteria) this;
        }

        public Criteria andPersonnelsourceNotBetween(String value1, String value2) {
            addCriterion("personnelSource not between", value1, value2, "personnelsource");
            return (Criteria) this;
        }

        public Criteria andDecisionnoIsNull() {
            addCriterion("decisionNo is null");
            return (Criteria) this;
        }

        public Criteria andDecisionnoIsNotNull() {
            addCriterion("decisionNo is not null");
            return (Criteria) this;
        }

        public Criteria andDecisionnoEqualTo(String value) {
            addCriterion("decisionNo =", value, "decisionno");
            return (Criteria) this;
        }

        public Criteria andDecisionnoNotEqualTo(String value) {
            addCriterion("decisionNo <>", value, "decisionno");
            return (Criteria) this;
        }

        public Criteria andDecisionnoGreaterThan(String value) {
            addCriterion("decisionNo >", value, "decisionno");
            return (Criteria) this;
        }

        public Criteria andDecisionnoGreaterThanOrEqualTo(String value) {
            addCriterion("decisionNo >=", value, "decisionno");
            return (Criteria) this;
        }

        public Criteria andDecisionnoLessThan(String value) {
            addCriterion("decisionNo <", value, "decisionno");
            return (Criteria) this;
        }

        public Criteria andDecisionnoLessThanOrEqualTo(String value) {
            addCriterion("decisionNo <=", value, "decisionno");
            return (Criteria) this;
        }

        public Criteria andDecisionnoLike(String value) {
            addCriterion("decisionNo like", value, "decisionno");
            return (Criteria) this;
        }

        public Criteria andDecisionnoNotLike(String value) {
            addCriterion("decisionNo not like", value, "decisionno");
            return (Criteria) this;
        }

        public Criteria andDecisionnoIn(List<String> values) {
            addCriterion("decisionNo in", values, "decisionno");
            return (Criteria) this;
        }

        public Criteria andDecisionnoNotIn(List<String> values) {
            addCriterion("decisionNo not in", values, "decisionno");
            return (Criteria) this;
        }

        public Criteria andDecisionnoBetween(String value1, String value2) {
            addCriterion("decisionNo between", value1, value2, "decisionno");
            return (Criteria) this;
        }

        public Criteria andDecisionnoNotBetween(String value1, String value2) {
            addCriterion("decisionNo not between", value1, value2, "decisionno");
            return (Criteria) this;
        }

        public Criteria andCriminalrecordIsNull() {
            addCriterion("criminalRecord is null");
            return (Criteria) this;
        }

        public Criteria andCriminalrecordIsNotNull() {
            addCriterion("criminalRecord is not null");
            return (Criteria) this;
        }

        public Criteria andCriminalrecordEqualTo(String value) {
            addCriterion("criminalRecord =", value, "criminalrecord");
            return (Criteria) this;
        }

        public Criteria andCriminalrecordNotEqualTo(String value) {
            addCriterion("criminalRecord <>", value, "criminalrecord");
            return (Criteria) this;
        }

        public Criteria andCriminalrecordGreaterThan(String value) {
            addCriterion("criminalRecord >", value, "criminalrecord");
            return (Criteria) this;
        }

        public Criteria andCriminalrecordGreaterThanOrEqualTo(String value) {
            addCriterion("criminalRecord >=", value, "criminalrecord");
            return (Criteria) this;
        }

        public Criteria andCriminalrecordLessThan(String value) {
            addCriterion("criminalRecord <", value, "criminalrecord");
            return (Criteria) this;
        }

        public Criteria andCriminalrecordLessThanOrEqualTo(String value) {
            addCriterion("criminalRecord <=", value, "criminalrecord");
            return (Criteria) this;
        }

        public Criteria andCriminalrecordLike(String value) {
            addCriterion("criminalRecord like", value, "criminalrecord");
            return (Criteria) this;
        }

        public Criteria andCriminalrecordNotLike(String value) {
            addCriterion("criminalRecord not like", value, "criminalrecord");
            return (Criteria) this;
        }

        public Criteria andCriminalrecordIn(List<String> values) {
            addCriterion("criminalRecord in", values, "criminalrecord");
            return (Criteria) this;
        }

        public Criteria andCriminalrecordNotIn(List<String> values) {
            addCriterion("criminalRecord not in", values, "criminalrecord");
            return (Criteria) this;
        }

        public Criteria andCriminalrecordBetween(String value1, String value2) {
            addCriterion("criminalRecord between", value1, value2, "criminalrecord");
            return (Criteria) this;
        }

        public Criteria andCriminalrecordNotBetween(String value1, String value2) {
            addCriterion("criminalRecord not between", value1, value2, "criminalrecord");
            return (Criteria) this;
        }

        public Criteria andIsthreetypeIsNull() {
            addCriterion("isThreetype is null");
            return (Criteria) this;
        }

        public Criteria andIsthreetypeIsNotNull() {
            addCriterion("isThreetype is not null");
            return (Criteria) this;
        }

        public Criteria andIsthreetypeEqualTo(String value) {
            addCriterion("isThreetype =", value, "isthreetype");
            return (Criteria) this;
        }

        public Criteria andIsthreetypeNotEqualTo(String value) {
            addCriterion("isThreetype <>", value, "isthreetype");
            return (Criteria) this;
        }

        public Criteria andIsthreetypeGreaterThan(String value) {
            addCriterion("isThreetype >", value, "isthreetype");
            return (Criteria) this;
        }

        public Criteria andIsthreetypeGreaterThanOrEqualTo(String value) {
            addCriterion("isThreetype >=", value, "isthreetype");
            return (Criteria) this;
        }

        public Criteria andIsthreetypeLessThan(String value) {
            addCriterion("isThreetype <", value, "isthreetype");
            return (Criteria) this;
        }

        public Criteria andIsthreetypeLessThanOrEqualTo(String value) {
            addCriterion("isThreetype <=", value, "isthreetype");
            return (Criteria) this;
        }

        public Criteria andIsthreetypeLike(String value) {
            addCriterion("isThreetype like", value, "isthreetype");
            return (Criteria) this;
        }

        public Criteria andIsthreetypeNotLike(String value) {
            addCriterion("isThreetype not like", value, "isthreetype");
            return (Criteria) this;
        }

        public Criteria andIsthreetypeIn(List<String> values) {
            addCriterion("isThreetype in", values, "isthreetype");
            return (Criteria) this;
        }

        public Criteria andIsthreetypeNotIn(List<String> values) {
            addCriterion("isThreetype not in", values, "isthreetype");
            return (Criteria) this;
        }

        public Criteria andIsthreetypeBetween(String value1, String value2) {
            addCriterion("isThreetype between", value1, value2, "isthreetype");
            return (Criteria) this;
        }

        public Criteria andIsthreetypeNotBetween(String value1, String value2) {
            addCriterion("isThreetype not between", value1, value2, "isthreetype");
            return (Criteria) this;
        }

        public Criteria andHandlingagencyIsNull() {
            addCriterion("handlingAgency is null");
            return (Criteria) this;
        }

        public Criteria andHandlingagencyIsNotNull() {
            addCriterion("handlingAgency is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingagencyEqualTo(String value) {
            addCriterion("handlingAgency =", value, "handlingagency");
            return (Criteria) this;
        }

        public Criteria andHandlingagencyNotEqualTo(String value) {
            addCriterion("handlingAgency <>", value, "handlingagency");
            return (Criteria) this;
        }

        public Criteria andHandlingagencyGreaterThan(String value) {
            addCriterion("handlingAgency >", value, "handlingagency");
            return (Criteria) this;
        }

        public Criteria andHandlingagencyGreaterThanOrEqualTo(String value) {
            addCriterion("handlingAgency >=", value, "handlingagency");
            return (Criteria) this;
        }

        public Criteria andHandlingagencyLessThan(String value) {
            addCriterion("handlingAgency <", value, "handlingagency");
            return (Criteria) this;
        }

        public Criteria andHandlingagencyLessThanOrEqualTo(String value) {
            addCriterion("handlingAgency <=", value, "handlingagency");
            return (Criteria) this;
        }

        public Criteria andHandlingagencyLike(String value) {
            addCriterion("handlingAgency like", value, "handlingagency");
            return (Criteria) this;
        }

        public Criteria andHandlingagencyNotLike(String value) {
            addCriterion("handlingAgency not like", value, "handlingagency");
            return (Criteria) this;
        }

        public Criteria andHandlingagencyIn(List<String> values) {
            addCriterion("handlingAgency in", values, "handlingagency");
            return (Criteria) this;
        }

        public Criteria andHandlingagencyNotIn(List<String> values) {
            addCriterion("handlingAgency not in", values, "handlingagency");
            return (Criteria) this;
        }

        public Criteria andHandlingagencyBetween(String value1, String value2) {
            addCriterion("handlingAgency between", value1, value2, "handlingagency");
            return (Criteria) this;
        }

        public Criteria andHandlingagencyNotBetween(String value1, String value2) {
            addCriterion("handlingAgency not between", value1, value2, "handlingagency");
            return (Criteria) this;
        }

        public Criteria andOtherhandlingagencyIsNull() {
            addCriterion("otherHandlingAgency is null");
            return (Criteria) this;
        }

        public Criteria andOtherhandlingagencyIsNotNull() {
            addCriterion("otherHandlingAgency is not null");
            return (Criteria) this;
        }

        public Criteria andOtherhandlingagencyEqualTo(String value) {
            addCriterion("otherHandlingAgency =", value, "otherhandlingagency");
            return (Criteria) this;
        }

        public Criteria andOtherhandlingagencyNotEqualTo(String value) {
            addCriterion("otherHandlingAgency <>", value, "otherhandlingagency");
            return (Criteria) this;
        }

        public Criteria andOtherhandlingagencyGreaterThan(String value) {
            addCriterion("otherHandlingAgency >", value, "otherhandlingagency");
            return (Criteria) this;
        }

        public Criteria andOtherhandlingagencyGreaterThanOrEqualTo(String value) {
            addCriterion("otherHandlingAgency >=", value, "otherhandlingagency");
            return (Criteria) this;
        }

        public Criteria andOtherhandlingagencyLessThan(String value) {
            addCriterion("otherHandlingAgency <", value, "otherhandlingagency");
            return (Criteria) this;
        }

        public Criteria andOtherhandlingagencyLessThanOrEqualTo(String value) {
            addCriterion("otherHandlingAgency <=", value, "otherhandlingagency");
            return (Criteria) this;
        }

        public Criteria andOtherhandlingagencyLike(String value) {
            addCriterion("otherHandlingAgency like", value, "otherhandlingagency");
            return (Criteria) this;
        }

        public Criteria andOtherhandlingagencyNotLike(String value) {
            addCriterion("otherHandlingAgency not like", value, "otherhandlingagency");
            return (Criteria) this;
        }

        public Criteria andOtherhandlingagencyIn(List<String> values) {
            addCriterion("otherHandlingAgency in", values, "otherhandlingagency");
            return (Criteria) this;
        }

        public Criteria andOtherhandlingagencyNotIn(List<String> values) {
            addCriterion("otherHandlingAgency not in", values, "otherhandlingagency");
            return (Criteria) this;
        }

        public Criteria andOtherhandlingagencyBetween(String value1, String value2) {
            addCriterion("otherHandlingAgency between", value1, value2, "otherhandlingagency");
            return (Criteria) this;
        }

        public Criteria andOtherhandlingagencyNotBetween(String value1, String value2) {
            addCriterion("otherHandlingAgency not between", value1, value2, "otherhandlingagency");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNull() {
            addCriterion("roomId is null");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNotNull() {
            addCriterion("roomId is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidEqualTo(String value) {
            addCriterion("roomId =", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotEqualTo(String value) {
            addCriterion("roomId <>", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThan(String value) {
            addCriterion("roomId >", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThanOrEqualTo(String value) {
            addCriterion("roomId >=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThan(String value) {
            addCriterion("roomId <", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThanOrEqualTo(String value) {
            addCriterion("roomId <=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLike(String value) {
            addCriterion("roomId like", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotLike(String value) {
            addCriterion("roomId not like", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidIn(List<String> values) {
            addCriterion("roomId in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotIn(List<String> values) {
            addCriterion("roomId not in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidBetween(String value1, String value2) {
            addCriterion("roomId between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotBetween(String value1, String value2) {
            addCriterion("roomId not between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomnoIsNull() {
            addCriterion("roomNo is null");
            return (Criteria) this;
        }

        public Criteria andRoomnoIsNotNull() {
            addCriterion("roomNo is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnoEqualTo(String value) {
            addCriterion("roomNo =", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoNotEqualTo(String value) {
            addCriterion("roomNo <>", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoGreaterThan(String value) {
            addCriterion("roomNo >", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoGreaterThanOrEqualTo(String value) {
            addCriterion("roomNo >=", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoLessThan(String value) {
            addCriterion("roomNo <", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoLessThanOrEqualTo(String value) {
            addCriterion("roomNo <=", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoLike(String value) {
            addCriterion("roomNo like", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoNotLike(String value) {
            addCriterion("roomNo not like", value, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoIn(List<String> values) {
            addCriterion("roomNo in", values, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoNotIn(List<String> values) {
            addCriterion("roomNo not in", values, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoBetween(String value1, String value2) {
            addCriterion("roomNo between", value1, value2, "roomno");
            return (Criteria) this;
        }

        public Criteria andRoomnoNotBetween(String value1, String value2) {
            addCriterion("roomNo not between", value1, value2, "roomno");
            return (Criteria) this;
        }

        public Criteria andBednoIsNull() {
            addCriterion("bedNo is null");
            return (Criteria) this;
        }

        public Criteria andBednoIsNotNull() {
            addCriterion("bedNo is not null");
            return (Criteria) this;
        }

        public Criteria andBednoEqualTo(String value) {
            addCriterion("bedNo =", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoNotEqualTo(String value) {
            addCriterion("bedNo <>", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoGreaterThan(String value) {
            addCriterion("bedNo >", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoGreaterThanOrEqualTo(String value) {
            addCriterion("bedNo >=", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoLessThan(String value) {
            addCriterion("bedNo <", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoLessThanOrEqualTo(String value) {
            addCriterion("bedNo <=", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoLike(String value) {
            addCriterion("bedNo like", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoNotLike(String value) {
            addCriterion("bedNo not like", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoIn(List<String> values) {
            addCriterion("bedNo in", values, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoNotIn(List<String> values) {
            addCriterion("bedNo not in", values, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoBetween(String value1, String value2) {
            addCriterion("bedNo between", value1, value2, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoNotBetween(String value1, String value2) {
            addCriterion("bedNo not between", value1, value2, "bedno");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNull() {
            addCriterion("deliveryDate is null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNotNull() {
            addCriterion("deliveryDate is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateEqualTo(String value) {
            addCriterion("deliveryDate =", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotEqualTo(String value) {
            addCriterion("deliveryDate <>", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThan(String value) {
            addCriterion("deliveryDate >", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThanOrEqualTo(String value) {
            addCriterion("deliveryDate >=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThan(String value) {
            addCriterion("deliveryDate <", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThanOrEqualTo(String value) {
            addCriterion("deliveryDate <=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLike(String value) {
            addCriterion("deliveryDate like", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotLike(String value) {
            addCriterion("deliveryDate not like", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIn(List<String> values) {
            addCriterion("deliveryDate in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotIn(List<String> values) {
            addCriterion("deliveryDate not in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateBetween(String value1, String value2) {
            addCriterion("deliveryDate between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotBetween(String value1, String value2) {
            addCriterion("deliveryDate not between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateIsNull() {
            addCriterion("recoveryDate is null");
            return (Criteria) this;
        }

        public Criteria andRecoverydateIsNotNull() {
            addCriterion("recoveryDate is not null");
            return (Criteria) this;
        }

        public Criteria andRecoverydateEqualTo(String value) {
            addCriterion("recoveryDate =", value, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateNotEqualTo(String value) {
            addCriterion("recoveryDate <>", value, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateGreaterThan(String value) {
            addCriterion("recoveryDate >", value, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateGreaterThanOrEqualTo(String value) {
            addCriterion("recoveryDate >=", value, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateLessThan(String value) {
            addCriterion("recoveryDate <", value, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateLessThanOrEqualTo(String value) {
            addCriterion("recoveryDate <=", value, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateLike(String value) {
            addCriterion("recoveryDate like", value, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateNotLike(String value) {
            addCriterion("recoveryDate not like", value, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateIn(List<String> values) {
            addCriterion("recoveryDate in", values, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateNotIn(List<String> values) {
            addCriterion("recoveryDate not in", values, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateBetween(String value1, String value2) {
            addCriterion("recoveryDate between", value1, value2, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateNotBetween(String value1, String value2) {
            addCriterion("recoveryDate not between", value1, value2, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andDrugvarietyIsNull() {
            addCriterion("drugVariety is null");
            return (Criteria) this;
        }

        public Criteria andDrugvarietyIsNotNull() {
            addCriterion("drugVariety is not null");
            return (Criteria) this;
        }

        public Criteria andDrugvarietyEqualTo(String value) {
            addCriterion("drugVariety =", value, "drugvariety");
            return (Criteria) this;
        }

        public Criteria andDrugvarietyNotEqualTo(String value) {
            addCriterion("drugVariety <>", value, "drugvariety");
            return (Criteria) this;
        }

        public Criteria andDrugvarietyGreaterThan(String value) {
            addCriterion("drugVariety >", value, "drugvariety");
            return (Criteria) this;
        }

        public Criteria andDrugvarietyGreaterThanOrEqualTo(String value) {
            addCriterion("drugVariety >=", value, "drugvariety");
            return (Criteria) this;
        }

        public Criteria andDrugvarietyLessThan(String value) {
            addCriterion("drugVariety <", value, "drugvariety");
            return (Criteria) this;
        }

        public Criteria andDrugvarietyLessThanOrEqualTo(String value) {
            addCriterion("drugVariety <=", value, "drugvariety");
            return (Criteria) this;
        }

        public Criteria andDrugvarietyLike(String value) {
            addCriterion("drugVariety like", value, "drugvariety");
            return (Criteria) this;
        }

        public Criteria andDrugvarietyNotLike(String value) {
            addCriterion("drugVariety not like", value, "drugvariety");
            return (Criteria) this;
        }

        public Criteria andDrugvarietyIn(List<String> values) {
            addCriterion("drugVariety in", values, "drugvariety");
            return (Criteria) this;
        }

        public Criteria andDrugvarietyNotIn(List<String> values) {
            addCriterion("drugVariety not in", values, "drugvariety");
            return (Criteria) this;
        }

        public Criteria andDrugvarietyBetween(String value1, String value2) {
            addCriterion("drugVariety between", value1, value2, "drugvariety");
            return (Criteria) this;
        }

        public Criteria andDrugvarietyNotBetween(String value1, String value2) {
            addCriterion("drugVariety not between", value1, value2, "drugvariety");
            return (Criteria) this;
        }

        public Criteria andIskeytraineeIsNull() {
            addCriterion("isKeyTrainee is null");
            return (Criteria) this;
        }

        public Criteria andIskeytraineeIsNotNull() {
            addCriterion("isKeyTrainee is not null");
            return (Criteria) this;
        }

        public Criteria andIskeytraineeEqualTo(String value) {
            addCriterion("isKeyTrainee =", value, "iskeytrainee");
            return (Criteria) this;
        }

        public Criteria andIskeytraineeNotEqualTo(String value) {
            addCriterion("isKeyTrainee <>", value, "iskeytrainee");
            return (Criteria) this;
        }

        public Criteria andIskeytraineeGreaterThan(String value) {
            addCriterion("isKeyTrainee >", value, "iskeytrainee");
            return (Criteria) this;
        }

        public Criteria andIskeytraineeGreaterThanOrEqualTo(String value) {
            addCriterion("isKeyTrainee >=", value, "iskeytrainee");
            return (Criteria) this;
        }

        public Criteria andIskeytraineeLessThan(String value) {
            addCriterion("isKeyTrainee <", value, "iskeytrainee");
            return (Criteria) this;
        }

        public Criteria andIskeytraineeLessThanOrEqualTo(String value) {
            addCriterion("isKeyTrainee <=", value, "iskeytrainee");
            return (Criteria) this;
        }

        public Criteria andIskeytraineeLike(String value) {
            addCriterion("isKeyTrainee like", value, "iskeytrainee");
            return (Criteria) this;
        }

        public Criteria andIskeytraineeNotLike(String value) {
            addCriterion("isKeyTrainee not like", value, "iskeytrainee");
            return (Criteria) this;
        }

        public Criteria andIskeytraineeIn(List<String> values) {
            addCriterion("isKeyTrainee in", values, "iskeytrainee");
            return (Criteria) this;
        }

        public Criteria andIskeytraineeNotIn(List<String> values) {
            addCriterion("isKeyTrainee not in", values, "iskeytrainee");
            return (Criteria) this;
        }

        public Criteria andIskeytraineeBetween(String value1, String value2) {
            addCriterion("isKeyTrainee between", value1, value2, "iskeytrainee");
            return (Criteria) this;
        }

        public Criteria andIskeytraineeNotBetween(String value1, String value2) {
            addCriterion("isKeyTrainee not between", value1, value2, "iskeytrainee");
            return (Criteria) this;
        }

        public Criteria andIscontroltraineeIsNull() {
            addCriterion("isControlTrainee is null");
            return (Criteria) this;
        }

        public Criteria andIscontroltraineeIsNotNull() {
            addCriterion("isControlTrainee is not null");
            return (Criteria) this;
        }

        public Criteria andIscontroltraineeEqualTo(String value) {
            addCriterion("isControlTrainee =", value, "iscontroltrainee");
            return (Criteria) this;
        }

        public Criteria andIscontroltraineeNotEqualTo(String value) {
            addCriterion("isControlTrainee <>", value, "iscontroltrainee");
            return (Criteria) this;
        }

        public Criteria andIscontroltraineeGreaterThan(String value) {
            addCriterion("isControlTrainee >", value, "iscontroltrainee");
            return (Criteria) this;
        }

        public Criteria andIscontroltraineeGreaterThanOrEqualTo(String value) {
            addCriterion("isControlTrainee >=", value, "iscontroltrainee");
            return (Criteria) this;
        }

        public Criteria andIscontroltraineeLessThan(String value) {
            addCriterion("isControlTrainee <", value, "iscontroltrainee");
            return (Criteria) this;
        }

        public Criteria andIscontroltraineeLessThanOrEqualTo(String value) {
            addCriterion("isControlTrainee <=", value, "iscontroltrainee");
            return (Criteria) this;
        }

        public Criteria andIscontroltraineeLike(String value) {
            addCriterion("isControlTrainee like", value, "iscontroltrainee");
            return (Criteria) this;
        }

        public Criteria andIscontroltraineeNotLike(String value) {
            addCriterion("isControlTrainee not like", value, "iscontroltrainee");
            return (Criteria) this;
        }

        public Criteria andIscontroltraineeIn(List<String> values) {
            addCriterion("isControlTrainee in", values, "iscontroltrainee");
            return (Criteria) this;
        }

        public Criteria andIscontroltraineeNotIn(List<String> values) {
            addCriterion("isControlTrainee not in", values, "iscontroltrainee");
            return (Criteria) this;
        }

        public Criteria andIscontroltraineeBetween(String value1, String value2) {
            addCriterion("isControlTrainee between", value1, value2, "iscontroltrainee");
            return (Criteria) this;
        }

        public Criteria andIscontroltraineeNotBetween(String value1, String value2) {
            addCriterion("isControlTrainee not between", value1, value2, "iscontroltrainee");
            return (Criteria) this;
        }

        public Criteria andGuaranteepoliceIsNull() {
            addCriterion("guaranteePolice is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteepoliceIsNotNull() {
            addCriterion("guaranteePolice is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteepoliceEqualTo(String value) {
            addCriterion("guaranteePolice =", value, "guaranteepolice");
            return (Criteria) this;
        }

        public Criteria andGuaranteepoliceNotEqualTo(String value) {
            addCriterion("guaranteePolice <>", value, "guaranteepolice");
            return (Criteria) this;
        }

        public Criteria andGuaranteepoliceGreaterThan(String value) {
            addCriterion("guaranteePolice >", value, "guaranteepolice");
            return (Criteria) this;
        }

        public Criteria andGuaranteepoliceGreaterThanOrEqualTo(String value) {
            addCriterion("guaranteePolice >=", value, "guaranteepolice");
            return (Criteria) this;
        }

        public Criteria andGuaranteepoliceLessThan(String value) {
            addCriterion("guaranteePolice <", value, "guaranteepolice");
            return (Criteria) this;
        }

        public Criteria andGuaranteepoliceLessThanOrEqualTo(String value) {
            addCriterion("guaranteePolice <=", value, "guaranteepolice");
            return (Criteria) this;
        }

        public Criteria andGuaranteepoliceLike(String value) {
            addCriterion("guaranteePolice like", value, "guaranteepolice");
            return (Criteria) this;
        }

        public Criteria andGuaranteepoliceNotLike(String value) {
            addCriterion("guaranteePolice not like", value, "guaranteepolice");
            return (Criteria) this;
        }

        public Criteria andGuaranteepoliceIn(List<String> values) {
            addCriterion("guaranteePolice in", values, "guaranteepolice");
            return (Criteria) this;
        }

        public Criteria andGuaranteepoliceNotIn(List<String> values) {
            addCriterion("guaranteePolice not in", values, "guaranteepolice");
            return (Criteria) this;
        }

        public Criteria andGuaranteepoliceBetween(String value1, String value2) {
            addCriterion("guaranteePolice between", value1, value2, "guaranteepolice");
            return (Criteria) this;
        }

        public Criteria andGuaranteepoliceNotBetween(String value1, String value2) {
            addCriterion("guaranteePolice not between", value1, value2, "guaranteepolice");
            return (Criteria) this;
        }

        public Criteria andOrigyearIsNull() {
            addCriterion("origYear is null");
            return (Criteria) this;
        }

        public Criteria andOrigyearIsNotNull() {
            addCriterion("origYear is not null");
            return (Criteria) this;
        }

        public Criteria andOrigyearEqualTo(Short value) {
            addCriterion("origYear =", value, "origyear");
            return (Criteria) this;
        }

        public Criteria andOrigyearNotEqualTo(Short value) {
            addCriterion("origYear <>", value, "origyear");
            return (Criteria) this;
        }

        public Criteria andOrigyearGreaterThan(Short value) {
            addCriterion("origYear >", value, "origyear");
            return (Criteria) this;
        }

        public Criteria andOrigyearGreaterThanOrEqualTo(Short value) {
            addCriterion("origYear >=", value, "origyear");
            return (Criteria) this;
        }

        public Criteria andOrigyearLessThan(Short value) {
            addCriterion("origYear <", value, "origyear");
            return (Criteria) this;
        }

        public Criteria andOrigyearLessThanOrEqualTo(Short value) {
            addCriterion("origYear <=", value, "origyear");
            return (Criteria) this;
        }

        public Criteria andOrigyearIn(List<Short> values) {
            addCriterion("origYear in", values, "origyear");
            return (Criteria) this;
        }

        public Criteria andOrigyearNotIn(List<Short> values) {
            addCriterion("origYear not in", values, "origyear");
            return (Criteria) this;
        }

        public Criteria andOrigyearBetween(Short value1, Short value2) {
            addCriterion("origYear between", value1, value2, "origyear");
            return (Criteria) this;
        }

        public Criteria andOrigyearNotBetween(Short value1, Short value2) {
            addCriterion("origYear not between", value1, value2, "origyear");
            return (Criteria) this;
        }

        public Criteria andOrigmonthIsNull() {
            addCriterion("origMonth is null");
            return (Criteria) this;
        }

        public Criteria andOrigmonthIsNotNull() {
            addCriterion("origMonth is not null");
            return (Criteria) this;
        }

        public Criteria andOrigmonthEqualTo(Short value) {
            addCriterion("origMonth =", value, "origmonth");
            return (Criteria) this;
        }

        public Criteria andOrigmonthNotEqualTo(Short value) {
            addCriterion("origMonth <>", value, "origmonth");
            return (Criteria) this;
        }

        public Criteria andOrigmonthGreaterThan(Short value) {
            addCriterion("origMonth >", value, "origmonth");
            return (Criteria) this;
        }

        public Criteria andOrigmonthGreaterThanOrEqualTo(Short value) {
            addCriterion("origMonth >=", value, "origmonth");
            return (Criteria) this;
        }

        public Criteria andOrigmonthLessThan(Short value) {
            addCriterion("origMonth <", value, "origmonth");
            return (Criteria) this;
        }

        public Criteria andOrigmonthLessThanOrEqualTo(Short value) {
            addCriterion("origMonth <=", value, "origmonth");
            return (Criteria) this;
        }

        public Criteria andOrigmonthIn(List<Short> values) {
            addCriterion("origMonth in", values, "origmonth");
            return (Criteria) this;
        }

        public Criteria andOrigmonthNotIn(List<Short> values) {
            addCriterion("origMonth not in", values, "origmonth");
            return (Criteria) this;
        }

        public Criteria andOrigmonthBetween(Short value1, Short value2) {
            addCriterion("origMonth between", value1, value2, "origmonth");
            return (Criteria) this;
        }

        public Criteria andOrigmonthNotBetween(Short value1, Short value2) {
            addCriterion("origMonth not between", value1, value2, "origmonth");
            return (Criteria) this;
        }

        public Criteria andCurriculumvitaeIsNull() {
            addCriterion("curriculumVitae is null");
            return (Criteria) this;
        }

        public Criteria andCurriculumvitaeIsNotNull() {
            addCriterion("curriculumVitae is not null");
            return (Criteria) this;
        }

        public Criteria andCurriculumvitaeEqualTo(String value) {
            addCriterion("curriculumVitae =", value, "curriculumvitae");
            return (Criteria) this;
        }

        public Criteria andCurriculumvitaeNotEqualTo(String value) {
            addCriterion("curriculumVitae <>", value, "curriculumvitae");
            return (Criteria) this;
        }

        public Criteria andCurriculumvitaeGreaterThan(String value) {
            addCriterion("curriculumVitae >", value, "curriculumvitae");
            return (Criteria) this;
        }

        public Criteria andCurriculumvitaeGreaterThanOrEqualTo(String value) {
            addCriterion("curriculumVitae >=", value, "curriculumvitae");
            return (Criteria) this;
        }

        public Criteria andCurriculumvitaeLessThan(String value) {
            addCriterion("curriculumVitae <", value, "curriculumvitae");
            return (Criteria) this;
        }

        public Criteria andCurriculumvitaeLessThanOrEqualTo(String value) {
            addCriterion("curriculumVitae <=", value, "curriculumvitae");
            return (Criteria) this;
        }

        public Criteria andCurriculumvitaeLike(String value) {
            addCriterion("curriculumVitae like", value, "curriculumvitae");
            return (Criteria) this;
        }

        public Criteria andCurriculumvitaeNotLike(String value) {
            addCriterion("curriculumVitae not like", value, "curriculumvitae");
            return (Criteria) this;
        }

        public Criteria andCurriculumvitaeIn(List<String> values) {
            addCriterion("curriculumVitae in", values, "curriculumvitae");
            return (Criteria) this;
        }

        public Criteria andCurriculumvitaeNotIn(List<String> values) {
            addCriterion("curriculumVitae not in", values, "curriculumvitae");
            return (Criteria) this;
        }

        public Criteria andCurriculumvitaeBetween(String value1, String value2) {
            addCriterion("curriculumVitae between", value1, value2, "curriculumvitae");
            return (Criteria) this;
        }

        public Criteria andCurriculumvitaeNotBetween(String value1, String value2) {
            addCriterion("curriculumVitae not between", value1, value2, "curriculumvitae");
            return (Criteria) this;
        }

        public Criteria andEmploymentsituationIsNull() {
            addCriterion("employmentSituation is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentsituationIsNotNull() {
            addCriterion("employmentSituation is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentsituationEqualTo(String value) {
            addCriterion("employmentSituation =", value, "employmentsituation");
            return (Criteria) this;
        }

        public Criteria andEmploymentsituationNotEqualTo(String value) {
            addCriterion("employmentSituation <>", value, "employmentsituation");
            return (Criteria) this;
        }

        public Criteria andEmploymentsituationGreaterThan(String value) {
            addCriterion("employmentSituation >", value, "employmentsituation");
            return (Criteria) this;
        }

        public Criteria andEmploymentsituationGreaterThanOrEqualTo(String value) {
            addCriterion("employmentSituation >=", value, "employmentsituation");
            return (Criteria) this;
        }

        public Criteria andEmploymentsituationLessThan(String value) {
            addCriterion("employmentSituation <", value, "employmentsituation");
            return (Criteria) this;
        }

        public Criteria andEmploymentsituationLessThanOrEqualTo(String value) {
            addCriterion("employmentSituation <=", value, "employmentsituation");
            return (Criteria) this;
        }

        public Criteria andEmploymentsituationLike(String value) {
            addCriterion("employmentSituation like", value, "employmentsituation");
            return (Criteria) this;
        }

        public Criteria andEmploymentsituationNotLike(String value) {
            addCriterion("employmentSituation not like", value, "employmentsituation");
            return (Criteria) this;
        }

        public Criteria andEmploymentsituationIn(List<String> values) {
            addCriterion("employmentSituation in", values, "employmentsituation");
            return (Criteria) this;
        }

        public Criteria andEmploymentsituationNotIn(List<String> values) {
            addCriterion("employmentSituation not in", values, "employmentsituation");
            return (Criteria) this;
        }

        public Criteria andEmploymentsituationBetween(String value1, String value2) {
            addCriterion("employmentSituation between", value1, value2, "employmentsituation");
            return (Criteria) this;
        }

        public Criteria andEmploymentsituationNotBetween(String value1, String value2) {
            addCriterion("employmentSituation not between", value1, value2, "employmentsituation");
            return (Criteria) this;
        }

        public Criteria andIsthreefalseIsNull() {
            addCriterion("isThreeFalse is null");
            return (Criteria) this;
        }

        public Criteria andIsthreefalseIsNotNull() {
            addCriterion("isThreeFalse is not null");
            return (Criteria) this;
        }

        public Criteria andIsthreefalseEqualTo(String value) {
            addCriterion("isThreeFalse =", value, "isthreefalse");
            return (Criteria) this;
        }

        public Criteria andIsthreefalseNotEqualTo(String value) {
            addCriterion("isThreeFalse <>", value, "isthreefalse");
            return (Criteria) this;
        }

        public Criteria andIsthreefalseGreaterThan(String value) {
            addCriterion("isThreeFalse >", value, "isthreefalse");
            return (Criteria) this;
        }

        public Criteria andIsthreefalseGreaterThanOrEqualTo(String value) {
            addCriterion("isThreeFalse >=", value, "isthreefalse");
            return (Criteria) this;
        }

        public Criteria andIsthreefalseLessThan(String value) {
            addCriterion("isThreeFalse <", value, "isthreefalse");
            return (Criteria) this;
        }

        public Criteria andIsthreefalseLessThanOrEqualTo(String value) {
            addCriterion("isThreeFalse <=", value, "isthreefalse");
            return (Criteria) this;
        }

        public Criteria andIsthreefalseLike(String value) {
            addCriterion("isThreeFalse like", value, "isthreefalse");
            return (Criteria) this;
        }

        public Criteria andIsthreefalseNotLike(String value) {
            addCriterion("isThreeFalse not like", value, "isthreefalse");
            return (Criteria) this;
        }

        public Criteria andIsthreefalseIn(List<String> values) {
            addCriterion("isThreeFalse in", values, "isthreefalse");
            return (Criteria) this;
        }

        public Criteria andIsthreefalseNotIn(List<String> values) {
            addCriterion("isThreeFalse not in", values, "isthreefalse");
            return (Criteria) this;
        }

        public Criteria andIsthreefalseBetween(String value1, String value2) {
            addCriterion("isThreeFalse between", value1, value2, "isthreefalse");
            return (Criteria) this;
        }

        public Criteria andIsthreefalseNotBetween(String value1, String value2) {
            addCriterion("isThreeFalse not between", value1, value2, "isthreefalse");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryactionIsNull() {
            addCriterion("disciplinaryAction is null");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryactionIsNotNull() {
            addCriterion("disciplinaryAction is not null");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryactionEqualTo(String value) {
            addCriterion("disciplinaryAction =", value, "disciplinaryaction");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryactionNotEqualTo(String value) {
            addCriterion("disciplinaryAction <>", value, "disciplinaryaction");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryactionGreaterThan(String value) {
            addCriterion("disciplinaryAction >", value, "disciplinaryaction");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryactionGreaterThanOrEqualTo(String value) {
            addCriterion("disciplinaryAction >=", value, "disciplinaryaction");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryactionLessThan(String value) {
            addCriterion("disciplinaryAction <", value, "disciplinaryaction");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryactionLessThanOrEqualTo(String value) {
            addCriterion("disciplinaryAction <=", value, "disciplinaryaction");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryactionLike(String value) {
            addCriterion("disciplinaryAction like", value, "disciplinaryaction");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryactionNotLike(String value) {
            addCriterion("disciplinaryAction not like", value, "disciplinaryaction");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryactionIn(List<String> values) {
            addCriterion("disciplinaryAction in", values, "disciplinaryaction");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryactionNotIn(List<String> values) {
            addCriterion("disciplinaryAction not in", values, "disciplinaryaction");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryactionBetween(String value1, String value2) {
            addCriterion("disciplinaryAction between", value1, value2, "disciplinaryaction");
            return (Criteria) this;
        }

        public Criteria andDisciplinaryactionNotBetween(String value1, String value2) {
            addCriterion("disciplinaryAction not between", value1, value2, "disciplinaryaction");
            return (Criteria) this;
        }

        public Criteria andDrugyearsIsNull() {
            addCriterion("drugYears is null");
            return (Criteria) this;
        }

        public Criteria andDrugyearsIsNotNull() {
            addCriterion("drugYears is not null");
            return (Criteria) this;
        }

        public Criteria andDrugyearsEqualTo(String value) {
            addCriterion("drugYears =", value, "drugyears");
            return (Criteria) this;
        }

        public Criteria andDrugyearsNotEqualTo(String value) {
            addCriterion("drugYears <>", value, "drugyears");
            return (Criteria) this;
        }

        public Criteria andDrugyearsGreaterThan(String value) {
            addCriterion("drugYears >", value, "drugyears");
            return (Criteria) this;
        }

        public Criteria andDrugyearsGreaterThanOrEqualTo(String value) {
            addCriterion("drugYears >=", value, "drugyears");
            return (Criteria) this;
        }

        public Criteria andDrugyearsLessThan(String value) {
            addCriterion("drugYears <", value, "drugyears");
            return (Criteria) this;
        }

        public Criteria andDrugyearsLessThanOrEqualTo(String value) {
            addCriterion("drugYears <=", value, "drugyears");
            return (Criteria) this;
        }

        public Criteria andDrugyearsLike(String value) {
            addCriterion("drugYears like", value, "drugyears");
            return (Criteria) this;
        }

        public Criteria andDrugyearsNotLike(String value) {
            addCriterion("drugYears not like", value, "drugyears");
            return (Criteria) this;
        }

        public Criteria andDrugyearsIn(List<String> values) {
            addCriterion("drugYears in", values, "drugyears");
            return (Criteria) this;
        }

        public Criteria andDrugyearsNotIn(List<String> values) {
            addCriterion("drugYears not in", values, "drugyears");
            return (Criteria) this;
        }

        public Criteria andDrugyearsBetween(String value1, String value2) {
            addCriterion("drugYears between", value1, value2, "drugyears");
            return (Criteria) this;
        }

        public Criteria andDrugyearsNotBetween(String value1, String value2) {
            addCriterion("drugYears not between", value1, value2, "drugyears");
            return (Criteria) this;
        }

        public Criteria andRundateIsNull() {
            addCriterion("runDate is null");
            return (Criteria) this;
        }

        public Criteria andRundateIsNotNull() {
            addCriterion("runDate is not null");
            return (Criteria) this;
        }

        public Criteria andRundateEqualTo(String value) {
            addCriterion("runDate =", value, "rundate");
            return (Criteria) this;
        }

        public Criteria andRundateNotEqualTo(String value) {
            addCriterion("runDate <>", value, "rundate");
            return (Criteria) this;
        }

        public Criteria andRundateGreaterThan(String value) {
            addCriterion("runDate >", value, "rundate");
            return (Criteria) this;
        }

        public Criteria andRundateGreaterThanOrEqualTo(String value) {
            addCriterion("runDate >=", value, "rundate");
            return (Criteria) this;
        }

        public Criteria andRundateLessThan(String value) {
            addCriterion("runDate <", value, "rundate");
            return (Criteria) this;
        }

        public Criteria andRundateLessThanOrEqualTo(String value) {
            addCriterion("runDate <=", value, "rundate");
            return (Criteria) this;
        }

        public Criteria andRundateLike(String value) {
            addCriterion("runDate like", value, "rundate");
            return (Criteria) this;
        }

        public Criteria andRundateNotLike(String value) {
            addCriterion("runDate not like", value, "rundate");
            return (Criteria) this;
        }

        public Criteria andRundateIn(List<String> values) {
            addCriterion("runDate in", values, "rundate");
            return (Criteria) this;
        }

        public Criteria andRundateNotIn(List<String> values) {
            addCriterion("runDate not in", values, "rundate");
            return (Criteria) this;
        }

        public Criteria andRundateBetween(String value1, String value2) {
            addCriterion("runDate between", value1, value2, "rundate");
            return (Criteria) this;
        }

        public Criteria andRundateNotBetween(String value1, String value2) {
            addCriterion("runDate not between", value1, value2, "rundate");
            return (Criteria) this;
        }

        public Criteria andControltrainee2IsNull() {
            addCriterion("controlTrainee2 is null");
            return (Criteria) this;
        }

        public Criteria andControltrainee2IsNotNull() {
            addCriterion("controlTrainee2 is not null");
            return (Criteria) this;
        }

        public Criteria andControltrainee2EqualTo(String value) {
            addCriterion("controlTrainee2 =", value, "controltrainee2");
            return (Criteria) this;
        }

        public Criteria andControltrainee2NotEqualTo(String value) {
            addCriterion("controlTrainee2 <>", value, "controltrainee2");
            return (Criteria) this;
        }

        public Criteria andControltrainee2GreaterThan(String value) {
            addCriterion("controlTrainee2 >", value, "controltrainee2");
            return (Criteria) this;
        }

        public Criteria andControltrainee2GreaterThanOrEqualTo(String value) {
            addCriterion("controlTrainee2 >=", value, "controltrainee2");
            return (Criteria) this;
        }

        public Criteria andControltrainee2LessThan(String value) {
            addCriterion("controlTrainee2 <", value, "controltrainee2");
            return (Criteria) this;
        }

        public Criteria andControltrainee2LessThanOrEqualTo(String value) {
            addCriterion("controlTrainee2 <=", value, "controltrainee2");
            return (Criteria) this;
        }

        public Criteria andControltrainee2Like(String value) {
            addCriterion("controlTrainee2 like", value, "controltrainee2");
            return (Criteria) this;
        }

        public Criteria andControltrainee2NotLike(String value) {
            addCriterion("controlTrainee2 not like", value, "controltrainee2");
            return (Criteria) this;
        }

        public Criteria andControltrainee2In(List<String> values) {
            addCriterion("controlTrainee2 in", values, "controltrainee2");
            return (Criteria) this;
        }

        public Criteria andControltrainee2NotIn(List<String> values) {
            addCriterion("controlTrainee2 not in", values, "controltrainee2");
            return (Criteria) this;
        }

        public Criteria andControltrainee2Between(String value1, String value2) {
            addCriterion("controlTrainee2 between", value1, value2, "controltrainee2");
            return (Criteria) this;
        }

        public Criteria andControltrainee2NotBetween(String value1, String value2) {
            addCriterion("controlTrainee2 not between", value1, value2, "controltrainee2");
            return (Criteria) this;
        }

        public Criteria andSmokingstyleIsNull() {
            addCriterion("smokingStyle is null");
            return (Criteria) this;
        }

        public Criteria andSmokingstyleIsNotNull() {
            addCriterion("smokingStyle is not null");
            return (Criteria) this;
        }

        public Criteria andSmokingstyleEqualTo(String value) {
            addCriterion("smokingStyle =", value, "smokingstyle");
            return (Criteria) this;
        }

        public Criteria andSmokingstyleNotEqualTo(String value) {
            addCriterion("smokingStyle <>", value, "smokingstyle");
            return (Criteria) this;
        }

        public Criteria andSmokingstyleGreaterThan(String value) {
            addCriterion("smokingStyle >", value, "smokingstyle");
            return (Criteria) this;
        }

        public Criteria andSmokingstyleGreaterThanOrEqualTo(String value) {
            addCriterion("smokingStyle >=", value, "smokingstyle");
            return (Criteria) this;
        }

        public Criteria andSmokingstyleLessThan(String value) {
            addCriterion("smokingStyle <", value, "smokingstyle");
            return (Criteria) this;
        }

        public Criteria andSmokingstyleLessThanOrEqualTo(String value) {
            addCriterion("smokingStyle <=", value, "smokingstyle");
            return (Criteria) this;
        }

        public Criteria andSmokingstyleLike(String value) {
            addCriterion("smokingStyle like", value, "smokingstyle");
            return (Criteria) this;
        }

        public Criteria andSmokingstyleNotLike(String value) {
            addCriterion("smokingStyle not like", value, "smokingstyle");
            return (Criteria) this;
        }

        public Criteria andSmokingstyleIn(List<String> values) {
            addCriterion("smokingStyle in", values, "smokingstyle");
            return (Criteria) this;
        }

        public Criteria andSmokingstyleNotIn(List<String> values) {
            addCriterion("smokingStyle not in", values, "smokingstyle");
            return (Criteria) this;
        }

        public Criteria andSmokingstyleBetween(String value1, String value2) {
            addCriterion("smokingStyle between", value1, value2, "smokingstyle");
            return (Criteria) this;
        }

        public Criteria andSmokingstyleNotBetween(String value1, String value2) {
            addCriterion("smokingStyle not between", value1, value2, "smokingstyle");
            return (Criteria) this;
        }

        public Criteria andDetoxificationsituationIsNull() {
            addCriterion("detoxificationSituation is null");
            return (Criteria) this;
        }

        public Criteria andDetoxificationsituationIsNotNull() {
            addCriterion("detoxificationSituation is not null");
            return (Criteria) this;
        }

        public Criteria andDetoxificationsituationEqualTo(String value) {
            addCriterion("detoxificationSituation =", value, "detoxificationsituation");
            return (Criteria) this;
        }

        public Criteria andDetoxificationsituationNotEqualTo(String value) {
            addCriterion("detoxificationSituation <>", value, "detoxificationsituation");
            return (Criteria) this;
        }

        public Criteria andDetoxificationsituationGreaterThan(String value) {
            addCriterion("detoxificationSituation >", value, "detoxificationsituation");
            return (Criteria) this;
        }

        public Criteria andDetoxificationsituationGreaterThanOrEqualTo(String value) {
            addCriterion("detoxificationSituation >=", value, "detoxificationsituation");
            return (Criteria) this;
        }

        public Criteria andDetoxificationsituationLessThan(String value) {
            addCriterion("detoxificationSituation <", value, "detoxificationsituation");
            return (Criteria) this;
        }

        public Criteria andDetoxificationsituationLessThanOrEqualTo(String value) {
            addCriterion("detoxificationSituation <=", value, "detoxificationsituation");
            return (Criteria) this;
        }

        public Criteria andDetoxificationsituationLike(String value) {
            addCriterion("detoxificationSituation like", value, "detoxificationsituation");
            return (Criteria) this;
        }

        public Criteria andDetoxificationsituationNotLike(String value) {
            addCriterion("detoxificationSituation not like", value, "detoxificationsituation");
            return (Criteria) this;
        }

        public Criteria andDetoxificationsituationIn(List<String> values) {
            addCriterion("detoxificationSituation in", values, "detoxificationsituation");
            return (Criteria) this;
        }

        public Criteria andDetoxificationsituationNotIn(List<String> values) {
            addCriterion("detoxificationSituation not in", values, "detoxificationsituation");
            return (Criteria) this;
        }

        public Criteria andDetoxificationsituationBetween(String value1, String value2) {
            addCriterion("detoxificationSituation between", value1, value2, "detoxificationsituation");
            return (Criteria) this;
        }

        public Criteria andDetoxificationsituationNotBetween(String value1, String value2) {
            addCriterion("detoxificationSituation not between", value1, value2, "detoxificationsituation");
            return (Criteria) this;
        }

        public Criteria andDrughistoryIsNull() {
            addCriterion("drugHistory is null");
            return (Criteria) this;
        }

        public Criteria andDrughistoryIsNotNull() {
            addCriterion("drugHistory is not null");
            return (Criteria) this;
        }

        public Criteria andDrughistoryEqualTo(String value) {
            addCriterion("drugHistory =", value, "drughistory");
            return (Criteria) this;
        }

        public Criteria andDrughistoryNotEqualTo(String value) {
            addCriterion("drugHistory <>", value, "drughistory");
            return (Criteria) this;
        }

        public Criteria andDrughistoryGreaterThan(String value) {
            addCriterion("drugHistory >", value, "drughistory");
            return (Criteria) this;
        }

        public Criteria andDrughistoryGreaterThanOrEqualTo(String value) {
            addCriterion("drugHistory >=", value, "drughistory");
            return (Criteria) this;
        }

        public Criteria andDrughistoryLessThan(String value) {
            addCriterion("drugHistory <", value, "drughistory");
            return (Criteria) this;
        }

        public Criteria andDrughistoryLessThanOrEqualTo(String value) {
            addCriterion("drugHistory <=", value, "drughistory");
            return (Criteria) this;
        }

        public Criteria andDrughistoryLike(String value) {
            addCriterion("drugHistory like", value, "drughistory");
            return (Criteria) this;
        }

        public Criteria andDrughistoryNotLike(String value) {
            addCriterion("drugHistory not like", value, "drughistory");
            return (Criteria) this;
        }

        public Criteria andDrughistoryIn(List<String> values) {
            addCriterion("drugHistory in", values, "drughistory");
            return (Criteria) this;
        }

        public Criteria andDrughistoryNotIn(List<String> values) {
            addCriterion("drugHistory not in", values, "drughistory");
            return (Criteria) this;
        }

        public Criteria andDrughistoryBetween(String value1, String value2) {
            addCriterion("drugHistory between", value1, value2, "drughistory");
            return (Criteria) this;
        }

        public Criteria andDrughistoryNotBetween(String value1, String value2) {
            addCriterion("drugHistory not between", value1, value2, "drughistory");
            return (Criteria) this;
        }

        public Criteria andDelaydateIsNull() {
            addCriterion("delayDate is null");
            return (Criteria) this;
        }

        public Criteria andDelaydateIsNotNull() {
            addCriterion("delayDate is not null");
            return (Criteria) this;
        }

        public Criteria andDelaydateEqualTo(String value) {
            addCriterion("delayDate =", value, "delaydate");
            return (Criteria) this;
        }

        public Criteria andDelaydateNotEqualTo(String value) {
            addCriterion("delayDate <>", value, "delaydate");
            return (Criteria) this;
        }

        public Criteria andDelaydateGreaterThan(String value) {
            addCriterion("delayDate >", value, "delaydate");
            return (Criteria) this;
        }

        public Criteria andDelaydateGreaterThanOrEqualTo(String value) {
            addCriterion("delayDate >=", value, "delaydate");
            return (Criteria) this;
        }

        public Criteria andDelaydateLessThan(String value) {
            addCriterion("delayDate <", value, "delaydate");
            return (Criteria) this;
        }

        public Criteria andDelaydateLessThanOrEqualTo(String value) {
            addCriterion("delayDate <=", value, "delaydate");
            return (Criteria) this;
        }

        public Criteria andDelaydateLike(String value) {
            addCriterion("delayDate like", value, "delaydate");
            return (Criteria) this;
        }

        public Criteria andDelaydateNotLike(String value) {
            addCriterion("delayDate not like", value, "delaydate");
            return (Criteria) this;
        }

        public Criteria andDelaydateIn(List<String> values) {
            addCriterion("delayDate in", values, "delaydate");
            return (Criteria) this;
        }

        public Criteria andDelaydateNotIn(List<String> values) {
            addCriterion("delayDate not in", values, "delaydate");
            return (Criteria) this;
        }

        public Criteria andDelaydateBetween(String value1, String value2) {
            addCriterion("delayDate between", value1, value2, "delaydate");
            return (Criteria) this;
        }

        public Criteria andDelaydateNotBetween(String value1, String value2) {
            addCriterion("delayDate not between", value1, value2, "delaydate");
            return (Criteria) this;
        }

        public Criteria andReducedateIsNull() {
            addCriterion("reduceDate is null");
            return (Criteria) this;
        }

        public Criteria andReducedateIsNotNull() {
            addCriterion("reduceDate is not null");
            return (Criteria) this;
        }

        public Criteria andReducedateEqualTo(String value) {
            addCriterion("reduceDate =", value, "reducedate");
            return (Criteria) this;
        }

        public Criteria andReducedateNotEqualTo(String value) {
            addCriterion("reduceDate <>", value, "reducedate");
            return (Criteria) this;
        }

        public Criteria andReducedateGreaterThan(String value) {
            addCriterion("reduceDate >", value, "reducedate");
            return (Criteria) this;
        }

        public Criteria andReducedateGreaterThanOrEqualTo(String value) {
            addCriterion("reduceDate >=", value, "reducedate");
            return (Criteria) this;
        }

        public Criteria andReducedateLessThan(String value) {
            addCriterion("reduceDate <", value, "reducedate");
            return (Criteria) this;
        }

        public Criteria andReducedateLessThanOrEqualTo(String value) {
            addCriterion("reduceDate <=", value, "reducedate");
            return (Criteria) this;
        }

        public Criteria andReducedateLike(String value) {
            addCriterion("reduceDate like", value, "reducedate");
            return (Criteria) this;
        }

        public Criteria andReducedateNotLike(String value) {
            addCriterion("reduceDate not like", value, "reducedate");
            return (Criteria) this;
        }

        public Criteria andReducedateIn(List<String> values) {
            addCriterion("reduceDate in", values, "reducedate");
            return (Criteria) this;
        }

        public Criteria andReducedateNotIn(List<String> values) {
            addCriterion("reduceDate not in", values, "reducedate");
            return (Criteria) this;
        }

        public Criteria andReducedateBetween(String value1, String value2) {
            addCriterion("reduceDate between", value1, value2, "reducedate");
            return (Criteria) this;
        }

        public Criteria andReducedateNotBetween(String value1, String value2) {
            addCriterion("reduceDate not between", value1, value2, "reducedate");
            return (Criteria) this;
        }

        public Criteria andRemovedateIsNull() {
            addCriterion("RemoveDate is null");
            return (Criteria) this;
        }

        public Criteria andRemovedateIsNotNull() {
            addCriterion("RemoveDate is not null");
            return (Criteria) this;
        }

        public Criteria andRemovedateEqualTo(String value) {
            addCriterion("RemoveDate =", value, "removedate");
            return (Criteria) this;
        }

        public Criteria andRemovedateNotEqualTo(String value) {
            addCriterion("RemoveDate <>", value, "removedate");
            return (Criteria) this;
        }

        public Criteria andRemovedateGreaterThan(String value) {
            addCriterion("RemoveDate >", value, "removedate");
            return (Criteria) this;
        }

        public Criteria andRemovedateGreaterThanOrEqualTo(String value) {
            addCriterion("RemoveDate >=", value, "removedate");
            return (Criteria) this;
        }

        public Criteria andRemovedateLessThan(String value) {
            addCriterion("RemoveDate <", value, "removedate");
            return (Criteria) this;
        }

        public Criteria andRemovedateLessThanOrEqualTo(String value) {
            addCriterion("RemoveDate <=", value, "removedate");
            return (Criteria) this;
        }

        public Criteria andRemovedateLike(String value) {
            addCriterion("RemoveDate like", value, "removedate");
            return (Criteria) this;
        }

        public Criteria andRemovedateNotLike(String value) {
            addCriterion("RemoveDate not like", value, "removedate");
            return (Criteria) this;
        }

        public Criteria andRemovedateIn(List<String> values) {
            addCriterion("RemoveDate in", values, "removedate");
            return (Criteria) this;
        }

        public Criteria andRemovedateNotIn(List<String> values) {
            addCriterion("RemoveDate not in", values, "removedate");
            return (Criteria) this;
        }

        public Criteria andRemovedateBetween(String value1, String value2) {
            addCriterion("RemoveDate between", value1, value2, "removedate");
            return (Criteria) this;
        }

        public Criteria andRemovedateNotBetween(String value1, String value2) {
            addCriterion("RemoveDate not between", value1, value2, "removedate");
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

        public Criteria andUserLevelIsNull() {
            addCriterion("user_level is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNotNull() {
            addCriterion("user_level is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(String value) {
            addCriterion("user_level =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(String value) {
            addCriterion("user_level <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(String value) {
            addCriterion("user_level >", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(String value) {
            addCriterion("user_level >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThan(String value) {
            addCriterion("user_level <", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThanOrEqualTo(String value) {
            addCriterion("user_level <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLike(String value) {
            addCriterion("user_level like", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotLike(String value) {
            addCriterion("user_level not like", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIn(List<String> values) {
            addCriterion("user_level in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotIn(List<String> values) {
            addCriterion("user_level not in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(String value1, String value2) {
            addCriterion("user_level between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(String value1, String value2) {
            addCriterion("user_level not between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserIdioctoniaIsNull() {
            addCriterion("user_idioctonia is null");
            return (Criteria) this;
        }

        public Criteria andUserIdioctoniaIsNotNull() {
            addCriterion("user_idioctonia is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdioctoniaEqualTo(Integer value) {
            addCriterion("user_idioctonia =", value, "userIdioctonia");
            return (Criteria) this;
        }

        public Criteria andUserIdioctoniaNotEqualTo(Integer value) {
            addCriterion("user_idioctonia <>", value, "userIdioctonia");
            return (Criteria) this;
        }

        public Criteria andUserIdioctoniaGreaterThan(Integer value) {
            addCriterion("user_idioctonia >", value, "userIdioctonia");
            return (Criteria) this;
        }

        public Criteria andUserIdioctoniaGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_idioctonia >=", value, "userIdioctonia");
            return (Criteria) this;
        }

        public Criteria andUserIdioctoniaLessThan(Integer value) {
            addCriterion("user_idioctonia <", value, "userIdioctonia");
            return (Criteria) this;
        }

        public Criteria andUserIdioctoniaLessThanOrEqualTo(Integer value) {
            addCriterion("user_idioctonia <=", value, "userIdioctonia");
            return (Criteria) this;
        }

        public Criteria andUserIdioctoniaIn(List<Integer> values) {
            addCriterion("user_idioctonia in", values, "userIdioctonia");
            return (Criteria) this;
        }

        public Criteria andUserIdioctoniaNotIn(List<Integer> values) {
            addCriterion("user_idioctonia not in", values, "userIdioctonia");
            return (Criteria) this;
        }

        public Criteria andUserIdioctoniaBetween(Integer value1, Integer value2) {
            addCriterion("user_idioctonia between", value1, value2, "userIdioctonia");
            return (Criteria) this;
        }

        public Criteria andUserIdioctoniaNotBetween(Integer value1, Integer value2) {
            addCriterion("user_idioctonia not between", value1, value2, "userIdioctonia");
            return (Criteria) this;
        }

        public Criteria andUserWoundIsNull() {
            addCriterion("user_wound is null");
            return (Criteria) this;
        }

        public Criteria andUserWoundIsNotNull() {
            addCriterion("user_wound is not null");
            return (Criteria) this;
        }

        public Criteria andUserWoundEqualTo(Integer value) {
            addCriterion("user_wound =", value, "userWound");
            return (Criteria) this;
        }

        public Criteria andUserWoundNotEqualTo(Integer value) {
            addCriterion("user_wound <>", value, "userWound");
            return (Criteria) this;
        }

        public Criteria andUserWoundGreaterThan(Integer value) {
            addCriterion("user_wound >", value, "userWound");
            return (Criteria) this;
        }

        public Criteria andUserWoundGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_wound >=", value, "userWound");
            return (Criteria) this;
        }

        public Criteria andUserWoundLessThan(Integer value) {
            addCriterion("user_wound <", value, "userWound");
            return (Criteria) this;
        }

        public Criteria andUserWoundLessThanOrEqualTo(Integer value) {
            addCriterion("user_wound <=", value, "userWound");
            return (Criteria) this;
        }

        public Criteria andUserWoundIn(List<Integer> values) {
            addCriterion("user_wound in", values, "userWound");
            return (Criteria) this;
        }

        public Criteria andUserWoundNotIn(List<Integer> values) {
            addCriterion("user_wound not in", values, "userWound");
            return (Criteria) this;
        }

        public Criteria andUserWoundBetween(Integer value1, Integer value2) {
            addCriterion("user_wound between", value1, value2, "userWound");
            return (Criteria) this;
        }

        public Criteria andUserWoundNotBetween(Integer value1, Integer value2) {
            addCriterion("user_wound not between", value1, value2, "userWound");
            return (Criteria) this;
        }

        public Criteria andUserSuddendeathIsNull() {
            addCriterion("user_suddendeath is null");
            return (Criteria) this;
        }

        public Criteria andUserSuddendeathIsNotNull() {
            addCriterion("user_suddendeath is not null");
            return (Criteria) this;
        }

        public Criteria andUserSuddendeathEqualTo(Integer value) {
            addCriterion("user_suddendeath =", value, "userSuddendeath");
            return (Criteria) this;
        }

        public Criteria andUserSuddendeathNotEqualTo(Integer value) {
            addCriterion("user_suddendeath <>", value, "userSuddendeath");
            return (Criteria) this;
        }

        public Criteria andUserSuddendeathGreaterThan(Integer value) {
            addCriterion("user_suddendeath >", value, "userSuddendeath");
            return (Criteria) this;
        }

        public Criteria andUserSuddendeathGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_suddendeath >=", value, "userSuddendeath");
            return (Criteria) this;
        }

        public Criteria andUserSuddendeathLessThan(Integer value) {
            addCriterion("user_suddendeath <", value, "userSuddendeath");
            return (Criteria) this;
        }

        public Criteria andUserSuddendeathLessThanOrEqualTo(Integer value) {
            addCriterion("user_suddendeath <=", value, "userSuddendeath");
            return (Criteria) this;
        }

        public Criteria andUserSuddendeathIn(List<Integer> values) {
            addCriterion("user_suddendeath in", values, "userSuddendeath");
            return (Criteria) this;
        }

        public Criteria andUserSuddendeathNotIn(List<Integer> values) {
            addCriterion("user_suddendeath not in", values, "userSuddendeath");
            return (Criteria) this;
        }

        public Criteria andUserSuddendeathBetween(Integer value1, Integer value2) {
            addCriterion("user_suddendeath between", value1, value2, "userSuddendeath");
            return (Criteria) this;
        }

        public Criteria andUserSuddendeathNotBetween(Integer value1, Integer value2) {
            addCriterion("user_suddendeath not between", value1, value2, "userSuddendeath");
            return (Criteria) this;
        }

        public Criteria andUserGetawayIsNull() {
            addCriterion("user_getaway is null");
            return (Criteria) this;
        }

        public Criteria andUserGetawayIsNotNull() {
            addCriterion("user_getaway is not null");
            return (Criteria) this;
        }

        public Criteria andUserGetawayEqualTo(Integer value) {
            addCriterion("user_getaway =", value, "userGetaway");
            return (Criteria) this;
        }

        public Criteria andUserGetawayNotEqualTo(Integer value) {
            addCriterion("user_getaway <>", value, "userGetaway");
            return (Criteria) this;
        }

        public Criteria andUserGetawayGreaterThan(Integer value) {
            addCriterion("user_getaway >", value, "userGetaway");
            return (Criteria) this;
        }

        public Criteria andUserGetawayGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_getaway >=", value, "userGetaway");
            return (Criteria) this;
        }

        public Criteria andUserGetawayLessThan(Integer value) {
            addCriterion("user_getaway <", value, "userGetaway");
            return (Criteria) this;
        }

        public Criteria andUserGetawayLessThanOrEqualTo(Integer value) {
            addCriterion("user_getaway <=", value, "userGetaway");
            return (Criteria) this;
        }

        public Criteria andUserGetawayIn(List<Integer> values) {
            addCriterion("user_getaway in", values, "userGetaway");
            return (Criteria) this;
        }

        public Criteria andUserGetawayNotIn(List<Integer> values) {
            addCriterion("user_getaway not in", values, "userGetaway");
            return (Criteria) this;
        }

        public Criteria andUserGetawayBetween(Integer value1, Integer value2) {
            addCriterion("user_getaway between", value1, value2, "userGetaway");
            return (Criteria) this;
        }

        public Criteria andUserGetawayNotBetween(Integer value1, Integer value2) {
            addCriterion("user_getaway not between", value1, value2, "userGetaway");
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