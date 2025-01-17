package com.studyopedia;

class Person {
    String name;
    float height;
    int age;

    Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void display() {
        System.out.println("NAME:" + name);
        System.out.println("height:" + height);
        System.out.println("age:" + age);
    }
}

class Student2 extends Person {
    String sid;
    int marks;

    Student2(String name, int age, float height, String sid, int marks) {
        super(name, age, height); // Corrected super call
        System.out.println("Student class constructor\t");

        this.sid = sid;
        this.marks = marks;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("marks:" + marks);
        System.out.println("sid:" + sid);
    }
}

public class SuperInheritance {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person p = new Person("nitin", 18, 5.6f);
        Student2 std = new Student2("nitin", 18, 5.6f, "HR19", 90);
        std.display();
    }
}
