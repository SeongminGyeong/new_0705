package com.webbing_mb.connection;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//test 패키지에서 Spring container에 접근할 수 있도록 함
@ContextConfiguration(					//root-context.xml 파일의 위치를 제공
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)
public class MyBatisTest {
	@Inject
	private SqlSessionFactory sqlFactory; // Spring 컨테이너에서 SqlSessionFactory 객체를 찾아 주입
	
	@Test
	public void testSqlSessionFactory() {
		System.out.println(sqlFactory.toString());
		
		SqlSession session = sqlFactory.openSession();
		
		if (session !=null)
		{
			System.out.println(session.toString());
		}
		
		
	}
}
