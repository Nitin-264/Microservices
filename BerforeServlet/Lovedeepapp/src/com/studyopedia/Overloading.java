package com.studyopedia;
class Animal{}
class Monkey extends Animal{}
class Overloading{
public void talk(Monkey m){
System.out.println("Monkey version");
}
public void talk(Animal a){
System.out.println("Animal version");
}
public static void main(String... args) {
Overloading t = new Overloading();

Animal a =new Animal();
t.talk(a);//Animal version
Monkey m =new Monkey();
t.talk(m);//Monkey version
Animal a1= new Monkey();// a1 -> Animal type(compiler will bind) a1->

//Monkey(runtime object::JVM)

t.talk(a1);//Animal version
}
}