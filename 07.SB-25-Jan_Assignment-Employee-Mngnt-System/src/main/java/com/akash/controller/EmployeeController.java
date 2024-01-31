package com.akash.controller;

import java.util.List;


import com.akash.model.Employee;


public interface EmployeeController {

	Employee SingleRecordsBody(int id);

	List<Employee> ShowAllData();

	Employee SingleRecAPI(int id);

	Employee SingleRecBody(int id);

	Employee updateSingle(Employee em);

	Employee deleteSignleAPI(int id);

}