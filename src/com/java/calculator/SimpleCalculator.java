package com.java.calculator;

public class SimpleCalculator implements ICalculator  {

	
	public int add(int x,int y){
		System.out.println(x+y);
		return x+y;
	}
	
	public int subtract(int x,int y){
		System.out.println(x-y);
		return x-y;
	}
	
	public int multiply(int x,int y){
		System.out.println(x*y);
		return x*y;
	}
	
	public int division(int x,int y){
		System.out.println(x/y);
		return x/y;
	}

	@Override
	public String getType() {
		return "SIMPLE";
	}

	

}
