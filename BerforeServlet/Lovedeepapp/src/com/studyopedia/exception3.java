package com.studyopedia;

public class exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			//System.out.println("Inside try block");
		System.out.println(10/0);
		
		
		}
		catch(ArithmeticException e){
		System.out.println(10/0);
		}
		
		finally {
			String s= null;
			System.out.println(s.length());
		}
	}

}
