/*
 작성일자 : 23. 09. 19 #
 내  용 : 메서드 2일차
 */
package tut05;

class Const{
	
	public Const (String title) {
		System.out.println(title);
	}
	
	public Const (String title, String tel) {
		this(title);
		System.out.println(tel);
	}
	
	public Const(String title, String tel, String addr) {
		this(title,tel);
		System.out.println(addr);
	}
	
	public int add(int num1 ,int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public String close(String title) {
		return title;
	}
	
}

public class ConstEx {
	public static void main(String[] args) {
		//시작할 때..
		//=====코리아아이티 계산기 ver1.0===== - 생성자
		//정수 + 정수 = 정수 메소드
		//프로그램 종료 - 메소드
		
		Const cal = new Const("=====코리아아이티 계산기 ver1.0=====");
		
		System.out.println(cal.add(100,200));
		
		System.out.println(cal.close("프로그램 종료"));
		
		System.out.println("---------------------");
		
		//코리아아이티, 전화번호
		Const seoul = new Const("=====코리아아이티 계산기 ver1.0=====", "010-2222-3333");
		
		System.out.println("-----------------------------");
		
		//코리아아이티, 전화번호, addr
		Const gwanju = new Const("=====코리아아이티 계산기 ver1.0=====", "010-2222-3333", "팡주");
		
	}

}
