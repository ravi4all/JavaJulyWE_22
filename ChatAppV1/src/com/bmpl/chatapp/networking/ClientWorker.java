package com.bmpl.chatapp.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JTextArea;

public class ClientWorker extends Thread {
	private InputStream in;
	private JTextArea textArea;
	
	public ClientWorker(InputStream in, JTextArea textArea) {
		this.in = in;
		this.textArea = textArea;
	}
	
	public void run() {
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String line;
		
		try {
			while(true) {
				line = br.readLine();
				textArea.setText(textArea.getText() + line);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if(br != null) {
				try {
					br.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
//		while(true) {
//			try {
//				line = br.readLine();
//				textArea.setText(textArea.getText() + line);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
	
}
