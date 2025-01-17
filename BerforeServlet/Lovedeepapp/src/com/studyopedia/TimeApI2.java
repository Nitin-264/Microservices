package com.studyopedia;
import java.time.*;
public class TimeApI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate todayDate = LocalDate.now();
		LocalDate birthDate = LocalDate.of(2003, 03, 30);
		
		Period p = Period.between(todayDate, birthDate);
		System.out.println(p);
		System.out.println(p.getYears());
	}

}
