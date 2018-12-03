package com.ljm.dao;

import com.ljm.bean.MemberBasicInfo;
import com.ljm.bean.MemberBasicInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberBasicInfoMapper {
    long countByExample(MemberBasicInfoExample example);

    int deleteByExample(MemberBasicInfoExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(MemberBasicInfo record);

    int insertSelective(MemberBasicInfo record);

    List<MemberBasicInfo> selectByExample(MemberBasicInfoExample example);

    MemberBasicInfo selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") MemberBasicInfo record, @Param("example") MemberBasicInfoExample example);

    int updateByExample(@Param("record") MemberBasicInfo record, @Param("example") MemberBasicInfoExample example);

    int updateByPrimaryKeySelective(MemberBasicInfo record);

    int updateByPrimaryKey(MemberBasicInfo record);
}