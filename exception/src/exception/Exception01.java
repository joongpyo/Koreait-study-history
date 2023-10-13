package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception01 {

	public static void main(String[] args) throws Exception {
		/*
		- Exception : 컴파일
  			1. classNotFoundE~ : Class.forName(디비);
  			2. IOE~ : 입출력
  			3. FileNotFoundE : 파일이 없는 경우
  			4. InterruptException : 쓰레드
  			5. CloneNotSupportEx~ : clone 객체 사용할 때
		 */
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); //예외가 발생한 부분 표시 : 개발자가 사용
			e.getMessage(); //: 예외 메시지
			System.out.println("404 Error : 관리자에게 문의하세요.");
		
		}finally {//성공, 실패 여부 상관없이 마지막에 꼭 실행해야 하는 내용
			//rs.close();
		}
		
		
		System.out.println("-----------------------------------------------------");
		
		
		try {
			FileInputStream fis = new FileInputStream("./koreait.txt");
			fis.read();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			e.getMessage();
			System.out.println("404 Error : 관리자에게 문의하세요.");
		}
		finally {
			System.out.println("종료합니다.");
		}
		
		
		System.out.println("------------------------------------------------------");
		
		/*
		 Runtime Exception : 실행 단위
		 - ArimetricEx~: 나누기 예외
		 - ArrayIndexOutBoundE~
		 - NullPointEx~
		 */
		
		try {
			System.out.println(10/0);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			ae.getMessage();
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
	
		System.out.println("------------------------------------------------------");
		
		
		
		String[] str = new String[] {"a", "b", "c"};
		
		try {
			System.out.println(str[3]);
		}catch(ArrayIndexOutOfBoundsException aiobe){
			aiobe.printStackTrace();
			System.out.println("인덱스번호 예욍");
		}
		
	
		System.out.println("------------------------------------------------------");
		
		
		String str1 = "koreait";
		//글자 추출 후 char로 변경 후 출력
		System.out.println(str1.charAt(0));
		
		String str2 = null;
		
		try {
			System.out.println(str2.charAt(0));
		}catch(NullPointerException npe) {
			npe.printStackTrace();
			npe.getMessage();
			System.out.println("데이터 값이 없습니다.");
		}
		
		
		
	
	
	
	
	
	}

}
