package jdbcPrj02;


import java.sql.*;


public class JdbcPrj02Ex {

	public static void main(String[] args) {
		
		JdbcPrj02Ex jdbc = new JdbcPrj02Ex();
		jdbc.insertDB();
		
	}
	
	public void insertDB() {
		try{
			//데이터베이스 연결 성공시
			//1. Class.forName();
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. 연결객체
			//DriverManager.getConnection(url,id,passwd);
			
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String passwd = "1234";
			
			//정상적으로 연결 된다면 Connection 객체로 받아주기
			Connection conn = DriverManager.getConnection(url,id,passwd);
			//System.out.println("성공...");
			
			//conn : 데이터베이스에 연결되었음
			String sql = "insert into register values (103,'김치맨','3333');";
			
			
			
			
			//3. createStatement("INSERT INTO ...")
			
			//위 변수에 저장된 쿼리를 실행하는 createStatement() 객체 사용
			Statement stmt = conn.createStatement();
			
			//4.execute();
			
			stmt.execute(sql);
			System.out.println("회원가입이 완료되었습니다.");
			
		}catch(Exception ex) {
			System.out.println("데이터베이스 접속 실패...");

		}
	
	}
}
