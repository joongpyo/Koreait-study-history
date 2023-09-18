/*
 작성일자 : 23. 09. 18
 내  용 : 반복문
 */
package tut03;

public class LoopEx {

	public static void main(String[] args) {
		
		//임의의 정수값이 0인데 0과 대소를 비교할 때
		for(int i = 0; i < 0; ++i) {
			System.out.println();
		}
		int j;
		for(j = 0; j<0; ++j) {
			System.out.println(j);
		}
		
		System.out.println("--------------------");
		
		int i = 0;
		while(i<0) {
			System.out.println(i);
			++i;
		}
		
		System.out.println("--------------------");
		
		int k = 0;
		do {
			System.out.println("조건이 틀려도 한번은 출력됩니다.");
			k++;
		}
		while(k<0); {
			//System.out.println("");
		}
		
		
	}

}
