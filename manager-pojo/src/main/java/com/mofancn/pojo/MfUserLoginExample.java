package com.mofancn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MfUserLoginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MfUserLoginExample() {
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

        public Criteria andUserLoginIdIsNull() {
            addCriterion("user_login_id is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdIsNotNull() {
            addCriterion("user_login_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdEqualTo(Long value) {
            addCriterion("user_login_id =", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdNotEqualTo(Long value) {
            addCriterion("user_login_id <>", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdGreaterThan(Long value) {
            addCriterion("user_login_id >", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_login_id >=", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdLessThan(Long value) {
            addCriterion("user_login_id <", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdLessThanOrEqualTo(Long value) {
            addCriterion("user_login_id <=", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdIn(List<Long> values) {
            addCriterion("user_login_id in", values, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdNotIn(List<Long> values) {
            addCriterion("user_login_id not in", values, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdBetween(Long value1, Long value2) {
            addCriterion("user_login_id between", value1, value2, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdNotBetween(Long value1, Long value2) {
            addCriterion("user_login_id not between", value1, value2, "userLoginId");
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

        public Criteria andUserLoginIpIsNull() {
            addCriterion("user_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpIsNotNull() {
            addCriterion("user_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpEqualTo(String value) {
            addCriterion("user_login_ip =", value, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpNotEqualTo(String value) {
            addCriterion("user_login_ip <>", value, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpGreaterThan(String value) {
            addCriterion("user_login_ip >", value, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_ip >=", value, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpLessThan(String value) {
            addCriterion("user_login_ip <", value, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpLessThanOrEqualTo(String value) {
            addCriterion("user_login_ip <=", value, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpLike(String value) {
            addCriterion("user_login_ip like", value, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpNotLike(String value) {
            addCriterion("user_login_ip not like", value, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpIn(List<String> values) {
            addCriterion("user_login_ip in", values, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpNotIn(List<String> values) {
            addCriterion("user_login_ip not in", values, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpBetween(String value1, String value2) {
            addCriterion("user_login_ip between", value1, value2, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginIpNotBetween(String value1, String value2) {
            addCriterion("user_login_ip not between", value1, value2, "userLoginIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginTypeIsNull() {
            addCriterion("user_login_type is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginTypeIsNotNull() {
            addCriterion("user_login_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginTypeEqualTo(String value) {
            addCriterion("user_login_type =", value, "userLoginType");
            return (Criteria) this;
        }

        public Criteria andUserLoginTypeNotEqualTo(String value) {
            addCriterion("user_login_type <>", value, "userLoginType");
            return (Criteria) this;
        }

        public Criteria andUserLoginTypeGreaterThan(String value) {
            addCriterion("user_login_type >", value, "userLoginType");
            return (Criteria) this;
        }

        public Criteria andUserLoginTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_type >=", value, "userLoginType");
            return (Criteria) this;
        }

        public Criteria andUserLoginTypeLessThan(String value) {
            addCriterion("user_login_type <", value, "userLoginType");
            return (Criteria) this;
        }

        public Criteria andUserLoginTypeLessThanOrEqualTo(String value) {
            addCriterion("user_login_type <=", value, "userLoginType");
            return (Criteria) this;
        }

        public Criteria andUserLoginTypeLike(String value) {
            addCriterion("user_login_type like", value, "userLoginType");
            return (Criteria) this;
        }

        public Criteria andUserLoginTypeNotLike(String value) {
            addCriterion("user_login_type not like", value, "userLoginType");
            return (Criteria) this;
        }

        public Criteria andUserLoginTypeIn(List<String> values) {
            addCriterion("user_login_type in", values, "userLoginType");
            return (Criteria) this;
        }

        public Criteria andUserLoginTypeNotIn(List<String> values) {
            addCriterion("user_login_type not in", values, "userLoginType");
            return (Criteria) this;
        }

        public Criteria andUserLoginTypeBetween(String value1, String value2) {
            addCriterion("user_login_type between", value1, value2, "userLoginType");
            return (Criteria) this;
        }

        public Criteria andUserLoginTypeNotBetween(String value1, String value2) {
            addCriterion("user_login_type not between", value1, value2, "userLoginType");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeIsNull() {
            addCriterion("user_login_time is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeIsNotNull() {
            addCriterion("user_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeEqualTo(Date value) {
            addCriterion("user_login_time =", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotEqualTo(Date value) {
            addCriterion("user_login_time <>", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeGreaterThan(Date value) {
            addCriterion("user_login_time >", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_login_time >=", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeLessThan(Date value) {
            addCriterion("user_login_time <", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_login_time <=", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeIn(List<Date> values) {
            addCriterion("user_login_time in", values, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotIn(List<Date> values) {
            addCriterion("user_login_time not in", values, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeBetween(Date value1, Date value2) {
            addCriterion("user_login_time between", value1, value2, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_login_time not between", value1, value2, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginUpdateTimeIsNull() {
            addCriterion("user_login_update_time is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginUpdateTimeIsNotNull() {
            addCriterion("user_login_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginUpdateTimeEqualTo(Date value) {
            addCriterion("user_login_update_time =", value, "userLoginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginUpdateTimeNotEqualTo(Date value) {
            addCriterion("user_login_update_time <>", value, "userLoginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginUpdateTimeGreaterThan(Date value) {
            addCriterion("user_login_update_time >", value, "userLoginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_login_update_time >=", value, "userLoginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginUpdateTimeLessThan(Date value) {
            addCriterion("user_login_update_time <", value, "userLoginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_login_update_time <=", value, "userLoginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginUpdateTimeIn(List<Date> values) {
            addCriterion("user_login_update_time in", values, "userLoginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginUpdateTimeNotIn(List<Date> values) {
            addCriterion("user_login_update_time not in", values, "userLoginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("user_login_update_time between", value1, value2, "userLoginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_login_update_time not between", value1, value2, "userLoginUpdateTime");
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