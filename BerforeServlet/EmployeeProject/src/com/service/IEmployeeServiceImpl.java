package com.service;

import com.dto.Employee;
import com.factory.EmployeeRepo;
import com.reposistery.IEmployeeRepo;

public class IEmployeeServiceImpl implements IEmployeeService {

	@Override
	public int insertrecord(Employee employee) throws Exception  {
		IEmployeeRepo repo = EmployeeRepo.getemployeerepo();
		return repo.insertrecord(employee);
	}

}
