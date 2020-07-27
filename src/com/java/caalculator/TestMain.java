package com.java.caalculator;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		int secondOperand = 0;
		final ArrayList<Integer> CALC_TYPE_LIST = new ArrayList<Integer>();
		CALC_TYPE_LIST.add(1);
		CALC_TYPE_LIST.add(2);
		
		final ArrayList<Integer> CALC_OPERATION_LIST = new ArrayList<Integer>();
		CALC_OPERATION_LIST.add(1);
		CALC_OPERATION_LIST.add(2);
		CALC_OPERATION_LIST.add(3);
		CALC_OPERATION_LIST.add(4);
		CALC_OPERATION_LIST.add(5);

		

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the type of the calculator: \n Enter 1 for SIMPLE CALCULATOR \n Enter 2 for SCIENTIFIC CALCULATOR \n");
		int calcType = sc.nextInt();
		sc.nextLine();
		if (!CALC_TYPE_LIST.contains(calcType)) {
			System.out.println("Choose a valid Calculator Type");
		}
		System.out.println("Choose Operation: \n Enter 1 for Addition \n Enter 2 for Subtraction \n Enter 3 for Multiplication \n Enter 4 for Division \n");
		if (calcType == 5) {
			System.out.println("Enter 5 for Squareroot");
		}
		int operation = sc.nextInt();
		sc.nextLine();
		if (!CALC_OPERATION_LIST.contains(operation)) {
			System.out.println("Choose a valid Operation");
		}
		System.out.println("Enter first operand");
		int firstOperand = sc.nextInt();
		sc.nextLine();
		if (!(operation == 5 && calcType == 2)) {
			System.out.println("Enter second operand");
			secondOperand = sc.nextInt();
			sc.nextLine();
		}
		performOperation(calcType, operation, firstOperand, secondOperand);

	}

	public static int performOperation(int type, int opratn, int operandFirst, int operandSecond) {
		CalculatorFactory factory = new CalculatorFactory();
		return factory.performCalculatorByTypeAndMode(type, opratn, operandFirst, operandSecond);

	}

}
