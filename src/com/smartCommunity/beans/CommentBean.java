package com.smartCommunity.beans;

/**
 * 
 * 评论信息Java Bean
 */
public class CommentBean implements Comparable<CommentBean>{
	/*
	 * 评论id
	 */
	private int commentId;
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
	 * 评论内容
	 */
	private String commentContext;
	/*
	 * 发表评论时间
	 */
	private long timestamp;
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
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
	public String getCommentContext() {
		return commentContext;
	}
	public void setCommentContext(String commentContext) {
		this.commentContext = commentContext;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "CommentBean [commentId=" + commentId + ", articleId=" + articleId + ", userId=" + userId + ", userName="
				+ userName + ", commentContext=" + commentContext + ", timestamp=" + timestamp + "]";
	}
	@Override
	public int compareTo(CommentBean obj) {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.getArticleId()).compareTo(obj.getArticleId());
	}
	
}
