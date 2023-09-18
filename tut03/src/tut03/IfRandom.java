/*
 작성일자 : 23. 09. 18. #
 내  용 : random 
 */
package tut03;

import java.util.Scanner;

public class IfRandom {

	public static void main(String[] args) {
		//가위(1) 바위(2) 보(3)
		//me, com 변수 
		//나와 컴퓨터를 비교해서 일치하지 않으면 이겼습니다. 일치하면 졌습니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 선택 > ");

		
		//System.out.println( Math.random());
		
		/*사용
			(int)(Math.random()* 마지막값) + 시작값
		*/
		
		//System.out.println((int)(Math.random()* 3) + 1);
		int com = ((int)(Math.random()* 3) + 1);
		
		boolean run = true;
		while(run) {
		
			 int me = sc.nextInt();	
		if(me != com) {
			System.out.println("컴퓨터는 "+com+", 나는 "+me+"입니다.");
			System.out.println("컴퓨터 승");
			System.out.println("프로그램을 종료합니다.");
			
		}else {
			System.out.println("컴퓨터는 "+com+", 나는 "+me+"입니다.");
			System.out.println("내가 이겼습니다.");
			System.out.println("프로그램을 종료합니다.");
		}
		
		}
		
	}

}
