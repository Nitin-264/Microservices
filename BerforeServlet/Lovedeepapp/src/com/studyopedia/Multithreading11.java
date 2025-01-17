package com.studyopedia;

public class Multithreading11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadGroup tg1 = new ThreadGroup("Ind");
		Thread T1 = new Thread(tg1,"Sachin");
		Thread T2 = new Thread(tg1,"Rahul");
		tg1.setMaxPriority(3);
		
		Thread T3 = new Thread(tg1,"Rohit");
		
		System.out.println(T1.getPriority());
		System.out.println(T2.getPriority());
		System.out.println(T3.getPriority());
	}

}
