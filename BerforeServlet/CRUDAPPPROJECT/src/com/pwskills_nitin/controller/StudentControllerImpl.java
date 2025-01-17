package com.pwskills_nitin.controller;

import java.sql.SQLException;

import org.apache.commons.beanutils.BeanUtils;

import com.pwsills_nitin.factory.StudentServicefactory;
import com.pwsills_nitin.servies.IStudentService;
import com.pwskills_nitin.DataTransferObject.StudentDTO;
import com.pwskills_nitin.DataTransferObject.StudentVO;

public class StudentControllerImpl implements IStudentController{

	@Override
	public String insertRecord(StudentVO student) throws SQLException {
		IStudentService service = StudentServicefactory.getStudentService();
		
		StudentDTO dto = new StudentDTO();
		
		dto.setSname(student.getSname());
		dto.setSage(Integer.parseInt(student.getSage()));
		dto.setSaddress(student.getSaddress());
		
		System.out.println("*****Sending to service layer*****");
		
		return service.insertRecord(dto);
	}

	@Override
	public String deleteRecord(String id) throws SQLException {
		// TODO Auto-generated method stub
		
		IStudentService service = StudentServicefactory.getStudentService();
		
		String status = service.deleteRecord(Integer.parseInt(id));
		
		return status;
	}

	@Override
	public StudentVO readrecord(String id) {
		// TODO Auto-generated method stub
		IStudentService service = StudentServicefactory.getStudentService();
		
		StudentDTO dto = service.readrecord(Integer.parseInt(id));
		StudentVO vo =null;
		
		if (dto!=null) {
			
			// convert dto to vo and send
						vo = new StudentVO();
						try {
							BeanUtils.copyProperties(vo, dto);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return vo;
			
		}
		else {
			return vo;
		}
	}

	@Override
	public String updaterecord(StudentVO voforUpdation) {
		// TODO Auto-generated method stub
		IStudentService service = StudentServicefactory.getStudentService();
		
		StudentDTO dto = new StudentDTO();
		try {
			BeanUtils.copyProperties(dto, voforUpdation);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return service.updaterecord(dto);
	}
	
	
}
