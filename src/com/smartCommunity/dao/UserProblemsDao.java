package com.smartCommunity.dao;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.smartCommunity.beans.UserProblemsBean;
import com.smartCommunity.db.DBAccess;

/**
 * 
 * 用户物业管理数据库操作
 */
public class UserProblemsDao {

	/*
	 * 数据库dao层
	 */
	public void setUserProblems(UserProblemsBean userProblemsBean) {
		
		System.out.println(userProblemsBean);
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dbAccess.getSqlSession();
			//通过sqlSession执行sql语句
			sqlSession.insert("UserProblems.setUserProblems", userProblemsBean);
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
