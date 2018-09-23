package com.sampleapp.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sampleapp.dao.EmployeeDao;
import com.sampleapp.entity.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

	private static List<Employee> empList = new ArrayList<>();

	@Autowired
	private SessionFactory sessionFactory;

	public Session session() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public boolean addEmployee(Employee emp) {

		empList.add(emp);

		session().save(emp);
		return true;

	}

}
