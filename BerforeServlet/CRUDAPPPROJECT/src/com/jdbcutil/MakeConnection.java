package com.jdbcutil;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class MakeConnection {
	private static DataSource datasource = null;
	private static Properties properties=null;
static {
	String path="/CRUDAPPPROJECT/src/com/jdbcutil/hikaricp.properties";
	try {
		
		HikariConfig config = new HikariConfig(path);
		datasource = new HikariDataSource(config);
		System.out.println(datasource);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static Connection getConnection() throws SQLException {
	
		return datasource.getConnection();
	
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
