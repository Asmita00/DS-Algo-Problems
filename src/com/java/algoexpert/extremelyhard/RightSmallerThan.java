package com.java.algoexpert.extremelyhard;

import java.util.ArrayList;
import java.util.List;

class RightSmallerThan {
	
	public static List<Integer> rightSmallerThan(List<Integer> array) {
		// Write your code here.
		// {"array": [8, 5, 11, -1, 3, 4, 2]}

		ArrayList<Integer> outputList = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < array.size(); i++) {
			for (int j = i + 1; j < array.size(); j++) {
				if (array.get(i) > array.get(j)) {
					count++;

				}

			}
			outputList.add(i, count);
			count=0;
		}
		return outputList;
	}

}
