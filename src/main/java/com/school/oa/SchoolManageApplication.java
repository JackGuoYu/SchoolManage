package com.school.oa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.school.oa.dao")
public class SchoolManageApplication {
	public static void main(String[] args) {
		SpringApplication.run(SchoolManageApplication.class, args);
	}
}
