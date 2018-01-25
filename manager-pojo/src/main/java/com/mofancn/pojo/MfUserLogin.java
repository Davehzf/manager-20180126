package com.mofancn.pojo;

import java.util.Date;

public class MfUserLogin {
    private Long userLoginId;

    private Long userId;

    private String userLoginIp;

    private String userLoginType;

    private Date userLoginTime;

    private Date userLoginUpdateTime;

    public Long getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(Long userLoginId) {
        this.userLoginId = userLoginId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserLoginIp() {
        return userLoginIp;
    }

    public void setUserLoginIp(String userLoginIp) {
        this.userLoginIp = userLoginIp == null ? null : userLoginIp.trim();
    }

    public String getUserLoginType() {
        return userLoginType;
    }

    public void setUserLoginType(String userLoginType) {
        this.userLoginType = userLoginType == null ? null : userLoginType.trim();
    }

    public Date getUserLoginTime() {
        return userLoginTime;
    }

    public void setUserLoginTime(Date userLoginTime) {
        this.userLoginTime = userLoginTime;
    }

    public Date getUserLoginUpdateTime() {
        return userLoginUpdateTime;
    }

    public void setUserLoginUpdateTime(Date userLoginUpdateTime) {
        this.userLoginUpdateTime = userLoginUpdateTime;
    }
}