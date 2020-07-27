package com.java.factorypattern.transportfarecalculator;

import com.java.factorypattern.transportfarecalculator.VehicleManager.TRANSPORTMODE;

public class TestMain {

	public static void main(String[] args) {
		IVehicle vehicle = VehicleManager.getVehicles(TRANSPORTMODE.AUTO, "kudghatToTollygunge", 8);
		IVehicle vehicleTwo = VehicleManager.getVehicles(TRANSPORTMODE.METRO, "kudghatToShovaBazar", 15);
		
		System.out.println(vehicle.displayInformation());
		System.out.println("Total Fare :: " + VehicleManager.totalFare());

	}

}
