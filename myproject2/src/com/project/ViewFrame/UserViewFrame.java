package com.project.ViewFrame;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.project.dto.UserDTO;

public class UserViewFrame extends JFrame implements ActionListener {
	
	private JButton loginButton;
	private JTextField userId;
	private JTextField password;
	private JLabel idLabel;
	private JLabel passwordLabel;
	private TextArea textArea;
	
	
	
	public TextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(TextArea textArea) {
		this.textArea = textArea;
	}

	public UserViewFrame() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		// Set up the login button
		loginButton = new JButton("로그인");
		loginButton.setSize(80, 30);
		loginButton.setLocation(480, 30);
		
		// Id 입력창 
		userId = new JTextField("아이디를 입력하세요");
		userId.setSize(150, 30);
		userId.setLocation(100, 30);
		
		idLabel = new JLabel("아이디");
		idLabel.setSize(50,30);
		idLabel.setLocation(50, 30);
		
		// password 입력창
		password = new JTextField("비밀번호를 입력하세요");
		password.setSize(150, 30);
		password.setLocation(320, 30);
		
		passwordLabel = new JLabel("비밀번호");
		passwordLabel.setSize(50,30);
		passwordLabel.setLocation(260,30);
		
		textArea = new TextArea();
		textArea.setSize(500,400);
		textArea.setLocation(50, 90);
	}
	
	private void setInitLayout() {
		setLayout(null);
		add(loginButton);
		add(userId);
		add(password);
		add(idLabel);
		add(passwordLabel);
		add(textArea);
		setSize(700, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void setlogindata(UserDTO userDTO) {
		//textArea.setText(userDTO.getUserId() + userDTO.getPassword());
		textArea.setText(userDTO.toString());
	}
	public static void main(String[] args) {
		new UserViewFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

	
	
	
}
