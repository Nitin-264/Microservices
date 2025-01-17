package com.studyopedia;
import java.util.function.*;
public class Jdkfetures5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer,Integer> f = i->i/2;
	    System.out.println("The otuput of the given number is ::"+f.apply(50));
	}

}
