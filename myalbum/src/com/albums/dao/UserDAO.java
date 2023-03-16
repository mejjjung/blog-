package com.albums.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.albums.dto.UserDTO;
import com.albums.utils.DBHelper;

public class UserDAO implements IUserDAO {

	private DBHelper dbHelper;
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	
	// 사용자 정보 저장시키는 기능 
	@Override
	public int insert(UserDTO userDTO) {
		String query = " INSERT INTO user(userId, id, title) "
				+ " VALUES (?, ?, ?) ";
		int resultRow = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userDTO.getUserId());
			pstmt.setInt(2, userDTO.getId());
			pstmt.setString(3, userDTO.getTitle());
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(">> saveUser함수에서 오류가 발생 했습니다.");
			e.printStackTrace();
		}
		return resultRow;
	}

	@Override
	public int insert(int userId, int id, String title) {

		String query = " INSERT INTO user(userId, id, title) "
				+ " VALUES (?, ?, ?) ";
		int resultRow = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userId );
			pstmt.setInt(2, id);
			pstmt.setString(3,title);
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(">> insert함수에서 오류가 발생 했습니다.");
			e.printStackTrace();
		}
		return resultRow; 
		}
}
