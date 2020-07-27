package com.java.factorypattern.transportfarecalculator;

public class Metro implements IVehicle{

	private int fare;
	private String route;
	
	public Metro(int fare,String route){
		this.fare=fare;
		this.route=route;
	}
	@Override
	public String displayInformation() {
		
		return "Fare is "+ fare+"Route is "+route;
	}

	@Override
	public int getFare() {
		
		return fare;
	}

}
