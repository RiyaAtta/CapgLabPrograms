package com.capgemini.multithreading;

public class UserThread extends Thread{

	public void run() {
		//to assign an action for a thread
		System.out.println("Thread is in running state");
		
		for(int i=1;i<10;i++) {
			try {
				Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("");
		}
	}
	
	public static void main(String args[]) throws InterruptedException {
		UserThread ut=new UserThread();
		
		UserThread ut_new=new UserThread();
		
		ut.start();
		
		ut_new.start();
		System.out.println("Sleep Complete");
		ut.run();
	}
}