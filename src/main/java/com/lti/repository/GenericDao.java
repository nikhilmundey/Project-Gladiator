package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.entity.Institute;

@Repository("dao")
public class GenericDao   {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void add(Object object) {
		entityManager.merge(object);
	}

	
	// public List<> getAvailableParts() {
	//
	// Query q = entityManager.createQuery("select t from CarPart as t");
	//
	// List <> cp=q.getResultList();
	// return cp;
	//
	// }

}
