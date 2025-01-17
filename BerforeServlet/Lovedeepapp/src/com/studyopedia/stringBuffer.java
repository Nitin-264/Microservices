package com.studyopedia;

public class stringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abcdefgh");
		sb.insert(2,"xyz");//abxyzdefgh
		sb.insert(11,"9");
		System.out.println(sb);//abxyzdefgh9
		
		StringBuffer sb1 = new StringBuffer("sachintendulkar");
		System.out.println(sb1);//sachintendulkar
		sb1.delete(6,12);//tendul
		System.out.println(sb1);//sachinkar
		sb1.deleteCharAt(6);
		System.out.println(sb1);//sachinar

		StringBuffer sb3 = new StringBuffer("pwskills");
		sb3.reverse();
		System.out.println(sb3);//sllikswp
	}

}
