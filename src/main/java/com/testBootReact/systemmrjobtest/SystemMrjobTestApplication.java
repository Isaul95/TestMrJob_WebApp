package com.testBootReact.systemmrjobtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//@EnableScheduling
public class SystemMrjobTestApplication {

	public static void main(String[] args) {
		System.out.println("Inicializando project MrJob by - Isaul:");
		SpringApplication.run(SystemMrjobTestApplication.class, args);
	}

// ERROR DEL DATASOURCE - Isaul el domingo despues de la llam
//	https://stackoverflow.com/questions/28042426/spring-boot-error-creating-bean-with-name-datasource-defined-in-class-path-r?page=1&tab=scoredesc#tab-top

}
