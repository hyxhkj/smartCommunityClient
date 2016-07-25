package com.smartCommunity.beans;

/**
 * 
 * 收藏文章Java Bean
 */
public class FavoriteArticleBean {

	/*
	 * 收藏记录Id
	 */
	private int favoriteId;
	/*
	 * 收藏用户Id
	 */
	private int userId;
	/*
	 * 收藏用户姓名
	 */
	private String userName;
	/*
	 * 收藏的文章Id
	 */
	private int articleId;
	/*
	 * 收藏时间戳
	 */
	private long timestamp;
	public int getFavoriteId() {
		return favoriteId;
	}
	public void setFavoriteId(int favoriteId) {
		this.favoriteId = favoriteId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "FavoriteArticleBean [favoriteId=" + favoriteId + ", userId=" + userId + ", userName=" + userName
				+ ", articleId=" + articleId + ", timestamp=" + timestamp + "]";
	}
	
}
