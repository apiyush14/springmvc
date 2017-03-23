package com.nex.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController 
{
 @RequestMapping(value="/register",method=RequestMethod.GET)
 public String getRegistration(Model model)
 {
	model.addAttribute(new Spitter());
	return "register"; 
 }
}
