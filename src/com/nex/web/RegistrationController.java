package com.nex.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
 public String register(@Valid Spitter spitter,BindingResult result,Model model)
 {
	if(result.hasErrors())
	{
		return "register";
	}
	model.addAttribute(spitter);
	return "doRegister"; 
 }
}
