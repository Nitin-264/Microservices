package connectingdatabase.com;
import java.sql.*;

public class loaddriver {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver Loaded Succesfully");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pwskills_octbatch","root", "root123");
		System.out.println("Connection is establised");
		System.out.println("Connection ::"+con.getClass().getName());
		
		Statement stm = con.createStatement();
		System.out.println("Ststement object created \n");
		System.out.println("statement::"+stm.getClass().getName());
		
		String selectQuery="select sid,sname,sage,saddress from student";
		ResultSet result = stm.executeQuery(selectQuery);
		
		System.out.println("Result set object created ");
        System.out.println("result::"+result.getClass().getName());
        
        //Processing the result 
        System.out.println("\nSID\tSNAME\tSAGE\tSADDRESS");
        while (result.next())
        {
        int sid = result.getInt(1);
        int sage = result.getInt(3);
        String sname = result.getString(2);
        String saddress = result.getString(4);
        System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+saddress);
        }
        //6. Close the resources
        result.close();
        stm.close();
        con.close();
        System.out.println("\nClosing the resources...");
		
	}

}
