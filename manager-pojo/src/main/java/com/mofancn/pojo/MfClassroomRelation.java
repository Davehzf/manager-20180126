package com.mofancn.pojo;

import java.util.Date;

public class MfClassroomRelation {
    private Integer mfRelationId;

    private Byte valid;

    private Long userId;

    private Long classroomId;

    private Integer record;

    private Date createTime;

    private Date updateTime;

    public Integer getMfRelationId() {
        return mfRelationId;
    }

    public void setMfRelationId(Integer mfRelationId) {
        this.mfRelationId = mfRelationId;
    }

    public Byte getValid() {
        return valid;
    }

    public void setValid(Byte valid) {
        this.valid = valid;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }

    public Integer getRecord() {
        return record;
    }

    public void setRecord(Integer record) {
        this.record = record;
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