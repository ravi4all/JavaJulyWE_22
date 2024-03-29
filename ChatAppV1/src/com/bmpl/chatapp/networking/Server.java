package com.bmpl.chatapp.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import com.bmpl.chatapp.dao.ConfigReader;

public class Server {
	ServerSocket serverSocket;
	ArrayList<ServerWorker> workers = new ArrayList<ServerWorker>();
	
	public Server() throws IOException {
		int PORT = Integer.parseInt(ConfigReader.getValue("PORT_NO"));
		serverSocket = new ServerSocket(PORT);
		System.out.println("Server Started...Waiting for Client...");
		handleClient();
	}
	
	public void handleClient() throws IOException {
		while(true) {
			// handshaking with client...
			Socket socket = serverSocket.accept();
			System.out.println("Connected with Client...");
			// creating new thread per client
			ServerWorker serverWorker = new ServerWorker(socket, this);
			workers.add(serverWorker);		
			serverWorker.start();
		}
	}
	
	// for single client
//	public Server() throws IOException {
//		int PORT = Integer.parseInt(ConfigReader.getValue("PORT_NO"));
//		serverSocket = new ServerSocket(PORT);
//		System.out.println("Server Started...Waiting for Client...");
//		// handshaking with client...
//		Socket socket = serverSocket.accept();
//		System.out.println("Connected with Client...");
//		InputStream in = socket.getInputStream();	// read bytes from network
//		byte []arr = in.readAllBytes();
//		String str = new String(arr);
//		System.out.println("Client : " + str);
//		in.close();
//		socket.close();
//	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Server server = new Server();
	}

}
