package Day15.com.capgemini.concurrency.executorexample;

public class RunnableOne implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("Executing the task one");
			try {
				Thread.sleep(1000);
			}catch(Throwable e) {
				e.printStackTrace();
			}
		}
	}
}