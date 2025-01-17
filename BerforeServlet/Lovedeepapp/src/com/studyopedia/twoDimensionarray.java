package com.studyopedia;

public class twoDimensionarray {
	public static void main(String[] args) {
		//array construction
		int a[][]= new int [2][2];
		System.out.println(a);
		
		//arrray intilization
		
		
		a[0][0]=10;
		a[0][1]=102;
		
		
		a[1][0]=20;
	    a[1][1]=200;
	    
	    
	    for(int i=0 ; i<2;i++) {
	    	for(int j=0;j<2;j++) {
	    		System.out.println(a[i][j]);
	    	}
	    }
	}
}
