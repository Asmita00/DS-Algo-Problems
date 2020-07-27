package com.java.factorypattern.transportfarecalculator;

public class TransportMode {

	public static void main(String[] args) {
		int total=0;
		String[][] transportMode ={
				{"8","Auto"},
				{"15", "Metro"},
				{"5", "Auto"}
				
		};
		displayCostOfTranspMode(total, transportMode);
		

	}

	private static void displayCostOfTranspMode(int total, String[][] transportMode) {
		for(int i=0;;){
			for(int j=0;i <transportMode.length;i++){
				
				System.out.println("Transport Mode "+transportMode[i][j+1]+" charged Rs."+transportMode[i][j]+" for single way");
				int charge=Integer.valueOf(transportMode[i][j]);
				 total =total+charge;
			}
			System.out.println("To and fro total charge is :"+2*total);
			break;
		}
		
	}

}
