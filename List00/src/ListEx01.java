/*
 작성일자 : 23. 09. 22 #
 내  용 : List
 */
import java.util.*;

public class ListEx01 {

	public static void main(String[] args) {
		//List -> ArrayList, Vector
		//입력, 수정, 삭제 -> 데이터 변동이 잦은
		//정수를 출력하는 ArrayList

		List<Integer> aList = new ArrayList<>();
		aList.add(100);
		aList.add(200);
//		aList.add(100,200);

		int count = aList.size();
		
		System.out.println(count);
		
		System.out.println("for 1");
		for(int i = 0; i< count; ++i) {
			System.out.println(aList.get(i));
		}
		
		System.out.println("----------------");
		
		System.out.println("for 2");
		for(Integer num : aList) {
			System.out.println(num);
		}
		
		
	}

}
