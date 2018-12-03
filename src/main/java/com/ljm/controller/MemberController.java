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
 * @date 2018年11月30日
 *
 * @function 控制与成员相关的业务逻辑
 */
@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	/*
	 * 得到所有成员的所有信息
	 */
	@ResponseBody
	@RequestMapping ( "/getAllMembers" )
	public List<MemberBasicInfo> getAllMembers(){
		return memberService.getAllMembers();
	}
}
