package inher01Ex;

public class InherEx04 {

	public static void main(String[] args) {
		//생성자를 이용해서 모델, 색상을 저장 후 출력
		Phone p = new Phone("롤리팝", "Black");
		p.turnOn();
		p.disp();
		p.turnOff();
		
		System.out.println("--------------------------");
		//Android
		//model, color, company -> 생성자
		
		Android a = new Android("Galaxy","silver","SAMSUNG");
		a.turnOn();
		a.disp();
		a.turnOff();

				
		
		
		
		
	}

}
