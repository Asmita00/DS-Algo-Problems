package com.java.top30codingtasks;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("The number is armstrong"+ isArmstrong(153));
		int[] arr = {4,1,2,4,2};
		singleNumber(arr);

	}
	
	private static boolean fibonacciSeries(int num){
		
		
		return false;
	}
	
	
	    public static int singleNumber(int[] nums) {
	        for(int i=0 ;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i] == nums[j]){
	                	System.out.println("Match found");
	                    break;
	                }
	                    else 
	                    System.out.println("Single number is:" + nums[i]);	
	                    return nums[i];
	            }
	        }
			return 0;
	    }
	

}
