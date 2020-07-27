package com.java.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

	 public <T> int solution(int[] A) {
		 
		 List list= (List<T>) Arrays.asList(A);
	        Collections.sort(list);
	      //int  firstEle=(int) list.get(0);
	       //int secondEle=(int) list.get(1);
	   for(int i=0;i<list.size();i++){
		   if((list.get(i+1)==(list.get(i)))){
			   
		   }
	   }
		 
		 return 0;
	    }

}
