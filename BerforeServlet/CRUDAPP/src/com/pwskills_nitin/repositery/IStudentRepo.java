package com.pwskills_nitin.repositery;

import com.pwskills_nitin.DataTransferObject.Student;

public interface IStudentRepo {


	/* C=CREATE;
	 * U=UPDATE
	 * R=READ
	 * D=DELETE
	 *  */
	
	public int insertRecord(Student student); 
		
}
