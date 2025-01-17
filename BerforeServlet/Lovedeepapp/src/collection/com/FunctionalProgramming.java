package collection.com;
import java.util.*;
import java.util.stream.Collectors;
public class FunctionalProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(12);
		al.add(2);
		al.add(-7);
		System.out.println("Before Sorting ::"+ al);
		Collections.sort(al,(i1,i2)->-i1.compareTo(i2));
		System.out.println("After Sorting ::"+al);
		
		List<Integer> StreamList = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(StreamList);
		
		ArrayList<String> as = new ArrayList<String>();
		as.add("Dhoni");
		as.add("rohit");
		as.add("kohli");
		as.add("yuvii");
		
		List<String> Streamlist = as.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(Streamlist);
		
	}

}
