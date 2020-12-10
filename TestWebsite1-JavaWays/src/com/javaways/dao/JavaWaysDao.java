package com.javaways.dao;

import com.javaways.bo.JavaWaysBo;
public interface JavaWaysDao {
	
	public int insert(JavaWaysBo bo) throws Exception;
	public int read(JavaWaysBo bo)throws Exception;
	public int update(JavaWaysBo bo)throws Exception;
	public int delete(JavaWaysBo bo)throws Exception;
}
