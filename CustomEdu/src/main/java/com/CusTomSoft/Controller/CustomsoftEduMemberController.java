package com.CusTomSoft.Controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.CusTomSoft.Dto.MemberDto;
import com.CusTomSoft.Service.MemberService;


@Controller
public class CustomsoftEduMemberController {
	private final Logger LOGGER = LoggerFactory.getLogger(CustomsoftEduMemberController.class);

	@Autowired
	private MemberService memberService; 
	
	@GetMapping("/login")
	public String login() {
		return "member/login";
	}

	@GetMapping("/test")
	public String test() {
		String test=memberService.selectTest();
		System.out.println(test);
		return test;
	}

}
