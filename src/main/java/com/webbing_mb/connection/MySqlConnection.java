package com.webbing_mb.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class MySqlConnection {
	private static final String DRIVER ="com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/webbing";
	private static final String USER = "root";
	private static final String PASSWORD ="1234";
	
	@Test
	public void testConnection() throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER);
		
		Connection con = DriverManager.getConnection(URL, USER, PASSWORD);  
		
		if(con !=null)
		{
			System.out.println("연결 성공 ! ");
		}
	}
}
