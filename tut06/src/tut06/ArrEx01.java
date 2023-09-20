/*
 작성일자 : 23. 09. 20 #
 내  용 : 배열 1일차
 */
package tut06;

public class ArrEx01 {

	public static void main(String[] args) {
		//배열은 반복문과 쓰임(for - 배열번호가 필요할 때, 향상된 for - 값만 출력할 때)
		//배열번호(index)는 0부터 시작
		//i, idx, index 변수이름이 보이면 배열처리
		
		//일반 for
//		for(int i = 0; i < 배열명.length; ++i){
//				출력코드( 배열명[i] );
//		}
		
		//향상된 for
//		for(출력타입 별명 : 배열명) {
//			출력코드(별명);
//		}
		
		//정수 100개에 값을 저장하는 프로그램을 완성하시오.
		//데이터타입[] 변수명 = new 데이터타입[];
		//int[] value = new int[100];	//4byte * 100공간이 생성 / 초기화x 빈공간 100개 생성
		
		//생성자 : 초기화
		//Member m = new Member();//초기화
		
		//int[] value = null; //참조타입이여서 null로 초기값;
		int[] value = new int[3]; // 초기화 아님, 공간만 생성 
		
		value[0] = 100; //초기화
		value[1] = 200; //초기화
		value[2] = 300; //초기화
		
		//배열 0 ~ 2번까지 출력하시오
		//배열명[index번호]
		//for
		
		//이렇게 할것을
//		System.out.println(value[0]);
//		System.out.println(value[1]);
//		System.out.println(value[2]);
		
		//이렇게 반복문을 쓴다
//		for(int i = 0; i < 3; ++i) {
//			System.out.println(value[i]);
//		}
		
		
		//value[0]의 값은 0입니다
		//1번 값은 100입니다.
		//2번 값은 200입니다.
		//3번 값은 300입니다.
//		for(int i = 0; i < 3; ++i) {
//			//System.out.println(value[i]);
//			//System.out.println("value["+i+"]의 값은 "+value[i]+"입니다.");
//			System.out.println((i+1)+"번 값은 "+value[i]+"입니다.");
//		}
//		System.out.println("-------------");
		
		//int[] num = {1,2,3,4,5};
		//초기값을 설정하면 배열 갯수가 생성
		
		//학생 3명 점수를 초기값으로 설정 후
		//화면에 출력하시오
		//합계를 출력하시오
		//평균를 출력하시오
		
		int[] jumsu = {88,77,66,55,44,100};
		
		//등록된 학생 수는 1000명입니다.
		System.out.println("등록된 학생 수는 "+jumsu.length+"명입니다.");
		
		System.out.println("=======화면출력========");
		for(int i = 0; i < jumsu.length ; ++i) {
			System.out.print(jumsu[i]+" ");
		}
		
		System.out.println("");
		
		System.out.println("=======합계출력========");
		//합계 : 누적(전역변수, static)
		
		int sum = 0;
		
		for(int i = 0; i < jumsu.length; ++i) {
			//System.out.println((i+1)+"번 점수는 "+jumsu[i]+"입니다.");
			sum = sum + jumsu[i];
			//System.out.println(sum);
		}
			System.out.println("합계는 "+sum+"입니다.");
			
			//평균
			//합계 / jumsu.length
			//System.out.println((double)sum/jumsu.length);
			double avg = (double)sum/jumsu.length;
			
			System.out.println(String.format("전체 학생의 평균은 %.2f입니다.",avg ));
			
			System.out.println("------------------------------------");
			
			//출력 포멧 변경 소수점 2자리로 설정
			//평균은 87.55입니다.
			System.out.println(String.format("평균은 %.2f입니다.",avg));
			System.out.printf("평균은 %.2f입니다.",avg);
			
			
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
