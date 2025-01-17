package com.studyopedia;

public class stringBuffer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("sachinrameshtendulkar");
		sb.setLength(6);
		System.out.println(sb);
		System.out.println();
		StringBuffer sb1 =new StringBuffer(100000);
		System.out.println(sb1.capacity());
		sb1.append("sachin");
		System.out.println(sb1.capacity());
		sb1.trimToSize();
		System.out.println(sb1.capacity());
		System.out.println();
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.capacity());
		sb2.ensureCapacity(10000);
		System.out.println(sb2.capacity());
	}

}
