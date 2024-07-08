package com.webbing_mb.daotest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.webbing_mb.domain.MemberVO;
import com.webbing_mb.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)//test 패키지에서 Spring container에 접근할 수 있도록 함
@ContextConfiguration(					//root-context.xml 파일의 위치를 제공
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)
public class MemberDAOTest 
{
	@Autowired
	private MemberDAO mdao;
	
//	@Test
//	public void testGetTime() {
//		System.out.println(mdao.getTime());
//	}
	
	//CRUD (CREATE(데이터 생성-INSERT) READ(SELECT) UPDATE(UPDATE) DELETE(삭제))
/*	@Test
	public void testInsertMember() {
		MemberVO newMember = MemberVO.builder()
			.userId("douner")
			.userPwd("1234")
			.userName("도넛")
			.mobile("010-2555-7896")
			.email("domint@google.com")
			.build();
			
		if (mdao.registerMember(newMember)==1)
		{
			System.out.println("회원 저장 성공");
		}
	}
*/	
/*	@Test
	public void selectMemberById() 
	{
		System.out.println((mdao.selectMemberByUserId("booly")).toString());
	}
	*/
	
	@Test
	public void selectAllMemberTest() 
	{
		List<MemberVO> members = mdao.selectAllMember();
		
		for (MemberVO m : members) {
			System.out.println(m.toString());
		}
	}
}
