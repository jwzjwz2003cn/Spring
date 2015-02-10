package com.loyaltyone.helloworld.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.loyaltyone.helloworld.web.services.TextService;

@Controller
public class MessageController {
	private TextService textService;
	
	@RequestMapping(value="/message", method=RequestMethod.GET)
	public String showMessage(){
		return "message";
	}
	

	@RequestMapping(value="/message", method=RequestMethod.POST)
	@ResponseBody
	public String displayText(HttpServletRequest request, HttpServletResponse response){
		String text = request.getParameter("text");
		System.out.println(text);
		textService.setText(text);
		return textService.getText();
	}
	
	@Autowired
	public void setTextService(TextService textService) {
		this.textService = textService;
	}
}
