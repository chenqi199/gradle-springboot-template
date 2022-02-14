package com.chen.t1.heterogeneity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chenqi
 * @date 2022/1/11 5:57 下午
 */
@SpringBootApplication
@MapperScan("com.dream.@.db.dao")
public class ApiProjectMain {
	public static void main(String[] args)  {
		SpringApplication.run(ApiProjectMain.class, args);

	}
}
