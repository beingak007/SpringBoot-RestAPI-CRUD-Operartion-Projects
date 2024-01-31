package com.akash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akash.model.Student;
import com.akash.service.StudentService;

@RestController
public class StudentControllerImpl implements StudentController {

	@Autowired
	private StudentService myService;

	@Override
	@GetMapping("showSingleStudentRecord/{id}")
	public String showSingleStudentRecord(@PathVariable int id) {
		return myService.showSingleStudentRecord(id);

	}

	@Override
	@GetMapping("showMultipleStudentRecord")
	public String showMultipleStudentRecord() {
		return myService.showMultipleStudentRecord();
	}

	@Override
	@PostMapping("insertSingleStudentRecord")
	public String insertSingleStudentRecord(@RequestBody Student student) {
		return myService.insertSingleStudentRecord(student);
	}

	@Override
	@PostMapping("insertSingleRecordPath/{id}/{name}")
	public String insertAPI(@PathVariable int id, String name) {
		return myService.insertAPI(id, name);
	}

	@Override
	@PostMapping("insertMultipleStudentRecord")
	public String insertMultipleStudentRecord(@RequestBody List<Student> list) {
		return myService.insertMultipleStudentRecord(list);
	}

	@Override
	@PutMapping("updateSingleStudentRecord")
	public String updateSingleStudentRecord(@RequestBody Student student) {
		return myService.updateSingleStudentRecord(student);
	}

	@Override
	@PutMapping("updateMultipleRecord")
	public String multipleupdate(@RequestBody List<Student> list) {
		return myService.multipleupdate(list);
	}

	@Override
	@PatchMapping("partialSingleFieldUpdate/{id}/{name}")
	public String partialSingleFieldUpdate(@PathVariable int id, String name) {
		return myService.partialSingleFieldUpdate(id, name);
	}

	@Override
	@PatchMapping("partialMultipleFieldUpdate/{id}/{name}")
	public String partialMultipleFieldUpdate(@PathVariable int id, String name, String city) {
		return myService.partialMultipleFieldUpdate(id, name, city);
	}

	@Override
	@DeleteMapping("deleteSingleStudentRecord/{id}")
	public String deleteSingleStudentRecord(@PathVariable int id) {
		return myService.deleteSingleStudentRecord(id);
	}

	@Override
	@DeleteMapping("deleteMultipleRecord")
	public String deleteAllStudentRecord() {
		return myService.deleteAllStudentRecord();
	}

}
