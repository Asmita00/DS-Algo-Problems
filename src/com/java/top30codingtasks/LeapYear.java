package com.java.top30codingtasks;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The year is isLeapYear"+ isLeapYear(2000));

	}
	
	private static boolean isLeapYear(int year){
		if(year % 100 == 0){
			if(year%4 == 0){
				System.out.println("Its a leap year");
				return true;
			}
			
		}
		
		if(year % 4 == 0){
			System.out.println("Its a leap year");
			return true;
		}
		System.out.println("Its not a leap year");
		return false;
	}

}
