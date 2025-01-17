package com.studyopedia;

interface Vehicle
{
//public abstract methods
String getBrand();
String speedUp();
String speedDown();
//default methods
default String turnAlarmOn()
{
return "Turning the Vehicle alaram on...";
}
default String turnAlarmOff()
{
return "Turning the Vehicle alaram of...";
}
//static methods :: utility methods/helper methods
public static void cleanVehicle()
{
System.out.println("Clean the Vehicle Properly....");
}
}
class Car1 implements Vehicle
{
private String brand;
Car1(String brand){
this.brand = brand;
}
@Override
public String getBrand(){
return brand;
}
@Override
public String speedUp(){
return "The car is speeding up...";
}
@Override
public String speedDown(){
return "The car is speeding down...";
}
}
public class jdkfeatures2{

public static void main(String[] args) {
Vehicle car= new Car1("Nexon");
//abstract methods
System.out.println(car.getBrand());
System.out.println(car.speedUp());
System.out.println(car.speedDown());
//default methods
System.out.println(car.turnAlarmOn());
System.out.println(car.turnAlarmOff());
//Utility method
Vehicle.cleanVehicle();
}
}

