package com.mofancn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MfClassroomUserSignInExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MfClassroomUserSignInExample() {
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

        public Criteria andSignInIdIsNull() {
            addCriterion("sign_in_id is null");
            return (Criteria) this;
        }

        public Criteria andSignInIdIsNotNull() {
            addCriterion("sign_in_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignInIdEqualTo(Long value) {
            addCriterion("sign_in_id =", value, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdNotEqualTo(Long value) {
            addCriterion("sign_in_id <>", value, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdGreaterThan(Long value) {
            addCriterion("sign_in_id >", value, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sign_in_id >=", value, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdLessThan(Long value) {
            addCriterion("sign_in_id <", value, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdLessThanOrEqualTo(Long value) {
            addCriterion("sign_in_id <=", value, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdIn(List<Long> values) {
            addCriterion("sign_in_id in", values, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdNotIn(List<Long> values) {
            addCriterion("sign_in_id not in", values, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdBetween(Long value1, Long value2) {
            addCriterion("sign_in_id between", value1, value2, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdNotBetween(Long value1, Long value2) {
            addCriterion("sign_in_id not between", value1, value2, "signInId");
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSignInValidIsNull() {
            addCriterion("sign_in_valid is null");
            return (Criteria) this;
        }

        public Criteria andSignInValidIsNotNull() {
            addCriterion("sign_in_valid is not null");
            return (Criteria) this;
        }

        public Criteria andSignInValidEqualTo(Byte value) {
            addCriterion("sign_in_valid =", value, "signInValid");
            return (Criteria) this;
        }

        public Criteria andSignInValidNotEqualTo(Byte value) {
            addCriterion("sign_in_valid <>", value, "signInValid");
            return (Criteria) this;
        }

        public Criteria andSignInValidGreaterThan(Byte value) {
            addCriterion("sign_in_valid >", value, "signInValid");
            return (Criteria) this;
        }

        public Criteria andSignInValidGreaterThanOrEqualTo(Byte value) {
            addCriterion("sign_in_valid >=", value, "signInValid");
            return (Criteria) this;
        }

        public Criteria andSignInValidLessThan(Byte value) {
            addCriterion("sign_in_valid <", value, "signInValid");
            return (Criteria) this;
        }

        public Criteria andSignInValidLessThanOrEqualTo(Byte value) {
            addCriterion("sign_in_valid <=", value, "signInValid");
            return (Criteria) this;
        }

        public Criteria andSignInValidIn(List<Byte> values) {
            addCriterion("sign_in_valid in", values, "signInValid");
            return (Criteria) this;
        }

        public Criteria andSignInValidNotIn(List<Byte> values) {
            addCriterion("sign_in_valid not in", values, "signInValid");
            return (Criteria) this;
        }

        public Criteria andSignInValidBetween(Byte value1, Byte value2) {
            addCriterion("sign_in_valid between", value1, value2, "signInValid");
            return (Criteria) this;
        }

        public Criteria andSignInValidNotBetween(Byte value1, Byte value2) {
            addCriterion("sign_in_valid not between", value1, value2, "signInValid");
            return (Criteria) this;
        }

        public Criteria andSignInTypeIsNull() {
            addCriterion("sign_in_type is null");
            return (Criteria) this;
        }

        public Criteria andSignInTypeIsNotNull() {
            addCriterion("sign_in_type is not null");
            return (Criteria) this;
        }

        public Criteria andSignInTypeEqualTo(Byte value) {
            addCriterion("sign_in_type =", value, "signInType");
            return (Criteria) this;
        }

        public Criteria andSignInTypeNotEqualTo(Byte value) {
            addCriterion("sign_in_type <>", value, "signInType");
            return (Criteria) this;
        }

        public Criteria andSignInTypeGreaterThan(Byte value) {
            addCriterion("sign_in_type >", value, "signInType");
            return (Criteria) this;
        }

        public Criteria andSignInTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("sign_in_type >=", value, "signInType");
            return (Criteria) this;
        }

        public Criteria andSignInTypeLessThan(Byte value) {
            addCriterion("sign_in_type <", value, "signInType");
            return (Criteria) this;
        }

        public Criteria andSignInTypeLessThanOrEqualTo(Byte value) {
            addCriterion("sign_in_type <=", value, "signInType");
            return (Criteria) this;
        }

        public Criteria andSignInTypeIn(List<Byte> values) {
            addCriterion("sign_in_type in", values, "signInType");
            return (Criteria) this;
        }

        public Criteria andSignInTypeNotIn(List<Byte> values) {
            addCriterion("sign_in_type not in", values, "signInType");
            return (Criteria) this;
        }

        public Criteria andSignInTypeBetween(Byte value1, Byte value2) {
            addCriterion("sign_in_type between", value1, value2, "signInType");
            return (Criteria) this;
        }

        public Criteria andSignInTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("sign_in_type not between", value1, value2, "signInType");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIsNull() {
            addCriterion("classroom_id is null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIsNotNull() {
            addCriterion("classroom_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomIdEqualTo(Long value) {
            addCriterion("classroom_id =", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotEqualTo(Long value) {
            addCriterion("classroom_id <>", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThan(Long value) {
            addCriterion("classroom_id >", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdGreaterThanOrEqualTo(Long value) {
            addCriterion("classroom_id >=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThan(Long value) {
            addCriterion("classroom_id <", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdLessThanOrEqualTo(Long value) {
            addCriterion("classroom_id <=", value, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdIn(List<Long> values) {
            addCriterion("classroom_id in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotIn(List<Long> values) {
            addCriterion("classroom_id not in", values, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdBetween(Long value1, Long value2) {
            addCriterion("classroom_id between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andClassroomIdNotBetween(Long value1, Long value2) {
            addCriterion("classroom_id not between", value1, value2, "classroomId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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