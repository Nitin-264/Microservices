package com.studyopedia;

public class continuebasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int x=2;
          for(int i=0;i<10;i++) {
        	  if(i%x==0)
        		  continue;
        	  
        	  System.out.println(i);
          }
	}

}
