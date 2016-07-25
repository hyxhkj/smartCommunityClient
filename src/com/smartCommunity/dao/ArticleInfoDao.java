package com.smartCommunity.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.smartCommunity.beans.ArticleBean;
import com.smartCommunity.beans.ArticleInfoBean;
import com.smartCommunity.beans.CommentBean;
import com.smartCommunity.beans.FavoriteArticleBean;
import com.smartCommunity.db.DBAccess;

/**
 * 
 * 社区论坛模块Dao层
 */
public class ArticleInfoDao {
	
	/*
	 * 获取帖子信息
	 */
	public ArticleInfoBean getArticles(int pageId){
		
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		ArticleInfoBean articleInfoBean = new ArticleInfoBean();
		List<ArticleBean> articleBeans = new ArrayList<ArticleBean>();
		List<CommentBean> commentBeans = new ArrayList<CommentBean>();
		List<Integer> articleIds = new ArrayList<Integer>();
		
		try {
			sqlSession = dbAccess.getSqlSession();
			articleBeans = sqlSession.selectList("ArticleInfo.getArticles", pageId);
			for(ArticleBean article:articleBeans){
				articleIds.add(article.getArticleId());
			}
			commentBeans = sqlSession.selectList("CommentInfo.getComments", articleIds);
			java.util.Collections.sort(commentBeans);
			
			int length = 0;
			for(int i=0,j=0; i<articleBeans.size()&&j<commentBeans.size();){
				if (articleBeans.get(i).getArticleId() == commentBeans.get(j).getArticleId()) {
					++length;
					++j;
				}else if (articleBeans.get(i).getArticleId() < commentBeans.get(j).getArticleId()) {
					if(0 != length)
						articleBeans.get(i).setCommentBeans(commentBeans.subList(j-length, j));
					++i;
					length = 0;
				}else if (articleBeans.get(i).getArticleId() > commentBeans.get(j).getArticleId()) {
					++j;
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(null != sqlSession)
				sqlSession.close();
		}
		
		articleInfoBean.setArticleBeans(articleBeans);
		return articleInfoBean;
	}
	
	/*
	 * 发帖
	 */
	public void postArticle(ArticleBean articleBean) {
		
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		
		try {
			sqlSession = dbAccess.getSqlSession();
			sqlSession.insert("ArticleInfo.postArticle", articleBean);
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(null != sqlSession)
				sqlSession.close();
		}
	}
	
	/*
	 * 回复帖子
	 */
	public void replyArticle(CommentBean commentBean){
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		
		try {
			sqlSession = dbAccess.getSqlSession();
			sqlSession.insert("ArticleInfo.replyArticle", commentBean);
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(null != sqlSession)
				sqlSession.close();
		}
	}
	
	/*
	 * 收藏帖子
	 */
	public void collectArticle(FavoriteArticleBean favoriteArticleBean){
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		
		try {
			sqlSession = dbAccess.getSqlSession();
			sqlSession.insert("ArticleInfo.collectArticle", favoriteArticleBean);
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(null != sqlSession)
				sqlSession.close();
		}
	}
	
	/*
	 * 删除帖子
	 */
	public void deleteArticle(ArticleBean articleBean){
		
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		
		try {
			sqlSession = dbAccess.getSqlSession();
			sqlSession.delete("ArticleInfo.deleteArticle", articleBean);
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(null != sqlSession)
				sqlSession.close();
		}
	}
	
}
