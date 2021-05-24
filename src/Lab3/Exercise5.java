package Lab3;
import java.io.*;
import java.util.*;
public class Exercise5 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int lines = 0, words = 0, characters = 0;
		char ch;
		System.out.println("Enter text: ");
		String str = sc.nextLine();
		FileInputStream f = new FileInputStream(str);
		int n = f.available();
		for (int i= 0; i < n; i++) {
			ch = (char)f.read();
			if (ch == '\n')
				lines += 1;
			else if (ch == ' ')
				words += 1;
				
		}
		System.out.println("Lines: " + lines + " words: " + words + " characters: " + characters);
		sc.close();
		f.close();
	}

}