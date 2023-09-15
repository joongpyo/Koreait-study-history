/*
 작성일자 : 23. 09. 15. 
 내  용 : 변수 선언
 */
package tut02;

public class Var {
	public static void main(String[] args) {
		//변수 : 값을 메모리에 저장하는 동작
		//ex) 저장할 값의 타입 변수명 = 초기값;
			//저장할값의 타입 변수명;
			//변수명 = 초기값;
		
		//기본형 타입 : 소문자로 시작
		//int(정수), double(실수)
		//boolean(논리형 - 1byte) : true, false만 가능
		//정수 100을 저장하는 변수를 생성하시오. 
		int i;  //메모리에 4byte 정수를 저장할 수 있는 공간이 생성.
		i = 100; //메모리에 처음(초기화)
		
		int i2 =100;
		
		//실수 : float, double
		//0.1, 0.2를 저장하는 변수 생성
		float f = 0.1F;  
		double d = 0.2;
		
		//1000000000를 변수에 저장하시오.
		//long(정수 타입 8byte) 큰 수
		long l = 1000000000L;
		
		//논리형 true(1), false(0)
		boolean b = false;
		
		//문자(char)
		//대문자 A 값을 저장하시오.
		char c = 'A';
		String s = "Aasdf김치";
		
		//참조형 타입: 대문자로 시작(단, 고정배열은 소문자로 시작)
		//Integer(정수형객체), Double(실수형 객체), 객체, 배열...

		//저장할 객체 타입 변수명 = new 저장할객체타입();
		//100 -> 객체형 정수
		 
		Integer num = new Integer(100);
		//문자열 저장 코리아
		String str = new String("코리아");
		
		//0.1  객체로 저장히시오.
		
		Double avg = new Double(0.1);
		
		//학생 점수(정수) 10개 저장하시오. => 배열
		int[] scores = new int[10];  
	
	}

}
