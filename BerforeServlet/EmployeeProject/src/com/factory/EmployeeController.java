package com.factory;

import com.controller.IEmployeeController;
import com.controller.IEmployeeControllerImpl;

public class EmployeeController {

	private static IEmployeeController employeecontroller = null;
	public  static IEmployeeController getemployeecontroller() {
		if (employeecontroller==null) {
			employeecontroller= new IEmployeeControllerImpl();
			
		}
		return employeecontroller;
	}
}
