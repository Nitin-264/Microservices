package in.pwskills.nitin.main;

import java.sql.*;
import in.pwskills.nitin.main.Arithmetic;//from a jar of another project

public class MainApp 
{
    public static void main( String[] args ) throws Exception
    {
        // Step2. Establish the Connection
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "System";
		String password = "system123";
		Connection connection = DriverManager.getConnection(url, user, password);
		System.out.println("CONNECTION object created...");

		// Step3. Create statement Object and send the Query
		Statement statement = connection.createStatement();
		System.out.println("STATEMENT object created...");

		// Step4. Execute the Query and Process the resultSet
		String sqlSelectQuery = "select sid,sname,sage,saddr from student";
		ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
		
		System.out.println("RESULTSET object created...");
		System.out.println("SID\tSNAME\tSAGE\tSADDRESS");
		while (resultSet.next()) {
			int sid = resultSet.getInt("sid");
			String sname = resultSet.getString("sname");
			int sage = resultSet.getInt("sage");
			String saddress = resultSet.getString("saddr");
			System.out.println(sid + "\t" + sname + "\t" + sage + "\t" + saddress);
		}

		System.out.println("Getting extra service");
		Arithmetic a = new Arithmetic();
		System.out.println("The sum is :: "+a.add(10,20));
		
		// Step6. Close the resources
		resultSet.close();
		statement.close();
		connection.close();
		System.out.println("Closing the resources...");

    }
}
