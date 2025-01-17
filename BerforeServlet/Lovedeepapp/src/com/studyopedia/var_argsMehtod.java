package com.studyopedia;

public class var_argsMehtod {
    public void m1(int[]... twoDArr) {
    	
    	System.out.println(twoDArr);
    	
    	
    	for(int[] oneDArr: twoDArr) {
    		
    		for(int data: oneDArr) {
    			System.out.println(data +"/t");
    		}
    		System.out.println();
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var_argsMehtod t=  new var_argsMehtod();
          int[] arr1= {10,20,30};
          int [] arr2= {100,200,300};
        
        ((var_argsMehtod) t).m1(arr1,arr2);
        

}
}