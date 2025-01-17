package com.studyopedia;


public class AnamonusInnerClass4 {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

		new Thread(
				new Runnable() {
					public void run() {
						System.out.println("Anamonus thraed");
					}
				}).start();
		
		System.in.read();
		for(int i=0 ;i<3;i++) {
			System.out.println("Parent thraed");
		}
	}
}
