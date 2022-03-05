package com.rmt.monitoringapi;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MonitoringApplication {

	// @Autowired
	// private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(MonitoringApplication.class, args);
	}

}
