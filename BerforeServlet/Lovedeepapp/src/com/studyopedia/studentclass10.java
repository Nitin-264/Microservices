package com.studyopedia;

class Student{
	//properties/fields
	String name;
	int age;
	
	//methods
	public void dispstdDetails() {
		System.out.println(name);
		System.out.println(age);
	}
	
}
public class studentclass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s =new Student();
      
     s.dispstdDetails();
	}

}
