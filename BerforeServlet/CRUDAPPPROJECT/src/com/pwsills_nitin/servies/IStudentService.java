package com.pwsills_nitin.servies;

import com.pwskills_nitin.DataTransferObject.StudentDTO;
import com.pwskills_nitin.DataTransferObject.StudentVO;

public interface IStudentService {


	/* C=CREATE;
	 * U=UPDATE
	 * R=READ
	 * D=DELETE
	 *  */
	
	public String insertRecord(StudentDTO dto); 
		
	public String deleteRecord(int i);
	
	public StudentDTO readrecord(int i);
	
	public String updaterecord(StudentDTO dto);
}
