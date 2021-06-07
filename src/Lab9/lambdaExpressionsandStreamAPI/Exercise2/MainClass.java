package Lab9.lambdaExpressionsandStreamAPI.Exercise2;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AddSpace i=()->{return(sc.next().replaceAll(".(?=.)", "$0 "));};
		System.out.println(i.Space());
	}

}