package com.mofancn.pojo;

import java.util.Date;

public class MfUser {
    private Long userId;

    private String userPhone;

    private String userPassword;

    private String userNickName;

    private String userImage;

    private Byte userGroup;

    private String userEmail;

    private String userWeixinId;

    private Date userRegisterTime;

    private Date userUpdateTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName == null ? null : userNickName.trim();
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage == null ? null : userImage.trim();
    }

    public Byte getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(Byte userGroup) {
        this.userGroup = userGroup;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserWeixinId() {
        return userWeixinId;
    }

    public void setUserWeixinId(String userWeixinId) {
        this.userWeixinId = userWeixinId == null ? null : userWeixinId.trim();
    }

    public Date getUserRegisterTime() {
        return userRegisterTime;
    }

    public void setUserRegisterTime(Date userRegisterTime) {
        this.userRegisterTime = userRegisterTime;
    }

    public Date getUserUpdateTime() {
        return userUpdateTime;
    }

    public void setUserUpdateTime(Date userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
    }
}