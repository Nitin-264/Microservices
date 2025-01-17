package collection.com;
import java.util.*;
public class Collectionapi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Legacy object
		Vector v =new Vector();
		System.out.println(v.capacity());
		for(int i=0;i<=10;i++) {
			v.add(i);
		}
		System.out.println(v);
		
		System.out.println("Iterating through lagacy cursor");
		
		// Legacy cursor
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			Integer obj = (Integer)(e.nextElement());
			if(obj%2==0) {
				System.out.println(obj);
			}
		}
		System.out.println(v);
	}

}
