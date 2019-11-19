package com.lti.repository;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.entity.StudentReg;

@Repository
public class GenericDao   {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void add(Object object) {
		entityManager.merge(object);
	}

	@Transactional
	public Object fetchById(Class clazz, Object pk) {
		return entityManager.find(clazz,pk);
	
	}
	
//	@Transactional
//	public List<StudentReg> fetchStudentByInstituteCode() {
//		
//		Query q= entityManager.createQuery("select r from StudentReg r ");
//		List<StudentReg> r=q.getResultList();
//		
//		return r;
//		
//		
//	}
	
}