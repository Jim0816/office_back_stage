package com.ljm.dao;

import com.ljm.bean.BlogRemark;
import com.ljm.bean.BlogRemarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogRemarkMapper {
    long countByExample(BlogRemarkExample example);

    int deleteByExample(BlogRemarkExample example);

    int deleteByPrimaryKey(Integer blogRemarkId);

    int insert(BlogRemark record);

    int insertSelective(BlogRemark record);

    List<BlogRemark> selectByExample(BlogRemarkExample example);

    BlogRemark selectByPrimaryKey(Integer blogRemarkId);

    int updateByExampleSelective(@Param("record") BlogRemark record, @Param("example") BlogRemarkExample example);

    int updateByExample(@Param("record") BlogRemark record, @Param("example") BlogRemarkExample example);

    int updateByPrimaryKeySelective(BlogRemark record);

    int updateByPrimaryKey(BlogRemark record);
}