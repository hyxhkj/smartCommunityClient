package com.smartCommunity.service;

import com.smartCommunity.beans.UserProblemsBean;
import com.smartCommunity.dao.UserProblemsDao;

/**
 * 处理用户物业请求逻辑的后台服务类
 *
 */
public class UserProblemsService {
	
	/*
	 * 处理客户端传来的物业请求参数
	 */
	public void setUserProblems(UserProblemsBean userProblemsBean) {
		UserProblemsDao userProblemsDao = new UserProblemsDao();
		
		//获取系统时间
		long timestamp = System.currentTimeMillis();
		userProblemsBean.setTimestamp(timestamp);
		//设置信息是否处理标识初始值为0
		userProblemsBean.setIsDealed(0);
		
		userProblemsDao.setUserProblems(userProblemsBean);
	}

}
