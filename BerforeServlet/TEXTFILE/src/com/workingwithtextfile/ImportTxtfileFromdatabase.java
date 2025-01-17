package com.workingwithtextfile;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

import org.apache.commons.io.IOUtils;

import com.jdbcutil.*;
public class ImportTxtfileFromdatabase {
	private	static final String query = "select eid,ename,eaddress,resume from employee where eid=? ";
	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub

		Connection connection =null;
		PreparedStatement pstm =null;
		ResultSet resultset = null;
		
		try {
			connection = MakeConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pstm =connection.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(connection!=null && pstm!=null) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id::");
		int id = scanner.nextInt();
		
		pstm.setInt(1, id);
		resultset=pstm.executeQuery();
		
		}
		
		if(resultset.next()) {
			System.out.println("EID\tENAME\tEADDRESS\t");
			
			String location = "resume.txt";
			FileWriter filewriter = new FileWriter(new File(location));
			IOUtils.copy(resultset.getCharacterStream(4), filewriter);
			filewriter.flush();
			System.out.println(resultset.getInt(1)+"\t"+resultset.getString(2)+"\t"+resultset.getString(3));
		}
		
	}
	

}
