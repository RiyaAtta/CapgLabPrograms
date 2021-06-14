package Lab9.Concurrent.Exercise1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import Lab9.Concurrent.Exercise1.Threads.CopyDataThread;
import Lab9.Concurrent.Exercise1.Threads.Timer;


//Java program to illustrate
//ThreadPool
/**
 * 
 * @author RIYA ATTA
 * 
 * Implementing the Multithreading Assignments using Executor, 
 * ExecutorService interface. 
 *
 */
public class Executor
{
	// Maximum number of threads in thread pool
	static final int MAX_T = 3;			

	public static void main(String[] args) throws IOException
	{
		// creates the tasks
		FileReader inputStream = new FileReader("source.txt");
		FileWriter outputStream = new FileWriter("target.txt");
		Runnable r1=new CopyDataThread(inputStream,outputStream);
		Runnable r2 = new Timer("task 2");
		
		// creates a thread pool with MAX_T no. of
		// threads as the fixed pool size
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
		
		// passes the Task objects to the pool to execute
		pool.execute(r1);
		pool.execute(r2);
		
		// pool shutdown 
		pool.shutdown();	
	}
}