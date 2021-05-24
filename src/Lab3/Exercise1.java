package Lab3;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers with one space gap: ");
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		int sum = 0;
		while (st.hasMoreTokens()) {
			int x = 0;
			x = Integer.parseInt(st.nextToken());
			System.out.println(x + " ");
			sum += x;
			
		}
		System.out.println("The sum of the integers is: "+sum);
		sc.close();
	}

}