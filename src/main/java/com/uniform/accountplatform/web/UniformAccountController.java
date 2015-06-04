package com.uniform.accountplatform.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uniform.accountplatform.model.UniformUser;

@Controller
public class UniformAccountController {

//	@ModelAttribute("uniformUser")
//	public UniformUser loadUserInfo(@PathVariable("userName") String userName){
//		//find uniformUser
//		
//		//check password by id then return user
//		System.out.println("in loadUserInfo");
//		return null;
//	}
	
//	@RequestMapping(value="/login", method=RequestMethod.POST)
//	public String loadLoginPage(){
//		return "login";
//	}

	@RequestMapping(value="/loadCreateUserPage", method=RequestMethod.GET)
	public String loadCreateUserPage(){
		return "createUser";
	}

	@RequestMapping(value="/createUser", method=RequestMethod.POST)
	public void createUser(){
		
	}
	
}
