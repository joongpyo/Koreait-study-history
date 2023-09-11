/*
 작성일자 : 23. 09. 11 (월)
 */
package tut01;

public class PrintEX {
	public static void main(String[] args) {
		//정수 5와 8의 합을 출력하시오.
		//변수 선언, 초기화
		
//		int num1, num2; //선언
//		num1 = 5; //초기화
//		num2 = 8;
		
		//변수이름 첫글자는 소문자
		int num1 = 5; //선언과 초기화 동시에 진행
		int num2 = 8;
		
		// System.in 컴퓨터안으로 입력 , System.out 컴퓨터 밖으로
		
		// 결과값을 변수에 저장 후 출력
		
		int result = num1 + num2; 
		
		//System.out.println(num1 + num2);
		
		System.out.println(result);
		
		System.out.println("");//개행
		System.out.println("");
		System.out.println("");
		
		//byte(1) - int(4) -> float(4) -> double(8)
		//0,1 => 1byte = 8bit => 2*8 => 256
		//byte = 음수 (-128) , 0, 양수 ((+)127)
		//byte b = +128; (x)
		
		//byte : 메시지 전송, 이미지 처리
		
		System.out.println("--------------");
		
		//int 10억 넘어가면 오류
		//long
		
		//int money = 10000000000;(x)
		long money = 10000000000L; //뒤에 L붙여줘야함
		
		//float 8자리, double 15자리
		//PI는 값이 정해져 있는(고정되어 있는)값 - 상수 => 대문자
		float PI = 3.12345678F;
		System.out.println(PI);
		
		double POINT = 0.1;
		
		
	}

}
