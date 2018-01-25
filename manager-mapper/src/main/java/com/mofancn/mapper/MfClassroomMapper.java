package com.mofancn.mapper;

import com.mofancn.pojo.MfClassroom;
import com.mofancn.pojo.MfClassroomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MfClassroomMapper {
    int countByExample(MfClassroomExample example);

    int deleteByExample(MfClassroomExample example);

    int deleteByPrimaryKey(Long classroomId);

    int insert(MfClassroom record);

    int insertSelective(MfClassroom record);

    List<MfClassroom> selectByExample(MfClassroomExample example);

    MfClassroom selectByPrimaryKey(Long classroomId);

    int updateByExampleSelective(@Param("record") MfClassroom record, @Param("example") MfClassroomExample example);

    int updateByExample(@Param("record") MfClassroom record, @Param("example") MfClassroomExample example);

    int updateByPrimaryKeySelective(MfClassroom record);

    int updateByPrimaryKey(MfClassroom record);
}