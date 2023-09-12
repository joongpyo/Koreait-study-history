/*
 작성일자 :23. 09. 12.
 내  용 : toUpperCase, .split, printf 활용 
 */
package tut01;

class StringEx3 {
	public static void main(String[] args) {
		
		//배열 - 같은 타입을 이름 하나로 많은 데이터를 다루기 위해 필요. : 배열[] + for
		//객체 - 다른 타입을 다루기 위해서
		
		
		//--------------toUpperCase();------------ 
		
		//소문자 -> 대문자
		//값.toUpperCase();
		String title = "korea it academy";
		System.out.println(title.toUpperCase());
		
		System.out.println("-------------");
		
		
		
		//----------.split("문자"); //쪼개기------------
		
		String menus = "Home:Company:Contact:Help";
		//				s0     s1      s2
		
		//System.out.println(menus.split(":"));
		
		String[] s = menus.split(":"); 
		//    이름을 s로			  :로 쪼갬
		
		//    for를 사용해야하는 이유 - 하나하나 적어야하기 때문
		System.out.println(s[0]); //Home
		System.out.println(s[1]); //Company
		System.out.println(s[2]); //Contact
		System.out.println(s[3]); //Help

		//옛날 for
		for(int i = 0; i < s.length; ++i ) {
			System.out.println(s[i]);
		}
		
		System.out.println("---------------");
		
		//향상된 for
		for(String result : s) {          //for(데이터타입 별명 : 배열이름) {
			System.out.println(result);   //    출력코드
		}								  //}
		
		System.out.println(s.length);  //메뉴 갯수
		
		System.out.println("-------------");
		
		
		//------------printf -> format--------------
		
		// 정수 생성 후 초기값은 100
		//출력 : 생성된 변수의 초기값은 100 입니다.
		int num = 100;
		System.out.println("초기값"+num+"입니다.");
		//대신
		System.out.printf("생성된 변수의 초기값은 %d 입니다.",num);
		
		String str = "부산";
		
//		2진수 -> binary => 01010101
//		8진수 -> Oct  => 01 010 101
//		16진수 -> hex => 0101 0101 -> 0 ~ 9 , a(10) b(11), c d e f(15)
//		10진수 -> dec => 
		
		System.out.println("");
		System.out.printf("내가 사는 곳은 %s입니다.",str);
		
	}

}
