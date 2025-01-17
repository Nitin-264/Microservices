package com.studyopedia;

class MyThread extends Thread
{
@Override
public void run()
{
for (int i=0;i<10 ;i++ )
{
System.out.println("child thread");
}
}
}
public class multithreading1
{
//JVM ---> main thread
public static void main(String[] args)throws Exception{
//instantiation of a thread
MyThread t = new MyThread();
//starting a thread
t.start();
//job of main thread
for (int i=0;i<5 ; i++)
{
System.out.println("main thread");
Thread.sleep(1000);
}
}
}
