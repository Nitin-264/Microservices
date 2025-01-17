package com.photoInsertion;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.jdbcutil.MakeConnection;
public class Imageinsertion {


	private static Connection connection = null;
	private static String sql_insert_query="insert into person (name,photo) values(?,?)";
	
	
	private static PreparedStatement pstm=null;
	static {
		try {
			connection = MakeConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		 pstm = connection.prepareStatement(sql_insert_query);
		 Scanner scanner =new Scanner(System.in);
		 if(pstm!=null && scanner!=null)
			 
	         System.out.println("Enter the username::");
			 String name = scanner.next();
			 
			
			 
			 
			 pstm.setString(1,name);
			 pstm.setBinaryStream(2, new FileInputStream("C:\\Users\\Nitin\\OneDrive\\Pictures\\photo.jpg"));
			int rowCount=pstm.executeUpdate();
			 
			if(rowCount==0) {
				System.out.println("No record inserted ");
			}
			else {
				System.out.println("record inserted succesfully");
			}
			 
		 }

		
	}


