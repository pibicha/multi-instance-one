package com.git.poan.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


@SpringBootApplication
@EnableAutoConfiguration
@ImportResource("classpath:spring/*.xml")
@ComponentScan(basePackages = {"com.git.b.*","com.git.a.*"})
public class ServerMain extends SpringBootServletInitializer {

	@Autowired
	private ThreadPoolTaskExecutor taskExecutor;


//	@Resource
//	private IDMappingService idMappingService;
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ServerMain.class, args);
	}
}
