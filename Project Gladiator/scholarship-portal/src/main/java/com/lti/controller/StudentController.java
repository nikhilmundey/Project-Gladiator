package com.lti.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.entity.StudentReg;
import com.lti.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@RequestMapping(path = "/studentregister", method = RequestMethod.POST)
	public String register(StudentReg studentReg,@RequestParam("sdob") String bdt )
	{
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "dd-MM-yyyy" ); 
		//LocalDate studentDOB = LocalDate.parse( bdt , formatter);
		LocalDate studentDOB = LocalDate.parse( bdt);
		studentReg.setStudentDOB(studentDOB);
//		System.out.println(studentReg.getStudentName());
		studentService.register(studentReg);
		return "home.jsp";
	}

	
	@RequestMapping(path="/studentlogin")
	public ModelAndView instituteLogin(@RequestParam("studentId") String studentId, @RequestParam("studentPassword") String studentPassword ){
		boolean i=studentService.checkLogin(Integer.parseInt(studentId), studentPassword);
		ModelAndView mv=new ModelAndView("index.jsp");

		if(i){
			
			System.out.println("Login Success");
			return mv;
		}
		else{
			System.out.println("Login Failed");
			return null;

		}
	}
	
}
