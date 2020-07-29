package com.java.algoexpert.hard;

import java.util.ArrayList;
import java.util.List;

public class FourNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array={7,6,4,-1,1,2};
		int targetSum=16;
		
		fourNumberSum(array,targetSum);

	}
	
	public static int fourNumberSum(int[] array, int targetSum) {
	    // Write your code here.
	
				 
		List<Integer[]> list = new ArrayList<>();
		Integer[][] outputArray = new Integer[10][10];
		for(int i=0;i<array.length-4;i++){
			if(array[i]+array[i+1]+array[i+2]+array[i+3] == targetSum){

				 System.out.println("The elements are:" +array[i]+"-"+array[i+1]+"-"+array[i+2]+"-"+array[i+3]);
			}
		for(int j=array.length;j>0+4;i--){
			if(array[j]+array[j-1]+array[j-2]+array[j-3] == targetSum)

				System.out.println("The elements are:" +array[j]+"-"+array[j-1]+"-"+array[j-2]+"-"+array[j-3]);
		}
		}
	    return  (Integer) null;
	  }

}
