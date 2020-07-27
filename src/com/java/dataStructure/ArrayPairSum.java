package com.java.dataStructure;

import java.lang.reflect.Array;

public class ArrayPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arry = {1,6,2,5,7,0,4,3};
		
		for(int i=0;i<arry.length;i++){
			for(int j=i+1;j<arry.length;j++){
			if(arry[i]+arry[j]==7){
				System.out.println(arry[i]+","+arry[j]);
				
			}
				
			}}
			
	

	}

}
