package com.akash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.dao.StudentDaoImpl;
import com.akash.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDaoImpl daoImpl;

	@Override
	public String showSingleStudentRecord(int id) {
		return daoImpl.showSingleStudentRecord(id);
	}

	@Override
	public String showMultipleStudentRecord() {
		return daoImpl.showMultipleStudentRecord();
	}

	@Override
	public String insertSingleStudentRecord(Student student) {
		return daoImpl.insertSingleStudentRecord(student);
	}

	@Override
	public String insertAPI(int id, String name) {
		return daoImpl.insertAPI(id, name);
	}

	@Override
	public String insertMultipleStudentRecord(List<Student> list) {
		return daoImpl.insertMultipleStudentRecord(list);
	}

	@Override
	public String updateSingleStudentRecord(Student student) {
		return daoImpl.updateSingleStudentRecord(student);
	}

	@Override
	public String multipleupdate(List<Student> list) {
		return daoImpl.multipleupdate(list);
	}

	@Override
	public String partialSingleFieldUpdate(int id, String name) {
		return daoImpl.partialSingleFieldUpdate(id, name);
	}

	@Override
	public String partialMultipleFieldUpdate(int id, String name, String city) {
		return daoImpl.partialMultipleFieldUpdate(id, name, city);
	}

	@Override
	public String deleteSingleStudentRecord(int id) {
		return daoImpl.deleteSingleStudentRecord(id);
	}

	@Override
	public String deleteAllStudentRecord() {
		return daoImpl.deleteAllStudentRecord();
	}
}

