package com.loyaltyone.helloworld.controllers;

import java.util.HashMap;
import java.util.Map;

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
	

	@RequestMapping(headers="Accept=application/json", value="/message", method=RequestMethod.POST, produces="application/json")
	@ResponseBody 
	public Map<String, Object> displayText(HttpServletRequest request){
		String text = request.getParameter("text");
		System.out.println(text);
		textService.setText(text);
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("message", textService.getText());
		return data;
	}
	
	@Autowired
	public void setTextService(TextService textService) {
		this.textService = textService;
	}
}
