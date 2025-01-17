package com.studyopedia;
interface ICalculator3{
	void sub(int a,int b);
}

class Calc{
	public void add(int a, int b) {
		System.out.println("a+b is : "+(a+b));
	}
}
abstract class Calculatorr extends Calc implements ICalculator3{
	
}

class Calculatorimp3 extends Calculatorr{
	@Override
	public void sub(int a,int b) {
		System.out.println("a-b is :"+(a-b));
	}
}
public class interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Calculatorr cal ;
           cal=new Calculatorimp3();
           cal.add(3, 05);
           cal.sub(5, 03);
           
	}

}
