package com.ljm.dao;

import com.ljm.bean.DailyPlan;
import com.ljm.bean.DailyPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DailyPlanMapper {
    long countByExample(DailyPlanExample example);

    int deleteByExample(DailyPlanExample example);

    int deleteByPrimaryKey(Integer planId);

    int insert(DailyPlan record);

    int insertSelective(DailyPlan record);

    List<DailyPlan> selectByExample(DailyPlanExample example);

    DailyPlan selectByPrimaryKey(Integer planId);

    int updateByExampleSelective(@Param("record") DailyPlan record, @Param("example") DailyPlanExample example);

    int updateByExample(@Param("record") DailyPlan record, @Param("example") DailyPlanExample example);

    int updateByPrimaryKeySelective(DailyPlan record);

    int updateByPrimaryKey(DailyPlan record);
}