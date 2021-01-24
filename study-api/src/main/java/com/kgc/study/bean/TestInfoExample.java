package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestInfoExample() {
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

        public Criteria andTestGmtCreateIsNull() {
            addCriterion("test_gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andTestGmtCreateIsNotNull() {
            addCriterion("test_gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andTestGmtCreateEqualTo(Date value) {
            addCriterion("test_gmt_create =", value, "testGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTestGmtCreateNotEqualTo(Date value) {
            addCriterion("test_gmt_create <>", value, "testGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTestGmtCreateGreaterThan(Date value) {
            addCriterion("test_gmt_create >", value, "testGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTestGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("test_gmt_create >=", value, "testGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTestGmtCreateLessThan(Date value) {
            addCriterion("test_gmt_create <", value, "testGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTestGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("test_gmt_create <=", value, "testGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTestGmtCreateIn(List<Date> values) {
            addCriterion("test_gmt_create in", values, "testGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTestGmtCreateNotIn(List<Date> values) {
            addCriterion("test_gmt_create not in", values, "testGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTestGmtCreateBetween(Date value1, Date value2) {
            addCriterion("test_gmt_create between", value1, value2, "testGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTestGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("test_gmt_create not between", value1, value2, "testGmtCreate");
            return (Criteria) this;
        }

        public Criteria andTestGmtModifiedIsNull() {
            addCriterion("test_gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andTestGmtModifiedIsNotNull() {
            addCriterion("test_gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andTestGmtModifiedEqualTo(Date value) {
            addCriterion("test_gmt_modified =", value, "testGmtModified");
            return (Criteria) this;
        }

        public Criteria andTestGmtModifiedNotEqualTo(Date value) {
            addCriterion("test_gmt_modified <>", value, "testGmtModified");
            return (Criteria) this;
        }

        public Criteria andTestGmtModifiedGreaterThan(Date value) {
            addCriterion("test_gmt_modified >", value, "testGmtModified");
            return (Criteria) this;
        }

        public Criteria andTestGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("test_gmt_modified >=", value, "testGmtModified");
            return (Criteria) this;
        }

        public Criteria andTestGmtModifiedLessThan(Date value) {
            addCriterion("test_gmt_modified <", value, "testGmtModified");
            return (Criteria) this;
        }

        public Criteria andTestGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("test_gmt_modified <=", value, "testGmtModified");
            return (Criteria) this;
        }

        public Criteria andTestGmtModifiedIn(List<Date> values) {
            addCriterion("test_gmt_modified in", values, "testGmtModified");
            return (Criteria) this;
        }

        public Criteria andTestGmtModifiedNotIn(List<Date> values) {
            addCriterion("test_gmt_modified not in", values, "testGmtModified");
            return (Criteria) this;
        }

        public Criteria andTestGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("test_gmt_modified between", value1, value2, "testGmtModified");
            return (Criteria) this;
        }

        public Criteria andTestGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("test_gmt_modified not between", value1, value2, "testGmtModified");
            return (Criteria) this;
        }

        public Criteria andTestNameIsNull() {
            addCriterion("test_name is null");
            return (Criteria) this;
        }

        public Criteria andTestNameIsNotNull() {
            addCriterion("test_name is not null");
            return (Criteria) this;
        }

        public Criteria andTestNameEqualTo(String value) {
            addCriterion("test_name =", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameNotEqualTo(String value) {
            addCriterion("test_name <>", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameGreaterThan(String value) {
            addCriterion("test_name >", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameGreaterThanOrEqualTo(String value) {
            addCriterion("test_name >=", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameLessThan(String value) {
            addCriterion("test_name <", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameLessThanOrEqualTo(String value) {
            addCriterion("test_name <=", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameLike(String value) {
            addCriterion("test_name like", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameNotLike(String value) {
            addCriterion("test_name not like", value, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameIn(List<String> values) {
            addCriterion("test_name in", values, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameNotIn(List<String> values) {
            addCriterion("test_name not in", values, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameBetween(String value1, String value2) {
            addCriterion("test_name between", value1, value2, "testName");
            return (Criteria) this;
        }

        public Criteria andTestNameNotBetween(String value1, String value2) {
            addCriterion("test_name not between", value1, value2, "testName");
            return (Criteria) this;
        }

        public Criteria andTestQbIdIsNull() {
            addCriterion("test_qb_id is null");
            return (Criteria) this;
        }

        public Criteria andTestQbIdIsNotNull() {
            addCriterion("test_qb_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestQbIdEqualTo(Integer value) {
            addCriterion("test_qb_id =", value, "testQbId");
            return (Criteria) this;
        }

        public Criteria andTestQbIdNotEqualTo(Integer value) {
            addCriterion("test_qb_id <>", value, "testQbId");
            return (Criteria) this;
        }

        public Criteria andTestQbIdGreaterThan(Integer value) {
            addCriterion("test_qb_id >", value, "testQbId");
            return (Criteria) this;
        }

        public Criteria andTestQbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_qb_id >=", value, "testQbId");
            return (Criteria) this;
        }

        public Criteria andTestQbIdLessThan(Integer value) {
            addCriterion("test_qb_id <", value, "testQbId");
            return (Criteria) this;
        }

        public Criteria andTestQbIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_qb_id <=", value, "testQbId");
            return (Criteria) this;
        }

        public Criteria andTestQbIdIn(List<Integer> values) {
            addCriterion("test_qb_id in", values, "testQbId");
            return (Criteria) this;
        }

        public Criteria andTestQbIdNotIn(List<Integer> values) {
            addCriterion("test_qb_id not in", values, "testQbId");
            return (Criteria) this;
        }

        public Criteria andTestQbIdBetween(Integer value1, Integer value2) {
            addCriterion("test_qb_id between", value1, value2, "testQbId");
            return (Criteria) this;
        }

        public Criteria andTestQbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_qb_id not between", value1, value2, "testQbId");
            return (Criteria) this;
        }

        public Criteria andTestTimeIsNull() {
            addCriterion("test_time is null");
            return (Criteria) this;
        }

        public Criteria andTestTimeIsNotNull() {
            addCriterion("test_time is not null");
            return (Criteria) this;
        }

        public Criteria andTestTimeEqualTo(Date value) {
            addCriterion("test_time =", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeNotEqualTo(Date value) {
            addCriterion("test_time <>", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeGreaterThan(Date value) {
            addCriterion("test_time >", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("test_time >=", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeLessThan(Date value) {
            addCriterion("test_time <", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeLessThanOrEqualTo(Date value) {
            addCriterion("test_time <=", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeIn(List<Date> values) {
            addCriterion("test_time in", values, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeNotIn(List<Date> values) {
            addCriterion("test_time not in", values, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeBetween(Date value1, Date value2) {
            addCriterion("test_time between", value1, value2, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeNotBetween(Date value1, Date value2) {
            addCriterion("test_time not between", value1, value2, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestScoreIsNull() {
            addCriterion("test_score is null");
            return (Criteria) this;
        }

        public Criteria andTestScoreIsNotNull() {
            addCriterion("test_score is not null");
            return (Criteria) this;
        }

        public Criteria andTestScoreEqualTo(Integer value) {
            addCriterion("test_score =", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotEqualTo(Integer value) {
            addCriterion("test_score <>", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreGreaterThan(Integer value) {
            addCriterion("test_score >", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_score >=", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreLessThan(Integer value) {
            addCriterion("test_score <", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreLessThanOrEqualTo(Integer value) {
            addCriterion("test_score <=", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreIn(List<Integer> values) {
            addCriterion("test_score in", values, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotIn(List<Integer> values) {
            addCriterion("test_score not in", values, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreBetween(Integer value1, Integer value2) {
            addCriterion("test_score between", value1, value2, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("test_score not between", value1, value2, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestTypeIsNull() {
            addCriterion("test_type is null");
            return (Criteria) this;
        }

        public Criteria andTestTypeIsNotNull() {
            addCriterion("test_type is not null");
            return (Criteria) this;
        }

        public Criteria andTestTypeEqualTo(Integer value) {
            addCriterion("test_type =", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotEqualTo(Integer value) {
            addCriterion("test_type <>", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeGreaterThan(Integer value) {
            addCriterion("test_type >", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_type >=", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLessThan(Integer value) {
            addCriterion("test_type <", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLessThanOrEqualTo(Integer value) {
            addCriterion("test_type <=", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeIn(List<Integer> values) {
            addCriterion("test_type in", values, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotIn(List<Integer> values) {
            addCriterion("test_type not in", values, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeBetween(Integer value1, Integer value2) {
            addCriterion("test_type between", value1, value2, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("test_type not between", value1, value2, "testType");
            return (Criteria) this;
        }

        public Criteria andTestAIsNull() {
            addCriterion("test_a is null");
            return (Criteria) this;
        }

        public Criteria andTestAIsNotNull() {
            addCriterion("test_a is not null");
            return (Criteria) this;
        }

        public Criteria andTestAEqualTo(String value) {
            addCriterion("test_a =", value, "testA");
            return (Criteria) this;
        }

        public Criteria andTestANotEqualTo(String value) {
            addCriterion("test_a <>", value, "testA");
            return (Criteria) this;
        }

        public Criteria andTestAGreaterThan(String value) {
            addCriterion("test_a >", value, "testA");
            return (Criteria) this;
        }

        public Criteria andTestAGreaterThanOrEqualTo(String value) {
            addCriterion("test_a >=", value, "testA");
            return (Criteria) this;
        }

        public Criteria andTestALessThan(String value) {
            addCriterion("test_a <", value, "testA");
            return (Criteria) this;
        }

        public Criteria andTestALessThanOrEqualTo(String value) {
            addCriterion("test_a <=", value, "testA");
            return (Criteria) this;
        }

        public Criteria andTestALike(String value) {
            addCriterion("test_a like", value, "testA");
            return (Criteria) this;
        }

        public Criteria andTestANotLike(String value) {
            addCriterion("test_a not like", value, "testA");
            return (Criteria) this;
        }

        public Criteria andTestAIn(List<String> values) {
            addCriterion("test_a in", values, "testA");
            return (Criteria) this;
        }

        public Criteria andTestANotIn(List<String> values) {
            addCriterion("test_a not in", values, "testA");
            return (Criteria) this;
        }

        public Criteria andTestABetween(String value1, String value2) {
            addCriterion("test_a between", value1, value2, "testA");
            return (Criteria) this;
        }

        public Criteria andTestANotBetween(String value1, String value2) {
            addCriterion("test_a not between", value1, value2, "testA");
            return (Criteria) this;
        }

        public Criteria andTestBIsNull() {
            addCriterion("test_b is null");
            return (Criteria) this;
        }

        public Criteria andTestBIsNotNull() {
            addCriterion("test_b is not null");
            return (Criteria) this;
        }

        public Criteria andTestBEqualTo(String value) {
            addCriterion("test_b =", value, "testB");
            return (Criteria) this;
        }

        public Criteria andTestBNotEqualTo(String value) {
            addCriterion("test_b <>", value, "testB");
            return (Criteria) this;
        }

        public Criteria andTestBGreaterThan(String value) {
            addCriterion("test_b >", value, "testB");
            return (Criteria) this;
        }

        public Criteria andTestBGreaterThanOrEqualTo(String value) {
            addCriterion("test_b >=", value, "testB");
            return (Criteria) this;
        }

        public Criteria andTestBLessThan(String value) {
            addCriterion("test_b <", value, "testB");
            return (Criteria) this;
        }

        public Criteria andTestBLessThanOrEqualTo(String value) {
            addCriterion("test_b <=", value, "testB");
            return (Criteria) this;
        }

        public Criteria andTestBLike(String value) {
            addCriterion("test_b like", value, "testB");
            return (Criteria) this;
        }

        public Criteria andTestBNotLike(String value) {
            addCriterion("test_b not like", value, "testB");
            return (Criteria) this;
        }

        public Criteria andTestBIn(List<String> values) {
            addCriterion("test_b in", values, "testB");
            return (Criteria) this;
        }

        public Criteria andTestBNotIn(List<String> values) {
            addCriterion("test_b not in", values, "testB");
            return (Criteria) this;
        }

        public Criteria andTestBBetween(String value1, String value2) {
            addCriterion("test_b between", value1, value2, "testB");
            return (Criteria) this;
        }

        public Criteria andTestBNotBetween(String value1, String value2) {
            addCriterion("test_b not between", value1, value2, "testB");
            return (Criteria) this;
        }

        public Criteria andTestCIsNull() {
            addCriterion("test_c is null");
            return (Criteria) this;
        }

        public Criteria andTestCIsNotNull() {
            addCriterion("test_c is not null");
            return (Criteria) this;
        }

        public Criteria andTestCEqualTo(String value) {
            addCriterion("test_c =", value, "testC");
            return (Criteria) this;
        }

        public Criteria andTestCNotEqualTo(String value) {
            addCriterion("test_c <>", value, "testC");
            return (Criteria) this;
        }

        public Criteria andTestCGreaterThan(String value) {
            addCriterion("test_c >", value, "testC");
            return (Criteria) this;
        }

        public Criteria andTestCGreaterThanOrEqualTo(String value) {
            addCriterion("test_c >=", value, "testC");
            return (Criteria) this;
        }

        public Criteria andTestCLessThan(String value) {
            addCriterion("test_c <", value, "testC");
            return (Criteria) this;
        }

        public Criteria andTestCLessThanOrEqualTo(String value) {
            addCriterion("test_c <=", value, "testC");
            return (Criteria) this;
        }

        public Criteria andTestCLike(String value) {
            addCriterion("test_c like", value, "testC");
            return (Criteria) this;
        }

        public Criteria andTestCNotLike(String value) {
            addCriterion("test_c not like", value, "testC");
            return (Criteria) this;
        }

        public Criteria andTestCIn(List<String> values) {
            addCriterion("test_c in", values, "testC");
            return (Criteria) this;
        }

        public Criteria andTestCNotIn(List<String> values) {
            addCriterion("test_c not in", values, "testC");
            return (Criteria) this;
        }

        public Criteria andTestCBetween(String value1, String value2) {
            addCriterion("test_c between", value1, value2, "testC");
            return (Criteria) this;
        }

        public Criteria andTestCNotBetween(String value1, String value2) {
            addCriterion("test_c not between", value1, value2, "testC");
            return (Criteria) this;
        }

        public Criteria andTestDIsNull() {
            addCriterion("test_d is null");
            return (Criteria) this;
        }

        public Criteria andTestDIsNotNull() {
            addCriterion("test_d is not null");
            return (Criteria) this;
        }

        public Criteria andTestDEqualTo(String value) {
            addCriterion("test_d =", value, "testD");
            return (Criteria) this;
        }

        public Criteria andTestDNotEqualTo(String value) {
            addCriterion("test_d <>", value, "testD");
            return (Criteria) this;
        }

        public Criteria andTestDGreaterThan(String value) {
            addCriterion("test_d >", value, "testD");
            return (Criteria) this;
        }

        public Criteria andTestDGreaterThanOrEqualTo(String value) {
            addCriterion("test_d >=", value, "testD");
            return (Criteria) this;
        }

        public Criteria andTestDLessThan(String value) {
            addCriterion("test_d <", value, "testD");
            return (Criteria) this;
        }

        public Criteria andTestDLessThanOrEqualTo(String value) {
            addCriterion("test_d <=", value, "testD");
            return (Criteria) this;
        }

        public Criteria andTestDLike(String value) {
            addCriterion("test_d like", value, "testD");
            return (Criteria) this;
        }

        public Criteria andTestDNotLike(String value) {
            addCriterion("test_d not like", value, "testD");
            return (Criteria) this;
        }

        public Criteria andTestDIn(List<String> values) {
            addCriterion("test_d in", values, "testD");
            return (Criteria) this;
        }

        public Criteria andTestDNotIn(List<String> values) {
            addCriterion("test_d not in", values, "testD");
            return (Criteria) this;
        }

        public Criteria andTestDBetween(String value1, String value2) {
            addCriterion("test_d between", value1, value2, "testD");
            return (Criteria) this;
        }

        public Criteria andTestDNotBetween(String value1, String value2) {
            addCriterion("test_d not between", value1, value2, "testD");
            return (Criteria) this;
        }

        public Criteria andTestKeysIsNull() {
            addCriterion("test_keys is null");
            return (Criteria) this;
        }

        public Criteria andTestKeysIsNotNull() {
            addCriterion("test_keys is not null");
            return (Criteria) this;
        }

        public Criteria andTestKeysEqualTo(String value) {
            addCriterion("test_keys =", value, "testKeys");
            return (Criteria) this;
        }

        public Criteria andTestKeysNotEqualTo(String value) {
            addCriterion("test_keys <>", value, "testKeys");
            return (Criteria) this;
        }

        public Criteria andTestKeysGreaterThan(String value) {
            addCriterion("test_keys >", value, "testKeys");
            return (Criteria) this;
        }

        public Criteria andTestKeysGreaterThanOrEqualTo(String value) {
            addCriterion("test_keys >=", value, "testKeys");
            return (Criteria) this;
        }

        public Criteria andTestKeysLessThan(String value) {
            addCriterion("test_keys <", value, "testKeys");
            return (Criteria) this;
        }

        public Criteria andTestKeysLessThanOrEqualTo(String value) {
            addCriterion("test_keys <=", value, "testKeys");
            return (Criteria) this;
        }

        public Criteria andTestKeysLike(String value) {
            addCriterion("test_keys like", value, "testKeys");
            return (Criteria) this;
        }

        public Criteria andTestKeysNotLike(String value) {
            addCriterion("test_keys not like", value, "testKeys");
            return (Criteria) this;
        }

        public Criteria andTestKeysIn(List<String> values) {
            addCriterion("test_keys in", values, "testKeys");
            return (Criteria) this;
        }

        public Criteria andTestKeysNotIn(List<String> values) {
            addCriterion("test_keys not in", values, "testKeys");
            return (Criteria) this;
        }

        public Criteria andTestKeysBetween(String value1, String value2) {
            addCriterion("test_keys between", value1, value2, "testKeys");
            return (Criteria) this;
        }

        public Criteria andTestKeysNotBetween(String value1, String value2) {
            addCriterion("test_keys not between", value1, value2, "testKeys");
            return (Criteria) this;
        }

        public Criteria andTestHintsIsNull() {
            addCriterion("test_hints is null");
            return (Criteria) this;
        }

        public Criteria andTestHintsIsNotNull() {
            addCriterion("test_hints is not null");
            return (Criteria) this;
        }

        public Criteria andTestHintsEqualTo(String value) {
            addCriterion("test_hints =", value, "testHints");
            return (Criteria) this;
        }

        public Criteria andTestHintsNotEqualTo(String value) {
            addCriterion("test_hints <>", value, "testHints");
            return (Criteria) this;
        }

        public Criteria andTestHintsGreaterThan(String value) {
            addCriterion("test_hints >", value, "testHints");
            return (Criteria) this;
        }

        public Criteria andTestHintsGreaterThanOrEqualTo(String value) {
            addCriterion("test_hints >=", value, "testHints");
            return (Criteria) this;
        }

        public Criteria andTestHintsLessThan(String value) {
            addCriterion("test_hints <", value, "testHints");
            return (Criteria) this;
        }

        public Criteria andTestHintsLessThanOrEqualTo(String value) {
            addCriterion("test_hints <=", value, "testHints");
            return (Criteria) this;
        }

        public Criteria andTestHintsLike(String value) {
            addCriterion("test_hints like", value, "testHints");
            return (Criteria) this;
        }

        public Criteria andTestHintsNotLike(String value) {
            addCriterion("test_hints not like", value, "testHints");
            return (Criteria) this;
        }

        public Criteria andTestHintsIn(List<String> values) {
            addCriterion("test_hints in", values, "testHints");
            return (Criteria) this;
        }

        public Criteria andTestHintsNotIn(List<String> values) {
            addCriterion("test_hints not in", values, "testHints");
            return (Criteria) this;
        }

        public Criteria andTestHintsBetween(String value1, String value2) {
            addCriterion("test_hints between", value1, value2, "testHints");
            return (Criteria) this;
        }

        public Criteria andTestHintsNotBetween(String value1, String value2) {
            addCriterion("test_hints not between", value1, value2, "testHints");
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