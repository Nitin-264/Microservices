package com.studyopedia;

import java.util.function.Predicate;

class Studentt {
    private String Name;
    private Integer age;

    Studentt(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public Integer getAge() {
        return age;
    }
}

public class jdkfeatures5 {

    public static void main(String[] args) {
        Studentt[] Std = new Studentt[3];
        Studentt S1 = new Studentt("Rohit", 36);
        Studentt S2 = new Studentt("Virat", 38);
        Studentt S3 = new Studentt("Dhoni", 42);

        Std[0] = S1;
        Std[1] = S2;
        Std[2] = S3;

        Predicate<Studentt> p = student -> student.getAge() < 40;
        performOperation(p, Std);
    }

    public static void performOperation(Predicate<Studentt> p, Studentt[] Students) {
        int count = 0;
        for (Studentt student : Students) {
            if (p.test(student)) {
                count++;
            }
        }
        System.out.println("The number of Students age less than 40 is: " + count);
    }
}
