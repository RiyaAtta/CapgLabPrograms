package Lab9.Concurrent.Exercise2;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author RIYA ATTA
 * 
 * Username should always end with _job and
 *  there should be at least minimum of 8 characters 
 * to the left of _job.
 *  a function to validate the same. 
 *  Return true in case the validation is passed.
 *   In case of validation failure return false. 
 *
 */
public class ExecutorMain {

	// Maximum number of threads in thread poolankitabsu_
	static final int MAX_T = 4;			

	public static void main(String[] args) throws IOException
	{
		// creates the tasks
		Runnable r1=new JobSeeker("User 1");
		Runnable r2 = new JobSeeker("User 2");
		Runnable r3=new JobSeeker("User 3");
		Runnable r4=new JobSeeker("User 4");
		Runnable r5=new JobSeeker("User 5");

		// creates a thread pool with MAX_T no. of
		// threads as the fixed pool size
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

		// passes the Task objects to the pool to execute
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);

		pool.shutdown();	
	}
}