package com.CusTomSoft.Controller;


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.CusTomSoft.Dto.MemberDto;
import com.CusTomSoft.Service.MemberService;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class CustomsoftEduMemberController {
	
	private final Logger logger = LoggerFactory.getLogger(CustomsoftEduMemberController.class);

	@Autowired
	private MemberService memberService; 
	
	//데이터 연결 확인
	@GetMapping("/test")
	public String test() {
		String test=memberService.selectTest();
		System.out.println(test);
		return test;
	}
	
	//로그인 페이지
	@GetMapping("/login")
	public String Login() {
			logger.info("로그인 화면 ");
		return "member/login";
	}
	
	@PostMapping("/Dologin")
	@ResponseBody
	public ModelAndView doLogin(@ModelAttribute MemberDto memberdto, HttpServletRequest req, HttpServletResponse resp, HttpSession sess  ) {
		ModelAndView mav= new ModelAndView(); 
		String Em_id  = req.getParameter("id");
		String Em_pwd = req.getParameter("pwd");
		
		memberdto.setId(Em_id);
		memberdto.setPwd(Em_pwd);
		
		int res=0;
		res= memberService.selectCountMember(memberdto);
		logger.info("Dologin ---" +res);
		

		if(res == 1 ) {
			mav.setViewName("redirect:home");
			
			
			Cookie cookie = new Cookie("userId", Em_id);
			cookie.setMaxAge(60*60*24);
			cookie.setPath("/"); //
			sess.setAttribute("ses_id", memberdto.getId());
			sess.setAttribute("ses_pwd", memberdto.getPwd());
			sess.setAttribute("ses_name",memberdto.getName());
			
			System.out.println(sess);
		}else {
			mav.setViewName("redirect:/");

			return mav;
		}
		return mav; 
	}
	
	@GetMapping("/Logout")
	public String loggout(HttpSession sess, HttpServletRequest req) {
		 logger.info("------------loggout");
		req.getSession().invalidate();
		req.getSession(true);
		return"member/login";
	}
	
	//회원가입 페이지
	@GetMapping("/signup")
	public String SignUp() {
			logger.info("회원가입화면 ");
		return "member/signup";
	}

	@PostMapping("/insertMember")
	@ResponseBody
	public  int insertmember(@RequestBody Map<Object, Object> map, HttpServletRequest req , HttpServletResponse resp) {
			logger.info("회원가입로직 실행");
			int result = memberService.insertMember(map);
			return result;
	}
	
	

}
