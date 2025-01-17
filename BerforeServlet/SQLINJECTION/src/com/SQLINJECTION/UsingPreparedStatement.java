package com.SQLINJECTION;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbcutil.MakeConnection;

public class UsingPreparedStatement {
	private static String SQL_Query= "select count(*) from people where name=? and password=? ";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Connection connection = MakeConnection.getConnection()){
			try(PreparedStatement stm =  connection.prepareStatement(SQL_Query) ;) {
				
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter name");
				String name = scanner.next();
				
				System.out.println("Enter password");
				String password = scanner.next();
			
				
				stm.setString(1, name);
				stm.setString(2, password);
				try(ResultSet resultset= stm.executeQuery()){
					int count =0;
					
					if(resultset.next()) {
						count = resultset.getInt(1);
						
					}
					if(count==1) {
						System.out.println("Valid incredetials");
					}
					else {
						System.out.println("Invalid incredetails");
					}
				}
			
			}
	
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
	}

}
