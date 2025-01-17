package com.studyopedia;

class MyRunnable1 implements Runnable{
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("Child Thread");
			
		}
	}
}
public class AnamonusInnerclass3 {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		Runnable r = new MyRunnable1();
		Thread T2 = new Thread(r);
		T2.start();
		
		for(int i=0; i<3; i++) {
			System.out.println("Main Thread");
		}
		
		System.in.read();
		
		Runnable r1 = ()->{
			for(int i=0; i<5;i++) {
				System.out.println("Lambda Expression Thread");
			}
		};
		
		Thread T3 = new Thread(r1);
		T3.start();
		
		for(int i=0; i<3; i++) {
			System.out.println("Main Thread");
		}
		
		//System.in.read();
		
		Runnable r2 = new Runnable() {
			public void run() {
				for(int i=0; i<5;i++) {
					System.out.println("Anamonus  Expression Thread");
				}
			}
		};
		new Thread(r2).start();
		
		for(int i=0; i<3; i++) {
			System.out.println("Main Thread");
		}
	}

}
