package com.akash.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akash.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	SessionFactory sf;

	// Show a Single Student Record
	@Override
	public String showSingleStudentRecord(int id) {
		Session s = sf.openSession();
		Student ss = s.get(Student.class, id);
		return "Show Single Student Record \n" + ss;
	}

	// Get a Multiple Student Record
	@Override
	public String showMultipleStudentRecord() {
		Session s = sf.openSession();
		Query query = s.createQuery("from Student");
		List<Student> list = query.list();
		return "Show Multiple Student Record \n" + list;
	}

	// Insert a Single Student Record
	@Override
	public String insertSingleStudentRecord(Student student) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(student);
		t.commit();
		return "Insert Single Student Record \n" + student;
	}

	// Insert a Single Student Record Using Request API
	@Override
	public String insertAPI(int id, String name) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Student ss = new Student(id, name);
		s.save(ss);
		t.commit();
		return "Insert a Single Student Record Using Request API \n" + ss;
	}

	// Insert a Single Student Record
	@Override
	public String insertMultipleStudentRecord(List<Student> list) {
		for (Student student : list) {
			Session ss = sf.openSession();
			Transaction tt = ss.beginTransaction();
			ss.save(student);
			tt.commit();
		}
		return "Insert Multiple Student Record \n" + list;
	}

	// Update a Single Student Record
	@Override
	public String updateSingleStudentRecord(Student student) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(student);
		t.commit();
		return "Update Single Student Record \n" + student;
	}

	// Update a Multiple Student Record
	@Override
	public String multipleupdate(List<Student> list) {
		for (Student student : list) {
			Session ss = sf.openSession();
			Transaction tt = ss.beginTransaction();
			ss.update(student);
			tt.commit();
		}
		return "Update Multiple Student Record \n" + list;
	}

	// Partial Update a Single Student field Record
	@Override
	public String partialSingleFieldUpdate(int id, String name) {
		Session s = sf.openSession();
		Student student = s.get(Student.class, id);
		student.setName(name);
		Transaction tx = s.beginTransaction();
		s.update(student);
		tx.commit();
		return "Partial Update a Single Student Record \n" + student;
	}

	// Partial Update a Multiple Student field Record
	@Override
	public String partialMultipleFieldUpdate(int id, String name, String city) {
		Session s = sf.openSession();
		Student student = s.get(Student.class, id);
		student.setName(name);
		// student.setCity(city);
		Transaction tx = s.beginTransaction();
		s.update(student);
		tx.commit();
		return "Partial Update a Multiple Student field Record\n" + student;
	}

	// Delete a Single Student Record
	@Override
	public String deleteSingleStudentRecord(int id) {
		// Database interaction code
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Student ss = s.get(Student.class, id);
		s.delete(ss);
		t.commit();
		return "Delete Single Student Record \n" + ss;
	}

	// Delete a Multiple Student Record's
	@Override
	public String deleteAllStudentRecord() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query query = s.createQuery("DELETE FROM Student");
		query.executeUpdate();
		t.commit();
		return "Deletes All Table Record's";
	}
}
