package List01;

public class Member {
	// 회원번호, 회원명 : 기본키(절대 중복x) : primary key:pk
	// ERD : Primary key- Foreign key
	private int memberID;
	private String memberName;

	public Member() {}

	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "회원아이디 : " + memberID + " | 회원이름 : " + memberName;
	}

}
