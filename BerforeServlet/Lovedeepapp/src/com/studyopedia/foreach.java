package com.studyopedia;

import java.util.Scanner;

public class foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size =0;
        System.out.println("Enter the length of arr;");
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        
        
        int[] arr = new int[size];
        System.out.println(arr);
        System.out.println("Before initialization");
        for(int i=0; i<arr.length;i++) {
        	
        	System.out.println(arr[i]);
        }
        
        for(int i=0; i<arr.length;i++) {
        	System.out.println("Enter the value of the array;");
        	arr[i]=scan.nextInt();
        }
        System.out.println("After initilization");
       for(int data: arr) {
    	   System.out.println(data);
       }
	}

}
