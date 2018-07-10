package com.cn.truth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
//@MapperScan(basePackages = "com.cn.truth.service.mapper")
public class TruthApplication {

	public static void main(String[] args) {
		SpringApplication.run(TruthApplication.class, args);
	}
}
