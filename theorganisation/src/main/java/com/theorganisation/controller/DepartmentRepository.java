package com.theorganisation.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.theorganisation.domain.Department;

@Component
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
