package som.webbing_mb.persistence;


//interface : 추상메서드(바디가 없는 메서드), 상수,default메소드만 가질 수 있다.
public interface MemberDAO 
{
	//DB서버의 현재 닐짜와 시간을 얻어오는 메서드
	public String getTime();
	
	default int countMember() {
		return 0;
		
	}
}
