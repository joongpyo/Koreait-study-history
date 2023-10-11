/*
 작성일자 : 23. 10. 11. #
 내  용 : singleton
 */
package singleton;

class SingletonTest{
	private static SingletonTest st = new SingletonTest();
	
	public SingletonTest() {} //db 커넥션 연결 되었다고 가정
	
	public static SingletonTest getInstance() { //instance 연결
		return st;
	}
	
	//공유해서 사용할 메소드--------------------------------
	
}


public class SingletonEx01 {

	public static void main(String[] args) {
		//생성자를 호출하면 호출하는 갯수 객체
		SingletonTest st1 = SingletonTest.getInstance();
		SingletonTest st2 = SingletonTest.getInstance();
		System.out.println(st1 == st2);
		
		
	}

}
