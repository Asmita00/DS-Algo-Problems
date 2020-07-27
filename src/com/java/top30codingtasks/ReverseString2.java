package com.java.top30codingtasks;

import java.lang.reflect.Array;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Iamabird";
		char[] arr = input.toCharArray();
		if(input == null){
			
		}
		else{
		for(int i=0;i<input.length()/2;i++){
			char temp=0;
			temp=arr[i];
			arr[i]=arr[input.length()-1-i];
			System.out.println(arr[i]+ "for"+i );
			arr[input.length()-1-i]=temp;
			System.out.println(arr[input.length()-1-i]+ "for"+i);
			System.out.println("===========================");
			//System.out.println(arr + "for"+i);
			
			
		}
		System.out.println(arr);
	}}

}
