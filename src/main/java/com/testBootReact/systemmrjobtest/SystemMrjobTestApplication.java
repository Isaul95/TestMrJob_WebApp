package com.testBootReact.systemmrjobtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SystemMrjobTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemMrjobTestApplication.class, args);
	}

}
