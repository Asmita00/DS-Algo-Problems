package com.java.leetcodehireandfire;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparator<Employee>{
	
	private double managerRating;
	private double peerRating;
	private double avgrating;
	public double getManagerRating() {
		return managerRating;
	}
	public void setManagerRating(double managerRating) {
		this.managerRating = managerRating;
	}
	public double getPeerRating() {
		return peerRating;
	}
	public void setPeerRating(double peerRating) {
		this.peerRating = peerRating;
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		double avgRatingEmp1 = setAvgrating(o1.getPeerRating(),o1.getManagerRating());
		double avgRatingEmp2 = setAvgrating(o2.getPeerRating(),o2.getManagerRating());
		if(avgRatingEmp1<avgRatingEmp2){
		return -1;
		}
		else if(avgRatingEmp1>avgRatingEmp2){
		return 1;
		}
		return 0;
	}
	public double getAvgrating() {
		return avgrating;
	}
	public double setAvgrating(double peerRating,double managerRating) {
		return (peerRating+managerRating)/2;
	}
	
	public  static List<Employee> employeeBuilder() {
		
		List<Employee> employeeList = new ArrayList<>();
		
		Employee a1 = new Employee();
		a1.setManagerRating(3.23);
		a1.setPeerRating(4.1);
		
		Employee a2 = new Employee();
		a2.setManagerRating(4.23);
		a2.setPeerRating(3.1);
		
		Employee a3 = new Employee();
		a3.setManagerRating(3.18);
		a3.setPeerRating(2.1);
		
		Employee a4 = new Employee();
		a4.setManagerRating(3.29);
		a4.setPeerRating(4.1);
		
		Employee a5 = new Employee();
		a5.setManagerRating(3.98);
		a5.setPeerRating(3.75);
		
		Employee a6 = new Employee();
		a6.setManagerRating(4.67);
		a6.setPeerRating(3.91);
		
		employeeList.add(a1);
		employeeList.add(a2);
		employeeList.add(a3);
		employeeList.add(a4);
		employeeList.add(a5);
		employeeList.add(a6);
		
		return employeeList;
		
		
	}


}


