package com.ljm.dao;

import com.ljm.bean.ReformType;
import com.ljm.bean.ReformTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReformTypeMapper {
    long countByExample(ReformTypeExample example);

    int deleteByExample(ReformTypeExample example);

    int deleteByPrimaryKey(Integer reformTypeId);

    int insert(ReformType record);

    int insertSelective(ReformType record);

    List<ReformType> selectByExample(ReformTypeExample example);

    ReformType selectByPrimaryKey(Integer reformTypeId);

    int updateByExampleSelective(@Param("record") ReformType record, @Param("example") ReformTypeExample example);

    int updateByExample(@Param("record") ReformType record, @Param("example") ReformTypeExample example);

    int updateByPrimaryKeySelective(ReformType record);

    int updateByPrimaryKey(ReformType record);
}