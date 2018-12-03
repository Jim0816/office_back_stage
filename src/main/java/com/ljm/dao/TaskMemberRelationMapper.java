package com.ljm.dao;

import com.ljm.bean.TaskMemberRelation;
import com.ljm.bean.TaskMemberRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskMemberRelationMapper {
    long countByExample(TaskMemberRelationExample example);

    int deleteByExample(TaskMemberRelationExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(TaskMemberRelation record);

    int insertSelective(TaskMemberRelation record);

    List<TaskMemberRelation> selectByExample(TaskMemberRelationExample example);

    TaskMemberRelation selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") TaskMemberRelation record, @Param("example") TaskMemberRelationExample example);

    int updateByExample(@Param("record") TaskMemberRelation record, @Param("example") TaskMemberRelationExample example);

    int updateByPrimaryKeySelective(TaskMemberRelation record);

    int updateByPrimaryKey(TaskMemberRelation record);
}