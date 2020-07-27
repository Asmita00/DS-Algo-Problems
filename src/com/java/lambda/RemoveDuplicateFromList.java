package com.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Asmita");
		nameList.add("Abhijit");
		nameList.add("Asmita");
		nameList.add("Abhijit");
		nameList.add("Sikha");
		nameList.add("Arun");
		nameList.add("Vera");
		nameList.add("Hati");
		nameList.add("Tholthol");
		nameList.add("Abhijit");
		nameList.add("Hati");
		System.out.println(nameList);
		System.out.println("The unique list is");
		
		ArrayList<Integer> array = new ArrayList<>();
		array.add(0, 8);
		  array.add(1, 5);
		  array.add(2, 11);
		  array.add(3, -1);
		  array.add(4, 3);
		  array.add(5, 4);
		  array.add(6, 2);
		Program.rightSmallerThan(array);

	}
	
	private static void removeDuplicates(ArrayList<String> names){
		names.forEach(n ->n.toUpperCase());
	}
	
	public static List<Integer> rightSmallerThan(List<Integer> array) {
	    // Write your code here.
		ArrayList<Integer> outputList = new ArrayList<>();
		int count =0;
		for (int i=0;i<array.size();i++){
			for (int j=i+1;j<array.size();j++){
				if(array.get(i)>array.get(j)){
					count++;
					
				}
				outputList.set(i, count);
				
			}
		}
	    return outputList;
	  }

}
