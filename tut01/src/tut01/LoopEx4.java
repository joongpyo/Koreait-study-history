/*
 작성일자 : 23. 09. 14. 
 내  용 : 무한루프
 */
package tut01;
public class LoopEx4 {

	public static void main(String[] args) {
		//while을 이용한 무한루프
		boolean run =  true;
		
		int i = 0;
		while(run) {
			System.out.println(++i);
		}
			
		
		
	}

}
