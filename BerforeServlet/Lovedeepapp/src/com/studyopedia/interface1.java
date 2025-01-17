package com.studyopedia;
interface ICalculator{
	void add(int a,int b);
	void sub(int a,int b);
	void mul(int a,int b);
	void div(int a,int b);
}

class Calculatorimp implements ICalculator{

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		int sum =a+b;
		System.out.println(sum);
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		int subb=a-b;
		System.out.println(subb);
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		int res=a*b;
		System.out.println(res);
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		float que=a/b;
		System.out.println(que);
	}
	
}
public class interface1 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
            ICalculator cal;
            cal= new Calculatorimp();
            cal.add(3, 4);
            cal.sub(76, 90);
            cal.mul(87, 675);
            cal.div(675, 87);
            
	}

}
