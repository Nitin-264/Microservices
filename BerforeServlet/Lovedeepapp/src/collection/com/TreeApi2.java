package collection.com;
import java.util.*;
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		
		if(i1<i2) {
			return +1;
		}
		else if(i1>i2) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
}
public class TreeApi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		
		System.out.println(ts);
	}

}
