package com.pwskills_nitin.controller;

import java.sql.SQLException;

import com.pwsills_nitin.factory.StudentServicefactory;
import com.pwsills_nitin.servies.IStudentService;
import com.pwskills_nitin.DataTransferObject.Student;

public class StudentControllerImpl implements IStudentController{

	@Override
	public int insertRecord(Student student) throws SQLException {
		IStudentService service = StudentServicefactory.getStudentService();
		int rowAffected=service.insertRecord(student);
		return rowAffected;
		
	}
	
	
}
