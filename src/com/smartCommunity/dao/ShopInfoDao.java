package com.smartCommunity.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.smartCommunity.beans.BusinessBean;
import com.smartCommunity.beans.CommunitySurroundingBean;
import com.smartCommunity.beans.ShopBean;
import com.smartCommunity.db.DBAccess;

/**
 * 
 * 获取商铺信息Dao层
 */
public class ShopInfoDao {
	
	public List<ShopBean> getShopInfo(int businessId){
		DBAccess dbAccess = new DBAccess();
		SqlSession sqlSession = null;
		List<ShopBean> shopBeans = new ArrayList<ShopBean>();
		try {
			sqlSession = dbAccess.getSqlSession();
			shopBeans = sqlSession.selectList("ShopInfo.getShopInfo", businessId);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(null != sqlSession)
				sqlSession.close();
		}
	
		return shopBeans;
	}
}
