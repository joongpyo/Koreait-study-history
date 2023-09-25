/*
 작성일자 : 23. 09. 25. #
 내  용 : set -> 회원가입
 */
package setEx01;

public class SetEx04 {

	public static void main(String[] args) {
		
		RegisterDao dao = new RegisterDao();
		
		dao.addRegister(new Register(101, "김찰스", "1111"));
		dao.addRegister(new Register(102, "홍길순", "2222"));
		dao.addRegister(new Register(103, "이영희", "3333"));
		
		dao.ShowInfo();
		
		System.out.println("---------------------------");
		
		
		boolean result = dao.deleteRegister(101);

				if(result) 
					System.out.println("삭제 되었습니다");
				else 
					System.out.println("없는 회원번호 입니다.");
				
				
				
		dao.ShowInfo();
		
		
		
		
	}

}
