package Lab9.Concurrent.Exercise1.Threads;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread implements Runnable{
	private String name;
	
	public CopyDataThread(String s)
	{
		name = s;
	}
	FileReader inputStream = null;
	FileWriter outputStream = null;
	public CopyDataThread(	FileReader inputStream,FileWriter outputStream){
		this.inputStream=inputStream;
		this.outputStream=outputStream;
	}

	public void run(){
		int count=1;

		try {

			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
				System.out.println(count);
				if(count%10==0) {
					Thread.sleep(5000);
					System.out.println("10 characters are copied");
				}
				count++;
			}
			System.out.println(name+" complete");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace(); }
		finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}