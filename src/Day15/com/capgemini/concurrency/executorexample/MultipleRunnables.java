package Day15.com.capgemini.concurrency.executorexample;

import java.util.List;

public class MultipleRunnables implements Runnable{

	private final List<Runnable> runnables;
	
	public MultipleRunnables(List<Runnable> runnables) {
	
		this.runnables = runnables;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(Runnable runnable : runnables) {
			new Thread(runnable).start();
		}
		
	}
	

}