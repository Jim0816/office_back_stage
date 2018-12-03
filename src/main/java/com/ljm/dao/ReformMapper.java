package com.ljm.dao;

import com.ljm.bean.Reform;
import com.ljm.bean.ReformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReformMapper {
    long countByExample(ReformExample example);

    int deleteByExample(ReformExample example);

    int deleteByPrimaryKey(Integer reformId);

    int insert(Reform record);

    int insertSelective(Reform record);

    List<Reform> selectByExample(ReformExample example);

    Reform selectByPrimaryKey(Integer reformId);

    int updateByExampleSelective(@Param("record") Reform record, @Param("example") ReformExample example);

    int updateByExample(@Param("record") Reform record, @Param("example") ReformExample example);

    int updateByPrimaryKeySelective(Reform record);

    int updateByPrimaryKey(Reform record);
}