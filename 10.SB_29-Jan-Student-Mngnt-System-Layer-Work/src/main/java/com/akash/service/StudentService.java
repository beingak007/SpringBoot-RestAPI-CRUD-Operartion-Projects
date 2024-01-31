package com.akash.service;

import java.util.List;

import com.akash.model.Student;

public interface StudentService {

	String showSingleStudentRecord(int id);

	String showMultipleStudentRecord();

	String insertSingleStudentRecord(Student student);

	String insertAPI(int id, String name);

	String insertMultipleStudentRecord(List<Student> list);

	String updateSingleStudentRecord(Student student);

	String multipleupdate(List<Student> list);

	String partialSingleFieldUpdate(int id, String name);

	String partialMultipleFieldUpdate(int id, String name, String city);

	String deleteSingleStudentRecord(int id);

	String deleteAllStudentRecord();

}