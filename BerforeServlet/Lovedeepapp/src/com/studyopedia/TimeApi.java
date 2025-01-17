package com.studyopedia;
import java.time.*;
import java.util.TimeZone;
public class TimeApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TimeZone tz = TimeZone.getDefault();
		System.out.println(tz);
		
		ZoneId tz1 = ZoneId.systemDefault();
		System.out.println(tz1);
		
		ZonedDateTime zdt = ZonedDateTime.now(tz1);
		System.out.println(zdt);
		
		
	}

}
