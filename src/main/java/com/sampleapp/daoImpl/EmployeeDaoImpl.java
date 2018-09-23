package com.sampleapp.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sampleapp.dao.EmployeeDao;
import com.sampleapp.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private static List<Employee> empList = new ArrayList<>();

	@Override
	public boolean addEmployee(Employee emp) {

		empList.add(emp);
		return true;

	}

}
