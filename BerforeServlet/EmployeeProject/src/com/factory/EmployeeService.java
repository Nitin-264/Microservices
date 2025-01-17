package com.factory;

import com.service.IEmployeeService;
import com.service.IEmployeeServiceImpl;

public class EmployeeService {

	private static IEmployeeService employeeservice = null;
	
	public static IEmployeeService getEmployeeService() {
		if (employeeservice==null) {
			employeeservice= new IEmployeeServiceImpl();
			
		}
		return employeeservice;
	}
}
