package custPrj;

import java.sql.*;
import java.util.*;

public class CustomerDao {
	Connection conn= null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	CustomerDao dao = null;
	
	//연결객체
	Connection getConnection() {
		
		try {
			String url = "jdbc:mysql://localhost:3306/mydb";
			String id = "root";
			String pwd = "1234";
			
			//접속에 필요한 드라이버
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pwd);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	//입력
	void setCustomer() throws Exception {
		
		dao = new CustomerDao();
		conn =  dao.getConnection(); //디비 연결 완료..
		
		String sql = "INSERT INTO customers VALUES(?, ?, ?, ?, now());";
		pstmt = conn.prepareStatement(sql);
		
		//db에 저장하기전에 setter에 임시 저장
		Customer c = new Customer();
		c.setId(103);
		c.setEmail("mail@email.com");
		c.setName("김찰홍");
		c.setSalary(10000);
		
		pstmt.setInt(1, c.getId());
		pstmt.setString(2, c.getEmail());
		pstmt.setString(3, c.getName());
		pstmt.setInt(4, c.getSalary());
		
		int row = pstmt.executeUpdate();
		
		if(row > 0 ) {
			System.out.println("고객 등록이 완료 되었습니다.");
		}
		
		
	}
	
	//출력
	List<Customer> getCustomers() throws Exception {
		//Collections 이용 Array List
		//빈줄, 빈칸 -> 값 삽입 - >객체.add();
		List<Customer> list = new ArrayList<>();
		
		dao = new CustomerDao();
		conn =  dao.getConnection();
		
		String sql = "SELECT * FROM customers ORDER BY id DESC;";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			Customer cu = new Customer();
			
			cu.setId(rs.getInt(1));
			cu.setEmail(rs.getString(2));
			cu.setName(rs.getString(3));
			cu.setSalary(rs.getInt(4));
			cu.setRegdate(rs.getString(5));

			list.add(cu);
			
		}
		
		return list;
	}
	
	
	
}
