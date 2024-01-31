package com.akash.dao;

import java.util.List;

import com.akash.model.Student;

public interface StudentDao {

	// Show a Single Student Record
	String showSingleStudentRecord(int id);

	// Get a Multiple Student Record
	String showMultipleStudentRecord();

	// Insert a Single Student Record
	String insertSingleStudentRecord(Student student);

	// Insert a Single Student Record Using Request API
	String insertAPI(int id, String name);

	// Insert a Single Student Record
	String insertMultipleStudentRecord(List<Student> list);

	// Update a Single Student Record
	String updateSingleStudentRecord(Student student);

	// Update a Multiple Student Record
	String multipleupdate(List<Student> list);

	// Partial Update a Single Student field Record
	String partialSingleFieldUpdate(int id, String name);

	// Partial Update a Multiple Student field Record
	String partialMultipleFieldUpdate(int id, String name, String city);

	// Delete a Single Student Record
	String deleteSingleStudentRecord(int id);

	// Delete a Multiple Student Record's
	String deleteAllStudentRecord();

}