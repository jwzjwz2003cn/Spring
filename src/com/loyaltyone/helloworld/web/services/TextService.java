package com.loyaltyone.helloworld.web.services;

import org.springframework.stereotype.Service;

@Service("textService")
public class TextService {
	
	private String text;
	
	public TextService() {

	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	

}
