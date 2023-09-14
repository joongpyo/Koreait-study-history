/*
 작성일자 : 23. 09. 14. #
 내  용 : 반복문.
 */
package tut01;

class LoopEx3 {
	public static void main(String[] args) {
		//도끼로 나무를 100번까지 찍는 for문
		//도끼를 20번째 찍으면 "나무가 쓰러집니다" 라는 메시지 출력 후 프로그램 종료
		for(int hit = 1; hit <= 100; ++hit) {
			if(hit>20) {
				System.out.println("나무가 쓰러집니다");
				break;
			}
			System.out.print(hit + " ");
		}
		
		System.out.println("---------------------------");
		
		//while로 위와 같이.
		int hit = 1;
		while(hit <= 100) {
			if(hit>20) {
				System.out.println("나무가 쓰러집니다");//출력코드 밑 증감값
				break;
			}
			System.out.print(hit + " ");
			
			++hit;								//증감값
		}
	
	}

}
