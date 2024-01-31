package com.akash.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akash.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	SessionFactory sf;

	@Override
	public Employee SingleRecordsBody(@RequestBody int id) {
		Session session = sf.openSession();

		Employee emp = session.get(Employee.class, id);

		return emp;

	}

	@Override
	public List<Employee> ShowAllData() {
		Session session = sf.openSession();
//		Query query = session.createQuery("from food management system");
		Query query = session.createQuery("from Employee");
		List<Employee> list = query.list();

		return list;
	}

	@Override
	public Employee SingleRecAPI(@PathVariable int id) {
		Session session = sf.openSession();

		Employee em = session.get(Employee.class, id);

		return em;
	}

	@Override
	public Employee SingleRecBody(@RequestBody int id) {
		Session session = sf.openSession();

		Employee em = session.get(Employee.class, id);
		session.save(em);

		return em;
	}

	@Override
	public Employee updateSingle(@RequestBody Employee em) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.update(em);
		tx.commit();
		return em;
	}

	@Override
	public Employee deleteSignleAPI(@PathVariable int id) {

		Session ss = sf.openSession();
		Transaction transaction = ss.beginTransaction();
		Employee em = ss.load(Employee.class, id);
		ss.delete(em);
		transaction.commit();

		return em;
	}

}
