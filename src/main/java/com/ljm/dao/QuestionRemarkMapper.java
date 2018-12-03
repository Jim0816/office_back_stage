package com.ljm.dao;

import com.ljm.bean.QuestionRemark;
import com.ljm.bean.QuestionRemarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionRemarkMapper {
    long countByExample(QuestionRemarkExample example);

    int deleteByExample(QuestionRemarkExample example);

    int deleteByPrimaryKey(Integer questionRemarkId);

    int insert(QuestionRemark record);

    int insertSelective(QuestionRemark record);

    List<QuestionRemark> selectByExample(QuestionRemarkExample example);

    QuestionRemark selectByPrimaryKey(Integer questionRemarkId);

    int updateByExampleSelective(@Param("record") QuestionRemark record, @Param("example") QuestionRemarkExample example);

    int updateByExample(@Param("record") QuestionRemark record, @Param("example") QuestionRemarkExample example);

    int updateByPrimaryKeySelective(QuestionRemark record);

    int updateByPrimaryKey(QuestionRemark record);
}