package com.bmpl.chatapp.views;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingDemo {

	private JFrame frame;
	int count = 0;
	
	public SwingDemo() {
		frame = new JFrame();
		frame.setSize(700,500);
		//frame.setBounds(100, 100, 450, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel title = new JLabel("Welcome to Chat App...");
		title.setFont(new Font("Arial", Font.BOLD, 40));
		//x,y,w,h
		title.setBounds(50, 10, 600, 100);
		
		JLabel counter = new JLabel("0");
		counter.setFont(new Font("Arial", Font.BOLD, 40));
		//x,y,w,h
		counter.setBounds(200, 115, 60, 40);
		
		JButton btn = new JButton("Count");
		btn.setFont(new Font("Arial", Font.BOLD, 25));
		btn.setBounds(50,110,120,50);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				counter.setText("" + count);
			}
		});
		
		Container container = frame.getContentPane();
		container.setLayout(null);
		container.add(title);
		container.add(btn);
		container.add(counter);
	}

	public static void main(String[] args) {
		SwingDemo window = new SwingDemo();
		window.frame.setVisible(true);
	}


}
