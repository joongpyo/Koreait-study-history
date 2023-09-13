/*
 작성일자 : 23. 09. 13 #
 내  용 : Scanner 활용 2. (문자열 숫자로, 숫자 문자열로 변환.)
 */
package tut01;

import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
	    //1. 문자열 -> 숫자로
		//2. 숫자 -> 문자열
	    //3. Scanner -> 형변환
		
		
		//1. 문자열 -=> 숫자
		int add = 10;
		String age = "100";
		//System.out.println(add + age);
		
		//Integer.parseInt(변수명)
		int tmp = Integer.parseInt(age); 
		
		int total = add + tmp;
		
		System.out.println("변환하여 더한 나이는 "+ total +"입니다.");
		
		System.out.println("----------------");
		
		//2. 숫자 -> 문자열
		int num = 1000;
		int value = 1000;
		
		
		String s = String.valueOf(value); //String.valueOf(); 숫자를 문자열로 변환
		System.out.println(num + s );
		
		System.out.println("---------------");
		
		
		//3. Scanner -> 형변환
		
		//입력창 : Scanner 객체
		//입력내용 : 컴퓨터로 입력하는것은 System.in
		//.next(); -> 문자열
		//Integer.parseInt(); -> 문자열을 숫자로 변환
		//입력 메시지는 "정수를 입력하세요" 라고 변환
		
	
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 > ");
		//int input = Integer.parseInt(sc.next()); //문자열 -> 정수로 변환해서 입력
		//int input = sc.nextInt(); // 그냥 정수 입력
		
		//System.out.println(100+input);
		
		
		
		
	}

}
