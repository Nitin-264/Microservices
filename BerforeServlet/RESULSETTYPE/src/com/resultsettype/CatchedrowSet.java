package com.resultsettype;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import com.jdbcutil.MakeConnection;

public class CatchedrowSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CachedRowSet chrow = null;
		Connection conn = null;
		Statement stm = null;
		ResultSet res = null;
		
		try{
			conn = MakeConnection.getConnection();
			stm = conn.createStatement();
			res = stm.executeQuery("select * from student");
			
			RowSetFactory factory = RowSetProvider.newFactory();
			
			// DisConnected based rowSet
			chrow = factory.createCachedRowSet();
			
			// Copy ResultSet object to CachedRowSet
			chrow.populate(res);

			conn.close();
			
			/*System.out.println("SID\tSNAME\tSAGE\tSADRESS\t");
			//sql exception
			while(res.next()) {
				System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getInt(3)+"\t"+res.getString(4))
				;
			}
			*/
			System.out.println("SID\tSNAME\tSAGE\tSADRESS\t");
			//sql exception
			while(chrow.next()) {
				System.out.println(chrow.getInt(1)+"\t"+chrow.getString(2)+"\t"+chrow.getInt(3)+"\t"+chrow.getString(4))
				;
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
