package com.studyopedia;

class C{
	public synchronized void foo(D d) {
		System.out.println("Thraed 1 starting its execution of foo method  ");
		
		try {
			Thread.sleep(2000);
			
		}
		catch(InterruptedException ie) {
			
		}
		System.out.println("Trying to call last method c.last()");
		d.last();
		
		
	}
	public synchronized void last() {
		System.out.println("This last method of class C");
	}
}

class D {
	public synchronized void bar(C c) {
System.out.println("Thraed 2 starting its execution of bar method  ");
		
		try {
			Thread.sleep(2000);
			
		}
		catch(InterruptedException ie) {
			
		}
		System.out.println("Trying to call last method d.last()");
		c.last();
	}
	public synchronized void last() {
		System.out.println("This last method of class D");
	}
}


public class  mutithreading8 extends Thread{
//JVM ---> main thread
	C c =new C();
	D d = new D();
	
	public void m1() {
		this.start();
		
		c.foo(d);
		
	}
	public void run() {
		d.bar(c);
	}

	public static void main(String[] args)throws Exception{
    mutithreading8 m = new mutithreading8();
    
	m.m1();

}
}

