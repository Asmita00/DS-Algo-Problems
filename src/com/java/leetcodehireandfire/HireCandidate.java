package com.java.leetcodehireandfire;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class HireCandidate {

	public static void main(String[] args) {


		List<String> candidateList = new ArrayList<>();
		candidateList.add("A1");
		candidateList.add("A2");
		candidateList.add("A3");
		candidateList.add("A4");
		candidateList.add("A5");
		candidateList.add("A6");
		
		Random randomNum = new Random();
		//randomNum.ints(0, candidateList.size()-1);
		for (int i=1;i<=4;i++){
		IntStream num=	randomNum.ints(1, candidateList.size());
		System.out.println("A"+num.findFirst().getAsInt()+" got the offer ");
		candidateList.get(num.findFirst().getAsInt());
		
		}
		
		
		
		
		

	}

}
