package com.enumm;

import com.studyopedia.foreach;

enum Result_type{
	pass,fail,absent;
	public void methodone() {
		
	}
	public static void main(String[] args) {
		System.out.println("Inside enum main ...");
	}
}
public class TwomainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result_type[] result = Result_type.values();
		for(Result_type resulttype : result) {
			System.out.println(resulttype+"--------"+resulttype.ordinal());
		}
	}

}
