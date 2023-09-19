package tut05;

public class Login2Ex {
	
	public static void main(String[] args) {
		//생성자 실행하는 순간에 필드에 있는 시간 
		Login2 l = new Login2();
		
		l.setEmail("tlswndvy");
		l.setPasswd("12345");
		
		System.out.println("-----------getter 출력-------------");
		System.out.println(l.getEmail());
		System.out.println(l.getPasswd());
		System.out.println(l.getNow());
		
		System.out.println("-----------메소드 출력--------------");
		
		System.out.println(l.toString());
	}

}
