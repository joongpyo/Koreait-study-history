/*
 작성일자 : 23. 10. 05. #
 내  용 : DB 삭제
 */
package jdbcPrj03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class UpdateDao{
	
	void updateDB() {
		try {
			Connection conn = null;
			Statement stmt = null; //연결객체.state
			
			//Class.forName()
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/grp";
			String uid = "root";
			String passwd = "1234";
			
			//접속 정보
			conn = DriverManager.getConnection(url, uid, passwd);
			
			String sql = "UPDATE member SET com_name = '동길홍' WHERE com_id = 2;";
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			
			if(result > 0) {
				System.out.println("회원정보가 수정되었습니다."); 
			}else {
				System.out.println("관리자에게 문의하세요.");
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("연결 실패");
		}
	}
	
}

class DeleteDao{
	 
	void DeleteDB() {
		try {
			Connection conn = null;
			Statement stmt = null; //연결객체.state
			
			//Class.forName()
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/grp";
			String uid = "root";
			String passwd = "1234";
			
			//접속 정보
			conn = DriverManager.getConnection(url, uid, passwd);
			String sql = "DELETE FROM member WHERE com_id = 6;";
			
			stmt = conn.createStatement();
			int row = stmt.executeUpdate(sql);
			
			if(row > 0) {
				System.out.println("사원 정보가 삭제 되었습니다.");
			}else {
				System.out.println("삭제할 수 없습니다. \n관리자에게 문의하세요.");
			}
			
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println("관리자에 문의하세요.");
		}
		
	} 
	
}


public class Jdbcprj05 {

	public static void main(String[] args) {
//		UpdateDao dao = new UpdateDao();
//		dao.updateDB();
		
		DeleteDao ddo = new DeleteDao();
		ddo.DeleteDB();
		
	}

}
