package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Institute;
import com.lti.entity.StudentReg;

@Repository("rep")
public class InstituteDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void add(Institute institute){
		
		entityManager.merge(institute);
	}

	@Transactional
	public List <StudentReg> fetchStudentByInstituteCode(int i){
		
		String ql="select s from StudentReg as s where s.institute=:inst";
		Query q =entityManager.createQuery(ql);
		
		q.setParameter("inst", i);

		List <StudentReg> students = q.getResultList();
		return students;
	}
	 
	@Transactional
	public List<Institute> getinsdetail(){
	
		String ql="select i from Institute i";
		Query q =entityManager.createQuery(ql);
		
		List<Institute> obj = q.getResultList();
				return obj;
		
	}
	
	@Transactional
	public int readLogin(int instituteCode, String password){
		//System.out.println("Here");
		String query = "Select i from Institute i where i.instituteCode=:instituteCode and i.institutePass=:password";
		TypedQuery<Institute> q1 = entityManager.createQuery(query, Institute.class);
		q1.setParameter("instituteCode", instituteCode);
		q1.setParameter("password", password);
		List<Institute> lists = q1.getResultList();
		
		return lists.size();
		
		
		
	}
}