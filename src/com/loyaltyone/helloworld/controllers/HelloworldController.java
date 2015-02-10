package com.loyaltyone.helloworld.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.loyaltyone.helloworld.web.services.TextService;

@Controller
public class HelloworldController {
	
	@RequestMapping("/")
	public String showHelloWorld() {
		
		return "helloworld";
	}
	

	
}
