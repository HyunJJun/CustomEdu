package com.CusTomSoft.Mapper;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.CusTomSoft.Dto.BoardDto;
import com.CusTomSoft.Dto.MemberDto;

import ch.qos.logback.core.model.Model;

@Repository
@Mapper
public interface BoardMapper {

	public String selectTest();
	
	public List<BoardDto> getboardlist();
	
}
