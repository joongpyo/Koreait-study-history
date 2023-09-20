/*
 작성일자 : 23. 09. 20 #
 내  용 : 배열 1일차
 */
package tut06;

import java.util.*;

class Users { //객체 구성 요소
	//필드(멤버변수) : 공유 변수
	String userid;
	String passwd;
	int age;
	
	
	
	
	//생성자 : 객체 !초기화! -> public으로 시작, class이름과 동일, 리턴x
	public Users() {}
	
	
	public Users(String userid, String passwd, int age) {
		this.userid = userid;
		this.passwd = passwd;
		this.age = age;
	}

	//저장 setter, 출력 getter  캡슐화(데이터보호)
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	
	//메소드
	public void disp() {
		
	}

	@Override
	public String toString() {
		return "Users : userid=" + userid + ", passwd=" + passwd + ", age=" + age ;
	}

	
	
	
}

public class UserEx {

	public static void main(String[] args) {
		//3명의 회원(Users)을 생성자로 저장 후 출력하시오.
//		Users user = new Users; //1명 저장
		
		Users[] user = new Users[3]; //3명 저장
		//3명 -> 초기화 3번
		user[0] = new Users("koreait", "b", 10);
		user[1] = new Users("1", "2", 30);
		user[2] = new Users("4", "3", 13);
		
		for(int i = 0; i < 3; ++i ) {
			user[i] = new Users("아이디"+i,"비번"+i,(0+i));
			
			System.out.println(user[i].toString());
		}
		
		System.out.println("----------------------------------");
		
		for(int i = 0; i < 3; ++i) {
			//set 이용해서 저장
			
			user[i] = new Users();
			user[i].setUserid("busan");
			user[i].setPasswd("1234");
			user[i].setAge(12);
			
			
			System.out.println(user[i].toString());
		}
		
		
		
		
	}

}
