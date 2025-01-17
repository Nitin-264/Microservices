package com.studyopedia;
class Mythread2 extends  Thread{
	public  void run() {
		System.out.println("No-arg method");
		run(10);
	}
	
	public  void run(int i) {
		System.out.println("int -arg method");
	}
}
public class mutithreading3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  
		Mythread2 t =new Mythread2();
		t.start();
		for(int i=0; i<4;i++) {
			System.out.println("Main method");
			Thread.sleep(1000);
		}
	}

}
