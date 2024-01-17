package servlet06.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.Connection;

import servlet06.dto.Register;

public class RegisterDao {
	
	public int registerEmp(Register reg) throws SQLException, ClassNotFoundException{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");
		
		String INSERT_SQL = "INSERT INTO emp VAlUES(?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(INSERT_SQL);
		pstmt.setString(1, reg.getUserid());
		pstmt.setString(2, reg.getPasswd());
		pstmt.setString(3, reg.getUsername());
		
		int result = pstmt.executeUpdate();
		
		return result;
		
	}
}
