/*
 작성일자 : 23. 09. 27 
 내  용 : 추상화 
 */
package inher01Ex;

//이름 정하고 -> 내용은 상황에 맞게 고쳐 쓰기
//추상화, interface => 표준화

//운영체제 온, 오프

abstract class OSsystem {
	abstract void startOS();
	abstract void endOS();
		
	
}



abstract class Computer{

	abstract void powerOn();
	abstract void powerOff(); 

	void timeCheck() {
		System.out.println("시간이 흘러갑니다.");
	}
}

class IBM extends Computer  {

	@Override
	void powerOn() {
		System.out.println("IBM 컴퓨터 스타트...");
	}

	@Override
	void powerOff() {
		System.out.println("IBM 컴퓨터 종료...");
	}
	
}

public class AbsEx {

	public static void main(String[] args) {
		//인스턴트(new), 인스턴트화(객체 생성 동작)

	}
}