package com.bmpl.chatapp.networking;

public class ThreadDemo implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i < 6; i++) {
			System.out.println("I is :: " + i + " :: " + Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadDemo job = new ThreadDemo();
		Thread thread = new Thread(job);
		// start will call run() internally
		thread.start();
		for(int j = 1; j < 6; j++) {
			System.out.println("J is :: " + j + " :: " + Thread.currentThread().getName());
			Thread.sleep(10);
		}
	}

}
