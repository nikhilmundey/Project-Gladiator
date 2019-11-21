package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.StudentReg;
import com.lti.repository.GenericDao;
import com.lti.repository.StudentDao;

@Service
public class StudentService {
	
	@Autowired
	private GenericDao gdao;
	
	private StudentDao studentdao;
	
	public void register(StudentReg studentReg)
	{
		gdao.add(studentReg);
	}
	
	public boolean checkLogin(int studentId, String studentPassword){
		
		int result=studentdao.readLogin(studentId, studentPassword);
		
		if(result==1){
			
			return true;
		}
		else 
			return false;
	}

}
	