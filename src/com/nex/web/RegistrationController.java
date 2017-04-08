package com.nex.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.aggregation.BooleanOperators.Or;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController 
{
	@Autowired
	MongoOperations mongo;
	
 @RequestMapping(value="/register",method=RequestMethod.GET)
 public String getRegistration(Model model)
 {
	Spitter spitter=new Spitter();
	spitter.setFirstName("Piyush");
	spitter.setLastName("Arora");
	model.addAttribute(spitter);
	Order order=new Order();
	order.setId("123");
	order.setCustomer("Piyush Arora Hello");
	mongo.save(order);
	Order order1=mongo.findById("123",Order.class);
	System.out.println("Customer retrieved from DB : "+order1.getCustomer());
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
