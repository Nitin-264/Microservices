package com.studyopedia;

class MyThread21 extends Thread{
	static Thread mt;
@Override
public void run(){
	try{
		mt.join();
		}
		catch (InterruptedException e){
		}
for (int i=1;i<=10 ;i++ ){
System.out.println("child Thread");

}
}
}
public class mutithreading6{
public static void main(String... args)throws InterruptedException{
	MyThread21.mt=Thread.currentThread();
MyThread21 t=new MyThread21();
t.start();

for (int i=1;i<=10;i++ ){
	Thread.sleep(20000);
System.out.println("Main thread");
}
}
}