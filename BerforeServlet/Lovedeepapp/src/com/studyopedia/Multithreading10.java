package com.studyopedia;

public class Multithreading10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println("The thread group name is ::"+t.getThreadGroup().getName());
		System.out.println("The Parent of tread group is ::"+t.getThreadGroup().getParent().getName());
		
		ThreadGroup tg = new ThreadGroup("Indian");
		System.out.println("The Parent of tread group is ::"+tg.getParent().getName());
		
		
		ThreadGroup gp = new ThreadGroup(tg,"Aus");
		System.out.println("The Parent of tread group is ::"+gp.getParent().getName());
		
	}

}
