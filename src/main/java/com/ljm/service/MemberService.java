/**
 * 
 */
package com.ljm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ljm.bean.MemberBasicInfo;
import com.ljm.dao.MemberBasicInfoMapper;

/**
 * @author ljm
 *
 * @date 2018年11月30日
 *
 * @function 处理与成员相关的业务逻辑
 */
@Service
public class MemberService {
	@Autowired
	private MemberBasicInfoMapper memberBasicInfoMapper;
	
	/*
	 * 得到所有成员的所有信息
	 */
	public List<MemberBasicInfo> getAllMembers() {
		return memberBasicInfoMapper.selectByExample(null);
	}
}
