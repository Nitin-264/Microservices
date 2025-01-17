package collection.com;
import java.util.*;
public class Hashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		HashMap hs =new HashMap();
		hs.put(i2, "sachin");
		hs.put(i2, "Messi");
		System.out.println(hs);
		//i1.equals(i2)
        System.out.println("***********");
        
        IdentityHashMap ihs = new IdentityHashMap();
        ihs.put(i1, "SAchin");
        ihs.put(i2, "Messi");
        //i1==i2(Object refrence checked)
        System.out.println(ihs);
        
	}

}
