package com.smartCommunity.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 社区周边商铺详细信息Java Bean
 */
public class CommunitySurroundingInfoBean {
	
	/*
	 * 商铺信息列表
	 */
	List<ShopBean> shopBeans;
	/*
	 * 行业信息列表
	 */
	List<BusinessBean> businessBeans;
	public List<ShopBean> getShopBeans() {
		return shopBeans;
	}
	public void setShopBeans(List<ShopBean> shopBeans) {
		this.shopBeans = shopBeans;
	}
	public List<BusinessBean> getBusinessBeans() {
		return businessBeans;
	}
	public void setBusinessBeans(List<BusinessBean> businessBeans) {
		this.businessBeans = businessBeans;
	}

}
