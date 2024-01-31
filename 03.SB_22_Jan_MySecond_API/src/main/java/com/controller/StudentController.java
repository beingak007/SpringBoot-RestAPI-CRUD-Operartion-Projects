package com.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.Student;

@RestController
public class StudentController {

	ArrayList<Student> al = new ArrayList<Student>();

	public StudentController() {
		al.add(new Student(1, "Akash"));
		al.add(new Student(2, "Abhishek"));
		al.add(new Student(3, "Shailesh"));
		al.add(new Student(4, "Mrunali "));

	}

	@GetMapping("ShowAllRecords")
	ArrayList<Student> getAllStudentRecords() {
		System.out.println("getAllStudentRecords: ");
		return  al;

	}
//
//	@GetMapping("ShowAllRecords")
//	ArrayList<Student> getAllStudentRecords() {
//		System.out.println("getAllStudentRecords: ");
//		return al;
//		
//	}
	
	@GetMapping("ShowSingleRecords/{id}")
	Student getSingleStudentRecords(@PathVariable int id) {

		Student std = null;

		for (Student student : al) {
			if (student.id == id) {

				std = student;

			}

		}

		System.out.println("Singel Student Records : ");
		return std;
	}
	@GetMapping("ShowSingleRecordsBody")
	Student requestBody(@RequestBody int id) {
		
		
		Student std = null;
		
		for (Student student : al) {
			if (student.id == id) {
				
				std = student;
			}
		}
		
		System.out.println("getAllStudentRecords: ");
		return std;
	}

}