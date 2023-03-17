package com.project.dao;

import java.awt.TextArea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.ViewFrame.UserViewFrame;
import com.project.dto.UserDTO;
import com.project.utils.DBHelper;

public class UserDAO implements IUserDAO {

	private DBHelper dbHelper;
	UserViewFrame userViewFrame = new UserViewFrame();

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public UserDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}

	// 로그인 체크 아이디 비번 값 확인해서 찾기
	@Override
	public UserDTO loginCheck(String userId, String password) {
		UserDTO resultUser = null;

		String query = " SELECT * FROM user " + "WHERE userId = ? AND password = ? ";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				//UserDTO dto = new UserDTO();
				UserDTO dto2 = new UserDTO(userId, password);
				dto2.setUserId(rs.getString("userId"));
				dto2.setPassword(rs.getString("password"));
				resultUser = dto2;
				//userViewFrame.getTextArea().append(dto2.);
				//userViewFrame.getTextArea().append(dto.getPassword());
				//userViewFrame.getTextArea().append(dto.getUserId(),dto.getPassword());
			}
		} catch (Exception e) {
			System.out.println(">> 회원찾기 시 에러가 발생했습니다 <<");
			e.printStackTrace();
		}
		return resultUser;
	}

}
