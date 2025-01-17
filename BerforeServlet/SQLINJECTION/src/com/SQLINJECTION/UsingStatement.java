package com.SQLINJECTION;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbcutil.MakeConnection;

public class UsingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Connection connection = MakeConnection.getConnection()){
			try(Statement stm =  connection.createStatement() ;) {
				
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter name");
				String name = scanner.next();
				name = "'"+name+"'";
				
				System.out.println("Enter password");
				String password = scanner.next();
				password = "'"+password+"'";
				
				String SQL_Query= "select count(*) from people where name="+name+" and password="+password+" ";
				try(ResultSet resultset= stm.executeQuery(SQL_Query)){
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
