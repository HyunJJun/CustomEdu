package com.CusTomSoft.Controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.CusTomSoft.Dto.BoardDto;
import com.CusTomSoft.Service.BoardService;

import ch.qos.logback.core.model.Model;



@Controller
public class CustomsoftEduBoardController {
	private final Logger logger = LoggerFactory.getLogger(CustomsoftEduBoardController.class);
	
	@Autowired
	private BoardService boardservice;
	
	@GetMapping(value="/board")
	public String BoardList(org.springframework.ui.Model model) throws Exception {
		logger.info("게시판페이지 이동");
		List<BoardDto> boardlist= boardservice.getboardlist();
		model.addAttribute("boardlist",boardlist);
		return "board/board";
	}
	

}
