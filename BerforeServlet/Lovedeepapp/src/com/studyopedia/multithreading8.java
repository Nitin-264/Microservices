package com.studyopedia;
class MyThread4 extends Thread{
	public  void run() {
		for(int i=0; i<5; i++) {
			System.out.println("I am a lazy Thread");
			
		}
		System.out.println("Ennntering into waiting state");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ie){
			System.out.println("I got interrupted");
			
		}
	}
}
public class multithreading8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread4 t= new MyThread4();
		t.start();
		t.interrupt();
		System.out.println("End Of Main Thread");

	}

}
