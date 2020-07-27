package com.java.top30codingtasks;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorial(5));

	}
	
	private static int factorial(int num){
		int fact=1;
		for(int i=1;i<=num;i++){
			 fact = fact*i;
		}
		return fact;
	}

}
