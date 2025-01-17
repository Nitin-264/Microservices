package com.pwsills_nitin;

import java.sql.SQLException;
import java.util.Scanner;

import com.pwsills_nitin.factory.StudentControllerFactory;
import com.pwskills_nitin.DataTransferObject.Student;
import com.pwskills_nitin.controller.IStudentController;

public class MainApp {

	public static void main(String[] args) {
		
       IStudentController controller = StudentControllerFactory.getStudentControllerObj();
		
		Student student = new Student();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the sid::");
		int sid = scanner.nextInt();
		
		System.out.println("Enter the sname::");
		String sname = scanner.next();
		
		System.out.println("Enter the sage::");
		int sage = scanner.nextInt();
		
		System.out.println("Enter the address::");
		String saddress = scanner.next();
		
		student.setSid(sid);
		student.setSname(sname);
		student.setSage(sage);
		student.setSaddress(saddress);
		
		 try {
			System.out.println("No of record inserted is"+controller.insertRecord(student));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Insertion failuer");
		}
		 scanner.close();
	}

}
