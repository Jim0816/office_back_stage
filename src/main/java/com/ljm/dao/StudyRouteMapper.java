package com.ljm.dao;

import com.ljm.bean.StudyRoute;
import com.ljm.bean.StudyRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudyRouteMapper {
    long countByExample(StudyRouteExample example);

    int deleteByExample(StudyRouteExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(StudyRoute record);

    int insertSelective(StudyRoute record);

    List<StudyRoute> selectByExample(StudyRouteExample example);

    StudyRoute selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") StudyRoute record, @Param("example") StudyRouteExample example);

    int updateByExample(@Param("record") StudyRoute record, @Param("example") StudyRouteExample example);

    int updateByPrimaryKeySelective(StudyRoute record);

    int updateByPrimaryKey(StudyRoute record);
}