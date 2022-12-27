package com.CusTomSoft.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class CustomsoftEduBoardController {
	private final Logger LOGGER = LoggerFactory.getLogger(CustomsoftEduBoardController.class);
	
	@GetMapping(value="/board")
	public String board() throws Exception {
		
		return "board/board";
	}
	

}
