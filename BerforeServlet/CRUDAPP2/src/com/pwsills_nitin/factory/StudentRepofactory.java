package com.pwsills_nitin.factory;

import com.pwskills_nitin.repositery.IStudentRepo;
import com.pwskills_nitin.repositery.IStudentRepoImpl;

public class StudentRepofactory {

	private static IStudentRepo studentrepo =null;
	
	
	public static IStudentRepo getStudentrepo() {
		if(studentrepo==null) {
			studentrepo = new IStudentRepoImpl();
		}
		return studentrepo ;
	}
}
