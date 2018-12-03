package com.ljm.dao;

import com.ljm.bean.StudentLocation;
import com.ljm.bean.StudentLocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentLocationMapper {
    long countByExample(StudentLocationExample example);

    int deleteByExample(StudentLocationExample example);

    int deleteByPrimaryKey(Integer studentLocationId);

    int insert(StudentLocation record);

    int insertSelective(StudentLocation record);

    List<StudentLocation> selectByExample(StudentLocationExample example);

    StudentLocation selectByPrimaryKey(Integer studentLocationId);

    int updateByExampleSelective(@Param("record") StudentLocation record, @Param("example") StudentLocationExample example);

    int updateByExample(@Param("record") StudentLocation record, @Param("example") StudentLocationExample example);

    int updateByPrimaryKeySelective(StudentLocation record);

    int updateByPrimaryKey(StudentLocation record);
}