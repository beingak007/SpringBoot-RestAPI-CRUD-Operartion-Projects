package com.akash.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.akash.model.Student;

public interface StudentController {

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