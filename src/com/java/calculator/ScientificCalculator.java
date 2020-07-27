package com.java.calculator;

public class ScientificCalculator extends SimpleCalculator implements ICalculator  {

	@Override
	public String getType() {
		System.out.println("Inside scientific calc");
		return "SCIENTIFIC";
	}
	
	public int sqrRoot(int x){
		System.out.println((int) Math.sqrt(x));
		return (int) Math.sqrt(x);
	}

}
