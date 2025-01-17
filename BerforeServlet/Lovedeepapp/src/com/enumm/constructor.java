package com.enumm;

enum result{
	pass,fail,absent;
	
	static {
		System.out.println("Result.class file loading ..");
	}
	result(){
		System.out.println("Result constructor got called...");
	}
}
public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		result res =   result.pass;
	}

}
