package com.smartCommunity.service;

import com.smartCommunity.beans.ArticleBean;
import com.smartCommunity.beans.ArticleInfoBean;
import com.smartCommunity.beans.CommentBean;
import com.smartCommunity.beans.FavoriteArticleBean;
import com.smartCommunity.dao.ArticleInfoDao;

/**
 * 
 * 获取用户文章列表的Service
 */
public class ForumService {
	
	/*
	 * 获取论坛发帖信息
	 */
	public ArticleInfoBean getArticles(int pageId){
		
		ArticleInfoDao articleInfoDao = new ArticleInfoDao();
		ArticleInfoBean articleInfoBean = articleInfoDao.getArticles(pageId);
		articleInfoBean.setPageid(pageId+1);
		
		return articleInfoBean;
	}

	/*
	 * 发帖
	 */
	public void postArticle(ArticleBean articleBean) {
		
		ArticleInfoDao articleInfoDao = new ArticleInfoDao();
		long timestamp = System.currentTimeMillis();
		articleBean.setTimestamp(timestamp);
		articleInfoDao.postArticle(articleBean);
		
	}
	
	/*
	 * 回复帖子
	 */
	public void replyArticle(CommentBean commentBean){
		ArticleInfoDao articleInfoDao = new ArticleInfoDao();
		long timestamp = System.currentTimeMillis();
		commentBean.setTimestamp(timestamp);
		articleInfoDao.replyArticle(commentBean);
	}
	
	/*
	 * 收藏帖子
	 */
	public void collectArticle(FavoriteArticleBean favoriteArticleBean){
		ArticleInfoDao articleInfoDao = new ArticleInfoDao();
		long timestamp = System.currentTimeMillis();
		favoriteArticleBean.setTimestamp(timestamp);
		articleInfoDao.collectArticle(favoriteArticleBean);
	}
	
	/*
	 * 删除帖子
	 */
	public void deleteArticle(ArticleBean articleBean){
		ArticleInfoDao articleInfoDao = new ArticleInfoDao();
		articleInfoDao.deleteArticle(articleBean);
	}
	
}
