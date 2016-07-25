package com.smartCommunity.beans;

/**
 * 
 * 商铺信息JavaBean
 */
public class ShopBean {
	/*
	 * 行业id
	 */
	private int businessId;
	/*
	 * 商铺id
	 */
	private int shopId;
	/*
	 * 商铺名称
	 */
	private String shopName;
	/*
	 * 商铺地址
	 */
	private String shopAddress;
	/*
	 * 商铺联系方式
	 */
	private String shopContact;
	/*
	 * 商铺图标
	 */
	private String shopIcon;
	/*
	 * 商铺主营业务
	 */
	private String shopSales;
	/*
	 * 商铺信息备注
	 */
	private String remark;
	public int getBusinessId() {
		return businessId;
	}
	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopAddress() {
		return shopAddress;
	}
	public void setShopAddress(String shopAddress) {
		this.shopAddress = shopAddress;
	}
	public String getShopContact() {
		return shopContact;
	}
	public void setShopContact(String shopContact) {
		this.shopContact = shopContact;
	}
	public String getShopIcon() {
		return shopIcon;
	}
	public void setShopIcon(String shopIcon) {
		this.shopIcon = shopIcon;
	}
	public String getShopSales() {
		return shopSales;
	}
	public void setShopSales(String shopSales) {
		this.shopSales = shopSales;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "ShopBean [businessId=" + businessId + ", shopId=" + shopId + ", shopName=" + shopName + ", shopAddress="
				+ shopAddress + ", shopContact=" + shopContact + ", shopIcon=" + shopIcon + ", shopSales=" + shopSales
				+ ", remark=" + remark + "]";
	}
	
	
}
