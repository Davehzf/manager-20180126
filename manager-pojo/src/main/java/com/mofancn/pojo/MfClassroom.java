package com.mofancn.pojo;

import java.util.Date;

public class MfClassroom {
    private Long classroomId;

    private Byte classroomValid;

    private String classroomName;

    private Long classroomManager;

    private String classroomPassword;

    private String classroomQrcodeUrl;

    private Integer classroomCredit;

    private Integer classroomPeriod;

    private Integer classroomSchooltime;

    private Integer classroomRepetition;

    private String classroomPlace;

    private Date createTime;

    private Date updateTime;

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }

    public Byte getClassroomValid() {
        return classroomValid;
    }

    public void setClassroomValid(Byte classroomValid) {
        this.classroomValid = classroomValid;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName == null ? null : classroomName.trim();
    }

    public Long getClassroomManager() {
        return classroomManager;
    }

    public void setClassroomManager(Long classroomManager) {
        this.classroomManager = classroomManager;
    }

    public String getClassroomPassword() {
        return classroomPassword;
    }

    public void setClassroomPassword(String classroomPassword) {
        this.classroomPassword = classroomPassword == null ? null : classroomPassword.trim();
    }

    public String getClassroomQrcodeUrl() {
        return classroomQrcodeUrl;
    }

    public void setClassroomQrcodeUrl(String classroomQrcodeUrl) {
        this.classroomQrcodeUrl = classroomQrcodeUrl == null ? null : classroomQrcodeUrl.trim();
    }

    public Integer getClassroomCredit() {
        return classroomCredit;
    }

    public void setClassroomCredit(Integer classroomCredit) {
        this.classroomCredit = classroomCredit;
    }

    public Integer getClassroomPeriod() {
        return classroomPeriod;
    }

    public void setClassroomPeriod(Integer classroomPeriod) {
        this.classroomPeriod = classroomPeriod;
    }

    public Integer getClassroomSchooltime() {
        return classroomSchooltime;
    }

    public void setClassroomSchooltime(Integer classroomSchooltime) {
        this.classroomSchooltime = classroomSchooltime;
    }

    public Integer getClassroomRepetition() {
        return classroomRepetition;
    }

    public void setClassroomRepetition(Integer classroomRepetition) {
        this.classroomRepetition = classroomRepetition;
    }

    public String getClassroomPlace() {
        return classroomPlace;
    }

    public void setClassroomPlace(String classroomPlace) {
        this.classroomPlace = classroomPlace == null ? null : classroomPlace.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}