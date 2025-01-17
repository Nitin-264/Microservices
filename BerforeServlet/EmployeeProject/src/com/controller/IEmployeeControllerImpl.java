package com.controller;

import com.dto.Employee;
import com.factory.EmployeeService;
import com.service.IEmployeeService;

public class IEmployeeControllerImpl implements IEmployeeController{

	public int insertrecord(Employee employee) throws Exception{
		IEmployeeService employeeservice = EmployeeService.getEmployeeService();
        return employeeservice.insertrecord(employee);
		}
}
