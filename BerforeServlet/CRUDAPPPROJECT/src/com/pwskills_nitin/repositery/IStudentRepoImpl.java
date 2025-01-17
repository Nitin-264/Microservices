 package com.pwskills_nitin.repositery;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

import com.jdbcutil.*;
import com.pwskills_nitin.DataTransferObject.*;

public class IStudentRepoImpl implements IStudentRepo {

	private static Connection connection = null;
	
	
	private static PreparedStatement insertPstmt = null;
	private static PreparedStatement deletePstmt = null;
	private static PreparedStatement readPstmt = null;
	private static PreparedStatement updatePstmt = null;
	
	private static final String SQL_INSERT_QUERY ="insert into student(`sname`,`sage`,`saddress`) values(?,?,?)";
	private static final String SQL_DELETE_QUERY ="delete from student where sid =?";
	private static final String SQL_READ_QUERY ="select sid,sname,sage,saddress from student where sid =?";
	private static final String SQL_UPDATE_QUERY = "update student set sname=?,sage=?,saddress=? where sid =?";
	static {
		try {
			connection = MakeConnection.getConnection();
			if (connection!=null) {
				insertPstmt = connection.prepareStatement(SQL_INSERT_QUERY);
			}
			if (connection!=null) {
				deletePstmt = connection.prepareStatement(SQL_DELETE_QUERY);
			}
			if (connection!=null) {
				readPstmt = connection.prepareStatement(SQL_READ_QUERY);
			}
			if (connection!=null) {
				updatePstmt = connection.prepareStatement(SQL_UPDATE_QUERY);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public String  insertRecord(StudentBO student ) {
		
		String status="";
		
		try {
			
			if (insertPstmt!=null) {
				
				insertPstmt.setString(1, student.getSname());
				insertPstmt.setInt(2, student.getSage());
				insertPstmt.setString(3, student.getSaddress());
				
				
				System.out.println();
				System.out.println("\n****USING BO TO PERFORM PERISTENCE OPERATION****");
				int rowCount = insertPstmt.executeUpdate();
				if (rowCount == 1) {
					status = "success";
				}
			}
		}
		catch(SQLException se) {
			int errorCode = se.getErrorCode();
			if (errorCode == 1064) {
				status = "some error in db operation";
			} else if (errorCode == 2006) {
				status = "connection lost at dbside";
			} else if (errorCode == 1045) {
				status = "acess denied for the user wrong credentialsm";
			} else if (errorCode == 1044) {
				status = "access denied for the user to database";
			} else {
				status = "Some Error at database side";
			}
			System.out.println(se);
		}
		catch(Exception e) {
			status = "Some unknown exception";
			System.out.println(e);
		}
		return status;
	}
	@Override
	public String deleteRecord(int id) {
		// TODO Auto-generated method stub
		String status ="";
		try {
			if (deletePstmt!=null) {
				
				deletePstmt.setInt(1,id);
				deletePstmt.executeUpdate();
				status="Success";
				
				
			}
		}
		catch(SQLException se) {
			status ="Some Exception occured...";
			System.out.println(se);
		}
		return status;
	}
	@Override
	public StudentBO readrecord(int id) {
		// TODO Auto-generated method stub
		StudentBO bo =null;
		try {
			if (readPstmt!=null) {
				readPstmt.setInt(1, id);
				ResultSet rs = readPstmt.executeQuery();
				
				if (rs!=null) {
					
					while(rs.next()) {
						bo = new StudentBO();
						bo.setSid(rs.getInt(1));
						bo.setSname(rs.getString(2));
						bo.setSage(rs.getInt(3));
						bo.setSaddress(rs.getString(4));
						System.out.println(bo);
					}
				}
			}
		}
		catch(SQLException se) {
			System.out.println(se);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		return bo;
	}
	@Override
	public String updaterecord(StudentBO bo) {
		// TODO Auto-generated method stub
		String status = "";
		try {
			if (updatePstmt != null) {
				updatePstmt.setString(1, bo.getSname());
				updatePstmt.setInt(2, bo.getSage());
				updatePstmt.setString(3, bo.getSaddress());
				

				updatePstmt.setInt(4, bo.getSid());

				updatePstmt.executeUpdate();
				status = "success";

			}
		} catch (SQLException e) {
			status = "SOME PROBLEM WITH DATABASE";
			e.printStackTrace();
		}
		return status;
		
	}
}
		