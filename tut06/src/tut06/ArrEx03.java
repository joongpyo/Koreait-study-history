/*
 작성일자 : 23. 09. 20 #
 내  용 : 배열 1일차 , Cal(계산 클래스), Display(화면출력 클래스)
 */
package tut06;

public class ArrEx03 {

	public static void main(String[] args) {
		//메소드를 이용하여 출력
		//정수에 5개 점수를 입력 후 
		//합계
		//평균
		
//		int[] scores = null;
//		scores = new int[] {1,2,3,4,5};

		//보낼때는 값(오른쪽), 받을때는 타입(왼쪽)
		int[] scores = new int[] {22,33,44,55,66,77,88};
		
		
		Cal c  = new Cal(); //생성자를 통해서 접근
		Display d = new Display();
		
		
		
		//c.sum();
		//c.avg();
		c.sum(scores);
		d.title("컴퓨터 프로그램");
		
		
		//c.sum(new int[] {1,2,3,4,5}); = c.sum(score);
		
		System.out.println("----------------");
		
		System.out.println(c.sum(scores));
		
		System.out.println("----------------");
		
		//배열 10개의 합은 100입니다.
		System.out.println("배열 "+scores.length+"개의 합은 "+c.sum(scores)+"입니다.");

		
		//평균 
		System.out.println("----------평균 출력-----------");
		//평균은 88.00입니다.
		c.avg(scores);
		System.out.println(String.format( ("평균은 %.2f입니다."),c.avg(scores) ) );
		
		System.out.println("----------------------------");
		
		System.out.println(d.close("시스템 종료"));
		
		
		
		
	}

}
