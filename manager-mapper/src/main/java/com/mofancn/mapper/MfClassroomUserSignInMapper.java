package com.mofancn.mapper;

import com.mofancn.pojo.MfClassroomUserSignIn;
import com.mofancn.pojo.MfClassroomUserSignInExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MfClassroomUserSignInMapper {
    int countByExample(MfClassroomUserSignInExample example);

    int deleteByExample(MfClassroomUserSignInExample example);

    int deleteByPrimaryKey(Long userSignInId);

    int insert(MfClassroomUserSignIn record);

    int insertSelective(MfClassroomUserSignIn record);

    List<MfClassroomUserSignIn> selectByExample(MfClassroomUserSignInExample example);

    MfClassroomUserSignIn selectByPrimaryKey(Long userSignInId);

    int updateByExampleSelective(@Param("record") MfClassroomUserSignIn record, @Param("example") MfClassroomUserSignInExample example);

    int updateByExample(@Param("record") MfClassroomUserSignIn record, @Param("example") MfClassroomUserSignInExample example);

    int updateByPrimaryKeySelective(MfClassroomUserSignIn record);

    int updateByPrimaryKey(MfClassroomUserSignIn record);
}