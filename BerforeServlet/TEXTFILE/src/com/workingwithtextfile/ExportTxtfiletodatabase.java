package com.workingwithtextfile;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.jdbcutil.MakeConnection;
public class ExportTxtfiletodatabase {


	private static Connection connection = null;
	private static String sql_insert_query="insert into employee(ename,eaddress,resume)values(?,?,?)";
	
	
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
			 
	         System.out.println("Enter the ename::");
			 String ename = scanner.next();
			 
			 System.out.println("Enter the eaddress::");
			 String eaddress =scanner.next();
			 
			 
			 pstm.setString(1,ename);
			 pstm.setString(2,eaddress);
			 pstm.setCharacterStream(3, new FileReader("D:\\Lovedeepapp\\Ask.txt"));
			int rowCount=pstm.executeUpdate();
			 
			if(rowCount==0) {
				System.out.println("No record inserted ");
			}
			else {
				System.out.println("record inserted succesfully");
			}
			 
		 }
	
		
	}


