/*
 작성일자 : 23. 09. 13. #
 내  용: 논리연산자 + 제어문(Scanner, 코드 줄이는 법,String.format 활용)
 */
package tut01;

import java.util.Scanner;

public class ContEx2 {

	public static void main(String[] args) {
		/*
		학점 91 ~ 100 A등급   
		81 ~ 90 B등급
		71 ~ 80 C등급
		나머지는 F등급으로 표시하시오
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력(숫자:0~100): ");
		//값을 입력 받을 수 있게 sc.next();
		//int jumsu = Integer.parseInt(sc.next()); //문자열 숫자로 바꿔주는 코드
		
		double jumsu = sc.nextDouble();
		
		String str = "";
		if(jumsu >= 91 && jumsu <= 100 ) {
			str = "A등급";
			
		}else if(jumsu >= 81 && jumsu <= 90 ) {
			str = "B등급";
			
		}else if(jumsu >= 71 && jumsu <= 80 ) {
			str = "C등급";
			
		}else {
			str = "F등급";
		}
		System.out.println(String.format(("당신의 점수는 %s입니다."),str));
	
	
	
	}

}
