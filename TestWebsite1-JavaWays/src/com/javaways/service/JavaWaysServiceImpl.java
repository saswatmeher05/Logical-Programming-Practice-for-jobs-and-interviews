package com.javaways.service;

import com.javaways.bo.JavaWaysBo;
import com.javaways.dao.JavaWaysDao;
import com.javaways.dao.JavaWaysDaoImpl;
import com.javaways.dto.JavaWaysDto;

public class JavaWaysServiceImpl implements JavaWaysService {
	public JavaWaysDao dao;
	
	public JavaWaysServiceImpl() {
		dao=new JavaWaysDaoImpl();
		
	}

	@Override
	public String registerUser(JavaWaysDto dto) throws Exception {
		JavaWaysBo bo=new JavaWaysBo();
		int count=0;
		bo.setCname(dto.getCname());
		bo.setCemail(dto.getCemail());
		bo.setCpassword(dto.getCpassword());
		bo.setCphone(dto.getCphone());
		bo.setCgender(dto.getCgender());
		bo.setCdob(dto.getCdob());
		bo.setCcountry(dto.getCcountry());
		//use dao
		count=dao.insert(bo);
		//process the result
		if(count==0) {
			return "Registration Failed";
		}
		else {
			return "Registration Successful";
		}
	}

}
