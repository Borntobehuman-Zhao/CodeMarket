package com.market.market_user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Zhaoyx
 */
@SpringBootApplication
@MapperScan("com.market.market_user.mapper")
public class MarketUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(MarketUserApplication.class, args);
	}

}
