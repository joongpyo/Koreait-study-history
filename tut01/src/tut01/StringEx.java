/*
 작성일자 : 23. 09. 12.
 */
package tut01;

public class StringEx {
	public static void main(String[] args) {
		//기본타입 Koreait 문자열 저장
		//객체타입 Koreait 문자열 저장
		//비교하는 예제
		
		String str = "koreait"; //stack메모리에 저장
		String str2 = new String("koreait"); //heap메모리에 저장
		
		//비교 A.equals(b) 값 비교 //메소드여서 ()필요
		if(str.equals(str2)) {
			System.out.println("저장 위치는 다르지만 값은 동일합니다.");
		}
		
		//문자열비교 == 메모리 주소값 비교
		//비교연산자(>,< 결과 : true, false)
		
		System.out.println(str == str2);//메모리 주소가 각각 stack, heap에 있어 메모리 주소가 다르기 때문에 false.
		boolean result = str == str2;
		if(result)
			System.out.println("메모리가 동일합니다.");
		
		else
			System.out.println("메모리 위치가 다릅니다.");
		//** 문자열을 제외하면 비교는 == 사용하면 됨
		
		int num1 = 1;
		int num2 = 2; 
		
		boolean res = (num1 == num2);
		System.out.println(res);
		
		
	}

}
