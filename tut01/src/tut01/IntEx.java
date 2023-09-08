package tut01;

public class IntEx {

	public static void main(String[] args) {
		//데이터타입 변수명 = 값;
		
				//1. 타입을 선언하고 나이를 20을 대입한 후 
				//2. 20보다 이상이면 성인, 아니면 미성년으로 표시하시오.
				
				int age = 20;
				//출력이 한 줄일때만
				if(age >= 20) {
					System.out.println("성인입니다.");
					
				}else {
					System.out.println("미성년입니다.");
				}
				
				//삼항 연산자
				//조건 ? "참일 때" : "거짓일 때";		
						
//				String result = (age >= 20) ? "성년" : "미성년";
//				System.out.println(result);
				
				
			
	}

}
