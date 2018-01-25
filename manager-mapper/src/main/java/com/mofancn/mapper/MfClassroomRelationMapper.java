package com.mofancn.mapper;

import com.mofancn.pojo.MfClassroomRelation;
import com.mofancn.pojo.MfClassroomRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MfClassroomRelationMapper {
    int countByExample(MfClassroomRelationExample example);

    int deleteByExample(MfClassroomRelationExample example);

    int deleteByPrimaryKey(Integer mfRelationId);

    int insert(MfClassroomRelation record);

    int insertSelective(MfClassroomRelation record);

    List<MfClassroomRelation> selectByExample(MfClassroomRelationExample example);

    MfClassroomRelation selectByPrimaryKey(Integer mfRelationId);

    int updateByExampleSelective(@Param("record") MfClassroomRelation record, @Param("example") MfClassroomRelationExample example);

    int updateByExample(@Param("record") MfClassroomRelation record, @Param("example") MfClassroomRelationExample example);

    int updateByPrimaryKeySelective(MfClassroomRelation record);

    int updateByPrimaryKey(MfClassroomRelation record);
}