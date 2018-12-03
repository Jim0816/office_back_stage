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
 * @date 2018��11��30��
 *
 * @function �������Ա��ص�ҵ���߼�
 */
@Service
public class MemberService {
	@Autowired
	private MemberBasicInfoMapper memberBasicInfoMapper;
	
	/*
	 * �õ����г�Ա��������Ϣ
	 */
	public List<MemberBasicInfo> getAllMembers() {
		return memberBasicInfoMapper.selectByExample(null);
	}
}
