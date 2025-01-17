package collection.com;
import java.util.*;

class CCompare implements Comparator{
	@Override
	
	public int compare(Object obj1,Object obj2) {
		String s1 = (String)obj1;
		String s2 = (String)obj2;
		return s2.compareTo(s1);
	}
	
}
public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue p = new PriorityQueue(new CCompare());
		System.out.println(p);
		p.add("A");
		p.add("X");
		p.add("G");
		p.add("H");
		p.add("P");
		p.add("L");
		System.out.println(p);
		
		
	}

}
