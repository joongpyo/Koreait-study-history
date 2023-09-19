/*
 작성일자 : 23. 09. 19 #
 내  용 : 메서드 2일차
 */
package tut05;

class Register{
	//필드 : 캡슐화
	private String userid;
	private String passwd;
	private int point;
	
	//생성자
	


	public Register(String userid, String passwd, int point) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.point = point;
	}
	
	
	
	//메소드
	public void disp() {
		System.out.println("아이디"+this.userid+", 비밀번호"+this.passwd+", 포인트"+this.point);
		
	}



	@Override
	public String toString() {
		return "Register [userid=" + userid + ", passwd=" + passwd + ", point=" + point + "]";
	}


}


public class RegisterEx {

	public static void main(String[] args) {
		//회원가입 프로그램 : 객체 = 회원 1명 정보
		//아이디(String), 비밀번호(String), 포인트(int)를 저장하고 출력하는 프로그램

		Register p1 = new Register("korea", "1234", 1000);
		p1.disp();
		
	}

}
