package com.sampleapp.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.sampleapp.dto.EmployeeDto;
import com.sampleapp.entity.Employee;
import com.sampleapp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String addEmployee(EmployeeDto dto) {
		
		Employee emp = dtoToEntity(dto);

		return null;
	}

	private Employee dtoToEntity(EmployeeDto dto) {

		ModelMapper mapper = new ModelMapper();

		return mapper.map(dto, Employee.class);

	}

}
