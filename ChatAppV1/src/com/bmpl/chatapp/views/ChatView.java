package com.bmpl.chatapp.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;

import com.bmpl.chatapp.networking.Client;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;

public class ChatView extends JFrame {
	private JTextField textField;
	private JTextArea textArea;
	private Client client;

	public static void main(String[] args) throws UnknownHostException, IOException {
		ChatView window = new ChatView();
	}
	
	public void sendMsg() throws IOException {
		String msg = textField.getText();
		System.out.println("Sending message : " + msg);
		client.sendMsg(msg);
	}

	public ChatView() throws UnknownHostException, IOException {
		setBounds(100, 100, 795, 484);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		client = new Client(textArea);
		
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
		textArea.setBounds(10, 10, 761, 328);
		getContentPane().add(textArea);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(10, 365, 573, 60);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					sendMsg();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(593, 365, 178, 60);
		getContentPane().add(btnNewButton);
		setVisible(true);
	}
}
