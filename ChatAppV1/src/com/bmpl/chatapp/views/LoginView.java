package com.bmpl.chatapp.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import com.bmpl.chatapp.dao.UserDAO;
import com.bmpl.chatapp.dto.UserDTO;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class LoginView extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;

	public LoginView() {
		setBounds(100, 100, 795, 484);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Chat App");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(138, 20, 486, 48);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter User ID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(43, 112, 226, 41);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(43, 202, 226, 41);
		getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(348, 112, 345, 41);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(348, 202, 345, 41);
		getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login User");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doLogin();
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton.setBounds(98, 310, 262, 70);
		getContentPane().add(btnNewButton);
		
		JButton btnRegisterUser = new JButton("Register User");
		btnRegisterUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doRegister();
			}
		});
		btnRegisterUser.setForeground(Color.WHITE);
		btnRegisterUser.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnRegisterUser.setBackground(Color.RED);
		btnRegisterUser.setBounds(407, 310, 262, 70);
		getContentPane().add(btnRegisterUser);
		setResizable(false);
		setVisible(true);
	}
	
	UserDAO userDAO = new UserDAO();
	
	public void doRegister() {
		String userId = textField.getText();
		char []password = passwordField.getPassword();
		UserDTO user = new UserDTO(userId, password);
		try {
			int record = userDAO.register(user);
			if(record > 0) {
				JOptionPane.showMessageDialog(this, "Registered Successfully...");
			}
			else {
				JOptionPane.showMessageDialog(this, "Registration Failed...");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void doLogin() {
		String userId = textField.getText();
		char []password = passwordField.getPassword();
		UserDTO user = new UserDTO(userId, password);
		try {
			boolean result = userDAO.login(user);
			if(result) {
				JOptionPane.showMessageDialog(this, "Login Success...");
			}
			else {
				JOptionPane.showMessageDialog(this, "Login Failed...");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		LoginView window = new LoginView();
	}
}
