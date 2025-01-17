package collection.com;
import java.util.*;
public class SetApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Underlining DataStructure -> HashTable
		//JDK 1.2 VERSION
		HashSet hs = new HashSet();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		System.out.println(hs);
		
		//Underlining DataStructure -> HashTable + Linked List
		//JDK 1.4 VERSION
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("A");
		lhs.add("D");
		lhs.add("B");
		lhs.add("C");
		System.out.println(lhs);
		
	}

}
