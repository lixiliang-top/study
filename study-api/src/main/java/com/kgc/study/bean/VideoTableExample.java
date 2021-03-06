package com.kgc.study.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoTableExample() {
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

        public Criteria andVideoTableIdIsNull() {
            addCriterion("video_table_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoTableIdIsNotNull() {
            addCriterion("video_table_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTableIdEqualTo(Long value) {
            addCriterion("video_table_id =", value, "videoTableId");
            return (Criteria) this;
        }

        public Criteria andVideoTableIdNotEqualTo(Long value) {
            addCriterion("video_table_id <>", value, "videoTableId");
            return (Criteria) this;
        }

        public Criteria andVideoTableIdGreaterThan(Long value) {
            addCriterion("video_table_id >", value, "videoTableId");
            return (Criteria) this;
        }

        public Criteria andVideoTableIdGreaterThanOrEqualTo(Long value) {
            addCriterion("video_table_id >=", value, "videoTableId");
            return (Criteria) this;
        }

        public Criteria andVideoTableIdLessThan(Long value) {
            addCriterion("video_table_id <", value, "videoTableId");
            return (Criteria) this;
        }

        public Criteria andVideoTableIdLessThanOrEqualTo(Long value) {
            addCriterion("video_table_id <=", value, "videoTableId");
            return (Criteria) this;
        }

        public Criteria andVideoTableIdIn(List<Long> values) {
            addCriterion("video_table_id in", values, "videoTableId");
            return (Criteria) this;
        }

        public Criteria andVideoTableIdNotIn(List<Long> values) {
            addCriterion("video_table_id not in", values, "videoTableId");
            return (Criteria) this;
        }

        public Criteria andVideoTableIdBetween(Long value1, Long value2) {
            addCriterion("video_table_id between", value1, value2, "videoTableId");
            return (Criteria) this;
        }

        public Criteria andVideoTableIdNotBetween(Long value1, Long value2) {
            addCriterion("video_table_id not between", value1, value2, "videoTableId");
            return (Criteria) this;
        }

        public Criteria andVideoTableNameIsNull() {
            addCriterion("video_table_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoTableNameIsNotNull() {
            addCriterion("video_table_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTableNameEqualTo(String value) {
            addCriterion("video_table_name =", value, "videoTableName");
            return (Criteria) this;
        }

        public Criteria andVideoTableNameNotEqualTo(String value) {
            addCriterion("video_table_name <>", value, "videoTableName");
            return (Criteria) this;
        }

        public Criteria andVideoTableNameGreaterThan(String value) {
            addCriterion("video_table_name >", value, "videoTableName");
            return (Criteria) this;
        }

        public Criteria andVideoTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_table_name >=", value, "videoTableName");
            return (Criteria) this;
        }

        public Criteria andVideoTableNameLessThan(String value) {
            addCriterion("video_table_name <", value, "videoTableName");
            return (Criteria) this;
        }

        public Criteria andVideoTableNameLessThanOrEqualTo(String value) {
            addCriterion("video_table_name <=", value, "videoTableName");
            return (Criteria) this;
        }

        public Criteria andVideoTableNameLike(String value) {
            addCriterion("video_table_name like", value, "videoTableName");
            return (Criteria) this;
        }

        public Criteria andVideoTableNameNotLike(String value) {
            addCriterion("video_table_name not like", value, "videoTableName");
            return (Criteria) this;
        }

        public Criteria andVideoTableNameIn(List<String> values) {
            addCriterion("video_table_name in", values, "videoTableName");
            return (Criteria) this;
        }

        public Criteria andVideoTableNameNotIn(List<String> values) {
            addCriterion("video_table_name not in", values, "videoTableName");
            return (Criteria) this;
        }

        public Criteria andVideoTableNameBetween(String value1, String value2) {
            addCriterion("video_table_name between", value1, value2, "videoTableName");
            return (Criteria) this;
        }

        public Criteria andVideoTableNameNotBetween(String value1, String value2) {
            addCriterion("video_table_name not between", value1, value2, "videoTableName");
            return (Criteria) this;
        }

        public Criteria andVideoTableUrlIsNull() {
            addCriterion("video_table_url is null");
            return (Criteria) this;
        }

        public Criteria andVideoTableUrlIsNotNull() {
            addCriterion("video_table_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTableUrlEqualTo(String value) {
            addCriterion("video_table_url =", value, "videoTableUrl");
            return (Criteria) this;
        }

        public Criteria andVideoTableUrlNotEqualTo(String value) {
            addCriterion("video_table_url <>", value, "videoTableUrl");
            return (Criteria) this;
        }

        public Criteria andVideoTableUrlGreaterThan(String value) {
            addCriterion("video_table_url >", value, "videoTableUrl");
            return (Criteria) this;
        }

        public Criteria andVideoTableUrlGreaterThanOrEqualTo(String value) {
            addCriterion("video_table_url >=", value, "videoTableUrl");
            return (Criteria) this;
        }

        public Criteria andVideoTableUrlLessThan(String value) {
            addCriterion("video_table_url <", value, "videoTableUrl");
            return (Criteria) this;
        }

        public Criteria andVideoTableUrlLessThanOrEqualTo(String value) {
            addCriterion("video_table_url <=", value, "videoTableUrl");
            return (Criteria) this;
        }

        public Criteria andVideoTableUrlLike(String value) {
            addCriterion("video_table_url like", value, "videoTableUrl");
            return (Criteria) this;
        }

        public Criteria andVideoTableUrlNotLike(String value) {
            addCriterion("video_table_url not like", value, "videoTableUrl");
            return (Criteria) this;
        }

        public Criteria andVideoTableUrlIn(List<String> values) {
            addCriterion("video_table_url in", values, "videoTableUrl");
            return (Criteria) this;
        }

        public Criteria andVideoTableUrlNotIn(List<String> values) {
            addCriterion("video_table_url not in", values, "videoTableUrl");
            return (Criteria) this;
        }

        public Criteria andVideoTableUrlBetween(String value1, String value2) {
            addCriterion("video_table_url between", value1, value2, "videoTableUrl");
            return (Criteria) this;
        }

        public Criteria andVideoTableUrlNotBetween(String value1, String value2) {
            addCriterion("video_table_url not between", value1, value2, "videoTableUrl");
            return (Criteria) this;
        }

        public Criteria andChapterTableIdIsNull() {
            addCriterion("chapter_table_id is null");
            return (Criteria) this;
        }

        public Criteria andChapterTableIdIsNotNull() {
            addCriterion("chapter_table_id is not null");
            return (Criteria) this;
        }

        public Criteria andChapterTableIdEqualTo(Long value) {
            addCriterion("chapter_table_id =", value, "chapterTableId");
            return (Criteria) this;
        }

        public Criteria andChapterTableIdNotEqualTo(Long value) {
            addCriterion("chapter_table_id <>", value, "chapterTableId");
            return (Criteria) this;
        }

        public Criteria andChapterTableIdGreaterThan(Long value) {
            addCriterion("chapter_table_id >", value, "chapterTableId");
            return (Criteria) this;
        }

        public Criteria andChapterTableIdGreaterThanOrEqualTo(Long value) {
            addCriterion("chapter_table_id >=", value, "chapterTableId");
            return (Criteria) this;
        }

        public Criteria andChapterTableIdLessThan(Long value) {
            addCriterion("chapter_table_id <", value, "chapterTableId");
            return (Criteria) this;
        }

        public Criteria andChapterTableIdLessThanOrEqualTo(Long value) {
            addCriterion("chapter_table_id <=", value, "chapterTableId");
            return (Criteria) this;
        }

        public Criteria andChapterTableIdIn(List<Long> values) {
            addCriterion("chapter_table_id in", values, "chapterTableId");
            return (Criteria) this;
        }

        public Criteria andChapterTableIdNotIn(List<Long> values) {
            addCriterion("chapter_table_id not in", values, "chapterTableId");
            return (Criteria) this;
        }

        public Criteria andChapterTableIdBetween(Long value1, Long value2) {
            addCriterion("chapter_table_id between", value1, value2, "chapterTableId");
            return (Criteria) this;
        }

        public Criteria andChapterTableIdNotBetween(Long value1, Long value2) {
            addCriterion("chapter_table_id not between", value1, value2, "chapterTableId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Long value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Long value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Long value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Long value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Long value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Long value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Long> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Long> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Long value1, Long value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Long value1, Long value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
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