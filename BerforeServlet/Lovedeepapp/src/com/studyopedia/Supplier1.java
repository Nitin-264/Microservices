package com.studyopedia;
import java.util.function.Supplier;

public class Supplier1 {

    public static void main(String[] args) {
        // Corrected Supplier implementation
        Supplier<String> s = () -> {
            String[] arr = {"Nitin", "Kamal", "Rahul", "Krish", "Nikhil"};
            int index = (int)(Math.random() * 5); // Corrected index calculation
            return arr[index];
        };

        System.out.println(s.get());
        System.out.println(s.get());
    }
}
