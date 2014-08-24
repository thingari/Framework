package com.aig.dms.Services;

import java.util.List;

import com.aig.dms.CustomExceptions.EmployeeNotFoundException;
import com.aig.dms.dao.Entities.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee e);

	public Employee create(Employee e);

	public Employee delete(int id) throws EmployeeNotFoundException;

	public List<Employee> findAll();

	public Employee update(Employee e) throws EmployeeNotFoundException;

	public Employee findById(int id);

}
