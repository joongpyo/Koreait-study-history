/*
 작성일자 : 23. 10. 05. #
 내  용 : DB 2일차
 */
package jdbcPrj03;

import java.sql.*;

//동작을 별도 클래스 작업
class DBDao{
	void insertDB() throws ClassNotFoundException, SQLException { // i/o 입출력의 기본은 try catch 
		//1. 연결 - connection 객체
		//2. 쿼리실행 : insert, update, delete, select 동작.. Statement, prepareStatement 
		//(3. 결과 출력 : ResultSet)
		Connection conn = null;
		Statement stmt = null; //연결객체.state
		
		//Class.forName()
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/grp";
		String uid = "root";
		String passwd = "1234";
		
		//접속 정보
		conn = DriverManager.getConnection(url, uid, passwd);
		stmt = conn.createStatement(); //쿼리 실행하기 위한 사전 작업
		
		
		
		//쿼리 실행
		String sql = "insert into member values(null, '콩나물', now(), now());";
		stmt.execute(sql); //쿼리
		System.out.println("insert completed...");
		
		
	}
	
	
}

public class JdbcPrj03 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DBDao db = new DBDao();
		db.insertDB();
	}

}
