package com.mofancn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MfClassroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MfClassroomExample() {
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

        public Criteria andClassroomValidIsNull() {
            addCriterion("classroom_valid is null");
            return (Criteria) this;
        }

        public Criteria andClassroomValidIsNotNull() {
            addCriterion("classroom_valid is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomValidEqualTo(Byte value) {
            addCriterion("classroom_valid =", value, "classroomValid");
            return (Criteria) this;
        }

        public Criteria andClassroomValidNotEqualTo(Byte value) {
            addCriterion("classroom_valid <>", value, "classroomValid");
            return (Criteria) this;
        }

        public Criteria andClassroomValidGreaterThan(Byte value) {
            addCriterion("classroom_valid >", value, "classroomValid");
            return (Criteria) this;
        }

        public Criteria andClassroomValidGreaterThanOrEqualTo(Byte value) {
            addCriterion("classroom_valid >=", value, "classroomValid");
            return (Criteria) this;
        }

        public Criteria andClassroomValidLessThan(Byte value) {
            addCriterion("classroom_valid <", value, "classroomValid");
            return (Criteria) this;
        }

        public Criteria andClassroomValidLessThanOrEqualTo(Byte value) {
            addCriterion("classroom_valid <=", value, "classroomValid");
            return (Criteria) this;
        }

        public Criteria andClassroomValidIn(List<Byte> values) {
            addCriterion("classroom_valid in", values, "classroomValid");
            return (Criteria) this;
        }

        public Criteria andClassroomValidNotIn(List<Byte> values) {
            addCriterion("classroom_valid not in", values, "classroomValid");
            return (Criteria) this;
        }

        public Criteria andClassroomValidBetween(Byte value1, Byte value2) {
            addCriterion("classroom_valid between", value1, value2, "classroomValid");
            return (Criteria) this;
        }

        public Criteria andClassroomValidNotBetween(Byte value1, Byte value2) {
            addCriterion("classroom_valid not between", value1, value2, "classroomValid");
            return (Criteria) this;
        }

        public Criteria andClassroomNameIsNull() {
            addCriterion("classroom_name is null");
            return (Criteria) this;
        }

        public Criteria andClassroomNameIsNotNull() {
            addCriterion("classroom_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomNameEqualTo(String value) {
            addCriterion("classroom_name =", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotEqualTo(String value) {
            addCriterion("classroom_name <>", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameGreaterThan(String value) {
            addCriterion("classroom_name >", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameGreaterThanOrEqualTo(String value) {
            addCriterion("classroom_name >=", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameLessThan(String value) {
            addCriterion("classroom_name <", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameLessThanOrEqualTo(String value) {
            addCriterion("classroom_name <=", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameLike(String value) {
            addCriterion("classroom_name like", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotLike(String value) {
            addCriterion("classroom_name not like", value, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameIn(List<String> values) {
            addCriterion("classroom_name in", values, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotIn(List<String> values) {
            addCriterion("classroom_name not in", values, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameBetween(String value1, String value2) {
            addCriterion("classroom_name between", value1, value2, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomNameNotBetween(String value1, String value2) {
            addCriterion("classroom_name not between", value1, value2, "classroomName");
            return (Criteria) this;
        }

        public Criteria andClassroomManagerIsNull() {
            addCriterion("classroom_manager is null");
            return (Criteria) this;
        }

        public Criteria andClassroomManagerIsNotNull() {
            addCriterion("classroom_manager is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomManagerEqualTo(Long value) {
            addCriterion("classroom_manager =", value, "classroomManager");
            return (Criteria) this;
        }

        public Criteria andClassroomManagerNotEqualTo(Long value) {
            addCriterion("classroom_manager <>", value, "classroomManager");
            return (Criteria) this;
        }

        public Criteria andClassroomManagerGreaterThan(Long value) {
            addCriterion("classroom_manager >", value, "classroomManager");
            return (Criteria) this;
        }

        public Criteria andClassroomManagerGreaterThanOrEqualTo(Long value) {
            addCriterion("classroom_manager >=", value, "classroomManager");
            return (Criteria) this;
        }

        public Criteria andClassroomManagerLessThan(Long value) {
            addCriterion("classroom_manager <", value, "classroomManager");
            return (Criteria) this;
        }

        public Criteria andClassroomManagerLessThanOrEqualTo(Long value) {
            addCriterion("classroom_manager <=", value, "classroomManager");
            return (Criteria) this;
        }

        public Criteria andClassroomManagerIn(List<Long> values) {
            addCriterion("classroom_manager in", values, "classroomManager");
            return (Criteria) this;
        }

        public Criteria andClassroomManagerNotIn(List<Long> values) {
            addCriterion("classroom_manager not in", values, "classroomManager");
            return (Criteria) this;
        }

        public Criteria andClassroomManagerBetween(Long value1, Long value2) {
            addCriterion("classroom_manager between", value1, value2, "classroomManager");
            return (Criteria) this;
        }

        public Criteria andClassroomManagerNotBetween(Long value1, Long value2) {
            addCriterion("classroom_manager not between", value1, value2, "classroomManager");
            return (Criteria) this;
        }

        public Criteria andClassroomPasswordIsNull() {
            addCriterion("classroom_password is null");
            return (Criteria) this;
        }

        public Criteria andClassroomPasswordIsNotNull() {
            addCriterion("classroom_password is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomPasswordEqualTo(String value) {
            addCriterion("classroom_password =", value, "classroomPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomPasswordNotEqualTo(String value) {
            addCriterion("classroom_password <>", value, "classroomPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomPasswordGreaterThan(String value) {
            addCriterion("classroom_password >", value, "classroomPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("classroom_password >=", value, "classroomPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomPasswordLessThan(String value) {
            addCriterion("classroom_password <", value, "classroomPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomPasswordLessThanOrEqualTo(String value) {
            addCriterion("classroom_password <=", value, "classroomPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomPasswordLike(String value) {
            addCriterion("classroom_password like", value, "classroomPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomPasswordNotLike(String value) {
            addCriterion("classroom_password not like", value, "classroomPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomPasswordIn(List<String> values) {
            addCriterion("classroom_password in", values, "classroomPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomPasswordNotIn(List<String> values) {
            addCriterion("classroom_password not in", values, "classroomPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomPasswordBetween(String value1, String value2) {
            addCriterion("classroom_password between", value1, value2, "classroomPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomPasswordNotBetween(String value1, String value2) {
            addCriterion("classroom_password not between", value1, value2, "classroomPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomCreditIsNull() {
            addCriterion("classroom_credit is null");
            return (Criteria) this;
        }

        public Criteria andClassroomCreditIsNotNull() {
            addCriterion("classroom_credit is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomCreditEqualTo(Integer value) {
            addCriterion("classroom_credit =", value, "classroomCredit");
            return (Criteria) this;
        }

        public Criteria andClassroomCreditNotEqualTo(Integer value) {
            addCriterion("classroom_credit <>", value, "classroomCredit");
            return (Criteria) this;
        }

        public Criteria andClassroomCreditGreaterThan(Integer value) {
            addCriterion("classroom_credit >", value, "classroomCredit");
            return (Criteria) this;
        }

        public Criteria andClassroomCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("classroom_credit >=", value, "classroomCredit");
            return (Criteria) this;
        }

        public Criteria andClassroomCreditLessThan(Integer value) {
            addCriterion("classroom_credit <", value, "classroomCredit");
            return (Criteria) this;
        }

        public Criteria andClassroomCreditLessThanOrEqualTo(Integer value) {
            addCriterion("classroom_credit <=", value, "classroomCredit");
            return (Criteria) this;
        }

        public Criteria andClassroomCreditIn(List<Integer> values) {
            addCriterion("classroom_credit in", values, "classroomCredit");
            return (Criteria) this;
        }

        public Criteria andClassroomCreditNotIn(List<Integer> values) {
            addCriterion("classroom_credit not in", values, "classroomCredit");
            return (Criteria) this;
        }

        public Criteria andClassroomCreditBetween(Integer value1, Integer value2) {
            addCriterion("classroom_credit between", value1, value2, "classroomCredit");
            return (Criteria) this;
        }

        public Criteria andClassroomCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("classroom_credit not between", value1, value2, "classroomCredit");
            return (Criteria) this;
        }

        public Criteria andClassroomPeriodIsNull() {
            addCriterion("classroom_period is null");
            return (Criteria) this;
        }

        public Criteria andClassroomPeriodIsNotNull() {
            addCriterion("classroom_period is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomPeriodEqualTo(Integer value) {
            addCriterion("classroom_period =", value, "classroomPeriod");
            return (Criteria) this;
        }

        public Criteria andClassroomPeriodNotEqualTo(Integer value) {
            addCriterion("classroom_period <>", value, "classroomPeriod");
            return (Criteria) this;
        }

        public Criteria andClassroomPeriodGreaterThan(Integer value) {
            addCriterion("classroom_period >", value, "classroomPeriod");
            return (Criteria) this;
        }

        public Criteria andClassroomPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("classroom_period >=", value, "classroomPeriod");
            return (Criteria) this;
        }

        public Criteria andClassroomPeriodLessThan(Integer value) {
            addCriterion("classroom_period <", value, "classroomPeriod");
            return (Criteria) this;
        }

        public Criteria andClassroomPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("classroom_period <=", value, "classroomPeriod");
            return (Criteria) this;
        }

        public Criteria andClassroomPeriodIn(List<Integer> values) {
            addCriterion("classroom_period in", values, "classroomPeriod");
            return (Criteria) this;
        }

        public Criteria andClassroomPeriodNotIn(List<Integer> values) {
            addCriterion("classroom_period not in", values, "classroomPeriod");
            return (Criteria) this;
        }

        public Criteria andClassroomPeriodBetween(Integer value1, Integer value2) {
            addCriterion("classroom_period between", value1, value2, "classroomPeriod");
            return (Criteria) this;
        }

        public Criteria andClassroomPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("classroom_period not between", value1, value2, "classroomPeriod");
            return (Criteria) this;
        }

        public Criteria andClassroomSchooltimeIsNull() {
            addCriterion("classroom_schooltime is null");
            return (Criteria) this;
        }

        public Criteria andClassroomSchooltimeIsNotNull() {
            addCriterion("classroom_schooltime is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomSchooltimeEqualTo(Integer value) {
            addCriterion("classroom_schooltime =", value, "classroomSchooltime");
            return (Criteria) this;
        }

        public Criteria andClassroomSchooltimeNotEqualTo(Integer value) {
            addCriterion("classroom_schooltime <>", value, "classroomSchooltime");
            return (Criteria) this;
        }

        public Criteria andClassroomSchooltimeGreaterThan(Integer value) {
            addCriterion("classroom_schooltime >", value, "classroomSchooltime");
            return (Criteria) this;
        }

        public Criteria andClassroomSchooltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("classroom_schooltime >=", value, "classroomSchooltime");
            return (Criteria) this;
        }

        public Criteria andClassroomSchooltimeLessThan(Integer value) {
            addCriterion("classroom_schooltime <", value, "classroomSchooltime");
            return (Criteria) this;
        }

        public Criteria andClassroomSchooltimeLessThanOrEqualTo(Integer value) {
            addCriterion("classroom_schooltime <=", value, "classroomSchooltime");
            return (Criteria) this;
        }

        public Criteria andClassroomSchooltimeIn(List<Integer> values) {
            addCriterion("classroom_schooltime in", values, "classroomSchooltime");
            return (Criteria) this;
        }

        public Criteria andClassroomSchooltimeNotIn(List<Integer> values) {
            addCriterion("classroom_schooltime not in", values, "classroomSchooltime");
            return (Criteria) this;
        }

        public Criteria andClassroomSchooltimeBetween(Integer value1, Integer value2) {
            addCriterion("classroom_schooltime between", value1, value2, "classroomSchooltime");
            return (Criteria) this;
        }

        public Criteria andClassroomSchooltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("classroom_schooltime not between", value1, value2, "classroomSchooltime");
            return (Criteria) this;
        }

        public Criteria andClassroomRepetitionIsNull() {
            addCriterion("classroom_repetition is null");
            return (Criteria) this;
        }

        public Criteria andClassroomRepetitionIsNotNull() {
            addCriterion("classroom_repetition is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomRepetitionEqualTo(Integer value) {
            addCriterion("classroom_repetition =", value, "classroomRepetition");
            return (Criteria) this;
        }

        public Criteria andClassroomRepetitionNotEqualTo(Integer value) {
            addCriterion("classroom_repetition <>", value, "classroomRepetition");
            return (Criteria) this;
        }

        public Criteria andClassroomRepetitionGreaterThan(Integer value) {
            addCriterion("classroom_repetition >", value, "classroomRepetition");
            return (Criteria) this;
        }

        public Criteria andClassroomRepetitionGreaterThanOrEqualTo(Integer value) {
            addCriterion("classroom_repetition >=", value, "classroomRepetition");
            return (Criteria) this;
        }

        public Criteria andClassroomRepetitionLessThan(Integer value) {
            addCriterion("classroom_repetition <", value, "classroomRepetition");
            return (Criteria) this;
        }

        public Criteria andClassroomRepetitionLessThanOrEqualTo(Integer value) {
            addCriterion("classroom_repetition <=", value, "classroomRepetition");
            return (Criteria) this;
        }

        public Criteria andClassroomRepetitionIn(List<Integer> values) {
            addCriterion("classroom_repetition in", values, "classroomRepetition");
            return (Criteria) this;
        }

        public Criteria andClassroomRepetitionNotIn(List<Integer> values) {
            addCriterion("classroom_repetition not in", values, "classroomRepetition");
            return (Criteria) this;
        }

        public Criteria andClassroomRepetitionBetween(Integer value1, Integer value2) {
            addCriterion("classroom_repetition between", value1, value2, "classroomRepetition");
            return (Criteria) this;
        }

        public Criteria andClassroomRepetitionNotBetween(Integer value1, Integer value2) {
            addCriterion("classroom_repetition not between", value1, value2, "classroomRepetition");
            return (Criteria) this;
        }

        public Criteria andClassroomPlaceIsNull() {
            addCriterion("classroom_place is null");
            return (Criteria) this;
        }

        public Criteria andClassroomPlaceIsNotNull() {
            addCriterion("classroom_place is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomPlaceEqualTo(String value) {
            addCriterion("classroom_place =", value, "classroomPlace");
            return (Criteria) this;
        }

        public Criteria andClassroomPlaceNotEqualTo(String value) {
            addCriterion("classroom_place <>", value, "classroomPlace");
            return (Criteria) this;
        }

        public Criteria andClassroomPlaceGreaterThan(String value) {
            addCriterion("classroom_place >", value, "classroomPlace");
            return (Criteria) this;
        }

        public Criteria andClassroomPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("classroom_place >=", value, "classroomPlace");
            return (Criteria) this;
        }

        public Criteria andClassroomPlaceLessThan(String value) {
            addCriterion("classroom_place <", value, "classroomPlace");
            return (Criteria) this;
        }

        public Criteria andClassroomPlaceLessThanOrEqualTo(String value) {
            addCriterion("classroom_place <=", value, "classroomPlace");
            return (Criteria) this;
        }

        public Criteria andClassroomPlaceLike(String value) {
            addCriterion("classroom_place like", value, "classroomPlace");
            return (Criteria) this;
        }

        public Criteria andClassroomPlaceNotLike(String value) {
            addCriterion("classroom_place not like", value, "classroomPlace");
            return (Criteria) this;
        }

        public Criteria andClassroomPlaceIn(List<String> values) {
            addCriterion("classroom_place in", values, "classroomPlace");
            return (Criteria) this;
        }

        public Criteria andClassroomPlaceNotIn(List<String> values) {
            addCriterion("classroom_place not in", values, "classroomPlace");
            return (Criteria) this;
        }

        public Criteria andClassroomPlaceBetween(String value1, String value2) {
            addCriterion("classroom_place between", value1, value2, "classroomPlace");
            return (Criteria) this;
        }

        public Criteria andClassroomPlaceNotBetween(String value1, String value2) {
            addCriterion("classroom_place not between", value1, value2, "classroomPlace");
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