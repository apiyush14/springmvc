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
	Spitter spitter=new Spitter();
	spitter.setFirstName("Piyush");
	spitter.setLastName("Arora");
	model.addAttribute(spitter);
	return "register"; 
 }
 
 @RequestMapping(value="/doRegister",method=RequestMethod.POST)
 public String register(Model model)
 {
	return "Your details are registered"; 
 }
}
