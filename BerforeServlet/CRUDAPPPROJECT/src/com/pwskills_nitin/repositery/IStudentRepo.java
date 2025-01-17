package com.pwskills_nitin.repositery;

import com.pwskills_nitin.DataTransferObject.StudentBO;
import com.pwskills_nitin.DataTransferObject.StudentDTO;
import com.pwskills_nitin.DataTransferObject.StudentVO;

public interface IStudentRepo {


	/* C=CREATE;
	 * U=UPDATE
	 * R=READ
	 * D=DELETE
	 *  */
	
	public String insertRecord(StudentBO bo); 
		
	public String deleteRecord(int id);
	
	public StudentBO readrecord(int id);

	public String updaterecord(StudentBO bo);
}
