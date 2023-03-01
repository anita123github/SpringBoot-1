package com.example.anita;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.anita.service.ReportService;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringBoot1Application.class, args);
		ReportService service = context.getBean(ReportService.class);
		service.downloadReport();
	}

}
