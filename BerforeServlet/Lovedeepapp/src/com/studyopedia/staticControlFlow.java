package com.studyopedia;

public class staticControlFlow {
	 static int i=10;
	 static {
		 methodone();
		 System.out.println("First static block:\t");
	 }
	 public static void  methodone() {
		 System.out.println(j);
		 }
	 static {
		 System.out.println("second static block:\t"); 
	 }
	 static int j=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      methodone();
      System.out.println("Inside main method\t");
       
	}

}
