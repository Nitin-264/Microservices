package com.studyopedia;

public class exception2 {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("statement1");
		//System.out.println(10/0);
		//System.out.println("statement2");
		
		
		try{
			System.out.println("Inside try block");
		System.out.println(10/0);
		
		
		}
		catch(ArithmeticException e){
		System.out.println("Catch block");
		}
		
		finally {
			System.out.println("Inside finally");
		}
		
	}
}
