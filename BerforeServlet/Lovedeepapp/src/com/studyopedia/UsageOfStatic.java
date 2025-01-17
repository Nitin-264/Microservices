package com.studyopedia;
import java.util.Scanner;
class Farmer
{
//instance variable
float p,si,t;
//static variable
static float r;
static
{
r = 2.5f;
}
//instance method
public void input()
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the value of prinicpal amount :: ");
p = scanner.nextFloat();
System.out.print("Enter the value of time period:: ");
t = scanner.nextFloat();
}
//instance method
public void calculateSI()
{
si = (p*t*r)/100;
}
//instance method
public void dispSI()
{
System.out.println("SI IS :: "+si);
}
}
class UsageOfStatic
{
public static void main(String[] args)
{
Farmer f1 = new Farmer();
f1.input();
f1.calculateSI();
f1.dispSI();
System.out.println();
Farmer f2 = new Farmer();
f2.input();

f2.calculateSI();
f2.dispSI();
System.out.println();
Farmer f3 = new Farmer();
f3.input();
f3.calculateSI();
f3.dispSI();
}
}
