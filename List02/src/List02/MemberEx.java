/*
 작성일자 : 23. 09. 25. #
 내  용 : List -> 회원가입
 */
package List02;

public class MemberEx {

	public static void main(String[] args) {
		//줄(dao) 만들고 ->  칸(Member)
		MemberDao md = new MemberDao();
		
		md.addMember(new Member("홍길동", "1111"));
		md.addMember(new Member("김철수", "2222"));
		
		md.deleteMember("김철수");
		
		md.ShowInfo();
		
		
	}

}
