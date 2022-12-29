package com.CusTomSoft.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
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