package com.aig.dms.Services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.aig.dms.CustomExceptions.EmployeeNotFoundException;
import com.aig.dms.Repositories.EmployeeRepository;
import com.aig.dms.dao.Entities.Employee;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	
	@Resource
	EmployeeRepository employeeRepository;
	


	@Override
	@Transactional
	public Employee create(Employee e) {
		
		Employee e1 = e;
		try {
			e1 = employeeRepository.save(e);
			
		} catch (Exception e2) {
			System.out.println(e2);
			e2.printStackTrace();
		}
		
		return 	e1;
	}

	@Override
	@Transactional
	public Employee delete(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee update(Employee e) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee createEmployee(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

}
