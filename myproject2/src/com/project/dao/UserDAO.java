package com.project.dao;

import java.awt.TextArea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.project.ViewFrame.UserViewFrame;
import com.project.dto.UserDTO;
import com.project.utils.DBHelper;

public class UserDAO implements IUserDAO {

	private DBHelper dbHelper;

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public UserDAO() {
		dbHelper = new DBHelper();
		conn = dbHelper.getConnection();
	}

	@Override
	public ArrayList<UserDTO> select() {

		ArrayList<UserDTO> list = new ArrayList<>();

		UserDTO resultUser = null;

		String query = " SELECT * FROM user " + "WHERE userId = ? AND password = ? ";
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString("Name");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				String address = rs.getString("Address");

				UserDTO dto = new UserDTO(name, email, phone, address);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return list;
	}

}
