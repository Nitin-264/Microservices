package com.studyopedia;
class student{
	String name;
	int age;
	float height;
	
	student(String name, int age,float height){
		System.out.println("Calling the constructer");
		this.name=name;
		this.age=age;
		this.height=height;
	}
	void student(String name, int age,float height){
		System.out.println("calling the method");
		this.name=name;
		this.age=age;
		this.height=height;
	}
	
	student(){
		name="nitin";
		age=18;
		height=5.7f;
	}
}
public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student std1 = new student("lovedeep",21,5.10f);
		System.out.println("name:"+std1.name);
		System.out.println("age:"+std1.age);
		System.out.println("height:"+std1.height);
		
		
		student std2= new student();
		System.out.println("name:"+std2.name);
		System.out.println("age:"+std2.age);
		System.out.println("height:"+std2.height);
		
		student std3 = new student("lovedeep",21,5.10f);
		System.out.println("name:"+std3.name);
		System.out.println("age:"+std3.age);
		System.out.println("height:"+std3.height);
		

	}

}
