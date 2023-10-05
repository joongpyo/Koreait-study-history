/*
 작성일자 : 23. 10. 05. #
 내  용 : DB 객체 통해서 값 입력
 */
package jdbcPrj04;

import java.sql.*;

class ItemCrud {
	
	void selectItem() throws Exception { //출력 메소드
		Connection conn = null; //연결
		PreparedStatement pstmt = null; //insert 문을 실행시키기 위함
		ResultSet rs = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/shop";
		String uid = "root";
		String passwd = "1234";
		
		//접속 정보
		conn = DriverManager.getConnection(url, uid, passwd);
		String sql = "SELECT * FROM items ORDER BY item_id DESC;";
		
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) { //디비 -> 객체 -> 화면 출력
			Items item = new Items(); //Items.java 4장    //상품 하나당 하나만 출력 초기화 일일이 다
			
			item.setItemId(rs.getInt(1));
			item.setItemName(rs.getString(2));
			item.setItemPrice(rs.getInt(3));
			item.setItemStock(rs.getInt(4));
			item.setItemDate(rs.getString(5));
			System.out.println(item.toString());
			System.out.println
			("-----------------------------------------------------------------------------------------");
			
		}
				
	
	}
	
	
	void insertItem() { //입력 메소드
		Connection conn = null;
		PreparedStatement pstmt = null; //insert 문을 실행시키기 위함
		
		
		try {
			//Class.forName()
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/shop";
			String uid = "root";
			String passwd = "1234";
			
			//접속 정보
			conn = DriverManager.getConnection(url, uid, passwd);
			
			String sql = "INSERT INTO items VALUES(null, ?, ?, ?, now());";
			 pstmt = conn.prepareStatement(sql);
			
			Items item = new Items(); //임시로 값을 객체에 저장
			item.setItemName("감자통구이");
			item.setItemPrice(1000);
			item.setItemStock(100);
			
			pstmt.setString(1, item.getItemName()); //실제 database에 저장
			pstmt.setInt(2, item.getItemPrice());
			pstmt.setInt(3, item.getItemStock());
			
			int row = pstmt.executeUpdate(); //실행
			
			if(row > 0) {  //예외처리
				System.out.println(item.getItemName() + " 상품 등록이 완료 되었습니다.");
			}
			
			else {
				System.out.println("상품 등록에 실패하였습니다.");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

public class ItemsEx {

	public static void main(String[] args) throws Exception {
		ItemCrud crud = new ItemCrud();
		//crud.insertItem();
		crud.selectItem();
	}

}
