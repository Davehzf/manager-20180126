package com.mofancn.pojo;

import java.util.Date;

public class MfClassroomUserSignIn {
    private Long userSignInId;

    private Long userId;

    private Byte signInValid;

    private Byte signInType;

    private Long classroomSignInId;

    private Long classroomId;

    private Date createTime;

    private Date updateTime;

    public Long getUserSignInId() {
        return userSignInId;
    }

    public void setUserSignInId(Long userSignInId) {
        this.userSignInId = userSignInId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Byte getSignInValid() {
        return signInValid;
    }

    public void setSignInValid(Byte signInValid) {
        this.signInValid = signInValid;
    }

    public Byte getSignInType() {
        return signInType;
    }

    public void setSignInType(Byte signInType) {
        this.signInType = signInType;
    }

    public Long getClassroomSignInId() {
        return classroomSignInId;
    }

    public void setClassroomSignInId(Long classroomSignInId) {
        this.classroomSignInId = classroomSignInId;
    }

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
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