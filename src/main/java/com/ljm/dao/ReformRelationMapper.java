package com.ljm.dao;

import com.ljm.bean.ReformRelation;
import com.ljm.bean.ReformRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReformRelationMapper {
    long countByExample(ReformRelationExample example);

    int deleteByExample(ReformRelationExample example);

    int deleteByPrimaryKey(Integer reformId);

    int insert(ReformRelation record);

    int insertSelective(ReformRelation record);

    List<ReformRelation> selectByExample(ReformRelationExample example);

    ReformRelation selectByPrimaryKey(Integer reformId);

    int updateByExampleSelective(@Param("record") ReformRelation record, @Param("example") ReformRelationExample example);

    int updateByExample(@Param("record") ReformRelation record, @Param("example") ReformRelationExample example);

    int updateByPrimaryKeySelective(ReformRelation record);

    int updateByPrimaryKey(ReformRelation record);
}