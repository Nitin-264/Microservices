package com.mainapp;

import java.sql.SQLException;
import java.util.Scanner;

import com.controller.IEmployeeController;
import com.dto.Employee;
import com.factory.EmployeeController;

public class Insertion {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		IEmployeeController empcontroller = EmployeeController.getemployeecontroller();
		Employee employee = new Employee();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter eid::");
		Integer eid = scanner.nextInt();
		
		System.out.println("Enter ename::");
		String ename = scanner.next();
		
		System.out.println("Enter eage::");
		Integer eage = scanner.nextInt();
		
		System.out.println("Enter the path of the photo::");
		String photopath=scanner.next();
		System.out.println("Enter the resume path");
		String resumepath=scanner.next();
		employee.setEid(eid);
		employee.setEname(ename);
		employee.setEage(eage);
		employee.setResume(photopath);
		try {
			employee.setPhoto(resumepath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//"C:\\Users\\Nitin\\Downloads\\rohit.webp"
		//"D:\\rohitresume\\Rohit.txt.txt"
		 try {
				System.out.println("No of record inserted is"+empcontroller.insertrecord(employee));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Insertion failuer");
			}
			 scanner.close();
	}

}
