package com.studyopedia;
class Thread1 extends Thread{
	//job for child thread 
	@Override
	public void run() {
	for(int i=0; i<5;i++) {
		System.out.println("Child thread");
	}
	System.out.println(Thread.currentThread().getName());
}
}
public class mutithreding4{

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub

		Thread1 t= new Thread1();
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(4);
		
		t.start();
		
		//job for main thread
		for(int i=0; i<5;i++) {
			Thread.yield();
			//Thread.sleep(1000);
			System.out.println("Parent thread");
			
		}
	}

}
