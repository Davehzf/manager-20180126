package com.mofancn.mapper;

import com.mofancn.pojo.MfUser;
import com.mofancn.pojo.MfUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MfUserMapper {
    int countByExample(MfUserExample example);

    int deleteByExample(MfUserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(MfUser record);

    int insertSelective(MfUser record);

    List<MfUser> selectByExample(MfUserExample example);

    MfUser selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") MfUser record, @Param("example") MfUserExample example);

    int updateByExample(@Param("record") MfUser record, @Param("example") MfUserExample example);

    int updateByPrimaryKeySelective(MfUser record);

    int updateByPrimaryKey(MfUser record);
}