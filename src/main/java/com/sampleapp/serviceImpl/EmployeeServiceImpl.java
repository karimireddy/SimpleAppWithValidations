package com.sampleapp.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleapp.dao.EmployeeDao;
import com.sampleapp.dto.EmployeeDto;
import com.sampleapp.entity.Employee;
import com.sampleapp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao dao;

	@Override
	public String addEmployee(EmployeeDto dto) {
		
		if(dao.addEmployee(dtoToEntity(dto))) {
			return "Success";
		}else {
			return "Fail";
		}
		
	}

	private Employee dtoToEntity(EmployeeDto dto) {

		ModelMapper mapper = new ModelMapper();

		return mapper.map(dto, Employee.class);

	}

}
