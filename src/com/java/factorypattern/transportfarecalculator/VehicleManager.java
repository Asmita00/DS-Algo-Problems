package com.java.factorypattern.transportfarecalculator;

import java.util.ArrayList;
import java.util.List;

public class VehicleManager {
	enum TRANSPORTMODE{AUTO,METRO};
	
	private static List<IVehicle> vehicleList = new ArrayList<IVehicle>();
public static IVehicle getVehicles(TRANSPORTMODE mode,String route,int fare){
	if(mode==TRANSPORTMODE.AUTO){	
	IVehicle v = new Auto(fare,route);
	vehicleList.add(v);
	return v;
	}
	else if(mode==TRANSPORTMODE.METRO){
		IVehicle v = new Metro(fare,route);
		vehicleList.add(v);
		return v;
			}
	else {
		return null;
	}
	
}

public static int totalFare(){
	int total=0;
	for(IVehicle v :  vehicleList){
	 total = total+v.getFare();	
	}
	return total;
}
}
