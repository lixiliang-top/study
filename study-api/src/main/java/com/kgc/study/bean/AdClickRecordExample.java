package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdClickRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdClickRecordExample() {
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

        public Criteria andAdClickIdIsNull() {
            addCriterion("ad_click_id is null");
            return (Criteria) this;
        }

        public Criteria andAdClickIdIsNotNull() {
            addCriterion("ad_click_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdClickIdEqualTo(Long value) {
            addCriterion("ad_click_id =", value, "adClickId");
            return (Criteria) this;
        }

        public Criteria andAdClickIdNotEqualTo(Long value) {
            addCriterion("ad_click_id <>", value, "adClickId");
            return (Criteria) this;
        }

        public Criteria andAdClickIdGreaterThan(Long value) {
            addCriterion("ad_click_id >", value, "adClickId");
            return (Criteria) this;
        }

        public Criteria andAdClickIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ad_click_id >=", value, "adClickId");
            return (Criteria) this;
        }

        public Criteria andAdClickIdLessThan(Long value) {
            addCriterion("ad_click_id <", value, "adClickId");
            return (Criteria) this;
        }

        public Criteria andAdClickIdLessThanOrEqualTo(Long value) {
            addCriterion("ad_click_id <=", value, "adClickId");
            return (Criteria) this;
        }

        public Criteria andAdClickIdIn(List<Long> values) {
            addCriterion("ad_click_id in", values, "adClickId");
            return (Criteria) this;
        }

        public Criteria andAdClickIdNotIn(List<Long> values) {
            addCriterion("ad_click_id not in", values, "adClickId");
            return (Criteria) this;
        }

        public Criteria andAdClickIdBetween(Long value1, Long value2) {
            addCriterion("ad_click_id between", value1, value2, "adClickId");
            return (Criteria) this;
        }

        public Criteria andAdClickIdNotBetween(Long value1, Long value2) {
            addCriterion("ad_click_id not between", value1, value2, "adClickId");
            return (Criteria) this;
        }

        public Criteria andAdMentIdIsNull() {
            addCriterion("ad_ment_id is null");
            return (Criteria) this;
        }

        public Criteria andAdMentIdIsNotNull() {
            addCriterion("ad_ment_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdMentIdEqualTo(Long value) {
            addCriterion("ad_ment_id =", value, "adMentId");
            return (Criteria) this;
        }

        public Criteria andAdMentIdNotEqualTo(Long value) {
            addCriterion("ad_ment_id <>", value, "adMentId");
            return (Criteria) this;
        }

        public Criteria andAdMentIdGreaterThan(Long value) {
            addCriterion("ad_ment_id >", value, "adMentId");
            return (Criteria) this;
        }

        public Criteria andAdMentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ad_ment_id >=", value, "adMentId");
            return (Criteria) this;
        }

        public Criteria andAdMentIdLessThan(Long value) {
            addCriterion("ad_ment_id <", value, "adMentId");
            return (Criteria) this;
        }

        public Criteria andAdMentIdLessThanOrEqualTo(Long value) {
            addCriterion("ad_ment_id <=", value, "adMentId");
            return (Criteria) this;
        }

        public Criteria andAdMentIdIn(List<Long> values) {
            addCriterion("ad_ment_id in", values, "adMentId");
            return (Criteria) this;
        }

        public Criteria andAdMentIdNotIn(List<Long> values) {
            addCriterion("ad_ment_id not in", values, "adMentId");
            return (Criteria) this;
        }

        public Criteria andAdMentIdBetween(Long value1, Long value2) {
            addCriterion("ad_ment_id between", value1, value2, "adMentId");
            return (Criteria) this;
        }

        public Criteria andAdMentIdNotBetween(Long value1, Long value2) {
            addCriterion("ad_ment_id not between", value1, value2, "adMentId");
            return (Criteria) this;
        }

        public Criteria andAdClickNumIsNull() {
            addCriterion("ad_click_num is null");
            return (Criteria) this;
        }

        public Criteria andAdClickNumIsNotNull() {
            addCriterion("ad_click_num is not null");
            return (Criteria) this;
        }

        public Criteria andAdClickNumEqualTo(Long value) {
            addCriterion("ad_click_num =", value, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andAdClickNumNotEqualTo(Long value) {
            addCriterion("ad_click_num <>", value, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andAdClickNumGreaterThan(Long value) {
            addCriterion("ad_click_num >", value, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andAdClickNumGreaterThanOrEqualTo(Long value) {
            addCriterion("ad_click_num >=", value, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andAdClickNumLessThan(Long value) {
            addCriterion("ad_click_num <", value, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andAdClickNumLessThanOrEqualTo(Long value) {
            addCriterion("ad_click_num <=", value, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andAdClickNumIn(List<Long> values) {
            addCriterion("ad_click_num in", values, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andAdClickNumNotIn(List<Long> values) {
            addCriterion("ad_click_num not in", values, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andAdClickNumBetween(Long value1, Long value2) {
            addCriterion("ad_click_num between", value1, value2, "adClickNum");
            return (Criteria) this;
        }

        public Criteria andAdClickNumNotBetween(Long value1, Long value2) {
            addCriterion("ad_click_num not between", value1, value2, "adClickNum");
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