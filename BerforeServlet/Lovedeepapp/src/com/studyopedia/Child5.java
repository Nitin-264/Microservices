package com.studyopedia;


class Parent6{
	int x=10;
	{
		methodone();
		System.out.println("Parent class First instance block");
	}
	Parent6(){
		System.out.println("Parent class constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Parent6 p= new Parent6();
          System.out.println("Parent class main method");
          
	}
	public void methodone(){
		System.out.println(y);
	}
	
	int y=20;
}
 class Child6 extends Parent6 {

	int x=100;
	{
		methodtwo();
		System.out.println("child class First instance block");
	}
	Child6(){
		System.out.println("child class constructor");
	}
	
	public void methodtwo(){
		System.out.println(y);
	}
	
	int y=200;

}

public class Child5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Child6 C=  new Child6();
	}

}
