package com.CusTomSoft.Controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.CusTomSoft.Dto.MemberDto;
import com.CusTomSoft.Service.MemberService;

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
		
		/*
		 * @RequestMapping(value="Tmember/TloginPro.do" ,method=RequestMethod.POST)
	public ModelAndView TloginPro(@ModelAttribute TmemberDTO dto
								  ,HttpServletRequest req
								  ,HttpServletResponse resp
								  ,HttpSession session) {
	ModelAndView mav=new ModelAndView();
	 
	 String mid=req.getParameter("Mid").trim();
	 String mpasswd=req.getParameter("Mpasswd").trim();
	 
	
	mav.addObject("root",Utility.getRoot());
	
	
	dto.setMid(mid);
	dto.setMpasswd(mpasswd);
	 
	  
    int res=0;
    res=dao.login(dto);
    System.out.println("res:" +res);
    
  
    if(res==1) {
         dto=dao.read(dto.getMid());
     	session.setAttribute("s_id", dto.getMid());
     	session.setAttribute("memid", dto.getMid());
     	session.setAttribute("s_passwd", dto.getMpasswd());
     	session.setAttribute("s_mlevel", dto.getMlevel());
     	
     
      
        session.setAttribute("s_mlevel", dto.getMlevel());	
        session.setAttribute("s_mnum", dto.getMnum());
//-----------------------------------------쿠키 아이디저장
       String c_id=req.getParameter("c_id");
          if(c_id==null){ 
             c_id="";
          }
       Cookie cookie=null;
       if(c_id.equals("SAVE")) {
          cookie=new Cookie("c_id", dto.getMid());
          System.out.println(dto.getMid());
          cookie.setMaxAge(60*60*24*31);//1달동안 쿠키저장
       }else {
          cookie=new Cookie("c_id", "");
          cookie.setMaxAge(0);
       }
       resp.addCookie(cookie);//사용자 pc에 쿠키값저장
//----------------------------------------------
       
       mav.setViewName("Tmember/TloginPro");
    }// if end
    
    req.setAttribute("res", new Integer(res));
	
	
	return mav;
	}
		 * */
		
		
		if(res ==1 ) {
			memberdto =memberService.readMember(memberdto); 
			
			sess.setAttribute("ses_id", memberdto.getId());
		}
		return mav; 
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
			System.out.println(map);
			System.out.println("안오나요");
			logger.info("회원가입로직 실행");
			int result = memberService.insertMember(map);
		return result;
	}
	
	

}
