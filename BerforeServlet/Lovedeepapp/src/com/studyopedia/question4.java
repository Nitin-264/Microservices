package com.studyopedia;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x=0;
      do {
    	  x=x+1;
    	  System.out.println(x);
    	  if((x=x+1)<5) 
    		  continue;
    	  x=x+1;
    	  System.out.println(x);
    		  
    	  
      }while(++x<10);
	}

}
