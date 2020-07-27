package com.java.top30codingtasks;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(12421));

	}
	
	private static boolean isPalindrome(int num){
		int sum=0;
		int temp=num;
		
		while(num>0){
			int reminder = num%10;
			sum = (sum*10)+reminder;
			num = num/10;
			
			
		}
		if(sum == temp)
		return true;
		else 
		{
			return false;
		}
		
	}

}
