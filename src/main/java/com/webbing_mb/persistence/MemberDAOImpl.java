package com.webbing_mb.persistence;

import java.sql.Connection;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.webbing_mb.domain.MemberVO;

@Repository //현재 클래스가 DAO 객체임을 스프링에게 알려주고, 스프링컨테이너에 의해 관리되도록 한다.
public class MemberDAOImpl implements MemberDAO 
{
	@Autowired //Spring 컨테이너에서 SqlSessionTemplate 객체 주입
	private SqlSession sqlSession;

	private static String NS = "com.webbing_mb.mappers.MemberMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(NS +".getTime");
		
	}

	@Override
	public int registerMember(MemberVO newMember) {
		
		return sqlSession.insert(NS +".saveMember", newMember);
	}
	
	@Override
	public MemberVO selectMemberByUserId(String userId)
	{
		return sqlSession.selectOne(NS +".getMemberByUserId", userId);
	}
	
	@Override
	public List<MemberVO> selectAllMember()
	{
		return sqlSession.selectList(NS + ".getAllMember");
	}
}
