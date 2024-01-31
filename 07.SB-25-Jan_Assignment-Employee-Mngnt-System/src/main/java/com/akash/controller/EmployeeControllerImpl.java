package com.akash.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akash.model.Employee;
import com.akash.service.EmployeeService;

@RestController
public class EmployeeControllerImpl implements EmployeeController {

	@Autowired
	EmployeeService employeeServiceImpl;

	@Override
	@PostMapping("insertSingleRecordsBody")
	public Employee SingleRecordsBody(@RequestBody int id) {

		return employeeServiceImpl.SingleRecBody(id);

	}

	@Override
	@GetMapping("showMultipleRecords")
	public List<Employee> ShowAllData() {

		return employeeServiceImpl.ShowAllData();
	}

	@Override
	@GetMapping("showSingleRecord/{id}")
	public Employee SingleRecAPI(@PathVariable int id) {
		return employeeServiceImpl.SingleRecAPI(id);
	}

	@Override
	@GetMapping("showSingleRecordBody")
	public Employee SingleRecBody(@RequestBody int id) {

		return employeeServiceImpl.SingleRecBody(id);
	}

	@Override
	@PutMapping("updateSingleRecord")
	public Employee updateSingle(@RequestBody Employee em) {
		return employeeServiceImpl.updateSingle(em);
	}

	@Override
	@DeleteMapping("deleteSingleRecord/{id}")
	public Employee deleteSignleAPI(@PathVariable int id) {
		return employeeServiceImpl.deleteSignleAPI(id);
	}

}
