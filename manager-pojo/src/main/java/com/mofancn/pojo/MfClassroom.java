package com.mofancn.pojo;

import java.util.Date;

public class MfClassroom {
    private Long classroomId;

    private Byte classroomValid;

    private String classroomName;

    private Long classroomManager;

    private String classroomPassword;

    private Integer classroomCredit;

    private Integer classroomPeriod;
//上课时间 
    private Date classroomSchooltime;
//重复（2的次方，0次方为一次，1次方星期一，类推到星期日，如11111111=255，每周每日重复）
    private String classroomRepetition;
//上课地点
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

    public Date getClassroomSchooltime() {
        return classroomSchooltime;
    }

    public void setClassroomSchooltime(Date classroomSchooltime) {
        this.classroomSchooltime = classroomSchooltime;
    }

    public String getClassroomRepetition() {
        return classroomRepetition;
    }

    public void setClassroomRepetition(String classroomRepetition) {
        this.classroomRepetition = classroomRepetition == null ? null : classroomRepetition.trim();
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