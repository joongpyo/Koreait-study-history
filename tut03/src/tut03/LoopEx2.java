/*
 작성일자 : 23. 09. 18
 내  용 : 반복문
 */
package tut03;

public class LoopEx2 {

	public static void main(String[] args) {
		//값을 누적을 할 때에는 전역변수(중괄호 위로 빼는 것), static
		//1 ~ 100 : 1,2,3,4,5,6 ..
		
		int sum = 0; // 실질적인 값은 여기 저장됨
		for ( int i = 1; i < 100; ++i) {
			//int sum = 0; // 실질적인 값은 여기 저장됨
			sum += i; //sum = sum + i;
			// System.out.println(sum); //값을 저장한 sum을 출력 , //for문 안에 있어 1~100까지 전부 출력
		}
			System.out.println(sum); // i는 for문안에 있어 오류가 남
	} 
	

}
