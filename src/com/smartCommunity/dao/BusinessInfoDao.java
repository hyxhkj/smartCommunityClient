package com.smartCommunity.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.smartCommunity.beans.BusinessBean;
import com.smartCommunity.beans.CommunitySurroundingBean;
import com.smartCommunity.db.DBAccess;

/**
 * 
 * 获取行业信息Dao层
 */
public class BusinessInfoDao {

	public List<BusinessBean> getBusinessInfo(CommunitySurroundingBean communitySurroundingBean){
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		List<BusinessBean> businessBeans = new ArrayList<BusinessBean>();
		try {
			sqlSession = dbAccess.getSqlSession();
			businessBeans = sqlSession.selectList("BusinessInfo.getBusinessInfo", communitySurroundingBean);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(null != sqlSession)
				sqlSession.close();
		}
	
		return businessBeans;
	}
}
