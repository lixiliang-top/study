package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GradeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradeInfoExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdIsNull() {
            addCriterion("agency_address_id is null");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdIsNotNull() {
            addCriterion("agency_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdEqualTo(Integer value) {
            addCriterion("agency_address_id =", value, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdNotEqualTo(Integer value) {
            addCriterion("agency_address_id <>", value, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdGreaterThan(Integer value) {
            addCriterion("agency_address_id >", value, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agency_address_id >=", value, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdLessThan(Integer value) {
            addCriterion("agency_address_id <", value, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("agency_address_id <=", value, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdIn(List<Integer> values) {
            addCriterion("agency_address_id in", values, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdNotIn(List<Integer> values) {
            addCriterion("agency_address_id not in", values, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("agency_address_id between", value1, value2, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agency_address_id not between", value1, value2, "agencyAddressId");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNull() {
            addCriterion("grade_name is null");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNotNull() {
            addCriterion("grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNameEqualTo(String value) {
            addCriterion("grade_name =", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotEqualTo(String value) {
            addCriterion("grade_name <>", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThan(String value) {
            addCriterion("grade_name >", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("grade_name >=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThan(String value) {
            addCriterion("grade_name <", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThanOrEqualTo(String value) {
            addCriterion("grade_name <=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLike(String value) {
            addCriterion("grade_name like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotLike(String value) {
            addCriterion("grade_name not like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameIn(List<String> values) {
            addCriterion("grade_name in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotIn(List<String> values) {
            addCriterion("grade_name not in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameBetween(String value1, String value2) {
            addCriterion("grade_name between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotBetween(String value1, String value2) {
            addCriterion("grade_name not between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdIsNull() {
            addCriterion("grade_type_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdIsNotNull() {
            addCriterion("grade_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdEqualTo(Integer value) {
            addCriterion("grade_type_id =", value, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdNotEqualTo(Integer value) {
            addCriterion("grade_type_id <>", value, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdGreaterThan(Integer value) {
            addCriterion("grade_type_id >", value, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_type_id >=", value, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdLessThan(Integer value) {
            addCriterion("grade_type_id <", value, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_type_id <=", value, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdIn(List<Integer> values) {
            addCriterion("grade_type_id in", values, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdNotIn(List<Integer> values) {
            addCriterion("grade_type_id not in", values, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_type_id between", value1, value2, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradeTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_type_id not between", value1, value2, "gradeTypeId");
            return (Criteria) this;
        }

        public Criteria andGradePersonIsNull() {
            addCriterion("grade_person is null");
            return (Criteria) this;
        }

        public Criteria andGradePersonIsNotNull() {
            addCriterion("grade_person is not null");
            return (Criteria) this;
        }

        public Criteria andGradePersonEqualTo(Integer value) {
            addCriterion("grade_person =", value, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradePersonNotEqualTo(Integer value) {
            addCriterion("grade_person <>", value, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradePersonGreaterThan(Integer value) {
            addCriterion("grade_person >", value, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradePersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_person >=", value, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradePersonLessThan(Integer value) {
            addCriterion("grade_person <", value, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradePersonLessThanOrEqualTo(Integer value) {
            addCriterion("grade_person <=", value, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradePersonIn(List<Integer> values) {
            addCriterion("grade_person in", values, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradePersonNotIn(List<Integer> values) {
            addCriterion("grade_person not in", values, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradePersonBetween(Integer value1, Integer value2) {
            addCriterion("grade_person between", value1, value2, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradePersonNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_person not between", value1, value2, "gradePerson");
            return (Criteria) this;
        }

        public Criteria andGradeStartTimeIsNull() {
            addCriterion("grade_start_time is null");
            return (Criteria) this;
        }

        public Criteria andGradeStartTimeIsNotNull() {
            addCriterion("grade_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andGradeStartTimeEqualTo(Date value) {
            addCriterion("grade_start_time =", value, "gradeStartTime");
            return (Criteria) this;
        }

        public Criteria andGradeStartTimeNotEqualTo(Date value) {
            addCriterion("grade_start_time <>", value, "gradeStartTime");
            return (Criteria) this;
        }

        public Criteria andGradeStartTimeGreaterThan(Date value) {
            addCriterion("grade_start_time >", value, "gradeStartTime");
            return (Criteria) this;
        }

        public Criteria andGradeStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("grade_start_time >=", value, "gradeStartTime");
            return (Criteria) this;
        }

        public Criteria andGradeStartTimeLessThan(Date value) {
            addCriterion("grade_start_time <", value, "gradeStartTime");
            return (Criteria) this;
        }

        public Criteria andGradeStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("grade_start_time <=", value, "gradeStartTime");
            return (Criteria) this;
        }

        public Criteria andGradeStartTimeIn(List<Date> values) {
            addCriterion("grade_start_time in", values, "gradeStartTime");
            return (Criteria) this;
        }

        public Criteria andGradeStartTimeNotIn(List<Date> values) {
            addCriterion("grade_start_time not in", values, "gradeStartTime");
            return (Criteria) this;
        }

        public Criteria andGradeStartTimeBetween(Date value1, Date value2) {
            addCriterion("grade_start_time between", value1, value2, "gradeStartTime");
            return (Criteria) this;
        }

        public Criteria andGradeStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("grade_start_time not between", value1, value2, "gradeStartTime");
            return (Criteria) this;
        }

        public Criteria andGradeGmtFounderIdIsNull() {
            addCriterion("grade_gmt_founder_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeGmtFounderIdIsNotNull() {
            addCriterion("grade_gmt_founder_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeGmtFounderIdEqualTo(Integer value) {
            addCriterion("grade_gmt_founder_id =", value, "gradeGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andGradeGmtFounderIdNotEqualTo(Integer value) {
            addCriterion("grade_gmt_founder_id <>", value, "gradeGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andGradeGmtFounderIdGreaterThan(Integer value) {
            addCriterion("grade_gmt_founder_id >", value, "gradeGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andGradeGmtFounderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_gmt_founder_id >=", value, "gradeGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andGradeGmtFounderIdLessThan(Integer value) {
            addCriterion("grade_gmt_founder_id <", value, "gradeGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andGradeGmtFounderIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_gmt_founder_id <=", value, "gradeGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andGradeGmtFounderIdIn(List<Integer> values) {
            addCriterion("grade_gmt_founder_id in", values, "gradeGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andGradeGmtFounderIdNotIn(List<Integer> values) {
            addCriterion("grade_gmt_founder_id not in", values, "gradeGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andGradeGmtFounderIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_gmt_founder_id between", value1, value2, "gradeGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andGradeGmtFounderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_gmt_founder_id not between", value1, value2, "gradeGmtFounderId");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteIsNull() {
            addCriterion("logic_delete is null");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteIsNotNull() {
            addCriterion("logic_delete is not null");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteEqualTo(Integer value) {
            addCriterion("logic_delete =", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteNotEqualTo(Integer value) {
            addCriterion("logic_delete <>", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteGreaterThan(Integer value) {
            addCriterion("logic_delete >", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("logic_delete >=", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteLessThan(Integer value) {
            addCriterion("logic_delete <", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("logic_delete <=", value, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteIn(List<Integer> values) {
            addCriterion("logic_delete in", values, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteNotIn(List<Integer> values) {
            addCriterion("logic_delete not in", values, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteBetween(Integer value1, Integer value2) {
            addCriterion("logic_delete between", value1, value2, "logicDelete");
            return (Criteria) this;
        }

        public Criteria andLogicDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("logic_delete not between", value1, value2, "logicDelete");
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