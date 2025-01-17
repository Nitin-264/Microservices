package com.transcationapp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

import com.jdbcutil.MakeConnection;

public class Transcation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Connection conn = MakeConnection.getConnection()){
			System.out.println(conn.getTransactionIsolation());
			conn.setTransactionIsolation(8);
			System.out.println(conn.getTransactionIsolation());
			try(Statement stm = conn.createStatement()){
				
				conn.setAutoCommit(false);
				
				stm.executeUpdate("insert into politicians(name,party) values('Rahul','congress')");
				stm.executeUpdate("insert into politicians(name,party) values('Deppender','congress')");
				
				Savepoint sp = conn.setSavepoint();
				stm.executeUpdate("insert into politicians values('Arvind','congress')");
				
				System.out.println("oops something went wrong ");
				conn.rollback(sp);
				
				conn.commit();
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
