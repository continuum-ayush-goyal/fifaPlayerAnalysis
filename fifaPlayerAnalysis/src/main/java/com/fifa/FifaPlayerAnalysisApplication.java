package com.fifa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.fifa.service.AddDataFromExcel;

@SpringBootApplication
public class FifaPlayerAnalysisApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FifaPlayerAnalysisApplication.class, args);
	//	context.getBean(AddDataFromExcel.class).fillData();
	}

}

