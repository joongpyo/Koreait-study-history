/*
 작성일자 : 23. 09. 13.
 내  용 : Scanner 활용 
 */
package tut01;

import java.util.Scanner; //Ctr + Shift + o

public class ScannerEX {
	public static void main(String[] args) {
		//Scanner(객체) : 값을 입력 받아서 처리 + System.in 과 같이 사용
		//객체 초기화(생성자 초기화) : new를 사용
		//문자열 입력 받아서 printf()로 화면에 출력
		
		//객체타입 객체명 = new ();
		Scanner sc = new Scanner(System.in);
		
		//단순 화면 표시 역할
		System.out.print("출력할 문자열 입력 >> ");
		String str = sc.next();
		System.out.println("입력한 문자열 : " + str);
		
		//출력할 문자열은 코리아아이티입니다.
		System.out.println (String.format("출력할 문자열은 %s입니다.",str));
		
	}

}
