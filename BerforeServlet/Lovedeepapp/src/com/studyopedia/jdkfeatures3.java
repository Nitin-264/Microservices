package com.studyopedia;

import java.util.function.Predicate;

public class jdkfeatures3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<String> s = i->i.length()<3;
		
		System.out.println(s.test("Nitin"));
		System.out.println(s.test("Nn"));
		System.out.println(s.test("kom"));
		System.out.println(s.test("Al"));
	}

}
