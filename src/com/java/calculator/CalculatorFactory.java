package com.java.calculator;

public class CalculatorFactory {
	SimpleCalculator sc = new SimpleCalculator();

	ScientificCalculator scientificcalc = new ScientificCalculator();

	public int getCalculatorByType(int type, int mode, int fOperand, int sOperand) {
		if (type == 2 && mode ==5) {
			return scientificcalc.sqrRoot(fOperand);
		} else if (mode ==1 ) {
			return sc.add(fOperand, sOperand);
		} else if (mode ==2) {
			return sc.subtract(fOperand, sOperand);
		} else if (mode ==3) {
			return sc.multiply(fOperand, sOperand);
		} else if (mode ==4) {
			return sc.division(fOperand, sOperand);
		}
		System.out.println("The type or operation is not valid");
		return 0;
	}
}
