package com.ljm.dao;

import com.ljm.bean.StudyResource;
import com.ljm.bean.StudyResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudyResourceMapper {
    long countByExample(StudyResourceExample example);

    int deleteByExample(StudyResourceExample example);

    int deleteByPrimaryKey(Integer resourceId);

    int insert(StudyResource record);

    int insertSelective(StudyResource record);

    List<StudyResource> selectByExample(StudyResourceExample example);

    StudyResource selectByPrimaryKey(Integer resourceId);

    int updateByExampleSelective(@Param("record") StudyResource record, @Param("example") StudyResourceExample example);

    int updateByExample(@Param("record") StudyResource record, @Param("example") StudyResourceExample example);

    int updateByPrimaryKeySelective(StudyResource record);

    int updateByPrimaryKey(StudyResource record);
}