package com.enumm;
final class result_status{
	public static final String  pass = "Pass";
	public static final String fail = "Fail";
	public static final String absent = "absent";
}
enum Result_Status{
	PASS,FAIL,ABSENT;
}

public class enuum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(result_status.pass);
		System.out.println(result_status.fail);
		System.out.println(result_status.absent);
		
		
		//enum
		System.out.println(Result_Status.PASS);
		System.out.println(Result_Status.FAIL);
		System.out.println(Result_Status.ABSENT);
	}

}
