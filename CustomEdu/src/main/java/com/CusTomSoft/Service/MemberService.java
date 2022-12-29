package com.CusTomSoft.Service;


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CusTomSoft.Controller.CustomsoftEduMemberController;
import com.CusTomSoft.Mapper.MemberMapper;

@Service
public class MemberService {
	@Autowired
	private MemberMapper membermapper;
	
	private final Logger logger = LoggerFactory.getLogger(CustomsoftEduMemberController.class);

	
	public String selectTest() {
		return membermapper.selectTest();
	}
	public int insertMember(Map<Object, Object> map ) {
			logger.info("MemberService.insertMember");
		 return membermapper.insertMember(map);
	}
}
