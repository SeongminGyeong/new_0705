package com.webbing_mb.connection;

import java.sql.Connection;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//test 패키지에서 Spring container에 접근할 수 있도록 함
@ContextConfiguration(					//root-context.xml 파일의 위치를 제공
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class DataSourceTest 
{
	@Inject //Spring container (스프링 메모리)에서 데이터 타입이 DataSource인 객체를 찾아 주입(의존선 주입)
	private DataSource ds;
	
	@Test
	public void testConnection() throws SQLException {
		System.out.println(ds.toString());
		
		Connection con = ds.getConnection();
		
		if(con!=null)
		{
			System.out.println("연결 성공");
		}
	}

}
