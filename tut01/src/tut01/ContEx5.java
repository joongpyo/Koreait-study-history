/*
 작성일자 : 23. 09. 14.
 내  용 : switch문
 */
package tut01;

import java.util.Scanner;

public class ContEx5 {

	public static void main(String[] args) {
		/*
		정수를 입력 받아서
		3~5 계절은 봄입니다.
		6~8 계절은 여름입니다.
		9~11 가을입니다
		1,2,12 겨울입니다.
		나머지는 잘못된 값입니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다.");
			break;
			
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.");
			break;
			
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다.");
			break;
			
		case 1:
		case 12:
		case 13:
			System.out.println("겨울입니다.");
			break;
			
			
		default : 
			 System.out.println("잘못된 값입니다.");
		}
		
		
		
		
	}

}
