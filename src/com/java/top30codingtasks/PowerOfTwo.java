package com.java.top30codingtasks;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The number is powerof 2"+ isPowerOfTwo(96));

	}
	
	private static boolean isPowerOfTwo(int num){
		while(num > 1){
			if(num%2 == 0){
				num = num/2;
			}
			else{
				System.out.println("Not power of 2");
				return false;
			}
		}
		System.out.println("Its power of 2");
		return true;
	}

}
