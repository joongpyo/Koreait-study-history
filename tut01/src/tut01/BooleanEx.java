package tut01;

public class BooleanEx {

	public static void main(String[] args) {
		//컴퓨터는 0, 1 => false(거짓) 0
				    //=> true(참) 0을 제외한 양수는 참
		
		//기본타입의 초기값 설정      //int i;(x) 비워두면 메모리에 문제가 생김
//		int i = 0;
//		double b = 0.0;
//		boolean b = false;
//		String str = "";
		
		boolean b = true; //boolean은 if (b == true) : 오류는 안나지만 굳이 x
		
		
		
		//참이면 통과, 아니면 재평가
		
		//equals() : String 값
		//그 외 값을 비교할 때는 ==
//		if(b) 
//			System.out.println("통과");
//		else 
//			System.out.println("재평가");

		//조건 ? "참일 때" : "거짓일 때";
	
		String s = (b) ? "통과" : "재평가";
		System.out.println(s);
		
		
		System.out.println("----------------");
		
		//조건이 참이면 1.0 아니면 0.0으로 출력하시오.
		double d = (b) ? 1.0 : 0.0;
		System.out.println(d);
		
		System.out.println("----------------");
		
		//조건이 참이면 true 아니면 false으로 출력하시오.
		boolean b1 = (b) ? true : false;
		
		System.out.println(b1);
	
		
	}
	

}
