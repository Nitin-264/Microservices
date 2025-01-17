package com.studyopedia;
class Animal1
{
public void eat()
{
System.out.println("Animal is eating...");
}
public void sleep()
{
System.out.println("Animal is sleeping...");
}
public void breathe()
{
System.out.println("Animal is breathing...");
}
}
class Tiger extends Animal1
{
//informing compiler about overidden method
@Override
public void eat()
{
System.out.println("Tiger hunts and eat...");
}
}
class Deer extends Animal1
{
//informing compiler about overidden method
@Override
public void eat()
{
System.out.println("Deer will graze and eat...");
}
}
class Monkey1 extends Animal1
{
//informing compiler about overidden method
@Override
public void eat()
{
System.out.println("Monkey steal and eat...");
}
}
public class inheritance6
{
public static void main(String[] args)
{
//Creating an Object of Animal Type
Tiger t = new Tiger();
Deer d = new Deer();
Monkey1 m = new Monkey1();
//Invoking the behaviours of all 3 animals
t.eat();
t.sleep();
t.breathe();
System.out.println();

d.eat();
d.sleep();
d.breathe();
System.out.println();
m.eat();
m.sleep();
m.breathe();
}
}

