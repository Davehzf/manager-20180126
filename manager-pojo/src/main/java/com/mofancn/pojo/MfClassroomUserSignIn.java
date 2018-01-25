package com.mofancn.pojo;

import java.util.Date;

public class MfClassroomUserSignIn {
    private Long signInId;

    private Long userId;

    private Byte signInValid;

    private Byte signInType;

    private Long classroomId;

    private Date createTime;

    private Date updateTime;

    public Long getSignInId() {
        return signInId;
    }

    public void setSignInId(Long signInId) {
        this.signInId = signInId;
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