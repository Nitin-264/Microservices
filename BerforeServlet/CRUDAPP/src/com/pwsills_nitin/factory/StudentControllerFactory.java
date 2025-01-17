package com.pwsills_nitin.factory;

import com.pwskills_nitin.controller.IStudentController;
import com.pwskills_nitin.controller.StudentControllerImpl;

public class StudentControllerFactory {

	private static IStudentController controller = null;
	
	public static IStudentController getStudentControllerObj() {
		if(controller==null) {
			controller = new StudentControllerImpl();
		}
		return controller;
	}
}
