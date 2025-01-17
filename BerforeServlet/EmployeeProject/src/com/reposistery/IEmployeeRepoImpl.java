package com.reposistery;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.dto.Employee;
import com.jdbcutil.MakeConnection;

public class IEmployeeRepoImpl implements IEmployeeRepo {

	private static final String SQL_Query = "insert into employee(eid,ename,eage,photo,resume) values (?,?,?,?,?))";
	private static Connection conn = null;
	private static PreparedStatement pstm =null;
	static {
		try {
			conn=MakeConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public int insertrecord(Employee employee) throws Exception {
		
		if(conn!=null) {
			try {
				 pstm = conn.prepareStatement(SQL_Query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Integer eid = employee.getEid();
			String ename = employee.getEname();
			Integer eage = employee.getEage();
			byte[] photo =  employee.getPhoto();
			byte[] resume =  employee.getResume();
			
			pstm.setInt(1, eid);
			pstm.setString(2, ename);
			pstm.setInt(3, eage);
			pstm.setBytes(4, photo);
			pstm.setBytes(5, resume);
			
			int rowupdated = pstm.executeUpdate();
			return rowupdated;
		}
		return 0;
	}

}
