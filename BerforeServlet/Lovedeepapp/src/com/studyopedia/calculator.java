package com.studyopedia;
 class addition{
	 
	 void add(int a,int b) {
		 System.out.println(a+b);
	 }
	 
	 void add(int a,int b,int c) {
		 System.out.println(a+b+c);
	 }
	 
	 void add(double  a,double b) {
		 System.out.println(a+b);
	 }
	 
	 void add(float a,float b) {
		 System.out.println(a+b);
	 }
 }
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        addition a=new addition();
       a. add(10,20);
       a.add(34,35,65 );
	}

}
