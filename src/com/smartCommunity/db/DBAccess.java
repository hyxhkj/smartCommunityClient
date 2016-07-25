package com.smartCommunity.db;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 
 * 用来生成mybatis访问数据库所需要的SqlSession对象
 */
public class DBAccess {

	public SqlSession getSqlSession() throws IOException {

		//通过配置文件获取数据库连接信息
		Reader reader = Resources.getResourceAsReader("com/smartCommunity/config/Configuration.xml");
		//通过配置信息构建一个SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		//通过SqlSessionFactory打开一个数据库会话
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession;
	}
}
