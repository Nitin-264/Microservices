package com.pwskills_nitin.controller;
import java.sql.SQLException;

import com.pwskills_nitin.DataTransferObject.*;

public interface IStudentController {

	/* C=CREATE;
	 * U=UPDATE
	 * R=READ
	 * D=DELETE
	 *  */
	
	public String insertRecord(StudentVO student) throws SQLException; 
		
	public String deleteRecord(String id) throws SQLException;

	public StudentVO readrecord(String id);

	public String updaterecord(StudentVO voforUpdation); 
	
}
