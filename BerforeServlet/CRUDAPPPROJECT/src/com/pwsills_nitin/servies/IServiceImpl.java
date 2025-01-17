package com.pwsills_nitin.servies;
import java.sql.*;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;

import com.pwsills_nitin.factory.StudentRepofactory;
import com.pwsills_nitin.factory.StudentServicefactory;
import com.pwskills_nitin.DataTransferObject.StudentBO;
import com.pwskills_nitin.DataTransferObject.StudentDTO;
import com.pwskills_nitin.DataTransferObject.StudentVO;
import com.pwskills_nitin.repositery.IStudentRepo;

public class IServiceImpl implements IStudentService {

	@Override
	public String insertRecord(StudentDTO student) {
		IStudentRepo repo = StudentRepofactory.getStudentrepo();
		StudentBO bo = new StudentBO();
		bo.setSname(student.getSname());
		bo.setSage(student.getSage());
		bo.setSaddress(student.getSaddress());
		
		System.out.println("****Sending to repo layer****");
		
		return repo.insertRecord(bo);
	}

	@Override
	public String deleteRecord(int id) {
		// TODO Auto-generated method stub
		IStudentRepo repo = StudentRepofactory.getStudentrepo();
		String status = repo.deleteRecord(id);
		return status;
	}

	@Override
	public StudentDTO readrecord(int i) {
		// TODO Auto-generated method stub
		IStudentRepo repo = StudentRepofactory.getStudentrepo();
		StudentDTO dto = null;
		StudentBO bo = repo.readrecord(i);
		
		if (bo!=null) {
			
			dto = new StudentDTO();
			try {
				BeanUtils.copyProperties(dto, bo);
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return dto;
		} else {

			return dto;
		}
	
	}

	@Override
	public String updaterecord(StudentDTO dto) {
		// TODO Auto-generated method stub
		IStudentRepo repo = StudentRepofactory.getStudentrepo();
		StudentBO bo = new StudentBO();
		bo.setSid(dto.getSid());
		bo.setSname(dto.getSname());
		bo.setSage(dto.getSage());
		bo.setSaddress(dto.getSaddress());
		
		String status = repo.updaterecord(bo);
		return status;
	}

}
