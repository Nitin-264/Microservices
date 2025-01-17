package com.studyopedia;
interface car{
	void noOfWheels();
	default void engine() {
		System.out.println("Enigine made from :: Toyota");
	}
}

class Car implements car{
	public void noOfWheels() {
		System.out.println("No of wheels =4");
	}
	public void engine() {
		System.out.println("Enigine made from :: Toyota Fortuner");
	}
}
public class Jdkfeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car Toyota = new Car();
		Toyota.noOfWheels();
		
	}

}
