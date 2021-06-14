package Lab9.Concurrent.Exercise1.Threads;


import java.util.Date;

public class Timer implements Runnable{
	private String name;
	
	public Timer(String s)
	{
		name = s;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count=0;
		while(count<=5) {
			try {
				System.out.println("["+new Date() +"] : timer refreshed!");
				Thread.sleep(10000);
				count++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
		}
		System.out.println(name+" complete");

	}
}