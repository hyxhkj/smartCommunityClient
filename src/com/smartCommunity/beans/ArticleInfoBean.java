package com.smartCommunity.beans;

import java.util.List;

/**
 * 
 * 文章信息Java Bean
 */
public class ArticleInfoBean {

	/*
	 * 当前文章页数
	 */
	private int pageid;
	/*
	 * 文章列表
	 */
	List<ArticleBean> articleBeans;
	public int getPageid() {
		return pageid;
	}
	public void setPageid(int pageid) {
		this.pageid = pageid;
	}
	public List<ArticleBean> getArticleBeans() {
		return articleBeans;
	}
	public void setArticleBeans(List<ArticleBean> articleBeans) {
		this.articleBeans = articleBeans;
	}
	@Override
	public String toString() {
		return "ArticleInfoBean [pageid=" + pageid + ", articleBeans=" + articleBeans + "]";
	}
	
}
