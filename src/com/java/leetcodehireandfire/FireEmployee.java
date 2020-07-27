package com.java.leetcodehireandfire;

import java.util.Collections;
import java.util.List;

public class FireEmployee {

	public static void main(String[] args) {

		List<Employee> employeeList = Employee.employeeBuilder();
		Collections.sort(employeeList, new Employee());
		System.out.println("The employee having manager rating:" + employeeList.get(0).getManagerRating()
				+ " and peer rating:" + employeeList.get(0).getPeerRating() + " will be fired. His average rating is:"
				+ (employeeList.get(0).getPeerRating() + employeeList.get(0).getManagerRating()) / 2);
	}
}
