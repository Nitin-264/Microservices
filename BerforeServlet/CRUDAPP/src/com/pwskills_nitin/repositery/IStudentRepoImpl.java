 package com.pwskills_nitin.repositery;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

import com.jdbcutil.*;
import com.pwskills_nitin.DataTransferObject.*;

public class IStudentRepoImpl implements IStudentRepo {

	private static Connection connection = null;
	static {
		try {
			connection = MakeConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public int insertRecord(Student student ) {
		
		Statement statement = null;
		if(connection!=null) {
			try {
				statement = connection.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String sqlInsertQuery = null;
		Integer sid = student.getSid();
		String sname = student.getSname();
		Integer sage = student.getSage();
		String sadderss = student.getSaddress();
		
		sqlInsertQuery = String.format("insert into student values(%d,'%s',%d,'%s')",sid,sname,sage,sadderss);
		
		System.out.println(sqlInsertQuery);
		if(statement!=null&& sqlInsertQuery!=null) {
			try {
				return statement.executeUpdate(sqlInsertQuery);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}
}
		