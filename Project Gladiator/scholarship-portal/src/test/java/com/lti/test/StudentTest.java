package com.lti.test;

import java.time.LocalDate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.entity.Institute;
import com.lti.entity.StudentReg;
import com.lti.repository.GenericDao;

public class StudentTest {

	@Test
	public void addStudent()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericDao gdao=(GenericDao) ctx.getBean(GenericDao.class);
		Institute ins= (Institute) gdao.fetchById(Institute.class,701 );

		StudentReg studentReg = new StudentReg();
		studentReg.setStudentaadhar(878787878787878L);
		studentReg.setStudentDistrict("Pune");
		studentReg.setStudentDOB(LocalDate.of(1997, 01, 01));
		studentReg.setStudentEmail("abc@yahoo.com");
		studentReg.setStudentGender("Male");
		studentReg.setStudentMobileNo(9090900990L);
		studentReg.setStudentName("Student1");
		studentReg.setStudentPassword("password1");
		studentReg.setStudentState("Maharashtra");
		studentReg.setInstitute(ins);
		gdao.add(studentReg);
	}
}
