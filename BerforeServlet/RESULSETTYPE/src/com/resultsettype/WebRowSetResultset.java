package com.resultsettype;

import java.io.FileWriter;
import java.sql.SQLException;

import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

public class WebRowSetResultset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RowSetFactory factory =null;
		WebRowSet web =null;
		
		try {
		     factory = RowSetProvider.newFactory();
			 web =  factory.createWebRowSet();
			
			web.setUrl("jdbc:mysql:///pwskills_octbatch");
			web.setUsername("root");
			web.setPassword("root123");
			
			web.setCommand("select * from student");
			web.execute();
			
			FileWriter filewriter = new FileWriter("std.xml");
			web.writeXml(filewriter);
			System.out.println("Student data copied and written to file std.xml succesfully");
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
