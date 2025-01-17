package com.studyopedia;
import java.util.*;
public class Stringjoiner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		delimitiorDemonstration();
		addingSuffixAndPrefix();
		mergingTwoString();
	}
	
	public static void delimitiorDemonstration() {
		StringJoiner sj = new StringJoiner(",");
		sj.add("Rohit");
		sj.add("Virat");
		sj.add("Gautuam");
		sj.add("Shikar");
		sj.add("Sachin");
		System.out.println(sj);
		System.out.println();
	}
	
	
	public static void addingSuffixAndPrefix() {
		StringJoiner sj = new StringJoiner(",","[","]");
		sj.add("Rohit");
		sj.add("Virat");
		sj.add("Gautuam");
		sj.add("Shikar");
		sj.add("Sachin");
		System.out.println(sj);
		System.out.println();
	}
	
	public static void mergingTwoString() {
		StringJoiner sj1 =new StringJoiner("|");
		sj1.add("Rohit");
		sj1.add("Virat");
		sj1.add("Gautuam");
		
		
		StringJoiner sj2 =new StringJoiner("|");
		sj2.add("Shikar");
		sj2.add("Sachin");
		
		StringJoiner sj3 = new StringJoiner("|");
		sj3 = sj1.merge(sj2);
		
		System.out.println(sj3);
	}

}
