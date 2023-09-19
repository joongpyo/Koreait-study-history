/*
 작성일자 : 23. 09. 19 #
 내  용 : 메서드 2일차
 */
package tut05;

public class LoginEx {

	
	
	public static void main(String[] args) {
		
		Login web = new Login();
		web.userid = "id1";
		web.passwd = "pwd1";
		web.age = 10;
		
		System.out.println("아이디는 "+web.userid+"입니다.");
		System.out.println("비밀번호는 "+web.passwd+"입니다.");
		System.out.println("나이는 "+web.age+"입니다.");
		
		System.out.println("--------------------------");
		
		Login grb = new Login();
		grb.userid = "id2";
		grb.passwd = "pwd2";
		grb.age = 11;
		System.out.println("아이디는 "+grb.userid+"입니다.\t"
				+ "비밀번호는 "+grb.passwd+"입니다.\t"
						+ "나이는 "+grb.age+"입니다.");
	}

}
