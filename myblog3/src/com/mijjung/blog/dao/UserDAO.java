package com.mijjung.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mijjung.blog.dto.UserDTO;
import com.mijjung.blog.utils.DBHelper;

public class UserDAO implements IUserDAO {
	
	private DBHelper dbHelper;
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		conn = DBHelper.getinstance().getConnection();
	}
	
	// 사용자 정보 저장시키기 
	@Override
	public int saveUser(UserDTO user) {
		String query = " INSERT INTO user(username, password, email, address, userRole, createDate) "
				+ " VALUES (?, ?, ?, ?, ?, now()) ";
		int resultRow = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,user.getUsername());
			pstmt.setString(2,user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getAddress());
			pstmt.setString(5, user.getUserRole());
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(">> saveUser 함수에서 오류가 발생 했습니다.");
			e.printStackTrace();
		}
		return resultRow;
	}

	// 사용자 정보를 아이디와 비번 값을 확인해서 찾기 
	@Override
	public UserDTO selectUserByUsernameAndPassword(String username, String password) {
		UserDTO resultUser = null;
		
		String query = " SELECT * "
				+ " FROM user "
				+ " WHERE username = ? "
				+ "AND password = ? ";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				UserDTO dto = new UserDTO();
				dto.setId(rs.getInt("id"));
				dto.setUsername(rs.getString("username"));
				dto.setPassword(rs.getString("password"));
				resultUser = dto;
			}
			
		} catch (Exception e) {
			System.out.println(">> userDAO 회원찾기 시 에러가 발생했습니다. <<");
			e.printStackTrace();
		}
		
		return resultUser;
	}
}
