package com.pwsills_nitin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

import com.pwsills_nitin.factory.StudentControllerFactory;
import com.pwskills_nitin.DataTransferObject.StudentVO;
import com.pwskills_nitin.controller.IStudentController;

public class MainApp {

	public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );	
		
       IStudentController controller = StudentControllerFactory.getStudentControllerObj();
		
	while(true) {
		System.out.println("*********WELCOMET TO STUDENT APPLICATION*****");
		System.out.println("1. INSERT");
		System.out.println("2. READ");
		System.out.println("3. UPDATE");
		System.out.println("4. DELETE");
		System.out.println("5. EXIT");
		System.out.print("ENTER YOUR CHOICE[1/2/3/4/5]:: ");
		String option = br.readLine();
		
		switch (option) {
		case "1": {
			insertrecord(br,controller);
		}
		break;
		case "2": {
			readrecord(br,controller);
		}
		break;
		case "3": {
			updaterecord(br,controller);
		}
		break;
		case "4": {
			deleterecord(br, controller);
		}
		break;
		case "5": {
			System.exit(0);
		}
		break;
		default:
			break;
		
	}
		}
	
}

	private static void deleterecord(BufferedReader br, IStudentController controller) throws IOException, SQLException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter id::");
	    String id = br.readLine();
	    
	    String status = controller.deleteRecord(id);
	    if (status.equalsIgnoreCase("success")) {
			System.out.println("Record deleted succesfully...");
		} else
			System.out.println(status);
	
	    
	}

	private static void updaterecord(BufferedReader br , IStudentController controller) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter id::");
	    String id = br.readLine();
	    
	    StudentVO vo = controller.readrecord(id);
	    if (vo!=null) {
			
	    	StudentVO voforUpdation = new StudentVO();
	    	
	    	System.out.println("Student id:: "+vo.getSid());
	    	voforUpdation.setSid(vo.getSid());
	    	
	    	System.out.println("Old name is::"+vo.getSname()+"Enter new name::");
	    	String name = br.readLine();
	    	
	    	if (name.equals("")|| name=="null") {
				voforUpdation.setSname(vo.getSname());
			}
	    	else {
	    		voforUpdation.setSname(name);
	    	}
	    	
	    	System.out.println("Old age is::"+vo.getSage()+"Enter new name::");
	    	String age = br.readLine();
	    	
	    	if (age.equals("")|| age=="null") {
				voforUpdation.setSage(vo.getSage());
			}
	    	else {
	    		voforUpdation.setSage(age);
	    	}
	    	
	    	System.out.println("Old address is::"+vo.getSaddress()+"Enter new address::");
	    	String add = br.readLine();
	    	
	    	if (add.equals("")|| add=="null") {
				voforUpdation.setSaddress(vo.getSaddress());
			}
	    	else {
	    		voforUpdation.setSaddress(add);
	    	}
	    	
	    	String status = controller.updaterecord(voforUpdation);
	    	 if (status.equalsIgnoreCase("success")) {
	 			System.out.println("Record Updated Succesfully...");
	 		} else {
	             System.out.println(status);
	 		}
		}
		
	}

	private static void readrecord(BufferedReader br , IStudentController controller) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter id::");
	    String id = br.readLine();
	    
	    StudentVO student = controller.readrecord(id);
	    if (student!=null) {
			System.out.println(student);
		} else {
            System.out.println("Record not found for the given id::"+id);
		}
	    
	}

	private static void insertrecord(BufferedReader br, IStudentController controller) throws IOException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("Enter username::");
	    String name = br.readLine();
	    
	    System.out.println("Enter age::");
	    String age = br.readLine();
	    
	    System.out.println("Enter address::");
	    String address = br.readLine();
	    
	    StudentVO vo = new StudentVO();
	    vo.setSname(name);
	    vo.setSage(age);
	    vo.setSaddress(address);
	    
	    System.out.println("*****Sending Student vo to controller*****");
	    
	    String status = controller.insertRecord(vo);
	    if (status.equalsIgnoreCase("success")) {
			System.out.println("Record inserted Succesfully...");
		} else {
            System.out.println(status);
		}
	   
	}
}