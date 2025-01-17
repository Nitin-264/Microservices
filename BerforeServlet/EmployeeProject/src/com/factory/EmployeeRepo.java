package com.factory;

import com.reposistery.IEmployeeRepo;
import com.reposistery.IEmployeeRepoImpl;

public class EmployeeRepo {

	private static IEmployeeRepo employeerepo = null;
	
	public static IEmployeeRepo getemployeerepo() {
		if(employeerepo==null) {
			employeerepo = new IEmployeeRepoImpl();
		}
		return employeerepo;
	}
}
