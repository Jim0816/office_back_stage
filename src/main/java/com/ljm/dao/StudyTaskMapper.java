package com.ljm.dao;

import com.ljm.bean.StudyTask;
import com.ljm.bean.StudyTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudyTaskMapper {
    long countByExample(StudyTaskExample example);

    int deleteByExample(StudyTaskExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(StudyTask record);

    int insertSelective(StudyTask record);

    List<StudyTask> selectByExample(StudyTaskExample example);

    StudyTask selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") StudyTask record, @Param("example") StudyTaskExample example);

    int updateByExample(@Param("record") StudyTask record, @Param("example") StudyTaskExample example);

    int updateByPrimaryKeySelective(StudyTask record);

    int updateByPrimaryKey(StudyTask record);
}