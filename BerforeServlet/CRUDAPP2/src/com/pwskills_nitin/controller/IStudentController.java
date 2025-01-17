package com.pwskills_nitin.controller;
import java.sql.SQLException;

import com.pwskills_nitin.DataTransferObject.*;

public interface IStudentController {

	/* C=CREATE;
	 * U=UPDATE
	 * R=READ
	 * D=DELETE
	 *  */
	
	public int insertRecord(Student student) throws SQLException; 
		public int deleteRecord(Student student)throws SQLException;
	
}
