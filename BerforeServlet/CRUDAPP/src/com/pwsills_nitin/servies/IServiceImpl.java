package com.pwsills_nitin.servies;
import java.sql.*;

import com.pwsills_nitin.factory.StudentRepofactory;
import com.pwskills_nitin.DataTransferObject.Student;
import com.pwskills_nitin.repositery.IStudentRepo;

public class IServiceImpl implements IStudentService {

	@Override
	public int insertRecord(Student student) {
		IStudentRepo repo = StudentRepofactory.getStudentrepo();
		return repo.insertRecord(student);
	}

}
