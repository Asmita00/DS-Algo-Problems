package com.java.top30codingtasks;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The number is HappyNumber"+ isHappyNumber(23));

	}
	
	private static boolean isHappyNumber(int num){
		int sum =0;
		while(num>0){
			int reminder = num%10;
			sum =sum + reminder*reminder;
			num=num/10;
		}
		if(sum ==1){
			return true;
		}
		else{
		num=sum;
		}
		return false;
	}

}
