
package com.studyopedia;

class Calculator{
	int addTwoNumbers(int a,int b){
		int c=a+b;
		return c;
	}
	
	int subtractTwoNumbers(int a,int b) {
		int d=a-b;
		return d;
		
	}
	int mutiplication(int a, int b) {
		int e=a*b;
		return e;
	}
}
public class calulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//creating an instance of a calculator
        Calculator calc = new Calculator();
        
        //calling a method using refernces
      int x= calc.addTwoNumbers(145,45);
        System.out.println(x);
        
       int y= calc.subtractTwoNumbers(58,10);
        System.out.println(y);
       int z= calc.mutiplication(14, 12);
        System.out.println(z);
        
	}

}
