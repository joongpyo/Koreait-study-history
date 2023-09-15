/*
 작성일자 : 23. 09. 15. #
 내  용 : 반복문
 */
package tut02;

public class LoopEx {
	public static void main(String[] args) {
		//for (초기값; 조건; 증감값;){
		//출력코드
		//{
		
		//0부터 10까지 출력하는 반복문을 완성하시오. for
		for(int i = 0; i <= 10; ++i) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		//for >> while
				int i = 1;
				while(i <= 20) {
					System.out.print(i+ " ");
					++i;
				}
		
		System.out.println("");
				
		//1부터 20까지 출력하는 for
		for(int j = 1; j <= 20; j++) {
			System.out.print(j + " " );
		}
		
		System.out.println("");
		
		//0 ~ 10까지 출력하는 for
		//짝수만 출력하세요
		//건너뛸때는 continue;
		for(int j =0; j <= 10; ++j) {
			if(j % 2 == 1) {
				continue;
			}
			System.out.print(j+ " " );
		}
		
		System.out.println("");
		
		int j = 0;
		while(j < 10) {
			
			if(j % 2 == 1) {
				continue;
			}
			
			System.out.print(j + " ");
			j++;
			
			}
			
			
			
		}
		
	}


