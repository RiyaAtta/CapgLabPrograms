package Lab10.Exercise2.com.capgemini.fileprograms;

import java.io.File;
import java.util.Scanner;
/**
 * 
 * @author RIYA ATTA
 * 
 * a Java program that reads on file name from the user,
 *  then displays information about whether the file exists, 
 *  whether the file is readable, whether the file is writable, 
 *  the type of file and the length of the file in bytes
 *
 */
class ReadbleFile{
	public static void main(String args[ ]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name: ");
		String str=sc.next();
		File f1 = new File(str);
		System.out.println("File Name: " + f1.getName());
		System.out.println(f1.exists() ? "exists" : "does not exist");
		System.out.println(f1.canWrite() ? "is writeable" : "is not writeable");
		System.out.println("File size: " + f1.length() + " Bytes");
	} 
}
