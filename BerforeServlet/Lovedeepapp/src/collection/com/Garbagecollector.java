package collection.com;

import java.util.Date;

public class Garbagecollector {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Runtime r = Runtime.getRuntime();
		System.out.println("Total memory on heap::"+r.availableProcessors());
		System.out.println("Free memory on heap::"+r.freeMemory());
		for(int i=0;i<1000;i++) {
			Date d = new Date();
			d =null;
		}
		System.out.println("Total memory on heap::"+r.availableProcessors());
		System.in.read();
		System.out.println("Free memory on heap::"+r.freeMemory());
		r.gc();
		System.out.println("Total memory on heap::"+r.availableProcessors());
		System.out.println("Free memory on heap::"+r.freeMemory());
	}

}
