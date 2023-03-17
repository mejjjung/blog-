package com.project.dto;

public class UserDTO {

	private int id;
	private String userId;
	private String Name;
	private String password;
	private String email;
	private String phone;
	private String Address;
	
	public UserDTO() {
		
	}

	public UserDTO(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	public UserDTO(String userId, String name, String password, String email, String phone, String address) {
		super();
		this.userId = userId;
		Name = name;
		this.password = password;
		this.email = email;
		this.phone = phone;
		Address = address;
	}
	
	

	public UserDTO(String name, String email, String phone, String address) {
		super();
		Name = name;
		this.email = email;
		this.phone = phone;
		Address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", Name=" + Name + ", password=" + password + ", email="
				+ email + ", phone=" + phone + ", Address=" + Address + "]";
	}
	
	
}
