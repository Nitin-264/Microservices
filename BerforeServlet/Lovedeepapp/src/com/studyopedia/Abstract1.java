package com.studyopedia;
abstract class Vechile{
	abstract public int  wheels();
	public void info() {
		System.out.println("Genral information...");
	}
}

class Bus extends Vechile{
	@Override
	public int wheels() {
		return 7;
	}
	@Override
	
	public void info() {
		System.out.println("VOLVO BUS ...");
	}
}
class Auto extends Vechile{
	@Override
	public int wheels() {
		return 3;
	}
	public void info() {
		System.out.println("UBER AUTO ...");
	}
}
public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Vechile v1=  new Bus();
         Vechile v2 = new Auto();
         
         v1.info();
         System.out.println("No of wheels in the bus is :" +v1.wheels() );
         
         v2.info();
         System.out.println("No of wheels in the bus is :" +v2.wheels() );
	}

}
