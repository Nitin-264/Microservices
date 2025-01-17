package collection.com;
import java.util.*;
public class collectionapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s=new Stack();
		System.out.println(s.empty());
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s.empty());
		
		System.out.println(s.search("D"));
		
	}

}
