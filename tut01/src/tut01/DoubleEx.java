/*
 1.프로그램명 :  주민번호의 8번째 숫자를 이용하여 남자 여자를 표시하시오
 2.작성일자 : 23. 09. 08
 3.내용 : double 활용, %활용해서 if else, 삼항 연산자
*/

package tut01;

public class DoubleEx {
	public static void main(String[] args) {
		//실수를 저장하는 변수 -> 값을 지정하지 않았을 때
		//값을 1.0으로 바꿀때
		
		//double d = 0.0;
		//System.out.println(d);
		
		//변수 선언은 기본적으로 overwrite(덮어쓰기)
		//d = 1.0;
		//System.out.println(d);
		
		//d2에 변수 하나를 추가하는데 값은 2.0   d와 d2를  더하기
		
//		double d = 1.0;
//		double d2 = 2.0;
		
		double d,d2;  //변수가 많을때 사용
		d = 1.23456;
		d2 = 2.23456;

		//쇼핑몰 -> 1.2 + 2.2 = 3.4 => 3 : 외국 돈 프로그램 처리
		
		// 실수 -> 정수로 타입 변환: 형변환 = (바꿀 타입)변수명
		
		//연산자 우선순위
		//특별히 지정하지 않으면 가까운 쪽에 것을 먼저 처리
		//()처리 우선순위가 제일 높음
		
		//순수한 숫자를 제외하면 + 연산자는 앞뒤를 연결할 때 사용
		System.out.println("합계 "+(int)(d+d2)+"달러");
		
		//------------------------------------------------------
		System.out.println("---------");
		
		//% : 몫이 아니고 나머지 

		//0012345-1234567 주민번호의 8번째 숫자를 이용하여 남자 여자를 표시하시오
		//단, %, if 사용해서 표시하시오
		
		//1이면 남자 2면 여자로 표시하시오.
		int jumin = 2;
		
		if(jumin % 2 == 1) 
			System.out.println("남자입니다.");
		else 
			System.out.println("여자입니다.");
		
		//(조건) ? "참일때" : "거짓일 때";
		
		String result = (jumin % 2 == 1) ? "남자" : "여자";
		
		System.out.println(result);
		
		
		
	    
		
		
		
		
	}

}
