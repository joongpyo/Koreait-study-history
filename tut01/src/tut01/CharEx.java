package tut01;

public class CharEx {
	public static void main(String[] args) {
//		데이터 타입 변수명 = 값;
		char c = 'a';
		String str = "b";
		int ch = 'a';
		
		System.out.println(c);
		System.out.println(str);
		System.out.println( (char)(ch + 1) );
		 
		System.out.println("----------------");
		
		//회원가입 했을 때 저장된 아이디, 비밀번호
		String userid = "jp";
		String passwd = "12345";
		
		// 값이 같냐 다르냐 A.equals("B") A와 B와 값이 같으면
		//확인할 때 => if -> 맞으면 로그인되었습니다. 다시 로그인해 주세요

		
		//내가 지금 입력한 아이디, 비밀번호
		String userid2 = "seoul";
		String passwd2 = "67890";
		
//		userid.equals(userid2)
		
		if(userid.equals(userid2) ) { //맞는 값 //! userid userid2 같지 않으면 
			System.out.println("로그인 되었습니다.");
			

			else {
			System.out.println("가입된 회원이 아닙니다.\n회원가입해 주세요.");
		}
		
		System.out.println("----------------------");
		
			
		
		
	}

}
