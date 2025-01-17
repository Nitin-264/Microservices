package collection.com;
import java.util.*;
public class ConcurentCoollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		System.out.println(al);
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println((String)(itr.next()));
			al.add("Nitin");
		}
		
	}

}
