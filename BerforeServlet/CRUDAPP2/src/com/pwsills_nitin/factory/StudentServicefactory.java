package com.pwsills_nitin.factory;

import com.pwsills_nitin.servies.IServiceImpl;
import com.pwsills_nitin.servies.IStudentService;

public class StudentServicefactory {

	private static IStudentService studentservice = null;
	
	private StudentServicefactory() {
		
	}
	public static IStudentService getStudentService() {
		if(studentservice == null) {
			studentservice = new IServiceImpl();
		 	
		}
		return studentservice;
	}
}
