/*
 작성일자 : 23. 09. 13.
 내  용 : 제어문(if)
 */
package tut01;

public class ContEx {
	public static void main(String[] args) {
		//if
		//비교연산자 > < => true, false
		int num1 = 3;
		int num2 = 5;
		
		//        if		else if	  else
		//사용자 Level 0(손님), 1(회원), 2(관리자)
		//출력하는 프로그램
		
		int level = 1;
		
		if(level == 0) {
			System.out.println("Guest로 로그인 하셨습니다.");
			System.out.println("관리자가 승인 후에 사이트 이용이 가능합니다.");
			
		}else if(level == 1) {
			System.out.println("회원으로 로그인 하셨습니다.");
			System.out.println("웹사이트 메인 페이지로 이동합니다.");
			
		}else {
			System.out.println("관리자로 로그인 하셨습니다.\n관리자 페이지로 이동합니다.");
		}
		
		
		
		
	}

}
