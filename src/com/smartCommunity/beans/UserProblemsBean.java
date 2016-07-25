package com.smartCommunity.beans;

public class UserProblemsBean {
	
	/*
	 * 用户姓名
	 */
	private String userName;
	
	/*
	 * 用户问题
	 */
	private String userProblems;
	/*
	 * 用户问题提交时间戳
	 */
	private long timestamp;
	/*
	 * 用户问题是否处置标识
	 */
	private int isDealed;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserProblems() {
		return userProblems;
	}

	public void setUserProblems(String userProblems) {
		this.userProblems = userProblems;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public int getIsDealed() {
		return isDealed;
	}

	public void setIsDealed(int isDealed) {
		this.isDealed = isDealed;
	}

	@Override
	public String toString() {
		return "UserProblemsBean [userName=" + userName + ", userProblems=" + userProblems + ", timestamp=" + timestamp
				+ ", isDealed=" + isDealed + "]";
	}
	
}
