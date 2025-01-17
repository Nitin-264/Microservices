package com.studyopedia;
import java.util.Scanner;

class TooYoungAgeException extends RuntimeException{
	TooYoungAgeException(String msg){
		super(msg);
	}
}
class TooOldAgeException extends RuntimeException{
	TooOldAgeException(String msg){
		super(msg);
	}
}
public class exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner Scan= new Scanner(System.in);
          
		System.out.println("Enter  the age of candiate::");
		int age = Scan.nextInt();
		
		if(age>60) {
			throw new TooOldAgeException("DL cannot be issued for senior citizens");
		}
		else if(age<18) {
			throw new TooYoungAgeException("DL cannot be issued for childerns ");
			
		}
		else {
			System.out.println("your license will be given too your mail id ");
			
		}
		
	}

}
