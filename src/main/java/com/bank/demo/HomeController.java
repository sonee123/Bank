package com.bank.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/hello")
	public String home()	
	{
		
		return "welcome to Spring Boot !";
	}
	

}
