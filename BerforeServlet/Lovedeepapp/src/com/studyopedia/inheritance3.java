package com.studyopedia;
class Parent1{
	Parent1(){
		System.out.println(this.hashCode());
	}
}

class Child1 extends Parent1{
    Child1(){
		System.out.println(this.hashCode());
	}
}
public class inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Child1 c =new Child1();
	}

}
