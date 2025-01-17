package com.photoInsertion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

import com.jdbcutil.*;
public class ExctractImagefromDatabase {
	private	static final String query = "select id,name,photo from person where id=? ";
	public static void main(String[] args) throws Exception {
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
			System.out.println("ID\tUSER\t");
			
			System.out.println(resultset.getInt(1)+"\t"+resultset.getString(2));
			//System.out.println(imageinfo(resultset.getBinaryStream(3)));
			IOUtils.copy(resultset.getBinaryStream(3),new FileOutputStream("download.jpg"));
		}
		else {
			System.out.println("No record found..");
		}
		
	}
	/* we dont write logic we use inbuilt logic using jars given by apache community
	 * private static String imageinfo(InputStream binaryStream) throws Exception {
		String location = "download.jpg";
		FileOutputStream fos = new FileOutputStream(location);
				
		byte [] imagebuffer = new byte[1024];
		while((binaryStream.read(imagebuffer))>0) {
			fos.write(imagebuffer);
			
		}
		fos.close();
		binaryStream.close();
		return "file downloaded succesfully"+location;
	}
*/
}
