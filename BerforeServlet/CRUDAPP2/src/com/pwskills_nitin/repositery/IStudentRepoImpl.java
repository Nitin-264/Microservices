package com.pwskills_nitin.repositery;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

import com.jdbcutil.*;
import com.pwskills_nitin.DataTransferObject.*;

public class IStudentRepoImpl implements IStudentRepo {

	private static Connection connection = null;
	private static String delete_query="delete from student where sid =?";
	
	private static PreparedStatement pstm=null;
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
		
		return 0;}

	@Override
	public int deleteRecord(Student student) {
		     try {
				pstm = connection.prepareStatement(delete_query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 if(pstm!=null) {
				 
				 int sid =student.getSid();
				 try {
					pstm.setInt(1,sid);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 try {
					return pstm.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 }
			 return 0;
	}
	
}
