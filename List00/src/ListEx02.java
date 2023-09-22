/*
 작성일자 : 23. 09. 22 #
 내  용 : List
 */

import java.util.ArrayList;
import java.util.List;

public class ListEx02 {

	public static void main(String[] args) {
		//정수 타입 입력 후 -> 삭제 -> 출력(for 1)
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		
//		index 0   1   2		
//		list<100,200,300>
		
		list.remove(1);
		
		for(int i = 0; i < list.size(); ++i) {
		System.out.println(list.get(i));
	}

		System.out.println("---------------");
		
		//문자열 입력, 삭제, 출력
		List<String> aList = new ArrayList<>();
		
		aList.add("#f00");//red, - HTML
		aList.add("#0f0"); //green - HTML
		aList.add("#00f"); // blue - HTML
		
		aList.remove(1);
		aList.remove("#f00");
		
		for(int i = 0; i<aList.size(); ++i) {
			System.out.println(aList.get(i));
		}
	}
}

