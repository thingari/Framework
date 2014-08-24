package com.aig.dms.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.aig.dms.dao.Entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
