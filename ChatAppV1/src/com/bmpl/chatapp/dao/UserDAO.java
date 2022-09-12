package com.bmpl.chatapp.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.bmpl.chatapp.dto.UserDTO;

public class UserDAO {
	public void login() {
		
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
