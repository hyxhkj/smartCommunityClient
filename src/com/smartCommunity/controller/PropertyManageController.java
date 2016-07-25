package com.smartCommunity.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smartCommunity.beans.UserProblemsBean;
import com.smartCommunity.service.UserProblemsService;

/**
 * 物业管理模块后台控制器
 *
 */
@Controller
@RequestMapping("/v1")
public class PropertyManageController {

	/*
	 * 接收用户物业管理信息
	 */
//	@ResponseBody
	@RequestMapping("UserProblems")
	public void setUserProblems(UserProblemsBean userProblemsBean){
		
		try {
			userProblemsBean.setUserName(new String(userProblemsBean.getUserName().getBytes("ISO-8859-1"), "UTF-8"));
			userProblemsBean.setUserProblems(new String(userProblemsBean.getUserProblems().getBytes("ISO-8859-1"), "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UserProblemsService userProblemsService = new UserProblemsService();
		userProblemsService.setUserProblems(userProblemsBean);

//		return conditionMonitoringBean;
	}
}
