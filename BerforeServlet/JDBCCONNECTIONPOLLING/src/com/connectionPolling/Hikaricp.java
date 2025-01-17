package com.connectionPolling;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Hikaricp {

	private static final String SQL_SELECT_QUERY = "select sid,sname,sage,s address from student";

	public static void main(String[] args) {
		String fileInfo = "D:\\JDBCCONNECTIONPOLLING\\src\\com\\jdbcutil\\Hikaricp.properties";
		HikariConfig config = new HikariConfig(fileInfo);

		try (HikariDataSource dataSource = new HikariDataSource(config)) {

			try (Connection connection = dataSource.getConnection()) {
				try (Statement statement = connection.createStatement()) {
					try (ResultSet resultSet = statement.executeQuery(SQL_SELECT_QUERY)) {
						System.out.println("EID\tENAME\tESAL\tEADDR");
						while (resultSet.next()) {
							System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t"
									+ resultSet.getInt(3) + "\t" + resultSet.getString(4));
						}
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
