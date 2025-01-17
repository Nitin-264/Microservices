package com.studyopedia;

class MYthrread extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class AnamonusInnerclass2 {
    public static void main(String[] args) {
        MYthrread m = new MYthrread();
        m.start();

        // Logic for main thread
        for (int i = 0; i < 3; i++) {
            System.out.println("Parent Thread");
        }

        // Anonymous inner class
        Thread t4 = new Thread() {
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Child Thread:: Anonymous type");
                }
            }
        };
        t4.start();

        // Logic for main thread
        for (int i = 0; i < 3; i++) {
            System.out.println("Parent Thread");
        }

        // Lambda expression
        Runnable r = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Child Thread:: Lambda Expression");
            }
        };
        Thread t5 = new Thread(r);
        t5.start();

        // Logic for main thread
        for (int i = 0; i < 3; i++) {
            System.out.println("Parent Thread");
        }
    }
}
