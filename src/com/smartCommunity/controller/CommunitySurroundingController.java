package com.smartCommunity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartCommunity.beans.CommunitySurroundingBean;
import com.smartCommunity.beans.CommunitySurroundingInfoBean;
import com.smartCommunity.service.CommunitySurroundingService;

/**
 * 
 * 社区周边模块后台控制器
 */
@Controller
@RequestMapping("/v1")
public class CommunitySurroundingController {

	/*
	 * 获取周边行业以及商铺信息
	 */
	@ResponseBody
	@RequestMapping("communitySurrounding")
	public CommunitySurroundingInfoBean getcommunitySurrounding(CommunitySurroundingBean communitySurroundingBean) {
		
		CommunitySurroundingService communitySurroundingService = new CommunitySurroundingService();
		CommunitySurroundingInfoBean communitySurroundingInfoBean = communitySurroundingService.getcommunitySurrounding(communitySurroundingBean);
		
		return communitySurroundingInfoBean;
	}
}
