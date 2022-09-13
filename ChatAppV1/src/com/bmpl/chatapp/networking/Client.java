package com.bmpl.chatapp.networking;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.bmpl.chatapp.dao.ConfigReader;

public class Client {
	
	Socket socket;
	
	public Client() throws UnknownHostException, IOException {
		int PORT = Integer.parseInt(ConfigReader.getValue("PORT_NO"));
		socket = new Socket(ConfigReader.getValue("SERVER_IP"), PORT);
		System.out.println("Client Arrived...");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your message : ");
		String msg = scanner.nextLine();
		OutputStream out = socket.getOutputStream();
		out.write(msg.getBytes());	// convert msg to byte
		out.close();
		socket.close();
		scanner.close();
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		Client client = new Client();

	}

}
