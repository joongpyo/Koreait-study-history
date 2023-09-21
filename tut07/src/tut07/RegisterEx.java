/*
 작성일자 : 23. 09. 20 #
 내  용 : 회원가입
 */
package tut07;

import java.util.Scanner;

public class RegisterEx {

	public static void main(String[] args) {
//		Register r = new Register();
//		Register r = new Register("mail@mail","1234","홍길동");

		//r.setEmail("mail@mail.com");
//		System.out.println(r.getEmail());
		
//		r.setEmail("koreait@mail.com");
//		System.out.println(r.getEmail());
		
		Scanner sc = new Scanner(System.in); //기본원리는 초기화
		
		System.out.print("가입할 회원 수 > ");
		int count = sc.nextInt();
		
		//Scanner를 이용해서 배열 생성 : 3
		//입력 Scanner
		//for
		Register[] r = new Register[count]; //객체 갯수, 초기화x
		System.out.println(r.length);
		
		//for입력
		for(int i = 0; i < r.length; ++i) {
			System.out.print("이메일 > ");
			String email = sc.next();
			
			System.out.print("비밀번호 > ");
			String passwd = sc.next();
			
			System.out.print("이름 > ");
			String uname = sc.next();
			
			r[i] = new Register(email, passwd, uname); //초기화, 값입력
			System.out.println((i+1) + "번째 회원이 등록 되었습니다." );
			System.out.println("");
			
		}
		System.out.println("회원가입이 완료 되었습니다.");
		
		System.out.println("");
		System.out.println("---------"+r.length+"명 회원 출력----------");
		
		
//		for(타입 별명 : 배열) {}
		for(Register reg : r) {
			System.out.println(reg.disp());
			System.out.println("-----------------------------");
		}
	}

	

}
