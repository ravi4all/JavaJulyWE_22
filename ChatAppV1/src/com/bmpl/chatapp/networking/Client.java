package com.bmpl.chatapp.networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JTextArea;

import com.bmpl.chatapp.dao.ConfigReader;

public class Client {
	
	Socket socket;
	OutputStream out;
	InputStream in;
	JTextArea textArea;
	ClientWorker clientWorker;
	
	public Client(JTextArea textArea) throws UnknownHostException, IOException {
		int PORT = Integer.parseInt(ConfigReader.getValue("PORT_NO"));
		socket = new Socket(ConfigReader.getValue("SERVER_IP"), PORT);
		this.textArea = textArea;
		out = socket.getOutputStream();
		in = socket.getInputStream();
		readMsg();
	}
	
	public void sendMsg(String msg) throws IOException {
		// send message to server - write msg on network
		System.out.println("Message Sent :: " + msg);
		//out.write(msg.getBytes());
		out.write((msg+"\n").getBytes());
	}
	
	public void readMsg() {
		clientWorker = new ClientWorker(in, textArea);
		clientWorker.start();
	}
	
	// for single client
//	public Client() throws UnknownHostException, IOException {
//		int PORT = Integer.parseInt(ConfigReader.getValue("PORT_NO"));
//		socket = new Socket(ConfigReader.getValue("SERVER_IP"), PORT);
//		System.out.println("Client Arrived...");
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter your message : ");
//		String msg = scanner.nextLine();
//		OutputStream out = socket.getOutputStream();
//		out.write(msg.getBytes());	// convert msg to byte
//		out.close();
//		socket.close();
//		scanner.close();
//	}

}
