package com.CusTomSoft.Controller;


import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class CustomsoftEduController {
	
	private final Logger logger = LoggerFactory.getLogger(CustomsoftEduController.class);
	
	
	
	@GetMapping(value="/")
	public String main() throws Exception {
		return "index";
	}
	
	@GetMapping(value="/grid")
	public String grid() throws Exception{
		return "home/grid";
	}
	
	@GetMapping(value="/memberlist")
	public String memberlist() throws Exception{
		return "home/member_list";
	}
	

	
}
