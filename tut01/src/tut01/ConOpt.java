/*
 작성일자 : 23. 09. 12
 내  용 : 삼항연산자,(if)
 */
package tut01;

public class ConOpt {
	public static void main(String[] args) {
		//삼항연산자
		//정수 두 개를 비교하여 크면 1, 작으면 0을 출력하시오.
		//타입변수 = (조건) ? "참일 때" : "거짓일 때";
		int num1 = 3;
		int num2 = 5;
		
		int result = (num1 > num2) ? 1 : 0; 
		System.out.println(result);
		
		//임의의 정수를 생성 후 1이면 홀수 0이면 짝수를 출력하시오.
		//타입변수 = (조건) ? "참일 때" : "거짓일 때";
		int num3 = 15;
		
		String res = (num3 % 2 == 1) ? "홀수" : "짝수";
		System.out.println(res);

		String msg = ""; //*해보기
		if ((num3 % 2 == 1)) {
			msg = "홀수";
		}else {
			msg = "짝수";
		}
		System.out.println(msg);
	}		
		
}
