package com.java.top30codingtasks;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The number is prime"+ isPrimeNumber(13));

	}
	
	private static boolean isPrimeNumber(int num){
		for(int i=2;i<num/2;i++){
			if(num%i ==0){
				return false ;
			}
		}
		
		return true;
	}

}
