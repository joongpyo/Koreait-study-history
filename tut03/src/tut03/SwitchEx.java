/*
 작성일자 : 23. 09. 18 #
 내  용 : switch
 */
package tut03;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		//대,소문자 값을 처리
		//char
		//A/a -> 골드 회원, B/b -> 실버 회원, 그외에는 Guest
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		char grade = sc.next().charAt(0);
		//문자, 문자열, 정수 -> 비교연산자 X
		switch(grade) {
		case 'A' :
		case 'a' :
			System.out.println("골드회원 입니다.");
			break;
		case 'B' :
		case 'b' :
			System.out.println("실버회원 입니다.");
			break;
			
			default : 
				System.out.println("Guest입니다.");
			
			
			
		}
	}

}
