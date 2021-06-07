package Day15.com.capgemini.concurrency.executorexample;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectedHandlerImpl implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		// TODO Auto-generated method stub
		System.out.println(r.toString()+": I've been rejected !!!");

	}

}