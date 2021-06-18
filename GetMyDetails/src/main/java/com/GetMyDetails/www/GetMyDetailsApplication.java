package com.GetMyDetails.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})


@SpringBootApplication
@ComponentScan({"com.GetMyDetails.www.service", "com.GetMyDetails.www.dao"})
@EntityScan("com.GetMyDetails.www.entity")
@EnableJpaRepositories("com.GetMyDetails.www.dao")

public class GetMyDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetMyDetailsApplication.class, args);
	}

}
