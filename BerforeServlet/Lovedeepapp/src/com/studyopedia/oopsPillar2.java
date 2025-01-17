package com.studyopedia;

class Nitin
{
String name;
int age;
float height;
public void setData(String name, int age, float height)
{
//we can use "this" to refer to Object
this.name=name;
this.age=age;
this.height=height;

}
public void displayData()
{
System.out.println("Name is : "+this.name);
System.out.println("Age is : "+this.age);
System.out.println("Height is : "+this.height);
}
}
class oopsPillar2
{
public static void main(String[] args)
{

Nitin std = new Nitin();
std.setData("sachin",49,5.5f);
std.displayData();

}
}
