package com.javaways.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.javaways.bo.JavaWaysBo;
import com.javaways.dto.JavaWaysDto;

public class JavaWaysDaoImpl implements JavaWaysDao {
	private static final String INSERT_CUSTOMER_DETAILS="INSERT INTO JAVAWAYS VALUES(CID.NEXTVAL,?,?,?,?,?,?,?)";

	private Connection getConnection() throws Exception{
		//load the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//establish the connection with oracle/mysql db
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system","manager");
		return connection;
	}
	
	@Override
	public int insert(JavaWaysBo bo) throws Exception {
		Connection con=null;
		int count=0;
		PreparedStatement ps=null;
		try {
			con=getConnection();
			ps=con.prepareStatement("INSERT_CUSTOMER_DETAILS");
			ps.setString(1, bo.getCname());
			ps.setString(2, bo.getCemail());
			ps.setString(3, bo.getCpassword());
			ps.setString(4, bo.getCphone() );
			ps.setString(5, bo.getCgender() );
			ps.setDate(6, bo.getCdob() );
			ps.setString(7, bo.getCcountry());
			count=ps.executeUpdate();
			//close objects
			con.close();
			ps.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	
	public int read(JavaWaysBo bo)throws Exception{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("SELECT * FROM JAVAWAYS");
		
		return 0;
		
	}

	@Override
	public int update(JavaWaysBo bo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(JavaWaysBo bo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
