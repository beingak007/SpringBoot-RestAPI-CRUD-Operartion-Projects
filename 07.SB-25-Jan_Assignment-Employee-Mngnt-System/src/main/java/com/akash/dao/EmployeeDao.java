package com.akash.dao;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.akash.model.Employee;

public interface EmployeeDao {

	Employee SingleRecordsBody(int id);

	List<Employee> ShowAllData();

	Employee SingleRecAPI(int id);

	Employee SingleRecBody(int id);

	Employee updateSingle(Employee em);

	Employee deleteSignleAPI(int id);


}