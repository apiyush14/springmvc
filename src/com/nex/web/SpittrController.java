package com.nex.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/spittr")
public class SpittrController {

	@RequestMapping(method=RequestMethod.GET)
	public String spittr(Model model)
	{
		model.addAttribute("spittr","Hello Piyush");
		return "spittr";
	}
}
