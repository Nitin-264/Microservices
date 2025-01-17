package com.studyopedia;
import java.util.function.*;
public class jdkfeature6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String,Integer> f1= s->s.length();
		Function<Integer,Integer> f2=i->i*2;
		System.out.println(f1.andThen(f2).apply("komal"));
	}

}
