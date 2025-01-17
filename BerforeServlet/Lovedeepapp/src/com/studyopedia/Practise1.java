package com.studyopedia;

import java.util.function.Function;
import java.util.function.Predicate;

public class Practise1{
	public static void main(String[] args) {
		Function<String, Integer> f1=l->l.length();
		System.out.println(f1.apply("qwertyuiihgfxcvvcxdfvhcggfefcvddfhdsagrhjherdhfbs"));
	 }
		
}
