package com.wyDemo.bean;

import java.util.ArrayList;
import java.util.List;

public class ChapterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChapterExample() {
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

        public Criteria andBookIdIsNull() {
            addCriterion("BOOK_ID is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("BOOK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(String value) {
            addCriterion("BOOK_ID =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(String value) {
            addCriterion("BOOK_ID <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(String value) {
            addCriterion("BOOK_ID >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(String value) {
            addCriterion("BOOK_ID >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(String value) {
            addCriterion("BOOK_ID <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(String value) {
            addCriterion("BOOK_ID <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLike(String value) {
            addCriterion("BOOK_ID like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotLike(String value) {
            addCriterion("BOOK_ID not like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<String> values) {
            addCriterion("BOOK_ID in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<String> values) {
            addCriterion("BOOK_ID not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(String value1, String value2) {
            addCriterion("BOOK_ID between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(String value1, String value2) {
            addCriterion("BOOK_ID not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookKeyIsNull() {
            addCriterion("BOOK_KEY is null");
            return (Criteria) this;
        }

        public Criteria andBookKeyIsNotNull() {
            addCriterion("BOOK_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andBookKeyEqualTo(String value) {
            addCriterion("BOOK_KEY =", value, "bookKey");
            return (Criteria) this;
        }

        public Criteria andBookKeyNotEqualTo(String value) {
            addCriterion("BOOK_KEY <>", value, "bookKey");
            return (Criteria) this;
        }

        public Criteria andBookKeyGreaterThan(String value) {
            addCriterion("BOOK_KEY >", value, "bookKey");
            return (Criteria) this;
        }

        public Criteria andBookKeyGreaterThanOrEqualTo(String value) {
            addCriterion("BOOK_KEY >=", value, "bookKey");
            return (Criteria) this;
        }

        public Criteria andBookKeyLessThan(String value) {
            addCriterion("BOOK_KEY <", value, "bookKey");
            return (Criteria) this;
        }

        public Criteria andBookKeyLessThanOrEqualTo(String value) {
            addCriterion("BOOK_KEY <=", value, "bookKey");
            return (Criteria) this;
        }

        public Criteria andBookKeyLike(String value) {
            addCriterion("BOOK_KEY like", value, "bookKey");
            return (Criteria) this;
        }

        public Criteria andBookKeyNotLike(String value) {
            addCriterion("BOOK_KEY not like", value, "bookKey");
            return (Criteria) this;
        }

        public Criteria andBookKeyIn(List<String> values) {
            addCriterion("BOOK_KEY in", values, "bookKey");
            return (Criteria) this;
        }

        public Criteria andBookKeyNotIn(List<String> values) {
            addCriterion("BOOK_KEY not in", values, "bookKey");
            return (Criteria) this;
        }

        public Criteria andBookKeyBetween(String value1, String value2) {
            addCriterion("BOOK_KEY between", value1, value2, "bookKey");
            return (Criteria) this;
        }

        public Criteria andBookKeyNotBetween(String value1, String value2) {
            addCriterion("BOOK_KEY not between", value1, value2, "bookKey");
            return (Criteria) this;
        }

        public Criteria andPrechapterIdIsNull() {
            addCriterion("PRECHAPTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrechapterIdIsNotNull() {
            addCriterion("PRECHAPTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrechapterIdEqualTo(String value) {
            addCriterion("PRECHAPTER_ID =", value, "prechapterId");
            return (Criteria) this;
        }

        public Criteria andPrechapterIdNotEqualTo(String value) {
            addCriterion("PRECHAPTER_ID <>", value, "prechapterId");
            return (Criteria) this;
        }

        public Criteria andPrechapterIdGreaterThan(String value) {
            addCriterion("PRECHAPTER_ID >", value, "prechapterId");
            return (Criteria) this;
        }

        public Criteria andPrechapterIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRECHAPTER_ID >=", value, "prechapterId");
            return (Criteria) this;
        }

        public Criteria andPrechapterIdLessThan(String value) {
            addCriterion("PRECHAPTER_ID <", value, "prechapterId");
            return (Criteria) this;
        }

        public Criteria andPrechapterIdLessThanOrEqualTo(String value) {
            addCriterion("PRECHAPTER_ID <=", value, "prechapterId");
            return (Criteria) this;
        }

        public Criteria andPrechapterIdLike(String value) {
            addCriterion("PRECHAPTER_ID like", value, "prechapterId");
            return (Criteria) this;
        }

        public Criteria andPrechapterIdNotLike(String value) {
            addCriterion("PRECHAPTER_ID not like", value, "prechapterId");
            return (Criteria) this;
        }

        public Criteria andPrechapterIdIn(List<String> values) {
            addCriterion("PRECHAPTER_ID in", values, "prechapterId");
            return (Criteria) this;
        }

        public Criteria andPrechapterIdNotIn(List<String> values) {
            addCriterion("PRECHAPTER_ID not in", values, "prechapterId");
            return (Criteria) this;
        }

        public Criteria andPrechapterIdBetween(String value1, String value2) {
            addCriterion("PRECHAPTER_ID between", value1, value2, "prechapterId");
            return (Criteria) this;
        }

        public Criteria andPrechapterIdNotBetween(String value1, String value2) {
            addCriterion("PRECHAPTER_ID not between", value1, value2, "prechapterId");
            return (Criteria) this;
        }

        public Criteria andPrechapterKeyIsNull() {
            addCriterion("PRECHAPTER_KEY is null");
            return (Criteria) this;
        }

        public Criteria andPrechapterKeyIsNotNull() {
            addCriterion("PRECHAPTER_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andPrechapterKeyEqualTo(String value) {
            addCriterion("PRECHAPTER_KEY =", value, "prechapterKey");
            return (Criteria) this;
        }

        public Criteria andPrechapterKeyNotEqualTo(String value) {
            addCriterion("PRECHAPTER_KEY <>", value, "prechapterKey");
            return (Criteria) this;
        }

        public Criteria andPrechapterKeyGreaterThan(String value) {
            addCriterion("PRECHAPTER_KEY >", value, "prechapterKey");
            return (Criteria) this;
        }

        public Criteria andPrechapterKeyGreaterThanOrEqualTo(String value) {
            addCriterion("PRECHAPTER_KEY >=", value, "prechapterKey");
            return (Criteria) this;
        }

        public Criteria andPrechapterKeyLessThan(String value) {
            addCriterion("PRECHAPTER_KEY <", value, "prechapterKey");
            return (Criteria) this;
        }

        public Criteria andPrechapterKeyLessThanOrEqualTo(String value) {
            addCriterion("PRECHAPTER_KEY <=", value, "prechapterKey");
            return (Criteria) this;
        }

        public Criteria andPrechapterKeyLike(String value) {
            addCriterion("PRECHAPTER_KEY like", value, "prechapterKey");
            return (Criteria) this;
        }

        public Criteria andPrechapterKeyNotLike(String value) {
            addCriterion("PRECHAPTER_KEY not like", value, "prechapterKey");
            return (Criteria) this;
        }

        public Criteria andPrechapterKeyIn(List<String> values) {
            addCriterion("PRECHAPTER_KEY in", values, "prechapterKey");
            return (Criteria) this;
        }

        public Criteria andPrechapterKeyNotIn(List<String> values) {
            addCriterion("PRECHAPTER_KEY not in", values, "prechapterKey");
            return (Criteria) this;
        }

        public Criteria andPrechapterKeyBetween(String value1, String value2) {
            addCriterion("PRECHAPTER_KEY between", value1, value2, "prechapterKey");
            return (Criteria) this;
        }

        public Criteria andPrechapterKeyNotBetween(String value1, String value2) {
            addCriterion("PRECHAPTER_KEY not between", value1, value2, "prechapterKey");
            return (Criteria) this;
        }

        public Criteria andChapterKeyIsNull() {
            addCriterion("CHAPTER_KEY is null");
            return (Criteria) this;
        }

        public Criteria andChapterKeyIsNotNull() {
            addCriterion("CHAPTER_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andChapterKeyEqualTo(String value) {
            addCriterion("CHAPTER_KEY =", value, "chapterKey");
            return (Criteria) this;
        }

        public Criteria andChapterKeyNotEqualTo(String value) {
            addCriterion("CHAPTER_KEY <>", value, "chapterKey");
            return (Criteria) this;
        }

        public Criteria andChapterKeyGreaterThan(String value) {
            addCriterion("CHAPTER_KEY >", value, "chapterKey");
            return (Criteria) this;
        }

        public Criteria andChapterKeyGreaterThanOrEqualTo(String value) {
            addCriterion("CHAPTER_KEY >=", value, "chapterKey");
            return (Criteria) this;
        }

        public Criteria andChapterKeyLessThan(String value) {
            addCriterion("CHAPTER_KEY <", value, "chapterKey");
            return (Criteria) this;
        }

        public Criteria andChapterKeyLessThanOrEqualTo(String value) {
            addCriterion("CHAPTER_KEY <=", value, "chapterKey");
            return (Criteria) this;
        }

        public Criteria andChapterKeyLike(String value) {
            addCriterion("CHAPTER_KEY like", value, "chapterKey");
            return (Criteria) this;
        }

        public Criteria andChapterKeyNotLike(String value) {
            addCriterion("CHAPTER_KEY not like", value, "chapterKey");
            return (Criteria) this;
        }

        public Criteria andChapterKeyIn(List<String> values) {
            addCriterion("CHAPTER_KEY in", values, "chapterKey");
            return (Criteria) this;
        }

        public Criteria andChapterKeyNotIn(List<String> values) {
            addCriterion("CHAPTER_KEY not in", values, "chapterKey");
            return (Criteria) this;
        }

        public Criteria andChapterKeyBetween(String value1, String value2) {
            addCriterion("CHAPTER_KEY between", value1, value2, "chapterKey");
            return (Criteria) this;
        }

        public Criteria andChapterKeyNotBetween(String value1, String value2) {
            addCriterion("CHAPTER_KEY not between", value1, value2, "chapterKey");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andPicsIsNull() {
            addCriterion("PICS is null");
            return (Criteria) this;
        }

        public Criteria andPicsIsNotNull() {
            addCriterion("PICS is not null");
            return (Criteria) this;
        }

        public Criteria andPicsEqualTo(String value) {
            addCriterion("PICS =", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotEqualTo(String value) {
            addCriterion("PICS <>", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsGreaterThan(String value) {
            addCriterion("PICS >", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsGreaterThanOrEqualTo(String value) {
            addCriterion("PICS >=", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLessThan(String value) {
            addCriterion("PICS <", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLessThanOrEqualTo(String value) {
            addCriterion("PICS <=", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLike(String value) {
            addCriterion("PICS like", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotLike(String value) {
            addCriterion("PICS not like", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsIn(List<String> values) {
            addCriterion("PICS in", values, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotIn(List<String> values) {
            addCriterion("PICS not in", values, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsBetween(String value1, String value2) {
            addCriterion("PICS between", value1, value2, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotBetween(String value1, String value2) {
            addCriterion("PICS not between", value1, value2, "pics");
            return (Criteria) this;
        }

        public Criteria andChapterIdIsNull() {
            addCriterion("CHAPTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andChapterIdIsNotNull() {
            addCriterion("CHAPTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChapterIdEqualTo(Integer value) {
            addCriterion("CHAPTER_ID =", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotEqualTo(Integer value) {
            addCriterion("CHAPTER_ID <>", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdGreaterThan(Integer value) {
            addCriterion("CHAPTER_ID >", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHAPTER_ID >=", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLessThan(Integer value) {
            addCriterion("CHAPTER_ID <", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdLessThanOrEqualTo(Integer value) {
            addCriterion("CHAPTER_ID <=", value, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdIn(List<Integer> values) {
            addCriterion("CHAPTER_ID in", values, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotIn(List<Integer> values) {
            addCriterion("CHAPTER_ID not in", values, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdBetween(Integer value1, Integer value2) {
            addCriterion("CHAPTER_ID between", value1, value2, "chapterId");
            return (Criteria) this;
        }

        public Criteria andChapterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CHAPTER_ID not between", value1, value2, "chapterId");
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