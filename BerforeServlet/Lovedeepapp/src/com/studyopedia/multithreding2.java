package com.studyopedia;

class Mythread16 extends Thread{
	public void run() {
	for(int i=0; i<7;i++) {
		System.out.println("Nitin");
	}
}
}
public class multithreding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mythread16 t = new Mythread16();
		t.start();
	}
	}




