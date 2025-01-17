package com.studyopedia;
class MyThread3 extends Thread{
	public  void run() {
		try {
			for(int i=0; i<5; i++) {
				System.out.println("I am a lazy Thread");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ie){
			System.out.println("I got interrupted");
			
		}
	}
}
public class multithreading7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 t= new MyThread3();
		t.start();
		t.interrupt();
		System.out.println("End Of Main Thread");

	}

}
