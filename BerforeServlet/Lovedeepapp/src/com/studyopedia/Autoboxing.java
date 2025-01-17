package com.studyopedia;

public class Autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("+++++++AutoUnboxing+++++++");
		//Internally compiler will do int i2=i1.intvalue()
		Integer i1= new Integer(10);
		int i2=i1;
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println("+++++++Autoboxing+++++++");
		
		//Internally compiler will do Integer i4= Integer.valueof(i3)
		int i3=10;
		Integer i4=  i3;
		System.out.println(i3);
		System.out.println(i4);
		
		
	}

}
