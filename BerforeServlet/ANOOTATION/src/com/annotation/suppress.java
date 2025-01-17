package com.annotation;

import java.util.ArrayList;

class Bank{
	@SuppressWarnings("rawtypes")
	public ArrayList getcustomer() {
		ArrayList al = new ArrayList();
		al.add("NITIN");
		al.add("ROHIT");
		al.add("KHOLI");
		al.add("SACHIN");
		return al;
		
	}
}
public class suppress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b = new Bank();
	    System.out.println(b.getcustomer());
	}

}
