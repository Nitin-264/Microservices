package com.InsertApp;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

import com.jdbcutil.MakeConnection;
public class InsertApp {


	private static Connection connection = null;
	//private static String sql_insert_query="insert into student(sid,sname,sage,saddress)values(?,?,?,?)";
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
	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub

		 pstm = connection.prepareStatement(delete_query);
		 Scanner scanner =new Scanner(System.in);
		 if(pstm!=null && scanner!=null) {
			 
			 System.out.println("Enter the sid::");
			 int sid =scanner.nextInt();
			 pstm.setInt(1,sid);
			 
			// System.out.println("No of rows affected is "+pstm.executeUpdate());
			 System.in.read();
			/*
	         System.out.println("Enter the sname::");
			 String sname = scanner.next();
			 
			 System.out.println("Enter the sage::");
			 int sage =scanner.nextInt();
			 
			 System.out.println("Enter the saddress::");
			 String saddress = scanner.next();
			 
			 pstm.setInt(1,sid);
			 pstm.setString(2,sname);
			 pstm.setInt(3, sage);
			 pstm.setString(4,saddress);*/
			 
			/*int rowCount=pstm.executeUpdate();
			 
			if(rowCount==0) {
				System.out.println("No record inserted ");
			}
			else {
				System.out.println("record inserted succesfully");
			}*/
			 
			 System.out.println("Using same compiled prepared statement object toperform deletion");
			 
			 System.out.println("Enter the sid::");
			 sid =scanner.nextInt();
			 pstm.setInt(1,sid);
			 
			 System.out.println("No of rows affected is "+pstm.executeUpdate());
			 
		 }
		
	}

}
