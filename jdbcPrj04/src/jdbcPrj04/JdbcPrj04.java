/*
 작성일자 : 23. 10. 05. #
 내  용 : DB prepareStatement 활용
 */
package jdbcPrj04;

import java.sql.*;

class InsertDao{
	
	void selectDB() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//Class.forName()
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shop";
			String uid = "root";
			String passwd = "1234";
			
			//접속 정보
			conn = DriverManager.getConnection(url, uid, passwd);
			
			String sql = "SELECT * FROM items ORDER BY item_id DESC;";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print("상품번호는 " + rs.getInt(1)+", ");
				System.out.print("상품명은 " + rs.getString(2)+", ");
				System.out.print("상품가격은 " + rs.getInt(3)+"원");
				System.out.println("");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	void insertDB() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//Class.forName()
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shop";
			String uid = "root";
			String passwd = "1234";
			
			//접속 정보
			conn = DriverManager.getConnection(url, uid, passwd);
			
			String sql = "INSERT INTO items VALUES(NULL, ?, ?, ?, now());";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "키보드");
			pstmt.setInt(2, 100000000);
			pstmt.setInt(3, 1);
			
			int row = pstmt.executeUpdate();
			
			if(row > 0) {
//				System.out.println(row);
				System.out.println("상품등록이 완료되었습니다.");
			}else {
//				System.out.println(row);
				System.out.println("관리자에게 문의하세요.");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
	

public class JdbcPrj04 {


	public static void main(String[] args) {
		 InsertDao dao = new InsertDao();
//		 dao.insertDB();
		 
		 dao.selectDB();
	}

}
