package com.lti.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.entity.Institute;
import com.lti.service.InstituteService;

@Controller
public class InstituteController {

	@Autowired
	private InstituteService instituteService;

	@RequestMapping("/register")
		
	public String register(Institute institute){
			
			instituteService.register(institute);
			return "home.jsp";
		}
	
	@RequestMapping(path="/studentregister",method=RequestMethod.GET)
	public String getInstDetails(Map m){
	    List<Institute> obj	= instituteService.getinsdetail();
	    	m.put("insdetails", obj);
	    	return "StudentRegister.jsp";
	    }
		
	@RequestMapping(path="/institutelogin")
	public ModelAndView instituteLogin(@RequestParam("instituteCode") String instituteCode, @RequestParam("institutePass") String password ){
		boolean i=instituteService.checkLogin(Integer.parseInt(instituteCode), password);
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