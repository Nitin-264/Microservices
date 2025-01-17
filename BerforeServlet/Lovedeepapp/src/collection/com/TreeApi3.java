package collection.com;
import java.util.*;
class MyComparator1 implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1= (String)obj1;
		String s2 = (String)obj2;
		//return -s1.compareTo(s2);
		//return -1;
		return+1;
	}
}
public class TreeApi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet ts = new TreeSet(new MyComparator1());
		String[] s= new String[4];
		s[0]="Nitin";
		s[1]="Komal";
		s[2]="Shruti";
		s[3]="Pranjal";
		ts.add(s[0]);
		ts.add(s[1]);
		ts.add(s[2]);
		ts.add(s[3]);
		
		System.out.println(ts);
	}

}
