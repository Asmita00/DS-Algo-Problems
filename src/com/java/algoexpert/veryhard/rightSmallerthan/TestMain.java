package com.java.algoexpert.veryhard.rightSmallerthan;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
	
	//Problem Statement
	/*Write a function takes in an array of integers and returns an array of the same length,where each element in the output array
	of the same length,where each element in the output array corresponds to the number of integers in the input
	array that are to the right of the relevant index and that are strictly smaller than the integer at that index.
	
	in other words,the value at output[i] represents the number of integers that are to the right
	of i and that are strictly smaller than input[i].
	
	Sample Input:
		array=[8,5,11,-1,3,4,2]
		
	Sample Output:
		array[5,4,4,0,1,1,0]
		
		*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array = new ArrayList<>();
		array.add(0, 8);
		  array.add(1, 5);
		  array.add(2, 11);
		  array.add(3, -1);
		  array.add(4, 3);
		  array.add(5, 4);
		  array.add(6, 2);
		RightSmallerThan.rightSmallerThan(array);

	}
	

}
