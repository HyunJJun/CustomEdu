package com.CusTomSoft.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class CustomsoftEduHomeController {
	private final Logger logger = LoggerFactory.getLogger(CustomsoftEduHomeController.class);
	
	@GetMapping(value="/home")
	public String home() throws Exception {
		
		return "home/home";
	}
	

}
