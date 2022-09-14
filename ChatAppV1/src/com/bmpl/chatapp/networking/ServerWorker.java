package com.bmpl.chatapp.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ServerWorker extends Thread {
	private Socket clientSocket;
	private InputStream in;
	private OutputStream out;
	private Server server;
	
	public ServerWorker(Socket clientSocket, Server server) throws IOException {
		this.clientSocket = clientSocket;
		in = clientSocket.getInputStream();
		out = clientSocket.getOutputStream();
		this.server = server;
	}
	
	@Override
	public void run() {
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String line;
		while(true) {
			try {
				line = br.readLine();
				// broadcasting...sending msg to all clients...
				for(ServerWorker serverWorker : server.workers) {
					//serverWorker.out.write(line.getBytes());
					serverWorker.out.write((line + "\n").getBytes());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
			finally {
				try {
					if(br != null) {
						br.close();
					}
					if(in != null) {
						in.close();
					}
					if(out != null) {
						out.close();
					}
					if(clientSocket != null) {
						clientSocket.close();
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
