package com.mofancn.mapper;

import com.mofancn.pojo.MfClassroomSignIn;
import com.mofancn.pojo.MfClassroomSignInExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MfClassroomSignInMapper {
    int countByExample(MfClassroomSignInExample example);

    int deleteByExample(MfClassroomSignInExample example);

    int deleteByPrimaryKey(Long classroomSignInId);

    int insert(MfClassroomSignIn record);

    int insertSelective(MfClassroomSignIn record);

    List<MfClassroomSignIn> selectByExample(MfClassroomSignInExample example);

    MfClassroomSignIn selectByPrimaryKey(Long classroomSignInId);

    int updateByExampleSelective(@Param("record") MfClassroomSignIn record, @Param("example") MfClassroomSignInExample example);

    int updateByExample(@Param("record") MfClassroomSignIn record, @Param("example") MfClassroomSignInExample example);

    int updateByPrimaryKeySelective(MfClassroomSignIn record);

    int updateByPrimaryKey(MfClassroomSignIn record);
}