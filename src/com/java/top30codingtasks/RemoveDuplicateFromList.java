package com.java.top30codingtasks;

import java.util.ArrayList;

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
		System.out.println("The unique list is"+ removeDuplicates(nameList));

	}
	
	private static ArrayList<String> removeDuplicates(ArrayList<String> names){
		for(int i=0;i<names.size()-1;i++){
			for (int j=i+1;j<names.size();j++){
			if(names.get(i) ==  names.get(j)){
				names.remove(i);
				System.out.println(names.remove(i));
			}
		}
		}
		
		return names;
	}

}
