package com.CusTomSoft.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class MemberDto{
	
	private String id;
	private String pwd;
	private String name;
	private String Enum;
	private String birth1;
	private String addr1;
	private String addr2;
	private String tel;
	
}