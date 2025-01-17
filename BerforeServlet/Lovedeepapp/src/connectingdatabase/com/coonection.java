package connectingdatabase.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class coonection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con =null;
		Statement stm = null;
		ResultSet result = null;
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Driver Loaded Succesfully\n");
		
		Properties prop = new Properties();
		FileInputStream fis= null;
		try {
			fis = new FileInputStream("D:\\Lovedeepapp\\src\\connectingdatabase\\com\\database.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = prop.getProperty("url");
		String password= prop.getProperty("password");
		String user = prop.getProperty("user");
		 try {
			con = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection is establised\n");
		System.out.println("Connection ::"+con.getClass().getName());
		
		try {
			stm = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ststement object created \n");
		System.out.println("statement::"+stm.getClass().getName());
		
		String selectQuery="select sid,sname,sage,saddress from student";
		
		try {
			result = stm.executeQuery(selectQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Result set object created \n");
        System.out.println("result::"+result.getClass().getName());
        
        //Processing the result 
        System.out.println("\nSID\tSNAME\tSAGE\tSADDRESS");
        try {
			while (result.next())
			{
			
			System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getInt(3)+"\t"+result.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //6. Close the resources
        try {
			result.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("\nClosing the resources...");
		
	}

}
