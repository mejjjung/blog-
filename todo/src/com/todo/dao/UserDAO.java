package com.todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.todo.utils.DBHelper;

public class UserDAO implements IUserDAO {

	private DBHelper dbHelper;
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}
	
	// 정보 저장시키기 
	@Override
	public int insert(int userId, int id, String title, boolean completed) {
		String query = " INSERT INTO todo(userId, id, title, completed) "
				+ " VALUES (? ,?, ?,?) ";
		int resultRow = 0;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userId);
			pstmt.setInt(2, id);
			pstmt.setString(3, title);
			pstmt.setBoolean(4, completed);
			resultRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(" >> insert함수에서 오류가 발생했습니다 <<" );
			e.printStackTrace();
		}
		
		return resultRow;
	}

	@Override
	public int delete(int UserId, int id) {
		int resultRow = 0;
		
		String sql = " DELETE FROM todo "
				+ " WHERE id = ? ";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			resultRow = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(">> delete 에러 발생 <<");
			e.printStackTrace();
		}
		
		return resultRow;
	}

}
