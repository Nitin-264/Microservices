package collection.com;
import java.util.*;
import java.util.LinkedList;
import java.util.ListIterator;
public class ListIteratorCursor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll =new LinkedList();
		ll.add("Nitin");
		ll.add("Rohit");
		ll.add("kohli");
		ll.add("Rishab");
		
		System.out.println(ll);
		
		ListIterator Litr= new ll.listIterator();
		while(Litr.hasNext()) {
			String name = (String)(Litr.next());
			if(name.equals("Rishab")) {
				Litr.remove();
			}
			if(name.equals("Nitin")) {
				Litr.set("NitinnMahlan");
				
			}
			if(name.equals("Rohit")) {
				Litr.add("Sharma");
				
			}
			
		}
		System.out.println(ll);
	
	}

}
