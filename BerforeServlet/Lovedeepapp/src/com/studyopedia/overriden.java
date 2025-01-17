package com.studyopedia;
class Parent2{
	public Object methodone() {
		return null;
	}
}
class Child2 extends Parent2{
	public String methodone() {
		
		return "sachin";
	}
}
public class overriden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Child2 c= new Child2();
         System.out.println(c.methodone());
	}

}
