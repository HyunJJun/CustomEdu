package com.CusTomSoft.Mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.CusTomSoft.Dto.MemberDto;

@Repository
@Mapper
public interface MemberMapper {

	public String selectTest();
	
}
