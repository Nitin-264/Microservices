package com.studyopedia;
import java.util.function.Predicate;
public class jdkfeatures4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {0,5,10,15,20,25,30};
		
		
		
		Predicate<Integer> p1= i -> i < 18;
		Predicate<Integer> p2= i -> i%2 == 0;
		System.out.print("Numbers which are less than 18:: ");
		performOperation(p1,arr);
		System.out.println();
		System.out.print("Numbers which are even :: ");
		performOperation(p2,arr);
		
		System.out.println();
		
		System.out.print("Numbers which are less than 18 and even:: ");
		performOperation(p1.and(p2),arr);
		System.out.println();
		System.out.print("Numbers which are not  even :: ");
		performOperation(p2.negate(),arr);
		
		System.out.print("Numbers which are not  even or less than 18:: ");
		performOperation(p2.negate().or(p2),arr);
	}
	public static void performOperation(Predicate<Integer>p,int[] arr)
	{
	for (int data:arr)
	{
	if (p.test(data))
	{
	System.out.print(data+"\t");
	}
	}
	System.out.println();
	}

	}


