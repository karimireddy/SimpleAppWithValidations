package com.sampleapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sampleapp.dto.EmployeeDto;
import com.sampleapp.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@GetMapping("/get")
	public String get() {
		return "Hello World from Rest Controller";
	}

	@PostMapping("/addEmployee")
	public String get(@RequestBody @Valid EmployeeDto dto) {

		service.addEmployee(dto);

		return dto.toString();
	}

}
