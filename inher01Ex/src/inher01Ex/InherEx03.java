/*
 작성일자 : 23. 09. 27 
 내  용 : 상속 
 */
package inher01Ex;

public class InherEx03 {

	public static void main(String[] args) {
		// interface, abstract -> 객체 생성해서 사용x (new x)
		// 본체 ({} x)

		Std s = new Std();
		s.study();
		s.StdID = "A200100001";
		s.name = "홍찰찰";
		s.age = 20;
		System.out.println("학생번호: " + s.StdID);
		System.out.println("학생이름: " + s.name);
		System.out.println("학생나이: " + s.age);
		s.eat();
		s.sleep();

		System.out.println("------------------------");

		Emp e = new Emp();
		e.eat();
		e.work();
		e.empID = "100300001";
		e.name = "김찰홍";
		e.age = 409;
		System.out.println("사원번호: " + e.empID);
		System.out.println("사원이름: " + e.name);
		System.out.println("사원나이: " + e.age);
		e.eat();
		e.sleep();
	}

}
