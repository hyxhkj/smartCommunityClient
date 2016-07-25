package com.smartCommunity.beans;

import java.util.List;

/**
 * 
 * 文章及评论详细信息JavaBean
 */
public class ArticleBean {

	/*
	 * 文章id
	 */
	private int articleId;
	/*
	 * 用户id
	 */
	private int userId;
	/*
	 * 用户姓名
	 */
	private String userName;
	/*
	 * 文章内容
	 */
	private String articleContext;
	/*
	 * 文章发表时间
	 */
	private long timestamp;
	/*
	 * 点赞个数
	 */
	private int like;
	/*
	 * 评论信息列表
	 */
	List<CommentBean> commentBeans;
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
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
	public String getArticleContext() {
		return articleContext;
	}
	public void setArticleContext(String articleContext) {
		this.articleContext = articleContext;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public List<CommentBean> getCommentBeans() {
		return commentBeans;
	}
	public void setCommentBeans(List<CommentBean> commentBeans) {
		this.commentBeans = commentBeans;
	}
	@Override
	public String toString() {
		return "ArticleBean [articleId=" + articleId + ", userId=" + userId + ", userName=" + userName
				+ ", articleContext=" + articleContext + ", timestamp=" + timestamp + ", like=" + like
				+ ", commentBeans=" + commentBeans + "]";
	}
	
}
