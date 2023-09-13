/*
 작성일자 : 23. 09. 13. 
 내  용 : printf 활용
 */
package tut01;

public class VarEx {

	public static void main(String[] args) {
		// 정수(decimal) -> printf()로 출력
		int num = 100;
		
		//정수 값을 100입니다.
		System.out.println("정수 값은 " + num + "입니다.");
		
		System.out.printf("정수 값은 %d입니다.\n",num);
		
		System.out.println(String.format("정수 값은 %d입니다.",num) );
		
		//koreait 아카데미입니다.
		String str = "koreait";
		System.out.println(String.format("%s 아카데미입니다.",str));
		
		
		
		
		
	}

}
