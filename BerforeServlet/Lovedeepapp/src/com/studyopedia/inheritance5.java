package com.studyopedia;
class Plane
{
String engine;
float fuel;
int wheel;
public void takeOff()
{
System.out.println("Plane tookoff...");
}
public void fly()
{
System.out.println("Plane is flying...");
}
public void land()
{
System.out.println("Plane is landing...");
}
}
class Passenger extends Plane
{
public void carryPassengers()
{
System.out.println("Carrying Passengers...");
}
}
class Cargo extends Plane
{
public void carryCargo()
{
System.out.println("Carrying Cargo...");
}
}

class Fighter extends Plane
{
public void carryWeapons()
{
System.out.println("Carrying Weapons...");
}
}
public class  inheritance5 
{
public static void main(String[] args)
{
//Creating 3 objects of Plane Type
Cargo c = new Cargo();
Passenger p =new Passenger();
Fighter f = new Fighter();
//Taking the actions for all the 3 planes
c.takeOff();
c.carryCargo();
c.fly();
c.land();
System.out.println();
p.takeOff();
p.carryPassengers();
p.fly();
p.land();
System.out.println();
f.takeOff();
f.carryWeapons();
f.fly();
f.land();

}
}

