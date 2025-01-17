package com.studyopedia;
class Parent{
	Parent(){
		System.out.println("PARENT CLASS CONSTRUCTOR\t");
	}
}
class Child extends Parent {
	Child(){
		System.out.println("CHILD CLASS CONSTRUCTOR\t");
	}
}
public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Parent p= new Parent();
           System.out.println("\t");
           Child c= new Child();
	}

}
