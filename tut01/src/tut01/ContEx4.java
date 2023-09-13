/*
 작성일자 : 23. 09. 13. #
 내  용 : switch (13일 수업 종합 복습)
 */
package tut01;

import java.util.Scanner;

public class ContEx4 {

	public static void main(String[] args) {
		//임의의 정수를 입력 받아서 홀수, 짝수를 표시하시오.
		//입력은 문자로 입력 받아서 정수로 변환하여 사용하시오.
		//switch
		//입력 화면은 1이면 홀수, 짝수, 결과, 2 프로그램 종료
		
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("계산(1), 종료(1번 외) : ");
//		int choice = Integer.parseInt(sc.next());
//		
//		switch(choice) {
//		case 1 : 
//			System.out.println("홀수, 짝수 계산을 진행합니다.....");
//			
//			System.out.print("정수 입력: ");
//			int num = Integer.parseInt(sc.next()); //  sc.nextInt();도 사용가능
//			
//			String result = (num % 2 == 1) ? "홀수" : "짝수";
//			System.out.println(String.format("입력하신 정수는 %s 입니다.",result)); //printf로 사용가능
//			
//			break;
//
//		default :
//			System.out.println("프로그램을 종료합니다.");
//			System.exit(0);
//		
//		} 	

		//(C/c)계산,  (Q/q)종료 를  문자로 입력 받아서 홀수, 짝수를 표시하시오.
		//입력은 문자로 입력 받아서 정수로 변환하여 사용하시오.
		//switch
		//입력 화면은 C/c이면 홀수, 짝수, 결과, Q/q 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계산(C/c), 종료(Q/q) 입력 : ");
		
		String choice = sc.next();
		
		switch (choice) {
		
		case "C" :
		case "c" :
			System.out.println("홀수, 짝수 계산을 진행합니다...");
			
			System.out.print("정수 입력 : ");
			int num = Integer.parseInt(sc.next());
			String result = (num % 2 == 1)? "홀수" : "짝수";
			System.out.println(String.format("입력하신 정수는 %s 입니다.",result));
			break;
		
		case "Q" :
		case "q" : 
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		
			default:
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("프로그램을 다시 실행하여 계산(C/c) 혹은 종료(Q/q)를 입력하여 주십시오.");
		
		}
	}

}
