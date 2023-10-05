/*
 작성일자 : 23. 10. 05. #
 내  용 : DB 2일차
 */
package jdbcPrj03;

import java.sql.*;

class SelectDao {
	void selectDB() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; // while

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/grp", "root", "1234");
			
			String sql = "Select * from member order by com_id desc limit 1, 2;";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql); //rs 객체 배열
			System.out.println("---------------------사원 목록 출력-----------------------");
			while(rs.next()) { //한줄씩 값을 가져와서
				//System.out.println(rs.getInt(com_id));
//				System.out.println(rs.getInt(1));
//				System.out.println(rs.getString(2));
				System.out.println("사번: "+rs.getInt(1)+", "
									+ "이름: "+rs.getString(2)+", "
									+ "입사일: "+rs.getDate(3)+", "
									+ "퇴사일: "+rs.getDate(4));
				System.out.println("------------------------------------------------------");
			}
			
			
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("연결 실패");
		}

	}

}

public class JdbcPrj04 {

	public static void main(String[] args) {
		SelectDao dao = new SelectDao();
		dao.selectDB();
	}

}
