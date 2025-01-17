package collection.com;
import java.util.*;
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hm  = new HashMap();
		hm.put(45,"Rohit");
		hm.put(19, "KomAL");
		hm.put(18, "NITIN");
		hm.put(21, "Pranjal");
		System.err.println(hm);
		
		Set Key = hm.keySet();
		System.out.println(Key);
		
		Collection c= hm.values();
		System.out.println(c);
		
		Set s = hm.entrySet();
		System.out.println(s);
		
		Iterator itr = Set.iterator();
		while (itr.hasNext())
		{
		Map.Entry m = (Map.Entry)itr.next();
		System.out.println("key is :: "+m.getKey());
		System.out.println("Value is :: "+m.getValue());
		System.out.println();
		//Method used for Updation
		if ((Integer)m.getKey() == 10)
		{
		m.setValue("sachinrameshtendulkar");
		}
		}
		
		
		
		
		
		
	}

}
