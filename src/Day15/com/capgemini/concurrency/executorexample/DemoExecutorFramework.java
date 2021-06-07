package Day15.com.capgemini.concurrency.executorexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoExecutorFramework {
	private static ExecutorService executor=null;
	
	private static volatile Future taskOneOutput=null;
	private static volatile Future taskTwoOutput=null;

	public static void main(String[] args) {
		executor=Executors.newFixedThreadPool(2);
		
		while(true) {
			try {
				checkTasks();
				Thread.sleep(3000);
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("Caught exception: "+e.getMessage());
			}
		}
	}

	private static void checkTasks() {
	// TODO Auto-generated method stub
		if(taskOneOutput==null || taskOneOutput.isDone() || taskOneOutput.isCancelled()) {
			taskOneOutput=executor.submit(new RunnableOne());
		}
		
		if(taskTwoOutput==null || taskTwoOutput.isDone() || taskTwoOutput.isCancelled()) {
			taskTwoOutput=executor.submit(new RunnableOne());
		}
	}

}