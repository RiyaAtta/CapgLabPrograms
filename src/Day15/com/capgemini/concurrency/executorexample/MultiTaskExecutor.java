package Day15.com.capgemini.concurrency.executorexample;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MultiTaskExecutor {

	public static void main(String[] args) {
		
		ArrayBlockingQueue<Runnable> worksQueue=new ArrayBlockingQueue<Runnable>(10);
		RejectedExecutionHandler rejectionHandler = new RejectedHandlerImpl();
		ThreadPoolExecutor executor = new ThreadPoolExecutor(3,3,10,TimeUnit.SECONDS,worksQueue);
	}

}