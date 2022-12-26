package com.CusTomSoft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.CusTomSoft.Mapper"})
public class CustomEduApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomEduApplication.class, args);
	}

}
