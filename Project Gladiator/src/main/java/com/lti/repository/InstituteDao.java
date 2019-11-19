////package com.lti.repository;
////
////import javax.persistence.EntityManager;
////import javax.persistence.PersistenceContext;
////import javax.transaction.Transactional;
////
////import org.springframework.stereotype.Repository;
////
////import com.lti.entity.Institute;
////
////@Repository("institute")
////public class InstituteDao implements InstituteInterface  {
////
////	@PersistenceContext
////	private EntityManager entityManager;
////
////	@Transactional
////	public void addInstitute(Institute institute) {
////		entityManager.merge(institute);
////	}
//
//	// public List<> getAvailableParts() {
//	//
//	// Query q = entityManager.createQuery("select t from CarPart as t");
//	//
//	// List <> cp=q.getResultList();
//	// return cp;
//	//
//	// }
//
//}
