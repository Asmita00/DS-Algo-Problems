package com.java.calculator;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.factorypattern.transportfarecalculator.Metro;


public class TestStreamAPI {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(20);
		list.add(21); 
		
		 
		System.out.println(10+20+"javapoint");
		System.out.println("javapoint"+10+20);
	System.out.println(list.stream().filter(i ->i%2 == 0).collect(Collectors.toList()));
	
	ArrayList<String> list1 = new ArrayList<String>();
	
	list1.add("asmita");
	list1.add("avijit");
	list1.stream().filter(i -> i.contentEquals("asmita") ).collect(Collectors.toList());
	
System.out.println(list1.stream().map(i -> i.toUpperCase() ).collect(Collectors.toList()));

Stream s = Stream.of(99,999,9999,99999);
//s.forEach(System.out::println);
System.out.println((s.findAny().filter(i ->i.equals(99))));
//s.anyMatch(i-> i.equals(999));

Metro metro = new Metro(12,"Asmita");
WeakReference<Metro> weakref = new WeakReference<Metro>(metro);
System.out.println(weakref);
weakref = null;
System.out.println(weakref);
System.gc();
System.out.println(weakref);


	}

}
