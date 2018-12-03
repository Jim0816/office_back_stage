package com.ljm.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljm.utils.HttpsRequestUtils;

import net.sf.json.JSONObject;

/**
 * @author ljm
 *
 * @date 2018年11月30日
 *
 * @function 整个应用相关的业务逻辑
 */
@Controller
public class CommonController {
	
	@ResponseBody
    @RequestMapping(value="/getOpenId")
	public JSONObject getOpenId(String code){
		String WX_URL = "https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code";
		Map<String, Object> result = new HashMap<>();
		boolean check = (StringUtils.isEmpty(code)) ? true : false;
		if(check) {
			System.out.println("参数异常");
		}
		String requestUrl = WX_URL.replace("APPID", "wxe0d663d839e9bf8b").
                replace("SECRET", "2422e8a655ce82513f0bbc105c7cf371").replace("JSCODE", code).
                replace("authorization_code", "authorization_code");
		
		JSONObject jsonObject = HttpsRequestUtils.httpsRequest(requestUrl, "GET", null);
		System.out.println(jsonObject);
		return jsonObject;
		
	}
}
