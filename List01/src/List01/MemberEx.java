/*
 작성일자 : 23. 09. 22 #
 내  용 : List -> 회원가입
 */
package List01;

public class MemberEx {

	public static void main(String[] args) {
		Member m1 = new Member(1001,"홍길동");
		Member m2 = new Member(2001,"김철수");
		Member m3 = new Member(3001,"리영희");
		
		MemberDao dao = new MemberDao();
		dao.addMember(m1);
		dao.addMember(m2);
		dao.addMember(m3);
		
		
		dao.deleteMember(1001);
		
		System.out.println("회원 정보를 검색합니다...");
		System.out.println("검색할 회원 아이디를 입력하세요.");
		System.out.println("");
		
		dao.findById(3001);
		
		
//		dao.showMember();
		
	}

}
