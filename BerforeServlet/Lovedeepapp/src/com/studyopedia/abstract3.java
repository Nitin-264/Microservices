package com.studyopedia;
import java.util.Scanner;
abstract class Bird
{
public abstract void fly();
public abstract void eat();
}
final class Sparrow extends Bird
{
@Override
public void fly()
{
System.out.println("Fly very fast...");
}
@Override
public void eat()
{
System.out.println("Sparrows eats grains...");
}
}

abstract class Eagle extends Bird
{
@Override
public void fly()
{
System.out.println("All Eagles Fly very very high...");
}
public abstract void eat();
}
final class SerpentEagle extends Eagle
{
@Override
public void eat(){
System.out.println("SerpentEagles eats snakes...");
}
}
final class GoldenEagle extends Eagle
{
@Override
public void eat(){
System.out.println("GoldeEagles catches the prey over the ocean...");
}
}
final class Crow extends Bird
{
@Override
public void fly()
{
System.out.println("Crow fly at Meidum Height...");
}
@Override
public void eat()
{
System.out.println("Crow eat Flesh...");
}
}
//HelperClass
abstract class Sky
{
/*
Polymorphism : Overriding(1:M)
= new Sparrow();
Bird ref = new SerpentEagle();
= new goldenEagle();
= new Crow();

*/
public static void allowBird(Bird ref)
{
System.out.println("Working with objeccalled::"+ref.getClass().getName());

ref.fly();
ref.eat();
System.out.println();

}
}
public class abstract3
{
public static void main(String[] args)
{
Sparrow sp = new Sparrow();
Eagle e1;
Eagle e2;
e1 = new SerpentEagle();
e2 = new GoldenEagle();
Crow c = new Crow();
Sky.allowBird(sp);
Sky.allowBird(e1);
Sky.allowBird(e2);
Sky.allowBird(c);
}
}

