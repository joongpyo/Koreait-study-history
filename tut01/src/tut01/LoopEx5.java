/*
 작성일자 : 23. 09. 14. #
 내  용 : 무한루프
 */
package tut01;

import java.util.Scanner;

public class LoopEx5 {
	public static void main(String[] args) {
		//q 누르기 전 프로그램은 계속 실행(무한 루프)
		//q 누르면 프로그램 종료
		//ui : a 입력하면 더하기, q 입력하면 종료
		//a를 누르면 두 정수를 입력 받아 더하기 한 후 출력
	
		Scanner sc = new Scanner(System.in);
	
		boolean run = true;
		while(run) {
			//무한루프 => sc.next() 만나면 입력대기(멈춤)			
			System.out.println("=========================");
			System.out.println("1. 더하기(a) | 2. 종료(a 제외)");
			System.out.println("=========================");
			System.out.print("작업 내용 입력 > ");
			
			String choice = sc.next();
			System.out.println(choice);
			System.out.println("");
			
			switch(choice) {
			case "a":
				System.out.print("첫 번째 정수를 입력 > ");
				int num1 = sc.nextInt();
				
				System.out.print("두 번째 정수를 입력 > ");
				int num2 = sc.nextInt();
				
				int result = num1 + num2;
			
				System.out.println("결과를 출력합니다.");
				System.out.println("두 수의 합은 "+result+" 입니다.");
				
				
				System.out.println("");
				break;
			
			case "q" :
					System.out.println("프로그램을 종료합니다.");
					System.exit(0); //무한루프를 종료하고 프로그램 빠져나가기
					break;
					
					default : {
						 System.out.println("잘못 입력하셨습니다.");
						 
						 System.out.println("");
						 
					}
			}
		}
	
	
	
	}

}
