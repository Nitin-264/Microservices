package com.studyopedia;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		char[] ch= {'n','i','t','i','n'};
		String s1= new String(ch);
		System.out.println(s1);
		
		System.out.println("-");
		byte[] b= {20,30,40};
		
		String s2= new String(b);
		System.out.println(s2);
		
		String s3="jaat";
		//System.out.println(s3[2]);
		// accesing the the data in the string at a particular index
		System.out.println(s3.charAt(2));
	   // System.out.println(s3.charAt(-1));
	   // System.out.println(s3.charAt(200));
	    
	    // perfoming next mehtod of the string which compares the data
	    
	    String s4="java";
	    System.out.println(s4.equals("java"));
	    System.out.println(s4.equals("JAVA"));
	    System.out.println(s4.equalsIgnoreCase("JAVA"));
	    System.out.println(s4.equalsIgnoreCase("java"));
	    
	    String s5="NitinMahlan";
	    System.out.println(s5.substring(3));
	    System.out.println(s5.substring(5,7));
	    System.out.println(s5.substring(5,5));
	  //  System.out.println(s5.substring(7,5));
	   // System.out.println(s5.substring(5,100));
	    
	    String s6= "ChoDharyRaMJiLaAl";
	    System.out.println("Actual data="+s6);
	    System.out.println("Lower case="+s6.toLowerCase());
	    System.out.println("Upper Case="+s6.toUpperCase());
	    
	    // Next method of string which will replace the character 
	    
	    String s7 ="lala";
	    System.out.println(s7.replace('l','a'));
	    System.out.println(s7.replace('a','l'));
	    
	    
	    
	}

}
