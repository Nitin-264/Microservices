package com.jdbcutil;

import java.sql.Statement;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class MakeConnection {
	private static FileInputStream fis=null;
	private static Properties properties=null;
static {
	String path="D:\\EmployeeProject\\src\\com\\jdbcutil\\DataBase.properties";
	try {
		fis=new FileInputStream(path);
		properties=new Properties();
		properties.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public static Connection getConnection() throws SQLException {
	
		return DriverManager.getConnection(properties.getProperty("url")
				,properties.getProperty("user"),properties.getProperty("password"));
		
	
}
public static void cleanObject(Connection connection,Statement stmt,ResultSet rs) {
	try {
		if(connection!=null) {
			connection.close();
		}
		if(stmt!=null) {
			stmt.close();
		}
		if(rs!=null) {
			rs.close();
		}
			} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
