package com.Genric;
import java.util.*;
public class communicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<String>();
		al.add("Nitin");
		methodOne(al);
		System.out.println(al);
	}

	public static void methodOne(ArrayList al) {
		al.add(10.5);
		al.add(10);
		al.add(true);
		
	}
}
