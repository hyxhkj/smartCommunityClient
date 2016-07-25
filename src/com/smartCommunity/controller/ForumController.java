package com.smartCommunity.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smartCommunity.beans.ArticleBean;
import com.smartCommunity.beans.ArticleInfoBean;
import com.smartCommunity.beans.CommentBean;
import com.smartCommunity.beans.FavoriteArticleBean;
import com.smartCommunity.service.ForumService;

/**
 * 
 * 社区论坛控制类
 */
@Controller
@RequestMapping("/v1")
public class ForumController {

	/*
	 * 获取帖子信息
	 */
	@ResponseBody
	@RequestMapping("getArticles")
	public ArticleInfoBean getArticles(HttpServletRequest request) {
		
		int pageId = 1;
		if(null != request.getParameter("pageId"))
			pageId = Integer.valueOf(request.getParameter("pageId"));
		ForumService forumService = new ForumService();
		ArticleInfoBean articleInfoBean = forumService.getArticles(pageId);
		
		return articleInfoBean;
	}
	/*
	 * 发表帖子
	 */
	@RequestMapping("postArticle")
	public void postArticle(ArticleBean articleBean) {
		
		ForumService forumService = new ForumService();
		forumService.postArticle(articleBean);
	}
	/*
	 * 回复帖子
	 */
	@RequestMapping("replyArticle")
	public void replyArticle(CommentBean commentBean){
		
		ForumService forumService = new ForumService();
		forumService.replyArticle(commentBean);
	}
	/*
	 * 收藏帖子
	 */
	@RequestMapping("collectArticle")
	public void collectArticle(FavoriteArticleBean favoriteArticleBean){
		ForumService forumService = new ForumService();
		forumService.collectArticle(favoriteArticleBean);
	}
	/*
	 * 删除帖子
	 */
	@RequestMapping("deleteArticle")
	public void deleteArticle(ArticleBean articleBean){
		ForumService forumService = new ForumService();
		forumService.deleteArticle(articleBean);
	}
}
