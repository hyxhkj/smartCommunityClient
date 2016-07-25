package com.smartCommunity.service;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.smartCommunity.beans.BusinessBean;
import com.smartCommunity.beans.CommunitySurroundingBean;
import com.smartCommunity.beans.CommunitySurroundingInfoBean;
import com.smartCommunity.beans.ShopBean;
import com.smartCommunity.dao.BusinessInfoDao;
import com.smartCommunity.dao.ShopInfoDao;

/**
 * 
 * 社区周边Service
 */
public class CommunitySurroundingService {

	public CommunitySurroundingInfoBean getcommunitySurrounding(CommunitySurroundingBean communitySurroundingBean) {
		
		CommunitySurroundingInfoBean communitySurroundingInfoBean = new CommunitySurroundingInfoBean();
		/*
		 * 获取行业信息列表
		 */
		List<BusinessBean> businessBeans = new ArrayList<BusinessBean>();
		BusinessInfoDao businessInfoDao = new BusinessInfoDao();
		businessBeans = businessInfoDao.getBusinessInfo(communitySurroundingBean);
		/*
		 * 获取商铺信息列表
		 */
		int businessId = 0;
		if (0 != businessBeans.size()) {
			businessId = businessBeans.get(0).getBusinessId();
		}
		List<ShopBean> shopBeans = new ArrayList<ShopBean>();
		ShopInfoDao shopInfoDao = new ShopInfoDao();
		shopBeans = shopInfoDao.getShopInfo(businessId);
		
		communitySurroundingInfoBean.setBusinessBeans(businessBeans);
		communitySurroundingInfoBean.setShopBeans(shopBeans);
		
		return communitySurroundingInfoBean;
	}
}
