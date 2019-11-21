package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Institute;
import com.lti.repository.InstituteDao;

@Service
public class InstituteService {

	@Autowired
	private InstituteDao instituteDao;
	
	public void register(Institute institute){
		            
		instituteDao.add(institute);

	}

	public List <Institute> getinsdetail(){
		
		List<Institute> serobj = instituteDao.getinsdetail();
			return serobj;
	}


	public boolean checkLogin(int instituteCode, String password) {
		
		int result=instituteDao.readLogin(instituteCode, password);
		
		if(result==1){
	
			return true;
		}
		else 
			return false;
	}


}
