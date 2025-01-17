package collection.com;
import java.util.*;
public class IteratorCursor {

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
		Iterator e = v.iterator();
		while(e.hasNext()) {
			Integer obj = (Integer)(e.next());
			if(obj%2==0) {
				System.out.println(obj);
			}
			else {
				e.remove();
			}
		}
		System.out.println(v);
	}

}
