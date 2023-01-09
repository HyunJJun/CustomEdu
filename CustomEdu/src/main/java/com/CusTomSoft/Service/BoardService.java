package com.CusTomSoft.Service;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CusTomSoft.Controller.CustomsoftEduMemberController;
import com.CusTomSoft.Dto.BoardDto;
import com.CusTomSoft.Mapper.BoardMapper;

import ch.qos.logback.core.model.Model;

@Service
public class BoardService {
	@Autowired
	private BoardMapper boardmapper;
	
	private final Logger logger = LoggerFactory.getLogger(CustomsoftEduMemberController.class);

	

	public List<BoardDto> getboardlist() {
		return boardmapper.getboardlist();
	}
	
	

}
