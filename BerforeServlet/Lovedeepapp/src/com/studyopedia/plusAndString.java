package com.studyopedia;

public class plusAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="sachin";
		char D;
		int a= 10,b=20,c=30;
		//int + String => concatination(joining String)
		System.out.println(a+b+c+name);//60sachin
		System.out.println(name+a+b+c);//sachin102030
		System.out.println(a+b+name+c);//30sachin30

		System.out.println(a+name+b+c);//10sachin2030
		System.out.println("D"+a);
	}

}
