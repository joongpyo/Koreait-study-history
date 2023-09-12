/*
 작성일자 : 23. 09. 12.
 내  용 : 비교연산자
 */
package tut01;

public class CompEx {
	public static void main(String[] args) {
		//1. 크기 비교 : >=, <=, >, <
		//결과는 true, false
		int num1 = 3;
		int num2 = 5;
		boolean res1 = (num1 <= num2);
		System.out.println(res1);
		
		
		//2. 등가비교 : ==, != 
		boolean res2 = (num1 == num2);
		System.out.println(res2);
		
		boolean res3 = (num1 != num2);
		System.out.println(res3); //!= : 같지 않다
		
		//3. 참조비교 : 메모리주소를 비교
		//new 키워드(자바에서 사용하는 문법)를 사용하면 다른 메모리에 저장.
		//문자열 : 참조타입으로 생성
		
		String s1 = new String("Hello"); //new 뒤에는 왼쪽에 타입과 동일하게 기입 
		String s2 = new String("Hello");
				
		//문자열 비교 equals()
		boolean res4 = s1.equals(s2);
		System.out.println(res4);

		//메모리 비교 ==
		boolean res5 = (s1 == s2);
		System.out.println(res5);
		
		
		
	}

}
