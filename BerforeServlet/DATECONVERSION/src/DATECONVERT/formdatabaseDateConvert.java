package DATECONVERT;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.jdbcutil.MakeConnection;
public class formdatabaseDateConvert {


	private static Connection connection = null;
	private static String sql_insert_query="insert into users(username,dob)values(?,?)";
	
	
	private static PreparedStatement pstm=null;
	static {
		try {
			connection = MakeConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		 pstm = connection.prepareStatement(sql_insert_query);
		 Scanner scanner =new Scanner(System.in);
		 if(pstm!=null && scanner!=null)
			 
	         System.out.println("Enter the username::");
			 String username = scanner.next();
			 
			 System.out.println("Enter the dob(MM-dd-yyyy)::");
			 String dob =scanner.next();
			 
			 
			 pstm.setString(1,username);
			 pstm.setDate(2,(java.sql.Date) prepareddate(dob));
			 
			int rowCount=pstm.executeUpdate();
			 
			if(rowCount==0) {
				System.out.println("No record inserted ");
			}
			else {
				System.out.println("record inserted succesfully");
			}
			 
		 }
	private static Date prepareddate(String dob) throws Exception{
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		java.util.Date jd = sdf.parse(dob);
		
		long time = jd.getTime();
		java.sql.Date reqf = new java.sql.Date(time);
		return reqf;
	}
	
	
	}


