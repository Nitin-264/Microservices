//package com.studyopedia;
class Test() {
	Static int count =0;
	{
		count ++;
	}
	Test(){
		
	}
	Test(int x){
		
	}
}
public class noOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Test t1=  new Test();
          Test t2=  new Test(100);
          Test t3=  new Test();
		  System.out.println(count);
	}

}
