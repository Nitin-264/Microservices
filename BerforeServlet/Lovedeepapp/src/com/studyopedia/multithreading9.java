package com.studyopedia;
class MyThread33 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Laazy Thread");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				System.out.println("intreuption occur in child thraed");
				
			}
	}
	
	}
}
public class multithreading9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread33 M = new MyThread33();
		M.setDaemon(true);
		M.start();
		System.out.println("End of the main thread");
		
	}

}
