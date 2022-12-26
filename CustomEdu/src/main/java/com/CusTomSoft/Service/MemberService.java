package com.CusTomSoft.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CusTomSoft.Dto.MemberDto;
import com.CusTomSoft.Mapper.MemberMapper;

@Service
public class MemberService {
	@Autowired
	private MemberMapper membermapper;
	
	public String selectTest() {
		return membermapper.selectTest();
	}
}
