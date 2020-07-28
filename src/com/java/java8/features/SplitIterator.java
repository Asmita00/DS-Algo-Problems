package com.java.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SplitIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> candidateList = new ArrayList<>();
		candidateList.add("A1");
		candidateList.add("A2");
		candidateList.add("A3");
		candidateList.add("A4");
		candidateList.add("A5");
		candidateList.add("A6");
		
		Spliterator splitr =	candidateList.spliterator();
		splitr.getExactSizeIfKnown();
	}

}
