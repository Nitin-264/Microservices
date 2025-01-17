package collection.com;
import java.util.*;

class Myclass implements Comparator{

	@Override
	public int compare(Object o,Object o1) {
		// TODO Auto-generated method stub
		Integer i1 = (Integer)o;
		Integer i2 = (Integer)o;
		
		return -i1.compareTo(i2);
	}
	
}
public class treemap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap ts  =new TreeMap();
		ts.put(10, "Ten");
		ts.put(11, "Eleven");
		ts.put(12, "Twelve");
		ts.put(13, "Thirteen");
		System.out.println(ts);
		
		@SuppressWarnings("unchecked")
		TreeMap ts1  =new TreeMap(new Myclass());
		ts1.put(10, "Ten");
		ts1.put(11, "Eleven");
		ts1.put(12, "Twelve");
		ts1.put(13, "Thirteen");
		System.out.println(ts1);
		
		
	}

}
