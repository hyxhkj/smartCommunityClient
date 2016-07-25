package com.smartCommunity.beans;

public class BusinessBean {
	/*
	 * 行业id
	 */
	private int businessId;
	/*
	 * 行业描述信息
	 */
	private String businessDescription;
	public int getBusinessId() {
		return businessId;
	}
	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}
	public String getBusinessDescription() {
		return businessDescription;
	}
	public void setBusinessDescription(String businessDescription) {
		this.businessDescription = businessDescription;
	}
	@Override
	public String toString() {
		return "BusinessBean [businessId=" + businessId + ", businessDescription=" + businessDescription + "]";
	}
	
	
}
