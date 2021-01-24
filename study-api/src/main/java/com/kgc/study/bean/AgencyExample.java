package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgencyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgencyExample() {
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

        public Criteria andAgencyNameIsNull() {
            addCriterion("agency_name is null");
            return (Criteria) this;
        }

        public Criteria andAgencyNameIsNotNull() {
            addCriterion("agency_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyNameEqualTo(String value) {
            addCriterion("agency_name =", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameNotEqualTo(String value) {
            addCriterion("agency_name <>", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameGreaterThan(String value) {
            addCriterion("agency_name >", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameGreaterThanOrEqualTo(String value) {
            addCriterion("agency_name >=", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameLessThan(String value) {
            addCriterion("agency_name <", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameLessThanOrEqualTo(String value) {
            addCriterion("agency_name <=", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameLike(String value) {
            addCriterion("agency_name like", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameNotLike(String value) {
            addCriterion("agency_name not like", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameIn(List<String> values) {
            addCriterion("agency_name in", values, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameNotIn(List<String> values) {
            addCriterion("agency_name not in", values, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameBetween(String value1, String value2) {
            addCriterion("agency_name between", value1, value2, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameNotBetween(String value1, String value2) {
            addCriterion("agency_name not between", value1, value2, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIsNull() {
            addCriterion("agency_address is null");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIsNotNull() {
            addCriterion("agency_address is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressEqualTo(String value) {
            addCriterion("agency_address =", value, "agencyAddress");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressNotEqualTo(String value) {
            addCriterion("agency_address <>", value, "agencyAddress");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressGreaterThan(String value) {
            addCriterion("agency_address >", value, "agencyAddress");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("agency_address >=", value, "agencyAddress");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressLessThan(String value) {
            addCriterion("agency_address <", value, "agencyAddress");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressLessThanOrEqualTo(String value) {
            addCriterion("agency_address <=", value, "agencyAddress");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressLike(String value) {
            addCriterion("agency_address like", value, "agencyAddress");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressNotLike(String value) {
            addCriterion("agency_address not like", value, "agencyAddress");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressIn(List<String> values) {
            addCriterion("agency_address in", values, "agencyAddress");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressNotIn(List<String> values) {
            addCriterion("agency_address not in", values, "agencyAddress");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressBetween(String value1, String value2) {
            addCriterion("agency_address between", value1, value2, "agencyAddress");
            return (Criteria) this;
        }

        public Criteria andAgencyAddressNotBetween(String value1, String value2) {
            addCriterion("agency_address not between", value1, value2, "agencyAddress");
            return (Criteria) this;
        }

        public Criteria andAgencyPhoneIsNull() {
            addCriterion("agency_phone is null");
            return (Criteria) this;
        }

        public Criteria andAgencyPhoneIsNotNull() {
            addCriterion("agency_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyPhoneEqualTo(String value) {
            addCriterion("agency_phone =", value, "agencyPhone");
            return (Criteria) this;
        }

        public Criteria andAgencyPhoneNotEqualTo(String value) {
            addCriterion("agency_phone <>", value, "agencyPhone");
            return (Criteria) this;
        }

        public Criteria andAgencyPhoneGreaterThan(String value) {
            addCriterion("agency_phone >", value, "agencyPhone");
            return (Criteria) this;
        }

        public Criteria andAgencyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("agency_phone >=", value, "agencyPhone");
            return (Criteria) this;
        }

        public Criteria andAgencyPhoneLessThan(String value) {
            addCriterion("agency_phone <", value, "agencyPhone");
            return (Criteria) this;
        }

        public Criteria andAgencyPhoneLessThanOrEqualTo(String value) {
            addCriterion("agency_phone <=", value, "agencyPhone");
            return (Criteria) this;
        }

        public Criteria andAgencyPhoneLike(String value) {
            addCriterion("agency_phone like", value, "agencyPhone");
            return (Criteria) this;
        }

        public Criteria andAgencyPhoneNotLike(String value) {
            addCriterion("agency_phone not like", value, "agencyPhone");
            return (Criteria) this;
        }

        public Criteria andAgencyPhoneIn(List<String> values) {
            addCriterion("agency_phone in", values, "agencyPhone");
            return (Criteria) this;
        }

        public Criteria andAgencyPhoneNotIn(List<String> values) {
            addCriterion("agency_phone not in", values, "agencyPhone");
            return (Criteria) this;
        }

        public Criteria andAgencyPhoneBetween(String value1, String value2) {
            addCriterion("agency_phone between", value1, value2, "agencyPhone");
            return (Criteria) this;
        }

        public Criteria andAgencyPhoneNotBetween(String value1, String value2) {
            addCriterion("agency_phone not between", value1, value2, "agencyPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameIsNull() {
            addCriterion("principal_name is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameIsNotNull() {
            addCriterion("principal_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameEqualTo(String value) {
            addCriterion("principal_name =", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotEqualTo(String value) {
            addCriterion("principal_name <>", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameGreaterThan(String value) {
            addCriterion("principal_name >", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameGreaterThanOrEqualTo(String value) {
            addCriterion("principal_name >=", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameLessThan(String value) {
            addCriterion("principal_name <", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameLessThanOrEqualTo(String value) {
            addCriterion("principal_name <=", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameLike(String value) {
            addCriterion("principal_name like", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotLike(String value) {
            addCriterion("principal_name not like", value, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameIn(List<String> values) {
            addCriterion("principal_name in", values, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotIn(List<String> values) {
            addCriterion("principal_name not in", values, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameBetween(String value1, String value2) {
            addCriterion("principal_name between", value1, value2, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalNameNotBetween(String value1, String value2) {
            addCriterion("principal_name not between", value1, value2, "principalName");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneIsNull() {
            addCriterion("principal_phone is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneIsNotNull() {
            addCriterion("principal_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneEqualTo(String value) {
            addCriterion("principal_phone =", value, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNotEqualTo(String value) {
            addCriterion("principal_phone <>", value, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneGreaterThan(String value) {
            addCriterion("principal_phone >", value, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("principal_phone >=", value, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneLessThan(String value) {
            addCriterion("principal_phone <", value, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneLessThanOrEqualTo(String value) {
            addCriterion("principal_phone <=", value, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneLike(String value) {
            addCriterion("principal_phone like", value, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNotLike(String value) {
            addCriterion("principal_phone not like", value, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneIn(List<String> values) {
            addCriterion("principal_phone in", values, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNotIn(List<String> values) {
            addCriterion("principal_phone not in", values, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneBetween(String value1, String value2) {
            addCriterion("principal_phone between", value1, value2, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andPrincipalPhoneNotBetween(String value1, String value2) {
            addCriterion("principal_phone not between", value1, value2, "principalPhone");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateIsNull() {
            addCriterion("admin_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateIsNotNull() {
            addCriterion("admin_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateEqualTo(Date value) {
            addCriterion("admin_gmt_create =", value, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateNotEqualTo(Date value) {
            addCriterion("admin_gmt_create <>", value, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateGreaterThan(Date value) {
            addCriterion("admin_gmt_create >", value, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_gmt_create >=", value, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateLessThan(Date value) {
            addCriterion("admin_gmt_create <", value, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("admin_gmt_create <=", value, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateIn(List<Date> values) {
            addCriterion("admin_gmt_create in", values, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateNotIn(List<Date> values) {
            addCriterion("admin_gmt_create not in", values, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateBetween(Date value1, Date value2) {
            addCriterion("admin_gmt_create between", value1, value2, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("admin_gmt_create not between", value1, value2, "adminGmtCreate");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedIsNull() {
            addCriterion("admin_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedIsNotNull() {
            addCriterion("admin_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedEqualTo(Date value) {
            addCriterion("admin_gmt_modified =", value, "adminGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedNotEqualTo(Date value) {
            addCriterion("admin_gmt_modified <>", value, "adminGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedGreaterThan(Date value) {
            addCriterion("admin_gmt_modified >", value, "adminGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_gmt_modified >=", value, "adminGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedLessThan(Date value) {
            addCriterion("admin_gmt_modified <", value, "adminGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("admin_gmt_modified <=", value, "adminGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedIn(List<Date> values) {
            addCriterion("admin_gmt_modified in", values, "adminGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedNotIn(List<Date> values) {
            addCriterion("admin_gmt_modified not in", values, "adminGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("admin_gmt_modified between", value1, value2, "adminGmtModified");
            return (Criteria) this;
        }

        public Criteria andAdminGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("admin_gmt_modified not between", value1, value2, "adminGmtModified");
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