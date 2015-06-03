package com.uniform.accountplatform.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uniform.accountplatform.model.UniformUser;

@Controller
public class UniformAccountController {

	@ModelAttribute("uniformUser")
	public UniformUser loadUserInfo(){
		//find uniformUser
		//check password by id then return user
		System.out.println("in loadUserInfo");
		return null;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loadLoginPage(){
		return "login";
	}
	
}
