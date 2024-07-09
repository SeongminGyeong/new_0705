package com.webbing_mb.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.webbing_mb.domain.MemberVO;

//interface : 추상메서드(바디가 없는 메서드), 상수,default메소드만 가질 수 있다.
public interface MemberDAO 
{
	//DB서버의 현재 닐짜와 시간을 얻어오는 메서드
	public String getTime() ;
	
	//default int countMember() {
	//	return 0;
	
	//newMember를insert하는 객체
	public int registerMember(MemberVO newMember);
	
	//userId로 회원 정보를 얻어오는 메서드
	public MemberVO selectMemberByUserId(String userId);
	
	//회원정보를 가져오는 메서드
	public List<MemberVO> selectAllMember();
	
	//회원의 전화번호를 변경할 수 있는 메서드
	public int updateMemberMobile(String userId, String mobile);
	
	//회원을 탈퇴하는 메서드
	public int removeMember(String userId);
}
