/*
 작성일자 : 23. 09. 25. #
 내  용 : set 
 */
package setEx01;

import java.util.HashSet;
import java.util.Set;

public class SetEX01 {

	public static void main(String[] args) {
		//HashSet 정수 저장
		//HashSet 문자열 저장
		//삭제, 출력
		Set<Integer> set = new HashSet<>();
		set.add(100);	
		set.add(200);	
		set.add(300);
		//값을 배열 형태로
		
		System.out.println(set.toString());
		System.out.println(set.size());
		
		System.out.println("-----------------");
		
				
		HashSet<String> hm = new HashSet<>();
		
		hm.add("seoul");
		hm.add("busan");
		hm.add("seoul");
		System.out.println(hm.toString());
		System.out.println(hm.size());
		
		//hm.remove(0); //배열 0번
		hm.remove("seoul");
		
		for(String str : hm) {
			System.out.println(str);
		}
		
		System.out.println("-----------------");
		
		//검색 배열명.contains(검색어)
		Set<String> set2 = new HashSet<>();
		set2.add("Red");
		set2.add("Green");
		set2.add("Blue");
		
		System.out.println(set2.contains("Blue"));		
		
		System.out.println("-----------------");
		
		set2.remove("Green");
		System.out.println(set2.size());
		
		
		set2.removeAll(set2);
		System.out.println(set2.size());
		
	}

}
