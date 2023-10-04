/*
 작성일자 : 23. 10. 04. #
 내  용 : DB 이클립스 연결
 */
package jdbcPrj01;

import java.sql.DriverManager;

public class JdbcPrj01Ex {

	public static void main(String[] args) {
		JdbcPrj01Ex jdbc = new JdbcPrj01Ex();
		jdbc.mysqlConnect();
	}

	void mysqlConnect() { //mysql 접속 동작
		try {
			//1. jdbc 연결 : Class.forName();
			// ver 5 : class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. 연결정보 : connection 
			//길어서 변수처리
			String url = "jdbc:mysql://localhost:3306/shop";
			String id = "root";
			String pwd = "1234";
			
			DriverManager.getConnection(url, id, pwd);
			
			//3. 확인
			System.out.println("데이터베이스 연결 완료");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
