package com.lti.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.entity.Institute;
import com.lti.repository.GenericDao;
import com.lti.repository.InstituteInterface;

import oracle.security.crypto.cert.GeneralName;

public class InstituteTest {
	@Test
	public void addInstituteTest() {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		InstituteInterface inif = (InstituteInterface) ctx.getBean("dao");
		GenericDao gdao=new GenericDao();
		Institute inst = new Institute();
		inst.setInstituteCategory("abc");
		inst.setInstituteName("bbd");
		inst.setInstituteDISECode(123);
		inst.setUniversityName("sgbau");
		inst.setInstitutePass("aa");
		inst.setInstituteEstbCert("hjgjasdg");
		inst.setInstituteAffCert("gdqgd");
		inst.setInstituteLoc("akola");
		inst.setInstituteCity("Pune");
		inst.setInstituteState("dfhf");
		inst.setInstitutePincode(444001);
		inst.setStautsId("approved");

		gdao.add(inst);
	}

}
