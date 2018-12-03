package com.ljm.dao;

import com.ljm.bean.Imgs;
import com.ljm.bean.ImgsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImgsMapper {
    long countByExample(ImgsExample example);

    int deleteByExample(ImgsExample example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(Imgs record);

    int insertSelective(Imgs record);

    List<Imgs> selectByExample(ImgsExample example);

    Imgs selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") Imgs record, @Param("example") ImgsExample example);

    int updateByExample(@Param("record") Imgs record, @Param("example") ImgsExample example);

    int updateByPrimaryKeySelective(Imgs record);

    int updateByPrimaryKey(Imgs record);
}