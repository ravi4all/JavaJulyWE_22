package com.bmpl.chatapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bmpl.chatapp.dto.UserDTO;

public class UserDAO {
	public boolean login(UserDTO user) throws SQLException, ClassNotFoundException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "select email_id from users where email_id=? and password=?";
		
		try {
			String userId = user.getUserId();
			String password = new String(user.getPassword());
			
			conn = CommonDAO.createConnection();
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, userId);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			
			return rs.next();
		}
		
		finally {
			if(pstmt != null) {
				pstmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}
	}
	
	public int register(UserDTO user) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = CommonDAO.createConnection();
			stmt = conn.createStatement();
			
			String userId = user.getUserId();
			String password = new String(user.getPassword());
			
			String query =  "insert into users (email_id, password) value ('" + userId + "','" + password + "')";
			int record = stmt.executeUpdate(query);
			return record;
		}
		finally {
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}
		
	}
}
