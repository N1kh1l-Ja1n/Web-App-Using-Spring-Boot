package com.example.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
	
	@RequestMapping("Home")
	public String home() {
		
		return "Home.jsp"; 
	}
	
	

}
