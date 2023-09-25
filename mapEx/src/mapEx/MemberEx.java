/*
 작성일자 : 23. 09. 25. #
 내  용 : Map
 */
package mapEx;

class MemberEx {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		
//		Map 순서가 없고 key로 접근이 가능(반복x)
		
//		순서 배열명.get(i)
//		List : 줄 + Member 칸 => 
//		홍길동, 1234 => List<Member>
//		홍길동, 1234 => List<Member>
//		홍길동, 1234 => List<Member>
		
		dao.putMember("u1", new Member("홍찰찰","1234"));
		dao.putMember("u2", new Member("김찰홍","0000"));
		dao.putMember("u3", new Member("이영희","3333"));
	
		dao.showInfo();
		
		System.out.println("--------------------------");
		
		boolean result = dao.deleteMember("u1");
		if(result) {
			System.out.println("삭제 되었씁니당");
		}
		else {
			System.out.println("존재하지 않는 key입니다.");
		}
		
		
		dao.showInfo();
		
		
	}
}
