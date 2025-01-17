package collection.com;
import java.util.concurrent.*;
public class concurrentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcurrentHashMap hm = new ConcurrentHashMap();
		hm.put(10,"Sachin");
		hm.put(10, "Afridi");
		System.out.println(hm);
		
		hm.putIfAbsent(10, "Nitin");
		System.out.println(hm);
		
	}

}
