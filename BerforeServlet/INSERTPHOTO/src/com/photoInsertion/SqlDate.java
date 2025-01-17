package com.photoInsertion;

import java.text.SimpleDateFormat;

public class SqlDate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String induser = "03-03-2024";
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date util = sdf.parse(induser);
		long inputms = util.getTime();
		
		java.sql.Date sql = new java.sql.Date(inputms);
		System.out.println(sql);
		
	}

}
