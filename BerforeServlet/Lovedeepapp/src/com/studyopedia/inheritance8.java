package com.studyopedia;
class Animal3
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
class Tiger3 extends Animal3
{
//informing compiler about overidden method
@Override
public void eat()
{
System.out.println("Tiger hunts and eat...");
}
}
class Deer3 extends Animal3
{
//informing compiler about overidden method
@Override
public void eat()
{
System.out.println("Deer will graze and eat...");
}
}
class Monkey3 extends Animal3
{
//informing compiler about overidden method
@Override
public void eat()
{
System.out.println("Monkey steal and eat...");
}
}
//Helper class
class Forest3
{
/*
RunTime Polymphism[1:M]
= new Tiger();
Animal ref = new Deer();
= new Monkey();

*/
public void allowAnimal(Animal3 ref)
{
ref.eat();

ref.sleep();
ref.breathe();
System.out.println();
}
}
public class inheritance8
{
public static void main(String[] args)
{

Tiger3 t = new Tiger3();
Deer3 d = new Deer3();
Monkey3 m = new Monkey3();
Forest3 f = new Forest3();
f.allowAnimal(t);
f.allowAnimal(d);
f.allowAnimal(m);

}
}

