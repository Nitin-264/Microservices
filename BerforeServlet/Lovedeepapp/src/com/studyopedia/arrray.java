package com.studyopedia;

public class arrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //array declaration
		int [] a=null;
		System.out.println(a);
		//array construction 
		a= new int[5];
	int []	a1=new int [21474838];
		System.out.println(a);
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		
		System.out.println("after initilization");
		
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		}

}
