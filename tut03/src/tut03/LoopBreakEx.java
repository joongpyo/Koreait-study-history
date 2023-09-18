/*
 작성일자 : 23. 09. 18 
 내  용 : 반복문, break
 */
package tut03;

public class LoopBreakEx {

	public static void main(String[] args) {
		//break
		//0 ~ 10까지 출력하시오.
		//단 조건 7까지만 출력하시오.
		for(int i = 0; i <= 10; ++i) {
			if(i>7) { 
			break; // 가장 가까운 반복문 빠져나가기
			}
			
			System.out.println(i);	
		}
			System.out.println("-----------");
			
			//1~20까지 홀수만 출력하시오
		for(int i = 0; i <= 20; i++) {
			if(i % 2 != 0) {
				continue; // 가장 가까운 반복문 건너뛰기
			}
			System.out.println(i);
		}
		
	}

}
