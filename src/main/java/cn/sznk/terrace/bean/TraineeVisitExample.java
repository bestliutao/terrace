package cn.sznk.terrace.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TraineeVisitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraineeVisitExample() {
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

        public Criteria andVisitnoIsNull() {
            addCriterion("visitNo is null");
            return (Criteria) this;
        }

        public Criteria andVisitnoIsNotNull() {
            addCriterion("visitNo is not null");
            return (Criteria) this;
        }

        public Criteria andVisitnoEqualTo(String value) {
            addCriterion("visitNo =", value, "visitno");
            return (Criteria) this;
        }

        public Criteria andVisitnoNotEqualTo(String value) {
            addCriterion("visitNo <>", value, "visitno");
            return (Criteria) this;
        }

        public Criteria andVisitnoGreaterThan(String value) {
            addCriterion("visitNo >", value, "visitno");
            return (Criteria) this;
        }

        public Criteria andVisitnoGreaterThanOrEqualTo(String value) {
            addCriterion("visitNo >=", value, "visitno");
            return (Criteria) this;
        }

        public Criteria andVisitnoLessThan(String value) {
            addCriterion("visitNo <", value, "visitno");
            return (Criteria) this;
        }

        public Criteria andVisitnoLessThanOrEqualTo(String value) {
            addCriterion("visitNo <=", value, "visitno");
            return (Criteria) this;
        }

        public Criteria andVisitnoLike(String value) {
            addCriterion("visitNo like", value, "visitno");
            return (Criteria) this;
        }

        public Criteria andVisitnoNotLike(String value) {
            addCriterion("visitNo not like", value, "visitno");
            return (Criteria) this;
        }

        public Criteria andVisitnoIn(List<String> values) {
            addCriterion("visitNo in", values, "visitno");
            return (Criteria) this;
        }

        public Criteria andVisitnoNotIn(List<String> values) {
            addCriterion("visitNo not in", values, "visitno");
            return (Criteria) this;
        }

        public Criteria andVisitnoBetween(String value1, String value2) {
            addCriterion("visitNo between", value1, value2, "visitno");
            return (Criteria) this;
        }

        public Criteria andVisitnoNotBetween(String value1, String value2) {
            addCriterion("visitNo not between", value1, value2, "visitno");
            return (Criteria) this;
        }

        public Criteria andTraineeidIsNull() {
            addCriterion("traineeId is null");
            return (Criteria) this;
        }

        public Criteria andTraineeidIsNotNull() {
            addCriterion("traineeId is not null");
            return (Criteria) this;
        }

        public Criteria andTraineeidEqualTo(Integer value) {
            addCriterion("traineeId =", value, "traineeid");
            return (Criteria) this;
        }

        public Criteria andTraineeidNotEqualTo(Integer value) {
            addCriterion("traineeId <>", value, "traineeid");
            return (Criteria) this;
        }

        public Criteria andTraineeidGreaterThan(Integer value) {
            addCriterion("traineeId >", value, "traineeid");
            return (Criteria) this;
        }

        public Criteria andTraineeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("traineeId >=", value, "traineeid");
            return (Criteria) this;
        }

        public Criteria andTraineeidLessThan(Integer value) {
            addCriterion("traineeId <", value, "traineeid");
            return (Criteria) this;
        }

        public Criteria andTraineeidLessThanOrEqualTo(Integer value) {
            addCriterion("traineeId <=", value, "traineeid");
            return (Criteria) this;
        }

        public Criteria andTraineeidIn(List<Integer> values) {
            addCriterion("traineeId in", values, "traineeid");
            return (Criteria) this;
        }

        public Criteria andTraineeidNotIn(List<Integer> values) {
            addCriterion("traineeId not in", values, "traineeid");
            return (Criteria) this;
        }

        public Criteria andTraineeidBetween(Integer value1, Integer value2) {
            addCriterion("traineeId between", value1, value2, "traineeid");
            return (Criteria) this;
        }

        public Criteria andTraineeidNotBetween(Integer value1, Integer value2) {
            addCriterion("traineeId not between", value1, value2, "traineeid");
            return (Criteria) this;
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
            addCriterion("traineename is null");
            return (Criteria) this;
        }

        public Criteria andTraineenameIsNotNull() {
            addCriterion("traineename is not null");
            return (Criteria) this;
        }

        public Criteria andTraineenameEqualTo(String value) {
            addCriterion("traineename =", value, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameNotEqualTo(String value) {
            addCriterion("traineename <>", value, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameGreaterThan(String value) {
            addCriterion("traineename >", value, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameGreaterThanOrEqualTo(String value) {
            addCriterion("traineename >=", value, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameLessThan(String value) {
            addCriterion("traineename <", value, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameLessThanOrEqualTo(String value) {
            addCriterion("traineename <=", value, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameLike(String value) {
            addCriterion("traineename like", value, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameNotLike(String value) {
            addCriterion("traineename not like", value, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameIn(List<String> values) {
            addCriterion("traineename in", values, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameNotIn(List<String> values) {
            addCriterion("traineename not in", values, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameBetween(String value1, String value2) {
            addCriterion("traineename between", value1, value2, "traineename");
            return (Criteria) this;
        }

        public Criteria andTraineenameNotBetween(String value1, String value2) {
            addCriterion("traineename not between", value1, value2, "traineename");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitIsNull() {
            addCriterion("subordinateUnit is null");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitIsNotNull() {
            addCriterion("subordinateUnit is not null");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitEqualTo(String value) {
            addCriterion("subordinateUnit =", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitNotEqualTo(String value) {
            addCriterion("subordinateUnit <>", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitGreaterThan(String value) {
            addCriterion("subordinateUnit >", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitGreaterThanOrEqualTo(String value) {
            addCriterion("subordinateUnit >=", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitLessThan(String value) {
            addCriterion("subordinateUnit <", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitLessThanOrEqualTo(String value) {
            addCriterion("subordinateUnit <=", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitLike(String value) {
            addCriterion("subordinateUnit like", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitNotLike(String value) {
            addCriterion("subordinateUnit not like", value, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitIn(List<String> values) {
            addCriterion("subordinateUnit in", values, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitNotIn(List<String> values) {
            addCriterion("subordinateUnit not in", values, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitBetween(String value1, String value2) {
            addCriterion("subordinateUnit between", value1, value2, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andSubordinateunitNotBetween(String value1, String value2) {
            addCriterion("subordinateUnit not between", value1, value2, "subordinateunit");
            return (Criteria) this;
        }

        public Criteria andVisitnameIsNull() {
            addCriterion("visitName is null");
            return (Criteria) this;
        }

        public Criteria andVisitnameIsNotNull() {
            addCriterion("visitName is not null");
            return (Criteria) this;
        }

        public Criteria andVisitnameEqualTo(String value) {
            addCriterion("visitName =", value, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameNotEqualTo(String value) {
            addCriterion("visitName <>", value, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameGreaterThan(String value) {
            addCriterion("visitName >", value, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameGreaterThanOrEqualTo(String value) {
            addCriterion("visitName >=", value, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameLessThan(String value) {
            addCriterion("visitName <", value, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameLessThanOrEqualTo(String value) {
            addCriterion("visitName <=", value, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameLike(String value) {
            addCriterion("visitName like", value, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameNotLike(String value) {
            addCriterion("visitName not like", value, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameIn(List<String> values) {
            addCriterion("visitName in", values, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameNotIn(List<String> values) {
            addCriterion("visitName not in", values, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameBetween(String value1, String value2) {
            addCriterion("visitName between", value1, value2, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitnameNotBetween(String value1, String value2) {
            addCriterion("visitName not between", value1, value2, "visitname");
            return (Criteria) this;
        }

        public Criteria andVisitrelationIsNull() {
            addCriterion("visitRelation is null");
            return (Criteria) this;
        }

        public Criteria andVisitrelationIsNotNull() {
            addCriterion("visitRelation is not null");
            return (Criteria) this;
        }

        public Criteria andVisitrelationEqualTo(String value) {
            addCriterion("visitRelation =", value, "visitrelation");
            return (Criteria) this;
        }

        public Criteria andVisitrelationNotEqualTo(String value) {
            addCriterion("visitRelation <>", value, "visitrelation");
            return (Criteria) this;
        }

        public Criteria andVisitrelationGreaterThan(String value) {
            addCriterion("visitRelation >", value, "visitrelation");
            return (Criteria) this;
        }

        public Criteria andVisitrelationGreaterThanOrEqualTo(String value) {
            addCriterion("visitRelation >=", value, "visitrelation");
            return (Criteria) this;
        }

        public Criteria andVisitrelationLessThan(String value) {
            addCriterion("visitRelation <", value, "visitrelation");
            return (Criteria) this;
        }

        public Criteria andVisitrelationLessThanOrEqualTo(String value) {
            addCriterion("visitRelation <=", value, "visitrelation");
            return (Criteria) this;
        }

        public Criteria andVisitrelationLike(String value) {
            addCriterion("visitRelation like", value, "visitrelation");
            return (Criteria) this;
        }

        public Criteria andVisitrelationNotLike(String value) {
            addCriterion("visitRelation not like", value, "visitrelation");
            return (Criteria) this;
        }

        public Criteria andVisitrelationIn(List<String> values) {
            addCriterion("visitRelation in", values, "visitrelation");
            return (Criteria) this;
        }

        public Criteria andVisitrelationNotIn(List<String> values) {
            addCriterion("visitRelation not in", values, "visitrelation");
            return (Criteria) this;
        }

        public Criteria andVisitrelationBetween(String value1, String value2) {
            addCriterion("visitRelation between", value1, value2, "visitrelation");
            return (Criteria) this;
        }

        public Criteria andVisitrelationNotBetween(String value1, String value2) {
            addCriterion("visitRelation not between", value1, value2, "visitrelation");
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andVisitoraddressIsNull() {
            addCriterion("visitorAddress is null");
            return (Criteria) this;
        }

        public Criteria andVisitoraddressIsNotNull() {
            addCriterion("visitorAddress is not null");
            return (Criteria) this;
        }

        public Criteria andVisitoraddressEqualTo(String value) {
            addCriterion("visitorAddress =", value, "visitoraddress");
            return (Criteria) this;
        }

        public Criteria andVisitoraddressNotEqualTo(String value) {
            addCriterion("visitorAddress <>", value, "visitoraddress");
            return (Criteria) this;
        }

        public Criteria andVisitoraddressGreaterThan(String value) {
            addCriterion("visitorAddress >", value, "visitoraddress");
            return (Criteria) this;
        }

        public Criteria andVisitoraddressGreaterThanOrEqualTo(String value) {
            addCriterion("visitorAddress >=", value, "visitoraddress");
            return (Criteria) this;
        }

        public Criteria andVisitoraddressLessThan(String value) {
            addCriterion("visitorAddress <", value, "visitoraddress");
            return (Criteria) this;
        }

        public Criteria andVisitoraddressLessThanOrEqualTo(String value) {
            addCriterion("visitorAddress <=", value, "visitoraddress");
            return (Criteria) this;
        }

        public Criteria andVisitoraddressLike(String value) {
            addCriterion("visitorAddress like", value, "visitoraddress");
            return (Criteria) this;
        }

        public Criteria andVisitoraddressNotLike(String value) {
            addCriterion("visitorAddress not like", value, "visitoraddress");
            return (Criteria) this;
        }

        public Criteria andVisitoraddressIn(List<String> values) {
            addCriterion("visitorAddress in", values, "visitoraddress");
            return (Criteria) this;
        }

        public Criteria andVisitoraddressNotIn(List<String> values) {
            addCriterion("visitorAddress not in", values, "visitoraddress");
            return (Criteria) this;
        }

        public Criteria andVisitoraddressBetween(String value1, String value2) {
            addCriterion("visitorAddress between", value1, value2, "visitoraddress");
            return (Criteria) this;
        }

        public Criteria andVisitoraddressNotBetween(String value1, String value2) {
            addCriterion("visitorAddress not between", value1, value2, "visitoraddress");
            return (Criteria) this;
        }

        public Criteria andRegdateIsNull() {
            addCriterion("regDate is null");
            return (Criteria) this;
        }

        public Criteria andRegdateIsNotNull() {
            addCriterion("regDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegdateEqualTo(Date value) {
            addCriterion("regDate =", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotEqualTo(Date value) {
            addCriterion("regDate <>", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateGreaterThan(Date value) {
            addCriterion("regDate >", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateGreaterThanOrEqualTo(Date value) {
            addCriterion("regDate >=", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLessThan(Date value) {
            addCriterion("regDate <", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateLessThanOrEqualTo(Date value) {
            addCriterion("regDate <=", value, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateIn(List<Date> values) {
            addCriterion("regDate in", values, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotIn(List<Date> values) {
            addCriterion("regDate not in", values, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateBetween(Date value1, Date value2) {
            addCriterion("regDate between", value1, value2, "regdate");
            return (Criteria) this;
        }

        public Criteria andRegdateNotBetween(Date value1, Date value2) {
            addCriterion("regDate not between", value1, value2, "regdate");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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