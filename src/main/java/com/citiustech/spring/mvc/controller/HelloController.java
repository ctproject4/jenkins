package com.citiustech.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	//Url Mapping for handling the request
	@RequestMapping("/hello")
	public String greet(){
		return "hello";//Its not String it is a logical name of the view 
	}
}
