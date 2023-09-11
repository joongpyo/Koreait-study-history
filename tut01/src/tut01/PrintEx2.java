/*
 작성일자: 23. 09. 11
 */
package tut01;

public class PrintEx2 {

	public static void main(String[] args) {
		//char : 문자, '', 2byte, ASCII, 숫자로 변환 가능 - 타입캐스팅(형변환) : ()
		char c = 'k';
		System.out.println(c);
		System.out.println((int)c); //형변환
		System.out.println((char)97);
		
		//boolean : true, false(따옴표 사용하면 x) => 주로 if와 사용
		boolean b = false;
		
		//true면 통과, false면 실패
		//if와 사용
		//문자열은 값이 같다는 .equals() 외에는 같다는 ==를 사용
		
		if(b == false ) {
			System.out.println("실패");
			
		}else {
			System.out.println("성공");
		}
		System.out.println("---------------");
		
		boolean run = true;
		
		if(!run) { //!(뒤집기)
			System.out.println("실패");
		}else {
			System.out.println("성공");
		}
		
		char grade = (!run) ? 'A' : 'F';
		System.out.println(grade);
	}
	

}
