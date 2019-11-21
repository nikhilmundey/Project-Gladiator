package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.StudentReg;

@Repository
public class StudentDao {

	@PersistenceContext
	private EntityManager entityManager;

	
	@Transactional
	public int readLogin(int studentId, String studentPassword){
		//System.out.println("Here");
		String query = "Select s from StudentReg s where s.studentId=:studentId and i.studentPassword=:password";
		TypedQuery<StudentReg> q1 = entityManager.createQuery(query, StudentReg.class);
		q1.setParameter("studentId", studentId);
		q1.setParameter("password", studentPassword);
		List<StudentReg> lists = q1.getResultList();
		
		return lists.size();
		
		
		
	}
}
