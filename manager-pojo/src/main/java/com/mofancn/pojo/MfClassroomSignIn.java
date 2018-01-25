package com.mofancn.pojo;


import java.math.BigDecimal;
import java.util.Date;

public class MfClassroomSignIn {
    private Long classroomSignInId;

    private Long classroomSignInManager;

    private Long classroomId;

    private Byte classroomSignInValid;

    private Date classroomSignInStartTime;

    private Date classroomSignInEndTime;

    private String classroomSignInPassword;

    private BigDecimal classroomSignInLatitude;

    private BigDecimal classroomSignInLongitude;

    private Long classroomSignInAccuracy;

    private Date classroomSignInCreateTime;

    private Date classroomSignInUpdateTime;

    public Long getClassroomSignInId() {
        return classroomSignInId;
    }

    public void setClassroomSignInId(Long classroomSignInId) {
        this.classroomSignInId = classroomSignInId;
    }

    public Long getClassroomSignInManager() {
        return classroomSignInManager;
    }

    public void setClassroomSignInManager(Long classroomSignInManager) {
        this.classroomSignInManager = classroomSignInManager;
    }

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }

    public Byte getClassroomSignInValid() {
        return classroomSignInValid;
    }

    public void setClassroomSignInValid(Byte classroomSignInValid) {
        this.classroomSignInValid = classroomSignInValid;
    }

    public Date getClassroomSignInStartTime() {
        return classroomSignInStartTime;
    }

    public void setClassroomSignInStartTime(Date classroomSignInStartTime) {
        this.classroomSignInStartTime = classroomSignInStartTime;
    }

    public Date getClassroomSignInEndTime() {
        return classroomSignInEndTime;
    }

    public void setClassroomSignInEndTime(Date classroomSignInEndTime) {
        this.classroomSignInEndTime = classroomSignInEndTime;
    }

    public String getClassroomSignInPassword() {
        return classroomSignInPassword;
    }

    public void setClassroomSignInPassword(String classroomSignInPassword) {
        this.classroomSignInPassword = classroomSignInPassword == null ? null : classroomSignInPassword.trim();
    }

    public BigDecimal getClassroomSignInLatitude() {
        return classroomSignInLatitude;
    }

    public void setClassroomSignInLatitude(BigDecimal classroomSignInLatitude) {
        this.classroomSignInLatitude = classroomSignInLatitude;
    }

    public BigDecimal getClassroomSignInLongitude() {
        return classroomSignInLongitude;
    }

    public void setClassroomSignInLongitude(BigDecimal classroomSignInLongitude) {
        this.classroomSignInLongitude = classroomSignInLongitude;
    }

    public Long getClassroomSignInAccuracy() {
        return classroomSignInAccuracy;
    }

    public void setClassroomSignInAccuracy(Long classroomSignInAccuracy) {
        this.classroomSignInAccuracy = classroomSignInAccuracy;
    }

    public Date getClassroomSignInCreateTime() {
        return classroomSignInCreateTime;
    }

    public void setClassroomSignInCreateTime(Date classroomSignInCreateTime) {
        this.classroomSignInCreateTime = classroomSignInCreateTime;
    }

    public Date getClassroomSignInUpdateTime() {
        return classroomSignInUpdateTime;
    }

    public void setClassroomSignInUpdateTime(Date classroomSignInUpdateTime) {
        this.classroomSignInUpdateTime = classroomSignInUpdateTime;
    }
}