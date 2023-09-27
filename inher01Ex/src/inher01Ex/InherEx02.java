/*
 작성일자 : 23. 09. 27 
 내  용 : 상속 
 */
package inher01Ex;

class Cals {
	//더하기, 빼기
	int plus(int num1, int num2) {
		return num1 + num2;
	}
	
	int sub(int num1, int num2) {
		return num1 - num2;
	}
	
}

class AdvCals extends Cals{
	
	int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	int div(int num1, int num2) {
		return num1 / num2;
	}
}

public class InherEx02 {

	public static void main(String[] args) {
		Cals cal = new Cals();
		System.out.println(cal.plus(4, 2));
		System.out.println(cal.sub(4, 2));
		
		System.out.println("----------------------");
		
		AdvCals ac = new AdvCals();
		
		System.out.println(ac.plus(4, 2));
		System.out.println(ac.sub(4, 2));
		System.out.println(ac.mul(4, 2));
		System.out.println(ac.div(4, 2));
		
	}

}
