package com.studyopedia;

public class switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x=10;
		//in switch case case value should be in range of data type 
		switch(x+1) {//byte  +  integer =>  integer
		// the below code get be executed because case 2000  is in range of integer but  there will be no output because the value in switch statement is 11 which is  not matching with anyof these cases
		case 10: System.out.println(10);
	      case 2000: System.out.println(2000);
	      case 3244:System.out.println(3244);
		}
		      
	}

}
