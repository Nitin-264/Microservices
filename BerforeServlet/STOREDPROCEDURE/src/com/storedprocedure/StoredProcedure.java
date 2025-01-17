package com.storedprocedure;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import com.jdbcutil.MakeConnection;
import com.mysql.cj.jdbc.CallableStatement;

public class StoredProcedure {

	private static final String CALL_QUERY = "CALL GET_PRODUCT_DETAILS_BY_PID (?,?,?,?)";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int id=0;
		if(scanner!=null){
			System.out.println("Enter the pid whose details to  e displayed::");
			id = scanner.nextInt();
		}
		try(Connection conn = MakeConnection.getConnection()){
			try(java.sql.CallableStatement cst = conn.prepareCall(CALL_QUERY)){
				
				cst.setInt(1, id);
				cst.registerOutParameter(2, Types.VARCHAR);
				cst.registerOutParameter(3, Types.FLOAT);
				cst.registerOutParameter(4, Types.INTEGER);
				
				cst.execute();

				String name = cst.getString(2);
				float price = cst.getFloat(3);
				int qnt = cst.getInt(4);
				System.out.println(name+"      "+price+"      "+qnt);
				
			}
		}
		catch(SQLException se) {
		se.printStackTrace();	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		scanner.close();
	}

}
