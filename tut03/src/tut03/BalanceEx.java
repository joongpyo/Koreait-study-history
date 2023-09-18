/*
 작성일자 : 23. 09. 18 #
 내  용 : 은행 프로그램
 */
package tut03;

import java.util.Scanner;

public class BalanceEx {

	public static void main(String[] args) {
//		<출력예시>
//		System.out.println("-------------------------------------");
//		System.out.println("1. 예금 | 2. 출금 | 3. 확인 | 4. 종료");
//		System.out.println("-------------------------------------")
//		System.out.print("선택 > ");
//
//		Scanner로 메뉴선택
//		Scanner로 예금액, 출금액 처리
//
//		종료(4) 입력 전까지는 무한반복
//		예금(1) : 잔고 + 예금액
//		출금(2) : 잔고 - 출금액
//		잔고확인(3) : 잔고 
//		종료(4) : 프로그램 종료

		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		boolean run = true;
		while(run) {
		System.out.println("-------------------------------------");
		System.out.println("1. 예금 | 2. 출금 | 3. 잔고확인 | 4. 종료");
		System.out.println("-------------------------------------");
		System.out.print("선택 > ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 : 
			System.out.print("예금하실 금액을 입력하세요 > ");
			int addMon = sc.nextInt();
			System.out.println("");
			money = money += addMon;
			
			System.out.println("입금되었습니다.");
			System.out.println("");
			
			System.out.println(String.format("현재 통장 잔고는 %d원 입니다.", money));
			System.out.println("");
			break;
		
		case 2 : 
		
			System.out.print("출금하실 금액을 입력하세요 > ");
			System.out.println("");
			
			int outMon = sc.nextInt();
			if(money<outMon) {
				System.out.println("출금에 실패하셨습니다.");
				System.out.println("");
				System.out.println("출금하실 금액이 통장 잔고보다 부족합니다.");
				System.out.println("");
				System.out.println(String.format("현재 통장 잔고는 %d원  입니다.", money));
				
			}else {
			money = money -= outMon;
			System.out.println("출금이 완료되었습니다.");
			System.out.println("");
			System.out.println(String.format("현재 통장 잔고는 %d원 입니다.", money));
			System.out.println("");
			}
		
			break;
		
		case 3 :
			System.out.println(String.format("현재 통장 잔고는 %d원 입니다.",money));
			System.out.println("");
			break;
		
		case 4 : 
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
			
			default :
				System.out.println("잘못 입력하셨습니다. 초기화면으로 돌아갑니다");
				System.out.println("");
		}
		
		
		}
	
		
	}

}
