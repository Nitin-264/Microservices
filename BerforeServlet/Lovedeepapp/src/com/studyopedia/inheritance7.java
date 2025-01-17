package com.studyopedia;
class Animal2
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
class Tiger2 extends Animal2
{
//informing compiler about overidden method
@Override
public void eat()
{
System.out.println("Tiger hunts and eat...");
}
}
class Deer2 extends Animal2
{
//informing compiler about overidden method
@Override
public void eat()
{
System.out.println("Deer will graze and eat...");
}
}
class Monkey2 extends Animal2
{
//informing compiler about overidden method
@Override
public void eat()
{
System.out.println("Monkey steal and eat...");
}
}

//Helper class
class Forest
{
//Method Overloading
public void allowAnimal(Tiger2 t)
{
t.eat();
t.sleep();
t.breathe();
}
public void allowAnimal(Deer2 d)
{
d.eat();
d.sleep();
d.breathe();
}
public void allowAnimal(Monkey2 m)
{
m.eat();
m.sleep();
m.breathe();
}
}
public class inheritance7
{
public static void main(String[] args)
{

Tiger2 t = new Tiger2();
Deer2 d = new Deer2();
Monkey2 m = new Monkey2();
Forest f = new Forest();
f.allowAnimal(t);
System.out.println();
f.allowAnimal(d);
System.out.println();
f.allowAnimal(m);

}
}
