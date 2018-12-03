package com.ljm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljm.bean.MemberBasicInfo;
import com.ljm.service.MemberService;

/**
 * @author ljm
 *
 * @date 2018��11��30��
 *
 * @function �������Ա��ص�ҵ���߼�
 */
@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	/*
	 * �õ����г�Ա��������Ϣ
	 */
	@ResponseBody
	@RequestMapping ( "/getAllMembers" )
	public List<MemberBasicInfo> getAllMembers(){
		return memberService.getAllMembers();
	}
}
