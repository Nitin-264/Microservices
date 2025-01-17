package com.resultsettype;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbcutil.MakeConnection;

public class ReseltSetType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Connection conn = MakeConnection.getConnection()){
			
			try(Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)){
				
				System.out.println("Reult in forward ddirection ::");
				
				System.out.println("SID\tSNAME\tSAGE\tSADDDRESS");
				ResultSet rs =stm.executeQuery("select * from student");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4))
					;
				}
				
               System.out.println("Reult in backward ddirection ::");
				
				System.out.println("SID\tSNAME\tSAGE\tSADDDRESS");
				//ResultSet rs =stm.executeQuery("select * from student");
				while(rs.previous()) {
					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4))
					;
				}
				
				System.out.println();
				System.out.println("Result set for navigation::");
				
				rs.first();
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4))
				;
				
				rs.last();
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4))
				;
			}
		}
		catch(SQLException se ) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
