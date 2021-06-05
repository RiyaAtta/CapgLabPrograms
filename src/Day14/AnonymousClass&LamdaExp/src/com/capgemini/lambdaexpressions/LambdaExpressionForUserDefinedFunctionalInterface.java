package com.capgemini.lambdaexpressions;


public class LambdaExpressionForUserDefinedFunctionalInterface {
	public static void main(String[] args) {
		Multiplication m = () -> {
			System.out.println("Multiplication of two numbers: " + (12*76));
		};
		
		m.mul();
	}
}