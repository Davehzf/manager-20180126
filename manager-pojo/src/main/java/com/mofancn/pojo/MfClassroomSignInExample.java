package com.mofancn.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MfClassroomSignInExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MfClassroomSignInExample() {
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

        public Criteria andClassroomSignInIdIsNull() {
            addCriterion("classroom_sign_in_id is null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInIdIsNotNull() {
            addCriterion("classroom_sign_in_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInIdEqualTo(Long value) {
            addCriterion("classroom_sign_in_id =", value, "classroomSignInId");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInIdNotEqualTo(Long value) {
            addCriterion("classroom_sign_in_id <>", value, "classroomSignInId");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInIdGreaterThan(Long value) {
            addCriterion("classroom_sign_in_id >", value, "classroomSignInId");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInIdGreaterThanOrEqualTo(Long value) {
            addCriterion("classroom_sign_in_id >=", value, "classroomSignInId");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInIdLessThan(Long value) {
            addCriterion("classroom_sign_in_id <", value, "classroomSignInId");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInIdLessThanOrEqualTo(Long value) {
            addCriterion("classroom_sign_in_id <=", value, "classroomSignInId");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInIdIn(List<Long> values) {
            addCriterion("classroom_sign_in_id in", values, "classroomSignInId");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInIdNotIn(List<Long> values) {
            addCriterion("classroom_sign_in_id not in", values, "classroomSignInId");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInIdBetween(Long value1, Long value2) {
            addCriterion("classroom_sign_in_id between", value1, value2, "classroomSignInId");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInIdNotBetween(Long value1, Long value2) {
            addCriterion("classroom_sign_in_id not between", value1, value2, "classroomSignInId");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInManagerIsNull() {
            addCriterion("classroom_sign_in_manager is null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInManagerIsNotNull() {
            addCriterion("classroom_sign_in_manager is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInManagerEqualTo(Long value) {
            addCriterion("classroom_sign_in_manager =", value, "classroomSignInManager");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInManagerNotEqualTo(Long value) {
            addCriterion("classroom_sign_in_manager <>", value, "classroomSignInManager");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInManagerGreaterThan(Long value) {
            addCriterion("classroom_sign_in_manager >", value, "classroomSignInManager");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInManagerGreaterThanOrEqualTo(Long value) {
            addCriterion("classroom_sign_in_manager >=", value, "classroomSignInManager");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInManagerLessThan(Long value) {
            addCriterion("classroom_sign_in_manager <", value, "classroomSignInManager");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInManagerLessThanOrEqualTo(Long value) {
            addCriterion("classroom_sign_in_manager <=", value, "classroomSignInManager");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInManagerIn(List<Long> values) {
            addCriterion("classroom_sign_in_manager in", values, "classroomSignInManager");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInManagerNotIn(List<Long> values) {
            addCriterion("classroom_sign_in_manager not in", values, "classroomSignInManager");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInManagerBetween(Long value1, Long value2) {
            addCriterion("classroom_sign_in_manager between", value1, value2, "classroomSignInManager");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInManagerNotBetween(Long value1, Long value2) {
            addCriterion("classroom_sign_in_manager not between", value1, value2, "classroomSignInManager");
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

        public Criteria andClassroomSignInValidIsNull() {
            addCriterion("classroom_sign_in_valid is null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInValidIsNotNull() {
            addCriterion("classroom_sign_in_valid is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInValidEqualTo(Byte value) {
            addCriterion("classroom_sign_in_valid =", value, "classroomSignInValid");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInValidNotEqualTo(Byte value) {
            addCriterion("classroom_sign_in_valid <>", value, "classroomSignInValid");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInValidGreaterThan(Byte value) {
            addCriterion("classroom_sign_in_valid >", value, "classroomSignInValid");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInValidGreaterThanOrEqualTo(Byte value) {
            addCriterion("classroom_sign_in_valid >=", value, "classroomSignInValid");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInValidLessThan(Byte value) {
            addCriterion("classroom_sign_in_valid <", value, "classroomSignInValid");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInValidLessThanOrEqualTo(Byte value) {
            addCriterion("classroom_sign_in_valid <=", value, "classroomSignInValid");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInValidIn(List<Byte> values) {
            addCriterion("classroom_sign_in_valid in", values, "classroomSignInValid");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInValidNotIn(List<Byte> values) {
            addCriterion("classroom_sign_in_valid not in", values, "classroomSignInValid");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInValidBetween(Byte value1, Byte value2) {
            addCriterion("classroom_sign_in_valid between", value1, value2, "classroomSignInValid");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInValidNotBetween(Byte value1, Byte value2) {
            addCriterion("classroom_sign_in_valid not between", value1, value2, "classroomSignInValid");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInStartTimeIsNull() {
            addCriterion("classroom_sign_in_start_time is null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInStartTimeIsNotNull() {
            addCriterion("classroom_sign_in_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInStartTimeEqualTo(Date value) {
            addCriterion("classroom_sign_in_start_time =", value, "classroomSignInStartTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInStartTimeNotEqualTo(Date value) {
            addCriterion("classroom_sign_in_start_time <>", value, "classroomSignInStartTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInStartTimeGreaterThan(Date value) {
            addCriterion("classroom_sign_in_start_time >", value, "classroomSignInStartTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("classroom_sign_in_start_time >=", value, "classroomSignInStartTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInStartTimeLessThan(Date value) {
            addCriterion("classroom_sign_in_start_time <", value, "classroomSignInStartTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("classroom_sign_in_start_time <=", value, "classroomSignInStartTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInStartTimeIn(List<Date> values) {
            addCriterion("classroom_sign_in_start_time in", values, "classroomSignInStartTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInStartTimeNotIn(List<Date> values) {
            addCriterion("classroom_sign_in_start_time not in", values, "classroomSignInStartTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInStartTimeBetween(Date value1, Date value2) {
            addCriterion("classroom_sign_in_start_time between", value1, value2, "classroomSignInStartTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("classroom_sign_in_start_time not between", value1, value2, "classroomSignInStartTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInEndTimeIsNull() {
            addCriterion("classroom_sign_in_end_time is null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInEndTimeIsNotNull() {
            addCriterion("classroom_sign_in_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInEndTimeEqualTo(Date value) {
            addCriterion("classroom_sign_in_end_time =", value, "classroomSignInEndTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInEndTimeNotEqualTo(Date value) {
            addCriterion("classroom_sign_in_end_time <>", value, "classroomSignInEndTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInEndTimeGreaterThan(Date value) {
            addCriterion("classroom_sign_in_end_time >", value, "classroomSignInEndTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("classroom_sign_in_end_time >=", value, "classroomSignInEndTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInEndTimeLessThan(Date value) {
            addCriterion("classroom_sign_in_end_time <", value, "classroomSignInEndTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("classroom_sign_in_end_time <=", value, "classroomSignInEndTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInEndTimeIn(List<Date> values) {
            addCriterion("classroom_sign_in_end_time in", values, "classroomSignInEndTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInEndTimeNotIn(List<Date> values) {
            addCriterion("classroom_sign_in_end_time not in", values, "classroomSignInEndTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInEndTimeBetween(Date value1, Date value2) {
            addCriterion("classroom_sign_in_end_time between", value1, value2, "classroomSignInEndTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("classroom_sign_in_end_time not between", value1, value2, "classroomSignInEndTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInPasswordIsNull() {
            addCriterion("classroom_sign_in_password is null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInPasswordIsNotNull() {
            addCriterion("classroom_sign_in_password is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInPasswordEqualTo(String value) {
            addCriterion("classroom_sign_in_password =", value, "classroomSignInPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInPasswordNotEqualTo(String value) {
            addCriterion("classroom_sign_in_password <>", value, "classroomSignInPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInPasswordGreaterThan(String value) {
            addCriterion("classroom_sign_in_password >", value, "classroomSignInPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("classroom_sign_in_password >=", value, "classroomSignInPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInPasswordLessThan(String value) {
            addCriterion("classroom_sign_in_password <", value, "classroomSignInPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInPasswordLessThanOrEqualTo(String value) {
            addCriterion("classroom_sign_in_password <=", value, "classroomSignInPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInPasswordLike(String value) {
            addCriterion("classroom_sign_in_password like", value, "classroomSignInPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInPasswordNotLike(String value) {
            addCriterion("classroom_sign_in_password not like", value, "classroomSignInPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInPasswordIn(List<String> values) {
            addCriterion("classroom_sign_in_password in", values, "classroomSignInPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInPasswordNotIn(List<String> values) {
            addCriterion("classroom_sign_in_password not in", values, "classroomSignInPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInPasswordBetween(String value1, String value2) {
            addCriterion("classroom_sign_in_password between", value1, value2, "classroomSignInPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInPasswordNotBetween(String value1, String value2) {
            addCriterion("classroom_sign_in_password not between", value1, value2, "classroomSignInPassword");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLatitudeIsNull() {
            addCriterion("classroom_sign_in_latitude is null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLatitudeIsNotNull() {
            addCriterion("classroom_sign_in_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLatitudeEqualTo(Double value) {
            addCriterion("classroom_sign_in_latitude =", value, "classroomSignInLatitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLatitudeNotEqualTo(Double value) {
            addCriterion("classroom_sign_in_latitude <>", value, "classroomSignInLatitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLatitudeGreaterThan(Double value) {
            addCriterion("classroom_sign_in_latitude >", value, "classroomSignInLatitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("classroom_sign_in_latitude >=", value, "classroomSignInLatitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLatitudeLessThan(Double value) {
            addCriterion("classroom_sign_in_latitude <", value, "classroomSignInLatitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("classroom_sign_in_latitude <=", value, "classroomSignInLatitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLatitudeIn(List<Double> values) {
            addCriterion("classroom_sign_in_latitude in", values, "classroomSignInLatitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLatitudeNotIn(List<Double> values) {
            addCriterion("classroom_sign_in_latitude not in", values, "classroomSignInLatitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLatitudeBetween(Double value1, Double value2) {
            addCriterion("classroom_sign_in_latitude between", value1, value2, "classroomSignInLatitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("classroom_sign_in_latitude not between", value1, value2, "classroomSignInLatitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLongitudeIsNull() {
            addCriterion("classroom_sign_in_longitude is null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLongitudeIsNotNull() {
            addCriterion("classroom_sign_in_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLongitudeEqualTo(Double value) {
            addCriterion("classroom_sign_in_longitude =", value, "classroomSignInLongitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLongitudeNotEqualTo(Double value) {
            addCriterion("classroom_sign_in_longitude <>", value, "classroomSignInLongitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLongitudeGreaterThan(Double value) {
            addCriterion("classroom_sign_in_longitude >", value, "classroomSignInLongitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("classroom_sign_in_longitude >=", value, "classroomSignInLongitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLongitudeLessThan(Double value) {
            addCriterion("classroom_sign_in_longitude <", value, "classroomSignInLongitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("classroom_sign_in_longitude <=", value, "classroomSignInLongitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLongitudeIn(List<Double> values) {
            addCriterion("classroom_sign_in_longitude in", values, "classroomSignInLongitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLongitudeNotIn(List<Double> values) {
            addCriterion("classroom_sign_in_longitude not in", values, "classroomSignInLongitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLongitudeBetween(Double value1, Double value2) {
            addCriterion("classroom_sign_in_longitude between", value1, value2, "classroomSignInLongitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("classroom_sign_in_longitude not between", value1, value2, "classroomSignInLongitude");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInAccuracyIsNull() {
            addCriterion("classroom_sign_in_accuracy is null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInAccuracyIsNotNull() {
            addCriterion("classroom_sign_in_accuracy is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInAccuracyEqualTo(Long value) {
            addCriterion("classroom_sign_in_accuracy =", value, "classroomSignInAccuracy");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInAccuracyNotEqualTo(Long value) {
            addCriterion("classroom_sign_in_accuracy <>", value, "classroomSignInAccuracy");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInAccuracyGreaterThan(Long value) {
            addCriterion("classroom_sign_in_accuracy >", value, "classroomSignInAccuracy");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInAccuracyGreaterThanOrEqualTo(Long value) {
            addCriterion("classroom_sign_in_accuracy >=", value, "classroomSignInAccuracy");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInAccuracyLessThan(Long value) {
            addCriterion("classroom_sign_in_accuracy <", value, "classroomSignInAccuracy");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInAccuracyLessThanOrEqualTo(Long value) {
            addCriterion("classroom_sign_in_accuracy <=", value, "classroomSignInAccuracy");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInAccuracyIn(List<Long> values) {
            addCriterion("classroom_sign_in_accuracy in", values, "classroomSignInAccuracy");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInAccuracyNotIn(List<Long> values) {
            addCriterion("classroom_sign_in_accuracy not in", values, "classroomSignInAccuracy");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInAccuracyBetween(Long value1, Long value2) {
            addCriterion("classroom_sign_in_accuracy between", value1, value2, "classroomSignInAccuracy");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInAccuracyNotBetween(Long value1, Long value2) {
            addCriterion("classroom_sign_in_accuracy not between", value1, value2, "classroomSignInAccuracy");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInCreateTimeIsNull() {
            addCriterion("classroom_sign_in_create_time is null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInCreateTimeIsNotNull() {
            addCriterion("classroom_sign_in_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInCreateTimeEqualTo(Date value) {
            addCriterion("classroom_sign_in_create_time =", value, "classroomSignInCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInCreateTimeNotEqualTo(Date value) {
            addCriterion("classroom_sign_in_create_time <>", value, "classroomSignInCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInCreateTimeGreaterThan(Date value) {
            addCriterion("classroom_sign_in_create_time >", value, "classroomSignInCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("classroom_sign_in_create_time >=", value, "classroomSignInCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInCreateTimeLessThan(Date value) {
            addCriterion("classroom_sign_in_create_time <", value, "classroomSignInCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("classroom_sign_in_create_time <=", value, "classroomSignInCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInCreateTimeIn(List<Date> values) {
            addCriterion("classroom_sign_in_create_time in", values, "classroomSignInCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInCreateTimeNotIn(List<Date> values) {
            addCriterion("classroom_sign_in_create_time not in", values, "classroomSignInCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInCreateTimeBetween(Date value1, Date value2) {
            addCriterion("classroom_sign_in_create_time between", value1, value2, "classroomSignInCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("classroom_sign_in_create_time not between", value1, value2, "classroomSignInCreateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInUpdateTimeIsNull() {
            addCriterion("classroom_sign_in_update_time is null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInUpdateTimeIsNotNull() {
            addCriterion("classroom_sign_in_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInUpdateTimeEqualTo(Date value) {
            addCriterion("classroom_sign_in_update_time =", value, "classroomSignInUpdateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInUpdateTimeNotEqualTo(Date value) {
            addCriterion("classroom_sign_in_update_time <>", value, "classroomSignInUpdateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInUpdateTimeGreaterThan(Date value) {
            addCriterion("classroom_sign_in_update_time >", value, "classroomSignInUpdateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("classroom_sign_in_update_time >=", value, "classroomSignInUpdateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInUpdateTimeLessThan(Date value) {
            addCriterion("classroom_sign_in_update_time <", value, "classroomSignInUpdateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("classroom_sign_in_update_time <=", value, "classroomSignInUpdateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInUpdateTimeIn(List<Date> values) {
            addCriterion("classroom_sign_in_update_time in", values, "classroomSignInUpdateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInUpdateTimeNotIn(List<Date> values) {
            addCriterion("classroom_sign_in_update_time not in", values, "classroomSignInUpdateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("classroom_sign_in_update_time between", value1, value2, "classroomSignInUpdateTime");
            return (Criteria) this;
        }

        public Criteria andClassroomSignInUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("classroom_sign_in_update_time not between", value1, value2, "classroomSignInUpdateTime");
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