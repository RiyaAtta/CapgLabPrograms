package Lab8.Exercise2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author RIYA
 *
 */

public class ThreadTimer implements Runnable{
	
	// synchronized display method to display the present time 
	public synchronized void display() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(date));
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("Present time : ");
		while(true) {
			try {
				display();
				Thread.sleep(10000);
				System.out.print("Time after 10 seconds : ");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTimer threadtimer=new ThreadTimer();
		Thread thread=new Thread(threadtimer);
		thread.start();
	}
}