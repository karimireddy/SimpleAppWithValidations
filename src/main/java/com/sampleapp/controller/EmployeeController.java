package com.sampleapp.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sampleapp.dto.EmployeeDto;

@RestController
public class EmployeeController {

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String get() {
		return "Hello World from Rest Controller";
	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String get(@RequestBody EmployeeDto dto) {
		
		return dto.toString();
	}
	
}
