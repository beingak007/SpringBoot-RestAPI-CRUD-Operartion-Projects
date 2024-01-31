package com.akash.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akash.dao.EmployeeDaoImpl;
import com.akash.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService  {

	@Autowired
	EmployeeDaoImpl employeeDaoImpl;

	@Override
	public Employee SingleRecordsBody(@RequestBody int id ) {

		return employeeDaoImpl.SingleRecordsBody(id);

	}

	@Override
	public List<Employee> ShowAllData() {

		return employeeDaoImpl.ShowAllData();
	}

	@Override
	public Employee SingleRecAPI(@PathVariable int id) {

		return employeeDaoImpl.SingleRecAPI(id);
	}

	@Override
	@GetMapping("showSingleRecordBody")
	public Employee SingleRecBody(@RequestBody int id) {

		return employeeDaoImpl.SingleRecBody(id);
	}

	@Override
	public Employee updateSingle(@RequestBody Employee em) {

		return employeeDaoImpl.updateSingle(em);
	}

	@Override
	public Employee deleteSignleAPI(@PathVariable int id) {

		return employeeDaoImpl.deleteSignleAPI(id);
	}

}
