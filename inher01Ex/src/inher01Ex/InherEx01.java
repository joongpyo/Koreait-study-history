/*
 작성일자 : 23. 09. 27 
 내  용 : 상속 
 */
package inher01Ex;

class Add{
	String title = "계산기 프로그램";
	
	void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//정수 + 정수 = 정수
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
}

class Desktop extends Add{
	void Os() {
		System.out.println("Windows Ver. 11");
	}
	
}

class Laptop extends Add{
	void Os() {
		System.out.println("IOS Ver. 1");
	}
}

public class InherEx01 {

	public static void main(String[] args) {
		//객체 => 상속 =>프로그램 확장(회원가입-> 게시판 -> 다중게시판 -> 일정...)
		/*C++ -> 다중상속 -> 상속(java) : 강제x -> 인터페이스(다중) : 강제성
							강제성 abstract
									extends		| 		implements
		*/
		
		Desktop d = new Desktop();
		
		System.out.println("데스크탑 컴퓨터");
		d.turnOn();
		d.Os();
		System.out.println(d.title);
		System.out.println(d.add(100, 200));
		d.turnOff();
		
		System.out.println("--------------------");
		
		Laptop l = new Laptop();
		
		System.out.println("노트북");
		l.turnOn();
		l.Os();
		System.out.println(l.title);
		System.out.println(l.add(1,4));
		l.turnOff();
		
		
	}

}
