/*
 작성일자 :23. 09. 12.
 내  용 : if, 삼항연산자를 활용한 로그인 프로그램
 */
package tut01;

public class Tut01Ex {
	public static void main(String[] args) {
		//아이디와 비밀번호가 모두 일치하면 "마이페이지로 이동합니다."
		//일치하지 않으면 "회원정보를 확인하세요."
		//회원가입 정보(아이디,비번) = 로그인 정보(아이디,비번) 
		//database 값을 정하는 변수 이름은 단어와 단어가 이어질 때 _
		
		//회원가입정보(db) : 저장
		String db_userid = "koreait"; 
		String db_passwd = "12345";
		int point = 1000;
		
		//로그인정보(db) : 입력
		String userid = "koreait";
		String passwd = "1235";
	
		
		 
		if(db_userid.equals(userid) && db_passwd.equals(passwd)) {
			System.out.println(db_userid+"회원님 안녕하세요.\n마이페이지로 이동합니다.");
			System.out.println((point += 100)+"점" ); //point = point + 100;
		}
		else {
			System.out.println("로그인 정보를 확인하세요.\n회원가입 페이지로 이동합니다.");
			System.out.println("보유한 포인트"+point+"점");
		}
		

		//타입 변수 = () ? "참" : "거짓";
		//String login = (db_userid.equals(userid) && db_passwd.equals(passwd)) ? "성공" : "실패";
		//System.out.println(login);
		
		
	}

}
