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

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class CustomsoftEduMemberController {
	
	private final Logger logger = LoggerFactory.getLogger(CustomsoftEduMemberController.class);

	@Autowired
	private MemberService memberService; 
	
	//로그인 화면
	@GetMapping("/login")
	public String Login() {
		logger.info("로그인 화면 ");
		return "member/login";
	}
	@GetMapping("/signin")
	public String SignIn() {
		logger.info("회원가입화면 ");
		return "member/signin";
	}

	//데이터 연결 확인
	@GetMapping("/test")
	public String test() {
		String test=memberService.selectTest();
		System.out.println(test);
		return test;
	}

}
