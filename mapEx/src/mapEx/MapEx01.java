/*
 작성일자 : 23. 09. 25. #
 내  용 : Map
 */
package mapEx;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {

	public static void main(String[] args) {
//		Map - HashMap
//		101 -> 서울
//		102 -> 부산
//		103 -> 대구
		
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "서울");
		map.put(102, "부산");
		map.put(103, "대구");
		
//		System.out.println(map.toString());
//		배열명.forEach((키별명, 값별명)->{
//			
//		} );
		map.forEach((k, v)->{
			System.out.println("키는 "+k+" ,값은 "+v);
		});
		
		System.out.println("------------------------");
		//map
//		userid01 -> 홍길동
//		userid02 -> 김찰스
//		userid03 -> 이영희
		
		HashMap<String, String>  map2 = new HashMap<String, String>();
		map2.put("userid01", "홍찰스");
		map2.put("userid02", "김길동");
		map2.put("userid03", "이홍찰");
		
		map2.put("userid03", "김김찰");
		
		map2.forEach((key, value)->{
			System.out.println("key는  "+key+",  value는 "+value);
		});
		
		System.out.println("---------------------------");
		
		//
		System.out.println(map2.containsValue("홍찰스"));
		
		System.out.println(map2.containsKey("userid01 "));
	}

}
