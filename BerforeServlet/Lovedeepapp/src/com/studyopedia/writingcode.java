package com.studyopedia;
  class Fan{
	  //has- part[variable]
	 String colour;
	 int  noofWings;
	 int price;
	 
	 //Does psrt [methods];
	 void rotate() {
		 System.out.println("Fan is rotating");
	 }
	 void blowAir() {
		 System.out.println("Fan is blowing air");
	 }
	 void stop() {
		 System.out.println("Fan is stopped");
	 }
  }
public class writingcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		//creating an instance of fan
		Fan f1=new Fan();
		//calling the methode of fan class
		f1.rotate();
		f1.blowAir();
		f1.stop();
	}

}
