package com.java.top30codingtasks;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The number is armstrong"+ isArmstrong(153));

	}
	
	private static boolean isArmstrong(int num){
		int sum=0;
		int temp=num;
		while(num>0){
			int reminder = num % 10;
			sum = sum +reminder*reminder*reminder;
			num =num/10;
		}
		if(sum == temp){
			return true;
		}
		return false;
	}

}
