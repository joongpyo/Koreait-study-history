/*
 작성일자 : 23. 09. 18 #
 내  용 : switch, random
 */
package tut03;

import java.util.Scanner;

public class SwitchRand {

	public static void main(String[] args) {
		//주사위 프로그램
		//dice
		//Scanner
		//1 ~ 6
		//외에 값이 들어오면 잘못 입력된 값입니다. 출력
		//(int)(Math.random()*마지막 값 ) + 시작값;
		int dice = (int)(Math.random()*6 ) + 1;
		
		switch(dice) {
		case 1 : 
			System.out.println(String.format("선택한 주사위 값은 %d입니다.",dice));
			break;
		case 2 : 
			System.out.println(String.format("선택한 주사위 값은 %d입니다.",dice));
			break;
		case 3 : 
			System.out.println(String.format("선택한 주사위 값은 %d입니다.",dice));
			break;
		case 4 : 
			System.out.println(String.format("선택한 주사위 값은 %d입니다.",dice));
			break;
		case 5 : 
			System.out.println(String.format("선택한 주사위 값은 %d입니다.",dice));
			break;
		case 6 : 
			System.out.println(String.format("선택한 주사위 값은 %d입니다.",dice));
			break;
			
		default :
			System.out.println("잘못된 값입니다.");
		}
		
	}

}
