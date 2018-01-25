package com.mofancn.mapper;

import com.mofancn.pojo.MfUserLogin;
import com.mofancn.pojo.MfUserLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MfUserLoginMapper {
    int countByExample(MfUserLoginExample example);

    int deleteByExample(MfUserLoginExample example);

    int deleteByPrimaryKey(Long userLoginId);

    int insert(MfUserLogin record);

    int insertSelective(MfUserLogin record);

    List<MfUserLogin> selectByExample(MfUserLoginExample example);

    MfUserLogin selectByPrimaryKey(Long userLoginId);

    int updateByExampleSelective(@Param("record") MfUserLogin record, @Param("example") MfUserLoginExample example);

    int updateByExample(@Param("record") MfUserLogin record, @Param("example") MfUserLoginExample example);

    int updateByPrimaryKeySelective(MfUserLogin record);

    int updateByPrimaryKey(MfUserLogin record);
}