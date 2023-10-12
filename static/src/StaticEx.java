/*
 작성일자 : 23. 10. 10. #
 내  용 : static
 */
class Member {
	int price = 10000;
	static double tax = 0.1;
	
	void method() {
		System.out.println("인스턴스(new) 메소드");
	}
	
	static void staticMethod() {
		System.out.println("static 메소드");
	}
	
}

public class StaticEx {
	
	public static void main(String[] args) {
		//static -> new(인스턴스화)할 수 있지만 -> 클래스명.메소드명();으로 사용
		Member m = new Member();
		//인스턴스
		System.out.println(m.price);
		
		//인스턴스 x
		System.out.println(Member.tax);
		
		System.out.println("----------------------");
		
		m.method();
		Member.staticMethod();
	}

}
