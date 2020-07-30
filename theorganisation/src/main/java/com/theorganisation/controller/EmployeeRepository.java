package com.theorganisation.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.theorganisation.domain.Employee;

@Component
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
