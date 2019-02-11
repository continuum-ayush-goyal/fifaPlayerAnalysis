package com.fifa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fifa.service.AddDataFromExcel;


@RestController
public class AddDataController {

	@Autowired
	private AddDataFromExcel addData;
	
	
	@RequestMapping("/addData")
	public String getAllCourses() {
		try {
		addData.fillData();
		}catch(Exception e) {
			return "Addition Not Successful : "+e.getMessage();
		}
		return "Addition Successful";
	}
	
	@RequestMapping("/test")
	public String test() {
		
		return "Test Success";
	}
}
