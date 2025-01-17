package com.studyopedia;
class A
{
int i;
A()
{
System.out.println("Parent class constructor");
}
}
class B extends A
{
int i;
B()
{
System.out.println("Child class constructor");
}
public void setData(int x, int i)
{
//Giving x value to parent class i
super.i = x;
//Giving i value to child class i
this.i = i;
}
public void disp()
{
System.out.println("A class i value is :: " +super.i);
System.out.println("B class i value is :: " +i);
}
}
public class inheritance2
{
public static void main(String[] args)
{
B b = new B();
b.setData(10,20);
b.disp();
}
}

