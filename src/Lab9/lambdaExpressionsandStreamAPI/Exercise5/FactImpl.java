package Lab9.lambdaExpressionsandStreamAPI.Exercise5;

import java.util.Scanner;

public class FactImpl {
	public static int calculateFact(int num) {
		int result = 1;
		for(int i=1;i<=num;i++) {
			result*=i;
		}
		return result;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	Fact obj=FactImpl::calculateFact;
	obj.fact(sc.nextInt());
}
}