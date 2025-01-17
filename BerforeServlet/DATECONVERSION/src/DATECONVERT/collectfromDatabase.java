package DATECONVERT;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.jdbcutil.*;
public class collectfromDatabase {
	private	static final String query = "select id,username,dob from users where id=? ";
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection connection =null;
		PreparedStatement pstm =null;
		ResultSet resultset = null;
		
		try {
			connection = MakeConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pstm =connection.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(connection!=null && pstm!=null) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id::");
		int id = scanner.nextInt();
		
		pstm.setInt(1, id);
		resultset=pstm.executeQuery();
		
		}
		
		if(resultset.next()) {
			System.out.println("ID\tUSER\tDOB\t");
			
			System.out.println(resultset.getInt(1)+"\t"+resultset.getString(2)+"\t"+convertToEndUser(resultset.getDate(3)));
		}
		
	}
	private static String convertToEndUser(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return sdf.format(d);
	}

}
