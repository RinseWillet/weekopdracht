package com.theorganisation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.theorganisation.domain.*;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeerepository;
	
	@Autowired
	TelefoonRepository telefoonrepository;
	
	public Employee addEmployee(Employee employee) {
		System.out.println("Employee toegevoegd aan database");
		return employeerepository.save(employee);
	}

	public Iterable<Employee> getAllEmployees() {
		System.out.println("inzien alle employees in database");
		return employeerepository.findAll();
	}
	
	public Employee getById(long id) {
		return employeerepository.findById(id).get();
	}
	
	public Employee addMessageToEmployee (Employee employee, Message message) {
		employee.addMessage(message);
		return employeerepository.save(employee);
	}
	
	public Employee changeSalary(Employee employee, Employee employeeUpdate) {
		System.out.println("Salaris wijzigen in service");
    	employee.setSalary(employeeUpdate.getSalary());
    	return employeerepository.save(employee);
    }
	
	public void deleteEmployeeByID(long id) {
		System.out.println("Deleting Employee in Service");
		employeerepository.deleteById(id);
	}
	
	public Employee TelefoonToevoegenEmployee(long employeeID, long telefoonID) {
		Employee werknemer = employeerepository.findById(employeeID).get();
		Telefoon telefoon = telefoonrepository.findById(telefoonID).get();
		if (telefoon.getEmployee() != null) {
			Optional<Employee> switcheroo = employeerepository.findById(telefoon.getEmployee().getId());
			switcheroo.get().addPhone(null);
		}
		werknemer.addPhone(telefoon);
		System.out.println("telefoon aan werknemer toegewezen");
		return employeerepository.save(werknemer);
	}
		
	
	
}
